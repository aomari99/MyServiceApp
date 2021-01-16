package com.example.myserviceapp

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.InetAddress
import java.net.Socket
import java.nio.charset.Charset
import java.nio.charset.StandardCharsets

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val conbtn = findViewById<Button>(R.id.connbtn)
        val info = findViewById<TextView>(R.id.info)
        conbtn.setOnClickListener(){

       /*     Intent(this, MyService::class.java).also { intent ->
                startService(intent)
            }*/
            val startIntent = Intent(this, MyService::class.java)
            //startIntent.putExtra("inputExtra", message)
            ContextCompat.startForegroundService(this, startIntent)

    }
}

}