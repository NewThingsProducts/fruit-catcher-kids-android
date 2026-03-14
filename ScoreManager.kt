package com.yazdan.fruitcatcher.managers

object ScoreManager {

    var score = 0
    var lives = 3

    fun addScore(){
        score++
    }

    fun loseLife(){
        lives--
    }
}
