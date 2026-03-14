package com.yazdan.fruitcatcher

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.yazdan.fruitcatcher.engine.GameView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val gameView = GameView(this)
        setContentView(gameView)
    }
}
