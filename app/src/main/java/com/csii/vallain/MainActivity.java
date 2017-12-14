package com.csii.vallain;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private Button normal;
    private Button warning;
    private Button info;
    private Button success;
    private Button error;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "原生Toast", Toast.LENGTH_SHORT).show();
            }
        });
        normal = (Button) findViewById(R.id.normal);
        normal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toasty.normal(MainActivity.this, "普通Toasty").show();
            }
        });

        warning = (Button) findViewById(R.id.warning);
        warning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toasty.warning(MainActivity.this, "警告Toasty", Toast.LENGTH_SHORT, true).show();
            }
        });

        info = (Button) findViewById(R.id.info);
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toasty.info(MainActivity.this, "信息Toasty", Toast.LENGTH_SHORT, true).show();
            }
        });
        success = (Button) findViewById(R.id.success);
        success.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toasty.success(MainActivity.this, "成功Toasty", Toast.LENGTH_SHORT, true).show();
            }
        });

        error = (Button) findViewById(R.id.error);
        error.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toasty.error(MainActivity.this, "错误Toasty", Toast.LENGTH_SHORT, true).show();
            }
        });
    }
}
