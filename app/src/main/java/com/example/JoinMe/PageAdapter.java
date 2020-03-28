package com.example.JoinMe;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class PageAdapter extends FragmentStatePagerAdapter {

    private int mNumTabs;

    public PageAdapter(FragmentManager fm, int numTabs) {
        super(fm);
        this.mNumTabs = numTabs;

    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: return new FriendsList();
            case 1: return new EventList();
            case 2: return new Map();
            default: return null;
        }
    }

    @Override
    public int getCount() {
        return mNumTabs;
    }
}