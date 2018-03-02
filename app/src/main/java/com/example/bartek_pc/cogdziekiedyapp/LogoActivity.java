package com.example.bartek_pc.cogdziekiedyapp;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class LogoActivity extends AppCompatActivity {

    public ImageView imageViewMain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        imageViewMain=(ImageView) findViewById((R.id.imageViewMain));
        Bitmap myBitmap = BitmapFactory.decodeFile("F:\\AndroidStudioProjects\\CoGdzieKiedyApp\\images\\beer.jpg");
        imageViewMain.setImageBitmap(myBitmap);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logo);
    }
}
