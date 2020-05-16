package com.example.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.WindowManager;

import com.example.ui.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        b = ActivityMainBinding.inflate(getLayoutInflater());
        View view = b.getRoot();
        setContentView(view);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        SpannableString spannableString=new SpannableString(b.dm.getText());
        ForegroundColorSpan w= new ForegroundColorSpan(Color.WHITE);
        spannableString.setSpan(w,0,6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        b.dm.setText(spannableString);

    }
}
