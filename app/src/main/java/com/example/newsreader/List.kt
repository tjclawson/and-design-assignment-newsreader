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

        //All these listeners and intents could likely be condensed into one, not sure how to do so
        iv1.setOnClickListener {
            val intent = Intent(this, Details::class.java)
            intent.putExtra("imageID", R.drawable.tree)
            intent.putExtra("titleID", R.string.treetitle)
            intent.putExtra("textID", R.string.treetext)
            startActivity(intent)

        }

        iv2.setOnClickListener {
            val intent = Intent(this, Details::class.java)
            intent.putExtra("imageID", R.drawable.flower)
            intent.putExtra("titleID", R.string.flowertitle)
            intent.putExtra("textID", R.string.flowertext)
            startActivity(intent)

        }

        iv3.setOnClickListener {
            val intent = Intent(this, Details::class.java)
            intent.putExtra("imageID", R.drawable.bee)
            intent.putExtra("titleID", R.string.beetitle)
            intent.putExtra("textID", R.string.beetext)
            startActivity(intent)

        }

        iv4.setOnClickListener {
            val intent = Intent(this, Details::class.java)
            intent.putExtra("imageID", R.drawable.cloud)
            intent.putExtra("titleID", R.string.cloudtitle)
            intent.putExtra("textID", R.string.cloudtext)
            startActivity(intent)

        }

        iv5.setOnClickListener {
            val intent = Intent(this, Details::class.java)
            intent.putExtra("imageID", R.drawable.cliff)
            intent.putExtra("titleID", R.string.clifftitle)
            intent.putExtra("textID", R.string.clifftext)
            startActivity(intent)

        }



    }
}
