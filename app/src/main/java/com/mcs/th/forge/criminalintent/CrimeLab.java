package com.mcs.th.forge.criminalintent;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.mcs.th.forge.criminalintent.database.CrimeBaseHelper;
import com.mcs.th.forge.criminalintent.database.CrimeDbSchema;
import com.mcs.th.forge.criminalintent.database.CrimeDbSchema.CrimeTable;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CrimeLab {

    private static CrimeLab sCrimeLab;
    //    private List<Crime> mCrimeList;
    private Context mContext;
    private SQLiteDatabase mDatabase;

    private CrimeLab(Context context) {
        mContext = context.getApplicationContext();
        mDatabase = new CrimeBaseHelper(mContext)
                .getWritableDatabase();
//        mCrimeList = new ArrayList();

    }

    public void addCrime(Crime c) {
//        mCrimeList.add(c);
        ContentValues values = getContentValues(c);
        mDatabase.insert(CrimeTable.NAME, null, values);
    }

    public void updateCrime(Crime crime) {
        String uuidString = crime.getId().toString();
        ContentValues values = getContentValues(crime);
        mDatabase.update(CrimeTable.NAME, values,
                CrimeTable.Cols.UUID + " = ?",
                new String[]{uuidString});
    }

    public boolean deleteCrime(Crime c) {
//        for (Crime crime : mCrimeList) {
//            if (crime.getId().equals(c.getId())) {
//                mCrimeList.remove(mCrimeList.indexOf(crime));
//                return true;
//            }
//        }
        return false;
    }

    public static CrimeLab get(Context context) {
        if (sCrimeLab == null) {
            sCrimeLab = new CrimeLab(context);
        }
        return sCrimeLab;
    }

    public List<Crime> getCrimes() {
//        return mCrimeList;
        return new ArrayList<>();
    }

    public Crime getCrime(UUID id) {
//        for (Crime crime : mCrimeList) {
//            if (crime.getId().equals(id)) {
//                return crime;
//            }
//        }
        return null;
    }

    private static ContentValues getContentValues(Crime crime) {
        ContentValues values = new ContentValues();
        values.put(CrimeTable.Cols.UUID, crime.getId().toString());
        values.put(CrimeTable.Cols.TITLE, crime.getTitle());
        values.put(CrimeTable.Cols.DATE, crime.getDate().getTime());
        values.put(CrimeTable.Cols.SOLVED, crime.isSolved() ? 1 : 0);
        return values;
    }
}
