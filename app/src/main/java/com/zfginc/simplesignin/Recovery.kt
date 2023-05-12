package com.zfginc.simplesignin

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

private const val MAIL = "admin@gmail.com"
private const val PASSWORD = "admin"
class Recovery : AppCompatActivity() {

    private lateinit var login_button: Button;

    private lateinit var login_google: ImageButton;
    private lateinit var login_facebook: ImageButton;
    private lateinit var login_twitter: ImageButton;

    private lateinit var fogot_password: TextView;

    private lateinit var username_input: EditText;
    private lateinit var password_input: EditText;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
/*
        login_button = findViewById(R.id.login_button);
        login_google = findViewById(R.id.login_google);
        login_facebook = findViewById(R.id.login_facebook);
        login_twitter = findViewById(R.id.login_twitter);
        fogot_password = findViewById(R.id.forgot_password);
        username_input = findViewById(R.id.username);
        password_input = findViewById(R.id.password);

        login_button.setOnClickListener(){
            login();
        }

        fogot_password.setOnClickListener(){
            showToast("usr/pas - admin/admin")
        }
        */
    }

}