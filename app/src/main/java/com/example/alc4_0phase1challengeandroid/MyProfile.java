package com.example.alc4_0phase1challengeandroid;

import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

public class MyProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile);

        Toolbar toolbar=(Toolbar) findViewById(R.id.toolbar);//Uses custom toolbar instead of original app actionbar
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

       // TextView txtName=(TextView) findViewById(R.id.textView_Name);
        //txtName.setPaintFlags(txtName.getPaintFlags()| Paint.UNDERLINE_TEXT_FLAG);//Underlines Name

        ImageView imgView=(ImageView) findViewById(R.id.imageView_myImageView);
        imgView.setImageResource(R.drawable.my_pic);
        imgView.getLayoutParams().height=getResources().getDisplayMetrics().heightPixels/2;

        ImageButton imgBack=(ImageButton) findViewById(R.id.imageButton_profileback);
        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyProfile.super.onBackPressed();
            }
        });


    }



}
