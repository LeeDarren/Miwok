package com.example.android.miwok;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Darren on 1/26/2017.
 */

public class CategoryAdapter extends FragmentPagerAdapter {

    public CategoryAdapter(FragmentManager fm){
        super(fm);
    }
    @Override
    public Fragment getItem(int position) {
        if (position == 1)
            return new FamilyFragment();
        else if (position == 2)
            return new ColorsFragment();
        else if (position == 3)
            return new PhrasesFragment();
        else
            return new NumbersFragment();
    }

    @Override
    public int getCount() {
        return 4;
    }
}
