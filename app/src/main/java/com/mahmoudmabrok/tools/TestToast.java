package com.mahmoudmabrok.tools;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.mahmoudmabrok.toasty.Toasty;

import androidx.appcompat.app.AppCompatActivity;

public class TestToast extends AppCompatActivity {

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_toast);

        Button btnCenter = findViewById(R.id.btnAtCenter);
        btnCenter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toasty.showMessageAtCenter(TestToast.this, "Center");
            }
        });

        Button btnAtXY = findViewById(R.id.btnAtXY);
        btnAtXY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toasty.showMessageAtXY(TestToast.this, "XY", 120, 254);
            }
        });

        Button btnSuccess = findViewById(R.id.btnSuccess);
        btnSuccess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toasty.success(TestToast.this, "Success").show();
            }
        });

        Button btnError = findViewById(R.id.btnError);
        btnError.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toasty.error(TestToast.this, "Error").show();
            }
        });


    }
}
