package com.example.newsreader

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_details.*
import kotlinx.android.synthetic.main.activity_list.*

class Details : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        var bundle: Bundle? = intent.extras
        if(bundle != null){
            var imageId = bundle.getInt("imageID")
            this.imageView.setImageResource(imageId)
            var titleID = bundle.getInt("titleID")
            this.tv_title.setText(titleID)
            var textID = bundle.getInt("textID")
            this.tv_story.setText(textID)

        }
    }
}
