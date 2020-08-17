package com.impression.savealife

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.bottomnavigation.BottomNavigationView

class ProfileActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        title = resources.getString(R.string.profile)
        bottomNavigationInitialize(R.id.nav_profile)

//        Initialization
        val editButton: Button = findViewById(R.id.profile_edit_btn)
        val historyButton:Button = findViewById(R.id.profile_history_btn)

//        Events
        editButton.setOnClickListener {  }

        historyButton.setOnClickListener {
            val intent = Intent(this, HistoryActivity::class.java)
            startActivity(intent)
        }


    }

    fun bottomNavigationInitialize(selectedItemId: Int){
        //Initialization
        val bottomnavigation: BottomNavigationView = findViewById(R.id.bottom_navigation)

        //Item selected
        bottomnavigation.selectedItemId = selectedItemId

        //Item Selected Listener
        bottomnavigation.setOnNavigationItemSelectedListener {
            when (it.itemId) {

                R.id.nav_home -> {
                    startActivity(Intent(this, HomeActivity::class.java))
                    overridePendingTransition(0,0)
                    return@setOnNavigationItemSelectedListener true
                }

                R.id.nav_notifications -> {
                    startActivity(Intent(this, NotificationsActivity::class.java))
                    overridePendingTransition(0,0)
                    return@setOnNavigationItemSelectedListener true
                }

                R.id.nav_profile -> return@setOnNavigationItemSelectedListener true
            }
            return@setOnNavigationItemSelectedListener false

        }
    }
}
