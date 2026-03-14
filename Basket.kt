package com.yazdan.fruitcatcher.models

import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Color

class Basket {

    var x = 500f
    private val y = 1500f
    private val paint = Paint()

    init{
        paint.color = Color.rgb(139,69,19)
    }

    fun draw(canvas: Canvas){
        canvas.drawRect(x-120,y,x+120,y+60,paint)
    }
}
