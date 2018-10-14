package com.example.myapplication;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
        Button bt1,bt2,bt3,bt4;
        android.support.v4.app.FragmentManager fm;
        android.support.v4.app.FragmentTransaction tran;
        Frag1 frag1;
        Frag2 frag2;
        Frag3 frag3;

        private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
                = new BottomNavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.bt1:
                        ActivityName("15번 벤치");
                        setFrag(0);
                        return true;
                    case R.id.bt2:
                        ActivityName("학교 메뉴");
                        setFrag(1);
                        return true;
                    case R.id.bt3:
                        ActivityName("마이 페이지");
                        setFrag(2);
                        return true;
                }
                return false;
            }
        };

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            setTitle("15번 벤치");
//            getSupportActionBar().setBackgroundDrawable(new ColorDrawable(0xFFFFFFFF));

            frag1 = new Frag1(); //프래그먼트 객채셍성
            frag2 = new Frag2(); //프래그먼트 객채셍성
            frag3 = new Frag3(); //프래그먼트 객채셍성
            setFrag(0); //프래그먼트 교체 처음은 메인화면뜨게


            BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
            navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        }

        //  지금딱히필요없다 .--------------------
        @Override
        public void onClick(View v){

        }
        //---------------------------------------


        @Override
        public void onBackPressed() {
            super.onBackPressed();
//            setTitle("15번 벤치"); //백버튼눌렀을때 타이틀정의
            ActivityName("15번 벤치");
        }


        public void setFrag(int n){    //프래그먼트를 교체하는 작업을 하는 메소드를 만들었습니다
                         FragmentManager fm = getSupportFragmentManager();
                         tran = fm.beginTransaction();
                        switch (n){
                            case 0:
                                tran.replace(R.id.main_frame, frag1);  //replace의 매개변수는 (프래그먼트를 담을 영역 id, 프래그먼트 객체) 입니다.
                                tran.commit();
                                break;
                            case 1:
                                tran.replace(R.id.main_frame, frag2);  //replace의 매개변수는 (프래그먼트를 담을 영역 id, 프래그먼트 객체) 입니다.
                                tran.commit();
                                break;
                            case 2:
                                tran.replace(R.id.main_frame, frag3);  //replace의 매개변수는 (프래그먼트를 담을 영역 id, 프래그먼트 객체) 입니다.
                                tran.commit();
                break;
        }
    }

    public void ActivityName(String name)
    {
        ActionBar actionBar = getSupportActionBar();
        LayoutInflater inflator = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View activityName = inflator.inflate(R.layout.custom_actionbar, null);
        ((TextView) activityName.findViewById(R.id.title)).setText(name);
//        Typeface robotoBoldCondensedItalic = Typeface.createFromAsset(getAssets(), "fonts/bisque.ttf");
//        ((TextView) activityName.findViewById(R.id.title)).setTypeface(robotoBoldCondensedItalic);
        actionBar.setCustomView(activityName);
    }

//    액션바커스텀
        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            ActionBar actionBar = getSupportActionBar();

            // Custom Actionbar를 사용하기 위해 CustomEnabled을 true 시키고 필요 없는 것은 false 시킨다
            actionBar.setDisplayShowCustomEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(false);            //액션바 아이콘을 업 네비게이션 형태로 표시합니다.
            actionBar.setDisplayShowTitleEnabled(false);        //액션바에 표시되는 제목의 표시유무를 설정합니다.
            actionBar.setDisplayShowHomeEnabled(false);            //홈 아이콘을 숨김처리합니다.
            //layout을 가지고 와서 actionbar에 포팅을 시킵니다.
            LayoutInflater inflater = (LayoutInflater)getSystemService(LAYOUT_INFLATER_SERVICE);
            View actionbar = inflater.inflate(R.layout.custom_actionbar, null);
            actionBar.setCustomView(actionbar);
            //액션바 양쪽 공백 없애기
            Toolbar parent = (Toolbar)actionbar.getParent();
            parent.setContentInsetsAbsolute(0,0);
            ActivityName("15번 벤치");
            return true;
        }
//        ------------------------------
}

