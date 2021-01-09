package com.example.autorizacia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_profile.*

class profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        val profilepicture = "https://www.pandasecurity.com/en/mediacenter/src/uploads/2013/11/pandasecurity-facebook-photo-privacy.jpg"
        if (profilepicture !== null) {
            Glide.with(this)
                .load(profilepicture)
                .into(profilePic)
        } else {
            profilePic.setImageResource(R.drawable.ic_launcher_background)
        }

        val coverpicture = "https://images.unsplash.com/photo-1529736576495-1ed4a29ca7e1?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=1080&fit=max"
        if (coverpicture !== null) {
            Glide.with(this)
                .load(coverpicture)
                .into(coverPic)
        } else {
            profilePic.setImageResource(R.drawable.ic_launcher_background)
        }



    }


}