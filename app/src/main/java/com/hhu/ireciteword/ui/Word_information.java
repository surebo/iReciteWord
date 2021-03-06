package com.hhu.ireciteword.ui;
/*
 * Created by 李雪滢 on 2020.4.16
 */

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.hhu.ireciteword.R;

//活动：单词详情页
public class Word_information extends AppCompatActivity {

    TextView wordView;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        Intent intent=getIntent();



        //单词详情页
        setContentView(R.layout.word_information);
        findViewById(R.id.back2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it =new Intent(Word_information.this, com.hhu.ireciteword.MainActivity.class);
                startActivity(it);
                Toast.makeText(Word_information.this,"你进入下一个界面",Toast.LENGTH_LONG).show();
            }
        });
        //通过按钮search,跳转到查单词界面，search_word
        findViewById(R.id.search2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it =new Intent(Word_information.this,Search_word.class);
                startActivity(it);
                Toast.makeText(Word_information.this,"你进入下一个界面",Toast.LENGTH_LONG).show();
            }
        });

        //通过按钮"下一个"，进入下一个单词界面,Word_recite1.java
        findViewById(R.id.next).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it =new Intent(Word_information.this, Word_recite1.class);
                startActivity(it);
                Toast.makeText(Word_information.this,"你进入下一个界面",Toast.LENGTH_LONG).show();
            }
        });

    }

    private void initView(){
        wordView=findViewById(R.id.word);

    }
}
