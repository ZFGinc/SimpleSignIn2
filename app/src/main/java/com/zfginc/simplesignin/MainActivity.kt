package com.zfginc.simplesignin

import android.content.Intent
import android.os.Bundle
import android.util.Patterns
import android.widget.*
import androidx.appcompat.app.AppCompatActivity


private const val EMAIL = "admin@gmail.com"
private const val PASSWORD = "admin"

class MainActivity : AppCompatActivity() {

    private lateinit var login_button: Button;
    private lateinit var fogot_password: TextView;

    private lateinit var email_input: EditText;
    private lateinit var password_input: EditText;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        login_button = findViewById(R.id.login_button);
        fogot_password = findViewById(R.id.forgot_password);
        email_input = findViewById(R.id.email);
        password_input = findViewById(R.id.password);

        login_button.setOnClickListener(){
            login();
        }

        fogot_password.setOnClickListener(){
            startActivity(Intent(this@MainActivity, Recovery::class.java))
        }

    }

    private fun showToast(id: Int){
        Toast.makeText(this, id, Toast.LENGTH_SHORT).show()
    }
    private fun showToast(text: String){
        Toast.makeText(this, text, Toast.LENGTH_LONG).show()
    }

    private fun login(){
        var email = email_input.getText().toString()
        var password = password_input.getText().toString()

        if(email == "" || password == "") {
            showToast(R.string.none_field)
            return
        }

        if(!isEmailValid(email)){
            showToast(R.string.email_not_valid)
            return
        }

        if(email == EMAIL && password == PASSWORD)
            showToast(R.string.correct_login)
        else
            showToast(R.string.uncorrect_login)
    }

    private fun isEmailValid(email: String?): Boolean {
        return Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }
}