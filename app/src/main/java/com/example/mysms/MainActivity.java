package com.example.mysms;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText ednum,edmsg;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ednum=findViewById(R.id.editTextPhone);
                edmsg=findViewById(R.id.editTextTextPersonName2);
                SmsManager sm= SmsManager.getDefault();
                sm.sendTextMessage(ednum.getText().toString(),null,edmsg.getText().toString(),null,null);
            }
        });
    }
}