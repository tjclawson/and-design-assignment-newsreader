package com.example.newsreader

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_list.*
import kotlinx.android.synthetic.main.login_activity.*

class List : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        iv1.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.tree))
        iv2.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.flower))
        iv3.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.bee))
        iv4.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.cloud))
        iv5.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.cliff))


        iv1.setOnClickListener {
            val intent = Intent(this, Details::class.java)
            startActivity(intent)

        }

        iv2.setOnClickListener {
            val intent = Intent(this, Details::class.java)
            startActivity(intent)

        }

        iv3.setOnClickListener {
            val intent = Intent(this, Details::class.java)
            startActivity(intent)

        }

        iv4.setOnClickListener {
            val intent = Intent(this, Details::class.java)
            startActivity(intent)

        }

        iv5.setOnClickListener {
            val intent = Intent(this, Details::class.java)
            startActivity(intent)

        }



    }
}
