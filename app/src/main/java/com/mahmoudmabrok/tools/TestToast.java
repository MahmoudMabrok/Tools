package com.mahmoudmabrok.tools;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;

import com.mahmoudmabrok.toasty.Toasty;

import androidx.appcompat.app.AppCompatActivity;

public class TestToast extends AppCompatActivity {

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_toast);

        Toasty.showMessageAtXY(this, "HI", 0, 0);

        LinearLayout linearLayout = findViewById(R.id.root);
        linearLayout.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_UP) {
                    float x = event.getX();
                    float y = event.getY();
                    Toasty.showMessageAtXY(TestToast.this, "A", (int) x, (int) y);
                }


                return true;
            }
        });

    }
}
