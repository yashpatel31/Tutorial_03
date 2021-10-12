package com.example.tutorial_03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText Uname,Pass;
    Button Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Uname = findViewById(R.id.uname);
        Pass = findViewById(R.id.pass);
        Login = findViewById(R.id.login);
    }

    public void login(View v)
    {
        if(Uname.getText().toString().equals("admin@gmail.com") && Pass.getText().toString().equals("admin")){
            Intent intent = new Intent(MainActivity.this,HomeActivity.class);

            startActivity(intent);
            finish();
        }else{
            Toast.makeText(MainActivity.this, "Enter Valid credentials", Toast.LENGTH_SHORT).show();
        }
    }
}