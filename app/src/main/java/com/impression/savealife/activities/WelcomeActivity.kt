package com.impression.savealife.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.impression.savealife.R

class WelcomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        findViewById<Button>(R.id.welcome_login_btn).setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }

        findViewById<Button>(R.id.welcome_home_btn).setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
        }
    }

    override fun onBackPressed() {
//        EXIT APP
    }
}
