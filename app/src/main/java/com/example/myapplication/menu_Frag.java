package com.example.myapplication;

import android.annotation.SuppressLint;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

@SuppressLint("ValidFragment")
public class menu_Frag extends Fragment implements View.OnClickListener{


    View view;

    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.menu_frag, container, false);

        tabLayout = (TabLayout) view.findViewById(R.id.tabLayout2);
        tabLayout.addTab(tabLayout.newTab().setText("추천"));
        tabLayout.addTab(tabLayout.newTab().setText("중국"));
        tabLayout.addTab(tabLayout.newTab().setText("치킨"));
        tabLayout.addTab(tabLayout.newTab().setText("분식"));
        tabLayout.addTab(tabLayout.newTab().setText("일식"));
        tabLayout.addTab(tabLayout.newTab().setText("한식"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        viewPager = (ViewPager) view.findViewById(R.id.menu_frame);

        // Creating TabPagerAdapter adapter
        TabPagerAdapter pagerAdapter = new TabPagerAdapter(getFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(pagerAdapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

//      특정프래그먼트 특정
        Bundle bundle = getArguments();
        Integer message = bundle.getInt("select");
        viewPager.setCurrentItem(message);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

           }

        });


        return view;
    }
    @Override
    public void onClick(View v) {

    }



}