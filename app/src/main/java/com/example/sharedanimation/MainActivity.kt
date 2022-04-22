package com.example.sharedanimation

import android.app.ActivityOptions
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Pair as UtilPair
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        go_btn.setOnClickListener {
            val intent = Intent(this, SharedActivity :: class.java)

            val options = ActivityOptions.makeSceneTransitionAnimation(this,
            UtilPair.create(image_new_user,"imageTransit"),
            UtilPair.create(userDesc,"descTransit"))

            startActivity(intent, options.toBundle())
        }
    }

}