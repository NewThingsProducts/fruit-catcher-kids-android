package com.yazdan.fruitcatcher.engine

class GameThread(private val gameView: GameView) : Thread() {

    private var running = true

    override fun run() {
        while (running) {
            gameView.update()
            gameView.postInvalidate()
            sleep(16)
        }
    }

    fun stopGame(){
        running = false
    }
}
