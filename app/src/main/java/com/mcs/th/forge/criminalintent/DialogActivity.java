package com.mcs.th.forge.criminalintent;

import android.support.v4.app.Fragment;

import java.util.Date;

public class DialogActivity extends SingleFragmentActivity {

    private static final String EXTRA_CRIME_DATE = "com.mcs.th.forge.criminalintent.crime_date";

    @Override
    protected Fragment createFragment() {
        Date date = (Date)getIntent().getSerializableExtra(EXTRA_CRIME_DATE);
        return DatePickerFragment.newInstance(date);
    }
}
