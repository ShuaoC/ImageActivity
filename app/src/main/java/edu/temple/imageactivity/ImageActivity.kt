package edu.temple.imageactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ImageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val game = findViewById<ImageView>(R.id.gameView)
        val name = findViewById<TextView>(R.id.name)
        val description = findViewById<TextView>(R.id.description)
        val games = arrayOf(
            ImageObject("Horizon Forbidden West", R.drawable.horizon,"Horizon Forbidden West is an action role-playing video game developed by Guerrilla Games and published by Sony Interactive Entertainment for the PlayStation 4 and PlayStation 5."),
            ImageObject("God of War Ragnarök", R.drawable.godofwar,"God of War Ragnarök is an upcoming action-adventure hack and slash video game developed by Santa Monica Studio and will be published by Sony Interactive Entertainment."),
            ImageObject("Black Myth: Wukong", R.drawable.blackmyth,"Black Myth: Wukong is an upcoming action role-playing game by Chinese indie developer Game Science, based on the classical 16th-century Chinese novel Journey to the West."),
            ImageObject("Dark Souls III", R.drawable.darksouls,"Dark Souls III is a 2016 action role-playing video game developed by FromSoftware and published by Bandai Namco Entertainment for PlayStation 4, Xbox One, and Microsoft Windows."),
            ImageObject("Genshin Impact", R.drawable.genshin,"Genshin Impact is an action role-playing game developed by Chinese developer miHoYo, and first published in 2020. The game features an anime-style open-world environment and an action-based battle system using elemental magic and character-switching."),
            ImageObject("Ghost of Tsushima", R.drawable.ghost,"Ghost of Tsushima is a 2020 action-adventure game developed by Sucker Punch Productions and published by Sony Interactive Entertainment."),
            ImageObject("Mafia: Definitive Edition", R.drawable.mafia,"Mafia: Definitive Edition is a 2020 action-adventure game developed by Hangar 13 and published by 2K Games. It is a remake of the 2002 video game Mafia, and the fourth main installment in the Mafia series."),
            ImageObject("Monster Hunter: World", R.drawable.monster,"Monster Hunter: World is an action role-playing game developed and published by Capcom and the fifth mainline installment in the Monster Hunter series."),
            ImageObject("Spider-Man", R.drawable.spiderman,"Marvel's Spider-Man is a 2018 action-adventure game developed by Insomniac Games and published by Sony Interactive Entertainment."),
            ImageObject("Wolfenstein II", R.drawable.wolfenstein,"Wolfenstein II: The New Colossus is a 2017 action-adventure first-person shooter video game developed by MachineGames and published by Bethesda Softworks."),
            ImageObject("The Legend of Zelda", R.drawable.zelda,"The Legend of Zelda: Breath of the Wild is a 2017 action-adventure game developed and published by Nintendo for the Nintendo Switch and Wii U consoles."),
            ImageObject("Red Dead Redemption 2", R.drawable.readdead,"Red Dead Redemption 2 is a 2018 action-adventure game developed and published by Rockstar Games. The game is the third entry in the Red Dead series and is a prequel to the 2010 game Red Dead Redemption.")
        )



        val myRecyclerViewFunc = {ImageObject:ImageObject ->
            game.setBackgroundResource(ImageObject.drawable)
            name.text = ImageObject.name
            description.text = ImageObject.description
        }

        val recyclerView = findViewById<RecyclerView>(R.id.RecyclerView)

        recyclerView.layoutManager = GridLayoutManager(this, 2)

        recyclerView.adapter = ImageAdapter(games, myRecyclerViewFunc)

    }
}