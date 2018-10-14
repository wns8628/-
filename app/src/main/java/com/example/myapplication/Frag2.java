package com.example.myapplication;

import android.annotation.SuppressLint;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * Created by 김세준 on 2018-05-24.
 */

@SuppressLint("ValidFragment")
public class Frag2 extends Fragment implements View.OnClickListener{

    View view;
    Button bt1,bt2,bt3,bt4;

    School_menu school_menu;
    School_menu2 school_menu2;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.frag2, container, false);

        bt1 = (Button)view.findViewById(R.id.bt_16);
        bt2 = (Button)view.findViewById(R.id.bt_8);

        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);

        school_menu = new School_menu(); //프래그먼트 객채셍성
        school_menu2 = new School_menu2(); //프래그먼트 객채셍성
        setFrag(0); //프래그먼트 교체 처음은 메인화면뜨게

        return view;
}

    @Override
    public void onClick(View v) {
            switch (v.getId()){
                case R.id.bt_16:
//                    setTitle("15번 벤치");
                    setFrag(0);
                    break;
                case R.id.bt_8:
//                    setTitle("단골 매장");
                    setFrag(1);
                    break;
            }
    }

    public void setFrag(int n){    //프래그먼트를 교체하는 작업을 하는 메소드를 만들었습니다
        FragmentManager fm = getActivity().getSupportFragmentManager();
        FragmentTransaction tran = fm.beginTransaction();
        switch (n){
            case 0:
                tran.replace(R.id.school_frame, school_menu);  //replace의 매개변수는 (프래그먼트를 담을 영역 id, 프래그먼트 객체) 입니다.
                tran.commit();
                break;
            case 1:
                tran.replace(R.id.school_frame, school_menu2);  //replace의 매개변수는 (프래그먼트를 담을 영역 id, 프래그먼트 객체) 입니다.
                tran.commit();
                break;
        }
    }
}