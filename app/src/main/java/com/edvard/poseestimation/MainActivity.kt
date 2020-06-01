package com.edvard.poseestimation

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity(),View.OnClickListener{

    private var nextbtn: Button? = null
    private var skipbtn: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nextbtn = findViewById(R.id.nextbtn)
        skipbtn =findViewById(R.id.skipbtn)

        nextbtn!!.setOnClickListener(this)
        skipbtn!!.setOnClickListener(this)


    }


    override fun onClick(view: View?) {
        if (view === nextbtn) {

            startActivity(Intent(applicationContext, Login::class.java))
        }
        if (view === skipbtn) {

            startActivity(Intent(applicationContext, CameraActivity::class.java))
        }

    }




}

