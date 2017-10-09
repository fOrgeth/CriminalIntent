package com.mcs.th.forge.criminalintent;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CrimeLab {

    private static CrimeLab sCrimeLab;
    private List<Crime> mCrimeList;

    private CrimeLab(Context context) {
        mCrimeList = new ArrayList();
        for (int i = 0; i < 100; i++) {
            Crime crime = new Crime();
            crime.setTitle("Crime #"+(i+1));
            crime.setSolved(i%2==0);
            mCrimeList.add(crime);
        }
    }

    public static CrimeLab get(Context context) {
        if (sCrimeLab == null) {
            sCrimeLab = new CrimeLab(context);
        }
        return sCrimeLab;
    }

    public List<Crime> getCrimes() {
        return mCrimeList;
    }

    private Crime getCrime(UUID id) {
        for (Crime crime : mCrimeList) {
            if (crime.getId().equals(id)) {
                return crime;
            }
        }
        return null;
    }
}
