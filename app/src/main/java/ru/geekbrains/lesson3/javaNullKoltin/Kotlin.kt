package ru.geekbrains.lesson3.javaNullKoltin

import android.widget.Button

class Kotlin {

    lateinit var nameNotNullabe:String // гарантия присвоения

    var nameNullable:String? = null // напоминание компилятора

    fun main(){

        val strLen1 = nameNotNullabe.length
        val strLen2 = nameNullable?.length // safe call(?), double bang(!!) - используется в крайних случаях
        //nameNullable = "либо вернёт этот текст либо 0"
        val strLen3 = (nameNullable?:"").length // оператор Элвиса
        main2(strLen3)



        val isVG = Button
    }

    fun main2(i:Int){

    }
}