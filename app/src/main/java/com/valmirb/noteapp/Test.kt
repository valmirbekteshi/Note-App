package com.valmirb.noteapp


 class Puntori(var emri: String, var vite: Int)

fun main(args: Array<String>){


    var puntori = mutableListOf<Puntori>()

    puntori.add(Puntori("aa",12221))
    puntori.add(Puntori("bedri",12))
    puntori.add(Puntori("avni",11))


    for (a in puntori){
        println("${a.emri} dhe ${a.vite}")
    }



}




