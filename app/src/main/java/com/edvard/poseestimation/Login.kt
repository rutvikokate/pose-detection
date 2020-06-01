package com.edvard.poseestimation

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Login : AppCompatActivity() , View.OnClickListener{

    private var example: Button? = null
    private var launchbtn: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        example = findViewById(R.id.example)
        launchbtn =findViewById(R.id.launchbtn)

        launchbtn!!.setOnClickListener(this)
        example!!.setOnClickListener(this)
    }


    override fun onClick(view: View?) {
        if (view === launchbtn) {

            startActivity(Intent(applicationContext,CameraActivity::class.java))
        }
        if (view === example) {

            startActivity(Intent(applicationContext, Examples::class.java))
        }

    }

}
