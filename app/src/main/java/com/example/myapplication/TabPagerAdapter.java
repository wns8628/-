package com.example.myapplication;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;

public class TabPagerAdapter extends FragmentStatePagerAdapter {

    // Count number of tabs
    private int tabCount;

    
    public TabPagerAdapter(FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }
    @Override
    public android.support.v4.app.Fragment getItem(int position) {

        // Returning the current tabs
        switch (position) {
            case 0:
                menu_Frag1 menu_frag1 = new menu_Frag1();
                return menu_frag1;
            case 1:
                menu_Frag2 menu_frag2 = new menu_Frag2();
                return menu_frag2;
            case 2:
                menu_Frag3 menu_frag3 = new menu_Frag3();
                return menu_frag3;
            case 3:
                menu_Frag4 menu_frag4 = new menu_Frag4();
                return menu_frag4;
            case 4:
                menu_Frag5 menu_frag5 = new menu_Frag5();
                return menu_frag5;
            case 5:
                menu_Frag6 menu_frag6 = new menu_Frag6();
                return menu_frag6;
            default:
                return null;
        }

    }


    @Override
    public int getCount() {
        return tabCount;
    }
}
