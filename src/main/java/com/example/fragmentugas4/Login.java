package com.example.fragmentugas4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    EditText user, password;
    Button login;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    public Boolean savelogin;
    CheckBox saveloginchechbox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        user = (EditText) findViewById(R.id.user);
        password = (EditText) findViewById(R.id.password);
        login = (Button) findViewById(R.id.btnlogin);

        sharedPreferences = getSharedPreferences("loginref", MODE_PRIVATE);
        saveloginchechbox = (CheckBox) findViewById(R.id.checkBox);
        editor = sharedPreferences.edit();

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login();
            }
        });
        savelogin = sharedPreferences.getBoolean("savelogin", true);
        if (savelogin == true) {
            user.setText(sharedPreferences.getString("user", null));
            password.setText(sharedPreferences.getString("password", null));
        }
    }


    public void login(){
        String username = user.getText().toString();
        String pass = password.getText().toString();
        if (username.equals("Asa") && pass.equals("08042020")){
            Intent intent = new Intent(Login.this, MainActivity.class);
            startActivity(intent);
            Toast.makeText(this, "username and password matched", Toast.LENGTH_LONG).show();
            if (saveloginchechbox.isChecked()){
                editor.putBoolean("savelogin", true);
                editor.putString("user", username);
                editor.putString("password", pass);
                editor.commit();
            }
        } else {
            Toast.makeText(this, "error",Toast.LENGTH_LONG).show();
        }
    }
}