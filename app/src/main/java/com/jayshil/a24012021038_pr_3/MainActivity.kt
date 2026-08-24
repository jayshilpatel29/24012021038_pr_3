package com.jayshil.a24012021038_pr_3

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.AlarmClock
import android.provider.CallLog
import android.provider.MediaStore
import android.telecom.Call
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.core.net.toUri

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        implicit()
        bcd()

    }
    fun implicit(){
        findViewById<Button>(R.id.btn_browse).setOnClickListener {
            Intent(Intent.ACTION_MAIN, Uri.parse(findViewById<EditText>(R.id.etWeb).text.toString())).also {
                startActivity(it)
            }
        }
        val number=findViewById<EditText>(R.id.etPhone).text.toString()
        val intent= Intent(Intent.ACTION_DIAL).setData("tel,$number".toUri())
        val callbutton=findViewById< Button>(R.id.btn_call)
        callbutton.setOnClickListener {
            startActivity(intent)
        }
        findViewById<Button>(R.id.btn_call).setOnClickListener {
            Intent(Intent.ACTION_VIEW).setType(CallLog.Calls.CONTENT_TYPE).apply { startActivity(this) }

        }
        findViewById<Button>(R.id.btn_alarm).setOnClickListener {
            Intent(AlarmClock.ACTION_SHOW_ALARMS).also { startActivity(it) }

        }
        findViewById<Button>(R.id.btn_camera).setOnClickListener {
            Intent(MediaStore.ACTION_IMAGE_CAPTURE).also { startActivity(it) }

        }
        findViewById<Button>(R.id.btn_gallery).setOnClickListener {
            Intent(Intent.ACTION_VIEW).setType("image/*").apply { startActivity(this) }

        }


        }
    fun bcd() {
        findViewById<Button>(R.id.btn_login).setOnClickListener {
            Intent(this@MainActivity, MainActivityLogin::class.java).also {
                startActivity(it)
            }

        }
    }

    }
