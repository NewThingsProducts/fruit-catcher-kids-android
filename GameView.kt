package com.yazdan.fruitcatcher.engine

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.view.MotionEvent
import android.view.View
import com.yazdan.fruitcatcher.models.Basket
import com.yazdan.fruitcatcher.models.Fruit
import kotlin.random.Random

class GameView(context: Context) : View(context) {

    private val basket = Basket()
    private val fruits = mutableListOf<Fruit>()
    private val thread = GameThread(this)

    init {
        for(i in 0..5){
            fruits.add(Fruit(Random.nextInt(100,800).toFloat()))
        }
        thread.start()
    }

    fun update(){
        fruits.forEach{
            it.update()
        }
    }

    override fun onDraw(canvas: Canvas) {
        canvas.drawColor(Color.CYAN)

        basket.draw(canvas)

        fruits.forEach{
            it.draw(canvas)
        }
    }

    override fun onTouchEvent(event: MotionEvent): Boolean {

        if(event.action == MotionEvent.ACTION_MOVE){
            basket.x = event.x
        }

        return true
    }
}
