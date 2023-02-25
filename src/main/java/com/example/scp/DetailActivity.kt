package com.example.scp
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val tvName: TextView = findViewById(R.id.tv_item_name)
        val tvDetails: TextView = findViewById(R.id.tv_item_detail)
        val tvPhoto: ImageView = findViewById(R.id.img_item_photo)

        val ulamaName = intent.getStringExtra("mName")
        val ulamaDetails = intent.getStringExtra("mDetail")
        val ulamaPhoto = intent.getIntExtra("mPhoto", 1)

        tvName.text = ulamaName
        tvDetails.text = ulamaDetails
        tvPhoto.setImageResource(ulamaPhoto)

    }

}