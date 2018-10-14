package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * Created by wns86 on 2018-05-28.
 */

@SuppressLint("ValidFragment")
public class menu_Frag2 extends Fragment implements View.OnClickListener{

    View view;

    Bundle bundle = new Bundle();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.menu_frag2, container, false);

        Intent intent = getActivity().getIntent();

        ImageButton button = (ImageButton)view.findViewById(R.id.menu_2_1);
        ImageButton button2 = (ImageButton)view.findViewById(R.id.menu_2_2);
        ImageButton button3 = (ImageButton)view.findViewById(R.id.menu_2_3);
        ImageButton button4 = (ImageButton)view.findViewById(R.id.menu_2_4);
        ImageButton button5 = (ImageButton)view.findViewById(R.id.menu_2_5);

        button.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);


//      dtail_menu_frag1 = new dtail_menu_Frag1(); //프래그먼트 객채셍성

        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.menu_2_1:
                Intent intent1 = new Intent(getActivity(), dtail_menu_activity.class);
                intent1.putExtra("pay", "best_1");
                startActivity(intent1);

                break;
            case R.id.menu_2_5:
                Intent intent2 = new Intent(getActivity(), dtail_menu_activity.class);
                intent2.putExtra("pay", "best_5");
                startActivity(intent2);

                break;
            case R.id.menu_2_3:
                Intent intent3 = new Intent(getActivity(), dtail_menu_activity.class);
                intent3.putExtra("pay", "best_3");
                startActivity(intent3);

                break;
            case R.id.menu_2_4:
                Intent intent4 = new Intent(getActivity(), dtail_menu_activity.class);
                intent4.putExtra("pay", "best_4");
                startActivity(intent4);

                break;
            case R.id.menu_2_2:
                Intent intent5 = new Intent(getActivity(), dtail_menu_activity.class);
                intent5.putExtra("pay", "best_2");
                startActivity(intent5);

                break;

        }
    }

}