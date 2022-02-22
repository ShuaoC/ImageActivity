package edu.temple.imageactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ImageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val game = findViewById<ImageView>(R.id.imageView)
        val name = findViewById<TextView>(R.id.textView)
        val games = arrayOf(
            ImageObject("Horizon", R.drawable.horizon),
            ImageObject("God of War", R.drawable.godofwar),
            ImageObject("Black Myth: Wukong", R.drawable.blackmyth),
            ImageObject("Dark Souls III", R.drawable.darksouls),
            ImageObject("Genshin Impact", R.drawable.genshin),
            ImageObject("Ghost of Tsushima", R.drawable.ghost),
            ImageObject("Mafia: Definitive Edition", R.drawable.mafia),
            ImageObject("Monster Hunter: World", R.drawable.monster),
            ImageObject("Spider-Man", R.drawable.spiderman),
            ImageObject("Wolfenstein II", R.drawable.wolfenstein)
        )



        val myRecyclerViewFunc = {ImageObject:ImageObject ->
            game.setBackgroundResource(ImageObject.drawable)
            name.text = ImageObject.name
        }

        val recyclerView = findViewById<RecyclerView>(R.id.RecyclerView)

        recyclerView.layoutManager = GridLayoutManager(this, 1)

        recyclerView.adapter = ImageAdapter(games, myRecyclerViewFunc)

    }
}