package com.sms.sendsms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void sendSMS(View v)
    {
        String num1 = "01718747846";
        String num = "smsto:"+num1;
        String valuet = "This sms made by Andorid app from:"+num1;
        Uri uri = Uri.parse(num);
        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
        intent.putExtra("sms_body", valuet);
        startActivity(intent);
    }
}
