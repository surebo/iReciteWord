package com.hhu.ireciteword.ui;
/*
 * Created by 张佳豪 on 4.18
 */
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.hhu.ireciteword.R;

public class Challengetwo_back extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.challenge_two);
        ImageButton challengetwoback = findViewById(R.id.challengetwoback);
        challengetwoback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Challengetwo_back.this, Dakachallenge_back.class);
                startActivity(it);
                Toast.makeText(Challengetwo_back.this, "你返回打卡挑战页面", Toast.LENGTH_LONG).show();
            }
        });

        Button challengetwo=findViewById(R.id.challengetwo);
        challengetwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Challengetwo_back.this, com.hhu.ireciteword.MainActivity.class);
                startActivity(it);
                Toast.makeText(Challengetwo_back.this, "开始打卡", Toast.LENGTH_LONG).show();
            }
        });
    }
}

