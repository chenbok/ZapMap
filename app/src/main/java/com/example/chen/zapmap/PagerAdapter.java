package com.example.chen.zapmap;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {

    public static final int SEARCH_TAB_INDEX = 0;
    public static final int FAVORITES_TAB_INDEX = 1;
    private static final int NUM_OF_TABS = 2;

    // pager adapter is created for the swipe tabs feature
    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case SEARCH_TAB_INDEX:
                SearchFragment SearchTab = new SearchFragment();
                return SearchTab;
            case FAVORITES_TAB_INDEX:
                FavoriteFragment FavTab = new FavoriteFragment();
                return FavTab;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return NUM_OF_TABS;
    }
}
