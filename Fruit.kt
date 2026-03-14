package com.yazdan.fruitcatcher.models

import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Color

class Fruit(var x: Float) {

    var y = 0f
    private val paint = Paint()

    init{
        paint.color = Color.RED
    }

    fun update(){
        y += 12
    }

    fun draw(canvas: Canvas){
        canvas.drawCircle(x,y,35f,paint)
    }
}
