package com.example.mypotfolio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView myName, starr, txt;
    EditText text;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myName = findViewById(R.id.name);
        txt = findViewById(R.id.dear);
        text = findViewById(R.id.nickname);
        btn = findViewById(R.id.button);
        starr = findViewById(R.id.star);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nickName = text.getText().toString();
                if (nickName.isEmpty()){
                    text.setError("Enter Your Nickname");
                }
                else {
                    myName.setText(nickName);
                    txt.setText("Dear "+nickName);
                }
            }
        });

        starr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "This is my simple potfolio", Toast.LENGTH_SHORT).show();
            }
        });
    }
}