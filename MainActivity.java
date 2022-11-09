package com.example.mpproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView ChooseSeason;
    CheckBox ChkSS, ChkFW;
    RadioGroup RdoSS, RdoFW;
    RadioButton 반팔, 반바지, 슬리퍼;
    RadioButton 긴팔, 긴바지, 자켓;
    Button BtnOK;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Fashion Magazine");
        ChooseSeason = (TextView)  findViewById(R.id.ChooseSeason);
        ChkSS = (CheckBox)  findViewById(R.id.ChkSS);
        ChkFW = (CheckBox) findViewById(R.id.ChkFW);
        RdoSS = (RadioGroup) findViewById(R.id.RdoSS);
        RdoFW = (RadioGroup) findViewById(R.id.RdoFW);

        반팔 = (RadioButton) findViewById(R.id.반팔);
        반바지 = (RadioButton) findViewById(R.id.반바지);
        슬리퍼 = (RadioButton) findViewById(R.id.슬리퍼);

        긴팔 = (RadioButton) findViewById(R.id.반팔);
        긴바지 = (RadioButton) findViewById(R.id.반팔);
        자켓 = (RadioButton) findViewById(R.id.반팔);

        BtnOK = (Button) findViewById(R.id.BtnOK);

        ChkSS.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if(ChkSS.isChecked() == true)
                {
                    ChkFW.setEnabled(false);
                    RdoSS.setVisibility(View.VISIBLE);
                    BtnOK.setVisibility(View.VISIBLE);

                    BtnOK.setOnClickListener(new View. OnClickListener() //선택완료 버튼 누렀을 때 페이지 이동
                    {
                        public void onClick(View view)
                        {

                            Intent intent = new Intent(MainActivity.this, SpringSummer_SubActivity.class);
                            startActivity(intent); //페이지 이동
                        }
                    });

                }
                else
                {

                    ChkFW.setEnabled(true);
                    RdoSS.setVisibility(View.INVISIBLE);
                    BtnOK.setVisibility(View.INVISIBLE);
                }
            }
        });

        ChkFW.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if(ChkFW.isChecked() == true)
                {
                    ChkSS.setEnabled(false);
                    RdoSS.setVisibility(View.GONE);
                    RdoFW.setVisibility(View.VISIBLE);
                    BtnOK.setVisibility(View.VISIBLE);

                    BtnOK.setOnClickListener(new View. OnClickListener() //선택완료 버튼 누렀을 때 페이지 이동
                    {
                        public void onClick(View view)
                        {

                            Intent intent = new Intent(MainActivity.this, FallWinter_SubActivity2.class);
                            startActivity(intent); //페이지 이동
                        }
                    });

                }
                else
                {
                    ChkSS.setEnabled(true);
                    ChkSS.setVisibility(View.VISIBLE);
                    RdoFW.setVisibility(View.INVISIBLE);
                    BtnOK.setVisibility(View.INVISIBLE);
                }
            }
        });


    }
}
