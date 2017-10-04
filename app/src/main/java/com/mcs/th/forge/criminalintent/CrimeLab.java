package com.mcs.th.forge.criminalintent;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CrimeLab {

    private static CrimeLab sCrimeLab;
    private List<Crime> crimeList;

    private CrimeLab(Context context) {
        crimeList = new ArrayList();
        for (int i = 0; i < 100; i++) {
            Crime crime = new Crime();
            crime.setTitle("Crime #"+(i+1));
            crime.setSolved(i%2==0);
            crimeList.add(crime);
        }
    }

    public static CrimeLab get(Context context) {
        if (sCrimeLab == null) {
            sCrimeLab = new CrimeLab(context);
        }
        return sCrimeLab;
    }

    public List<Crime> getCrimes() {
        return crimeList;
    }

    private Crime getCrime(UUID id) {
        for (Crime crime : crimeList) {
            if (crime.getId().equals(id)) {
                return crime;
            }
        }
        return null;
    }
}
