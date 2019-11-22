package dev.deg.holamundo.Entrenamiento

import android.util.Log

// DOC: #https://kotlinlang.org/docs/reference/control-flow.html

class ControlFlow {

    //ShowCase de "if"
    private fun showCase1() {
        val num1 = 5
        val num2 = 10

        if (num1 > num2) {
            Log.w("CONTROL-FLOW-1", "NUM1 es mayor que NUM2")
        }

        if (num2 > num1) {
            Log.w("CONTROL-FLOW-1", "NUM2 es mayor que NUM1")
        }
    }

    //ShowCase de "if else"
    private fun showCase2() {
        val num1 = 5
        val num2 = 10

        if (num1 > num2) {
            Log.w("CONTROL-FLOW-1", "NUM1 es mayor que NUM2")
        } else {
            Log.w("CONTROL-FLOW-1", "NUM2 es mayor que NUM1")
        }

        // Como expresión
        if (num1 > num2) Log.w("CONTROL-FLOW-1", "NUM1 es mayor que NUM2")
        else Log.w("CONTROL-FLOW-1", "NUM2 es mayor que NUM1")

        val result = if (num1 > num2) num1 else num2
    }

    //ShowCase de "when", lo equivalente a un switch en Java
    private fun showCase3() {
        val x = 1

        // Con argumento (x)
        when (x) {
            1 -> Log.w("CONTROL-FLOW-3", "x == 1") // case 1
            2 -> Log.w("CONTROL-FLOW-3", "x == 2") // case 2
            else -> Log.w("CONTROL-FLOW-3", "x es otro número") // case default, no es obligatorio
        }

        when (x) {
            0, 1 -> Log.w("CONTROL-FLOW-3", "x == 0 o x == 1") // case 0 y 1
        }

        // Sin argumento (x)
        when {
            (x % 2 == 0) -> Log.w("CONTROL-FLOW-3", "número par")
            (x % 2 == 1) -> Log.w("CONTROL-FLOW-3", "número impar")
        }

        // Sin argumento y devolviendo un valor
        val esPar = when {
            (x % 2 == 0) -> true
            else -> false
        }
    }

    //ShowCase de bucle "for"
    private fun showCase4() {
        val numbers = arrayOf(1, 2, 3, 4, 5)

        for (number in numbers) Log.w("CONTROL-FLOW-4", number.toString())

        // Especificando el tipo
        for (number: Int in numbers) {
            Log.w("CONTROL-FLOW-4", number.toString())
        }

        // Con índices
        for((index, number) in numbers.withIndex()) {
            Log.w("CONTROL-FLOW-4", "$index: $number")
        }
    }

    //ShowCase de "while y do-while"
    private fun showCase5() {
        var x = 10

        while (x > 0) {
            Log.w("CONTROL-FLOW-5", x--.toString())
        }

        do {
            Log.w("CONTROL-FLOW-5", "Primera y única iteración")
        } while (x > 0)
    }

    fun showCases() {
        showCase1()
        showCase2()
        showCase3()
        showCase4()
        showCase5()
    }
}