package com.androidstudy.toolbarscrollviewexample;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LocationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);

        Button btnGoMain = (Button) findViewById(R.id.btnGoMain);
        Button btnLogout = (Button) findViewById(R.id.btnLogout);

        btnGoMain = (Button)findViewById(R.id.btnGoMain);
        btnGoMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SignUpSuccess.class);
                startActivity(intent);
            }
        });

        btnLogout = (Button)findViewById(R.id.btnLogout);
        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intent);
            }
        });

        // Fragment를 추가하는 소스를 코딩해 줍니다!
        if(savedInstanceState == null){
            MainFragment mainFragment = new MainFragment();
            // tag: 식별 명칭은 "main"으로 처리합니다.
            getSupportFragmentManager().beginTransaction().replace(R.id.mainFragment, mainFragment, "main").commit();
        }
    }
}
