package com.example.pushnotification

import android.app.NotificationChannel
import android.app.NotificationManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.google.firebase.messaging.FirebaseMessaging

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


      //  throw RuntimeException("Test Crash") // Force a crash

        /*FirebaseMessaging.getInstance().subscribeToTopic("weather")
            .addOnCompleteListener { task ->
                var msg = "Successful"
                if (!task.isSuccessful) {
                    msg = "Failed"
                }
                Toast.makeText(baseContext, msg, Toast.LENGTH_SHORT).show()
            }*/
    }
}