package edu.temple.imageactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ImageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val colors = arrayOf(
            ImageObject("Horizon", R.drawable.horizon),
            ImageObject("God Of War", R.drawable.godofwar),
        )

        setContentView(R.layout.activity_main)
        val image = findViewById<View>(R.id.imageView)
        val img = colors[1].drawable
        image.setBackgroundResource(img)
        val myRecyclerViewFunc = {ImageObject:ImageObject ->
            image.setBackgroundResource(img)
        }

//        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
//
//        // Assign a Grid layout manager with 2 columns
//        recyclerView.layoutManager = GridLayoutManager(this, 2)
//
//        // Initialize adapter with lambda for event listening
//        recyclerView.adapter = ColorAdapter(colors, myRecyclerViewFunc)

    }
}