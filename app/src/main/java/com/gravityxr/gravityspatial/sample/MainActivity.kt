package com.gravityxr.gravityspatial.sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.gravityxr.gravitysdk.ar.GravityXR

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        GravityXR.init(application, {
            GravityXR.launchHome(this)
        }, {
            Toast.makeText(
                this,
                "Problem in launching the app, please check tenant id",
                Toast.LENGTH_SHORT
            ).show();
            System.exit(0)
        })
    }
}