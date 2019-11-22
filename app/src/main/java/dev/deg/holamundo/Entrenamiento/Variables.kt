package dev.deg.holamundo.Entrenamiento

import android.util.Log

/*
En kotlin todo es un objeto.
No hay tipos basicos.
No existe void (Se devuelve Unit Object)
   */
class Variables{
    /*
    Si no se asigna el tipo de variable, Kotlin la asigna automaticamente
    */
    private var var0 = 1
    private var var1 = 1.toByte()
    private var var2 = -123
    private var var3 = 34789724389
    private var var4 = 7.8.toFloat()
    private var var5 = 7.8
    //Char lleva comilla simple
    private var var6 = 'a'
    //String lleva comilla doble
    private var var7 = "a"
    private var var8 = true

    //Arreglo de enteros
    private var var9 = arrayOf(1,2,3,4,5)
    /*
    Arreglo de nulos enteros
    Se usa para crear un arreglo de enteros completamente vacio
     */
    private var var10 = arrayOfNulls<Int>(10)
    //Variable inmutable
    private val var11 = 11

    //Show Case byte
    private fun showCase1(){
        Log.w("VARIABLE-0","Es entera? " + (var0 is Int) + "o es un byte?")
        Log.w("VARIABLE-1","Es byte? " + (var1 is Byte) + "o es un byte?")
    }

    //Show case int
    private fun showCase2(){
        Log.w("VARIABLE-2","Es entero. ")
        var2 = Int.MAX_VALUE
    }

    //Show case long
    private fun showCase3(){
        Log.w("VARIABLE-3","Es long?. " + (var3 is Long))
    }

    //Show case float
    private fun showCase4(){
        Log.w("VARIABLE-4", "Es un float? " + (var4 is Float))
    }

    private fun showCase5(){
        Log.w("VARIABLE-5", "Es un double? " + (var5 is Double))
    }

    //Show case char
    private fun showCase6(){
        Log.w("VARIABLE-6","Es un char? " + (var6 is Char))
    }

    //Show case String
    private fun showCase7(){
        Log.w("VARIABLE-7","Es un String? " + (var7 is String))
        //String literals
        var7 = "Hola mundo\nCerrando mundo." //Java Style
        var7 =
            """
            Hola mundo
            Adios mundo
            """//Kotlin Style

        //String templates
        var points = 9
        var maxPoints = 10
        var7 = "Hola, tengo " + points + " sobre " + maxPoints //Java Style
        var7 = "Hola, tengo $points sobre $maxPoints" //Kotlin Style
        var7 = "Hola, tengo ${points*5} sobre ${maxPoints*5}" //Kotlin Style + operations

    }

    //Show case boolean
    private fun showCase8(){
        Log.w("VARIABLE-8", "Es un booleano? " + (var8 is Boolean))
    }

    //Show case boolean
    private fun showCase9(){
        Log.w("VARIABLE-9", "Es un booleano? " + (var9 is Array<Int>))
    }

    public fun showCases(){
        showCase1()
        showCase2()
        showCase3()
        showCase4()
        showCase5()
        showCase6()
        showCase7()
        showCase8()
        showCase9()
    }
}