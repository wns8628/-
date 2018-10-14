package com.example.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class dtail_menu_activity extends AppCompatActivity implements View.OnClickListener {
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                super.onBackPressed();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_dtail_menu_activity);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ImageButton Call = (ImageButton) findViewById(R.id.call);
        Call.setOnClickListener(this);

        TextView textView = (TextView) findViewById(R.id.pay);
        ImageView imageView = (ImageView) findViewById(R.id.dtail);

        Intent intent = getIntent();
        String name = intent.getExtras().getString("pay");

        //----------------------------------------------백운
        if (name.equals("best_1")) {
            setTitle("백운중국관");
            textView.setTextSize(12);
            textView.setText("(소) 11,000원(3명 적당)\n두루치기+공기밥3+짬뽕국물\n\n" +
                             "(중) 16,000원(4명 적당)\n두루치기+공기밥5+짬뽕국물\n\n" +
                             "(대) 24,000원(6~7명 적당)\n두루치기+공기밥8+짬뽕국물+덮밥?");
            imageView.setImageResource(R.drawable.best_1d);

            Call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String tel = "tel:0516238229";
                    startActivity(new Intent("android.intent.action.DIAL", Uri.parse(tel)));
                }
            });
        }
        //--------------------------------------------------------
        //----------------------------------2----
        if (name.equals("best_2")) {
            setTitle("주구장창 석쇠불판");
            textView.setTextSize(12);
            textView.setText(
                            "영업시간 : 오전11시~밤12시, 일요일: 오후 12시30분~밤12시.\n" +
                            "밥따로 시켜야됩니다.\n\n" +
                            "-직화 고추장불고기/직화 간장불고기-\n"+
                            "(소) 16,000원\n(중) 21,000원\n(대) 27,000원\n(특대) 30,000원(+쫄면)\n\n\n" +
                            "-직화불고기 Sea(해물들어간것)-\n"+
                            "(소) 18,000원\n(중) 23,000원\n(대) 29,000원\n(특대) 32,000원(+쫄면?)\n\n\n"+
                            "-겁나 불닭발(뼈or무뼈)-\n"+
                            "(소) 17,000원\n(중) 22,000원\n\n\n"+
                            "-직화양념 불막창-\n" +
                            "(중) 24,000원\n(대) 31,000원");

            imageView.setImageResource(R.drawable.best_2d);

            Call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String tel = "tel:0516210792";
                    startActivity(new Intent("android.intent.action.DIAL", Uri.parse(tel)));
                }
            });
        }
      //----------------------------------2----
      //------------------------------3-----------
        if (name.equals("best_3")) {
            setTitle("구구닭촌");
            textView.setTextSize(12);
            textView.setText(
                    "*영업시간 : 11시 ~ 새벽1시\n"+
                    "*땡초 선택시 1000원추가\n카드결제시 미리말해주세요\n\n"+

                    "-한마리 메뉴(양,간,후 中 1개)-\n"+
                    "(순살) 12,000원\n(뼈) 13,000원\n " +
                    "-한마리+호프1000cc-\n" +
                    "순살-15,000원,뼈-16,000원\n\n" +

                    "-두마리 세트(후라이드or양념or간장)\n"+
                    "(순살) 17,000원\n(뼈) 19,000원\n(땡초치킨은 각각1000원추가됨)\n\n"+

                    "-세마리 세트(양념+간장+후라이드)-\n"+
                    "(순살) 25,000원\n(뼈) 29,000원\n");

            imageView.setImageResource(R.drawable.best_3d);

            Call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String tel = "tel:0516119245";
                    startActivity(new Intent("android.intent.action.DIAL", Uri.parse(tel)));
                }
            });
        }
      //------------------------------3----------
        //-----------------------------4---------
        if (name.equals("best_4")) {
            setTitle("신불떡볶이");
            textView.setTextSize(12);
            textView.setText(
                    "*영업시간 : 오전 11시 ~ 밤 12시 까지, 카드결제미리말해주세요\n"+
                    "*대연동 10,000원이상배달 그 외지역 12,000원이상배달\n\n"+

                    "-떡볶이/김밥-\n"+
                    "떡볶이(순한맛/매운맛)-2,500원\n" +
                    "치즈떡볶이(순한맛/매운맛)-3,500원\n " +
                    "신불김밥-1,500원\n" +
                    "신불치즈김밥-2,500원\n" +
                    "신불컵밥-3,500원\n" +
                    "참치마요컵밥-3,500원\n"+
                    "치킨마요컵밥-3,500원\n"+
                    "스팸마요컵밥-3,500원\n\n"+

                    "-튀김류\n"+
                    "오뎅-1,000원\n" +
                    "만두-1,000원\n" +
                    "춘권-1,000원\n" +
                    "김말이-2,000원\n"+
                    "튀말이-1,000원\n"+
                    "단호박-1,000원\n"+
                    "치즈스틱-1,000원\n"+
                    "오징어튀김-1,500원\n"+
                    "감자튀김-1,500원\n\n"+

                    "-음료,그외?-\n"+
                    "쿨피스-1,500원\n" +
                    "콜라-1,500원\n"+
                    "사이다-1,500원\n"+
                    "팥빙수-5,000\n"+
                    "순대-3,500\n\n" +

                    "-세트메뉴(구성변경가능)-\n"+
                    "떡+오뎅+만두+튀말이+쿨피스\n-7,000원\n\n" +
                    "떡+오뎅2+만두+튀말이+김밥+쿨피스\n-9500\n\n"+
                    "떡+오뎅2+만두+튀말이+팥빙수\n-11,500원\n\n"+
                    "떡+치떡+오뎅2+만두2+튀말이+김밥\n-12,500원\n\n"+
                    "떡+치떡+오뎅2+만두2+튀말이2\n+김밥+쿨피스-15,000원\n\n+" +
                    "떡+치떡+오뎅2+만두2+튀말이2\n+김밥+치즈김밥+쿨피스-17,500원\n\n"+
                    "떡+치떡+오뎅2+만두2+튀말이2\n+치즈스틱2+김말이+김밥+치즈김밥\n+쿨피스-21,500원"
            );

            imageView.setImageResource(R.drawable.best_4d);

            Call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String tel = "tel:0516256338";
                    startActivity(new Intent("android.intent.action.DIAL", Uri.parse(tel)));
                }
            });
        }
        //--------------------------------------4--
        //-------------------------------------------------5-----
        if (name.equals("best_5")) {
            setTitle("화성루");
            textView.setTextSize(12);
            textView.setText(
                    "-두루치기정식-\n"+
                    "(2인상) 10,000원\n\n" +
                    "(3인상) 15,000원\n\n" +
                    "(5인상) 20,000원\n");
            imageView.setImageResource(R.drawable.best_5d);

            Call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String tel = "tel:0516228512";
                    startActivity(new Intent("android.intent.action.DIAL", Uri.parse(tel)));
                }
            });
        }
        //-------------------------------------------------5------
    }

    @Override
    public void onClick(View v) {

    }
}
