package com.secondapp.android.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by venu on 21-08-2017.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
