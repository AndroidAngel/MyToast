package com.teamandroidangel.iamangelauditor.mytoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view){

        ImageView emoticon = (ImageView) findViewById(R.id.imageView1);

        emoticon.setImageResource(R.drawable.emoticon2);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
