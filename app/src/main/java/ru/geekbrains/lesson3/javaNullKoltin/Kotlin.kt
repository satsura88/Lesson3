package ru.geekbrains.lesson3.javaNullKoltin

class Kotlin {

    lateinit var nameNotNullabe:String // гарантия присвоения

    var nameNullable:String? = null // напоминание компилятора

    fun main(){

        val strLen1 = nameNotNullabe.length

        val strLen2 = nameNullable?.length // safe call

    }
}