package com.example.dentalpass;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.media.Image;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton[] imageButtons_list = new ImageButton[32];

        /*ImageButton btn1 = (ImageButton) findViewById(R.id.imageButton1);
        ImageButton btn2 = (ImageButton) findViewById(R.id.imageButton2);
        ImageButton btn3 = (ImageButton) findViewById(R.id.imageButton3);
        ImageButton btn4 = (ImageButton) findViewById(R.id.imageButton4);
        ImageButton btn5 = (ImageButton) findViewById(R.id.imageButton5);
        ImageButton btn6 = (ImageButton) findViewById(R.id.imageButton6);
        ImageButton btn7 = (ImageButton) findViewById(R.id.imageButton7);
        ImageButton btn8 = (ImageButton) findViewById(R.id.imageButton8);
        ImageButton btn9 = (ImageButton) findViewById(R.id.imageButton9);
        ImageButton btn10 = (ImageButton) findViewById(R.id.imageButton10);
        ImageButton btn11 = (ImageButton) findViewById(R.id.imageButton11);
        ImageButton btn12 = (ImageButton) findViewById(R.id.imageButton12);
        ImageButton btn13 = (ImageButton) findViewById(R.id.imageButton13);
        ImageButton btn14 = (ImageButton) findViewById(R.id.imageButton14);
        ImageButton btn15 = (ImageButton) findViewById(R.id.imageButton15);
        ImageButton btn16 = (ImageButton) findViewById(R.id.imageButton16);
        ImageButton btn17 = (ImageButton) findViewById(R.id.imageButton17);
        ImageButton btn18 = (ImageButton) findViewById(R.id.imageButton18);
        ImageButton btn19 = (ImageButton) findViewById(R.id.imageButton19);
        ImageButton btn20 = (ImageButton) findViewById(R.id.imageButton20);
        ImageButton btn21 = (ImageButton) findViewById(R.id.imageButton21);
        ImageButton btn22 = (ImageButton) findViewById(R.id.imageButton22);
        ImageButton btn23 = (ImageButton) findViewById(R.id.imageButton23);
        ImageButton btn24 = (ImageButton) findViewById(R.id.imageButton24);
        ImageButton btn25 = (ImageButton) findViewById(R.id.imageButton25);
        ImageButton btn26 = (ImageButton) findViewById(R.id.imageButton26);
        ImageButton btn27 = (ImageButton) findViewById(R.id.imageButton27);
        ImageButton btn28 = (ImageButton) findViewById(R.id.imageButton28);
        ImageButton btn29 = (ImageButton) findViewById(R.id.imageButton29);
        ImageButton btn30 = (ImageButton) findViewById(R.id.imageButton30);
        ImageButton btn31 = (ImageButton) findViewById(R.id.imageButton31);
        ImageButton btn32 = (ImageButton) findViewById(R.id.imageButton32);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn10.setOnClickListener(this);
        btn11.setOnClickListener(this);
        btn12.setOnClickListener(this);
        btn13.setOnClickListener(this);
        btn14.setOnClickListener(this);
        btn15.setOnClickListener(this);
        btn16.setOnClickListener(this);
        btn17.setOnClickListener(this);
        btn18.setOnClickListener(this);
        btn19.setOnClickListener(this);
        btn20.setOnClickListener(this);
        btn21.setOnClickListener(this);
        btn22.setOnClickListener(this);
        btn23.setOnClickListener(this);
        btn24.setOnClickListener(this);
        btn25.setOnClickListener(this);
        btn26.setOnClickListener(this);
        btn27.setOnClickListener(this);
        btn28.setOnClickListener(this);
        btn29.setOnClickListener(this);
        btn30.setOnClickListener(this);
        btn31.setOnClickListener(this);
        btn32.setOnClickListener(this);

        ImageButton[] imageButtons_list = {btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10,
                btn11, btn12, btn13, btn14, btn15, btn16, btn17, btn18, btn19, btn20, btn21, btn22, btn23,
                btn24, btn25, btn26, btn27, btn28, btn29, btn30, btn31, btn32};
        */

        int[] imageButtons_id = {R.id.imageButton1, R.id.imageButton2, R.id.imageButton3, R.id.imageButton4,
                R.id.imageButton5, R.id.imageButton6, R.id.imageButton7, R.id.imageButton8, R.id.imageButton9,
                R.id.imageButton10, R.id.imageButton11, R.id.imageButton12, R.id.imageButton13, R.id.imageButton14,
                R.id.imageButton15, R.id.imageButton16, R.id.imageButton17, R.id.imageButton18, R.id.imageButton19,
                R.id.imageButton20, R.id.imageButton21, R.id.imageButton22, R.id.imageButton23, R.id.imageButton24,
                R.id.imageButton25, R.id.imageButton26, R.id.imageButton27, R.id.imageButton28, R.id.imageButton29,
                R.id.imageButton30, R.id.imageButton31, R.id.imageButton32};

        int[] redImages_id = {R.drawable.red1, R.drawable.red2, R.drawable.red3, R.drawable.red4, R.drawable.red5,
                R.drawable.red6, R.drawable.red7, R.drawable.red8, R.drawable.red9, R.drawable.red10,
                R.drawable.red11, R.drawable.red12, R.drawable.red13, R.drawable.red14, R.drawable.red15,
                R.drawable.red16, R.drawable.red17, R.drawable.red18, R.drawable.red19, R.drawable.red20,
                R.drawable.red21, R.drawable.red22, R.drawable.red23, R.drawable.red24, R.drawable.red25,
                R.drawable.red26, R.drawable.red27, R.drawable.red28, R.drawable.red29, R.drawable.red30,
                R.drawable.red31, R.drawable.red32};

        for (int i = 0; i <= 31; ++i) {
            imageButtons_list[i] = findViewById(imageButtons_id[i]);
            int finalI = i;
            imageButtons_list[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    imageButtons_list[finalI].setImageResource(redImages_id[finalI]);
                }
            });
        }
    }
}