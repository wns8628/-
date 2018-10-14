package com.example.myapplication;

import android.annotation.SuppressLint;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

import pyxis.uzuki.live.rollingbanner.RollingBanner;
import pyxis.uzuki.live.rollingbanner.RollingViewPagerAdapter;


/**
 * Created by 김세준 on 2018-05-24.
 */

@SuppressLint("ValidFragment")
public class Frag1 extends Fragment implements View.OnClickListener {
    private RollingBanner rollingBanner;
    private String[] txtRes = new String[]{"Purple", "Light Blue", "Cyan", "Teal", "Green"};
    private int[] colorRes = new int[]{0xff9C27B0, 0xff03A9F4, 0xff00BCD4, 0xff009688, 0xff4CAF50};

    View view;

    menu_Frag1 menu_frag1;
    menu_Frag menu_frag;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.frag1, container, false);

//     롤링배너
        rollingBanner = view.findViewById(R.id.banner);
        SampleAdapter adapter = new SampleAdapter(new ArrayList<>(Arrays.asList(txtRes)));
        rollingBanner.setAdapter(adapter);
//
        Button button = (Button)view.findViewById(R.id.best_menu_bt);
        Button button2 = (Button)view.findViewById(R.id.cha_bt);
        Button button3 = (Button)view.findViewById(R.id.chicken_bt);
        Button button4 = (Button)view.findViewById(R.id.snack_bt);
        Button button5 = (Button)view.findViewById(R.id.japan_bt);
        Button button6 = (Button)view.findViewById(R.id.korea_bt);

        ImageButton imgbutton = (ImageButton)view.findViewById(R.id.best_menu);
        ImageButton imgbutton2 = (ImageButton)view.findViewById(R.id.cha);
        ImageButton imgbutton3 = (ImageButton)view.findViewById(R.id.chicken);
        ImageButton imgbutton4 = (ImageButton)view.findViewById(R.id.snack);
        ImageButton imgbutton5 = (ImageButton)view.findViewById(R.id.japan);
        ImageButton imgbutton6 = (ImageButton)view.findViewById(R.id.korea);

        button.setOnClickListener(this);
        imgbutton.setOnClickListener(this);
        button2.setOnClickListener(this);
        imgbutton2.setOnClickListener(this);
        button3.setOnClickListener(this);
        imgbutton3.setOnClickListener(this);
        button4.setOnClickListener(this);
        imgbutton4.setOnClickListener(this);
        button5.setOnClickListener(this);
        imgbutton5.setOnClickListener(this);
        button6.setOnClickListener(this);
        imgbutton6.setOnClickListener(this);


        return view;
    }

    @Override
    public void onClick(View v) {
        Bundle bundle = new Bundle();
        menu_frag1 = new menu_Frag1(); //프래그먼트 객채셍성
        menu_frag = new menu_Frag();

        switch (v.getId()) {
            case R.id.best_menu_bt:
                ((MainActivity)getActivity()).ActivityName("추천 메뉴!");
                bundle.putInt("select",0);
                menu_frag.setArguments(bundle);
                setFrag(0);
                break;
            case   R.id.best_menu:
                ((MainActivity)getActivity()).ActivityName("추천 메뉴!");
                bundle.putInt("select",0);
                menu_frag.setArguments(bundle);
                setFrag(0);
                break;
            case R.id.cha_bt:
                ((MainActivity)getActivity()).ActivityName("중국집");
                bundle.putInt("select",1);
                menu_frag.setArguments(bundle);
                setFrag(0);
                break;
            case   R.id.cha:
                ((MainActivity)getActivity()).ActivityName("중국집");
                bundle.putInt("select",1);
                menu_frag.setArguments(bundle);
                setFrag(0);
                break;
            case R.id.chicken_bt:
                ((MainActivity)getActivity()).ActivityName("치킨");
                bundle.putInt("select",2);
                menu_frag.setArguments(bundle);
                setFrag(0);
                break;
            case   R.id.chicken:
                ((MainActivity)getActivity()).ActivityName("치킨");
                bundle.putInt("select",2);
                menu_frag.setArguments(bundle);
                setFrag(0);
                break;
            case R.id.snack_bt:
                ((MainActivity)getActivity()).ActivityName("분식");
                bundle.putInt("select",3);
                menu_frag.setArguments(bundle);
                setFrag(0);
                break;
            case   R.id.snack:
                ((MainActivity)getActivity()).ActivityName("분식");
                bundle.putInt("select",3);
                menu_frag.setArguments(bundle);
                setFrag(0);
                break;
            case R.id.japan_bt:
                ((MainActivity)getActivity()).ActivityName("일식");
                bundle.putInt("select",4);
                menu_frag.setArguments(bundle);
                setFrag(0);
                break;
            case   R.id.japan:
                ((MainActivity)getActivity()).ActivityName("일식");
                bundle.putInt("select",4);
                menu_frag.setArguments(bundle);
                setFrag(0);
                break;
            case R.id.korea_bt:
                ((MainActivity)getActivity()).ActivityName("한식");
                bundle.putInt("select",5);
                menu_frag.setArguments(bundle);
                setFrag(0);
                break;
            case   R.id.korea:
                ((MainActivity)getActivity()).ActivityName("한식");
                bundle.putInt("select",5);
                menu_frag.setArguments(bundle);
                setFrag(0);
                break;
        }
    }

    public void setFrag(int n){    //프래그먼트를 교체하는 작업을 하는 메소드를 만들었습니다
                 FragmentManager fm = getFragmentManager();
                 FragmentTransaction tran = fm.beginTransaction();
        switch (n){
            case 0:
                tran.replace(R.id.main_frame, menu_frag);  //replace의 매개변수는 (프래그먼트를 담을 영역 id, 프래그먼트 객체) 입니다.
                tran.commit();
                tran.addToBackStack(null);
                break;
            }
        }
//

    public class SampleAdapter extends RollingViewPagerAdapter<String> {

        public SampleAdapter(ArrayList<String> itemList) {
            super(itemList);
        }

        @Override
        public View getView(int position, String item) {
            View view = LayoutInflater.from(getActivity()).inflate(R.layout.activity_main_pager, null, true);
            FrameLayout container = view.findViewById(R.id.container);
//            TextView txtText = view.findViewById(R.id.txtText);
            ImageView imageV = view.findViewById(R.id.imageView2);
            String txt = getItem(position);
            int index = getItemList().indexOf(txt);
//            txtText.setText(txt);
//            container.setBackgroundColor(colorRes[index]);
            imageV.setImageResource(R.drawable.best1+index);

            return view;
        }
    }
//
}

