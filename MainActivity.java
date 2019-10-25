package com.example.loginactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Layout;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView register = (TextView)findViewById(R.id.lnkRegister);
        LinearLayout l =(LinearLayout) findViewById(R.id.l) ;
        register.setMovementMethod(LinkMovementMethod.getInstance());
       register.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
                 Intent intent = new Intent(MainActivity.this, Registration.class);
                startActivity(intent);
               final ProgressDialog progressDialog = new ProgressDialog(MainActivity.this,
                       R.style.Theme_AppCompat_Light_Dialog);
               progressDialog.setIndeterminate(true);
               progressDialog.setMessage("wait a Moment...");
               progressDialog.show();
           }
       });
    }

}
