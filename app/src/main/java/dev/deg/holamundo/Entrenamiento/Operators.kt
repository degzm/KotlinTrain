package dev.deg.holamundo.Entrenamiento

import android.app.Person
import android.util.Log

class Operators{
    private fun showCase1(){
        var a = 5
        var b = 5

        //Comparacion de referencia a tipos enteros
        Log.w("OPERATORS-1","Referential equality. es A =  B? ${a===b}") //True
        //Comparacion de enteros
        Log.w("OPERATORS-1","Structural equality. es A =  B? ${a==b}") //True
    }

    private fun showCase2(){
        val pn1 = PersonNormal()
        val pn2 = PersonNormal()

        Log.w("OPERATORS-2","Referential equality. es pn1 =  pn2? ${pn1===pn2}") //False
        //La segunda es falsa por que no sobreescribe el metodo equals()
        Log.w("OPERATORS-2","Referential equality. es pn1 =  pn2? ${pn1==pn2}") //False
    }

    private fun showCase3(){
        val pn1 = PersonEqualsOverride()
        val pn2 = PersonEqualsOverride()

        Log.w("OPERATORS-3","Referential equality. es pn1 =  pn2? ${pn1===pn2}") //False
        Log.w("OPERATORS-3","Referential equality. es pn1 =  pn2? ${pn1==pn2}") //True
    }

    private fun showCase4(){
        val pn1 = PersonDataClass()
        val pn2 = PersonDataClass()
        val pn3 = PersonDataClass(name ="Degs", age = 23)

        Log.w("OPERATORS-4","Referential equality. es pn1 =  pn2? ${pn1===pn2}") //False
        Log.w("OPERATORS-4","Referential equality. es pn1 =  pn2? ${pn1==pn2}") //True
        Log.w("OPERATORS-3","Referential equality. es pn2 =  pn3? ${pn2==pn3}") //False
    }

    class PersonNormal{
        val name = "Deg"
    }

    class PersonEqualsOverride{
        val name = "Deg"
        override fun equals(other: Any?): Boolean {
            if(other === null) return false
            if(other is PersonEqualsOverride){
                //Se compara el nombre del otro objeto
                return other.name === this.name
            }
            return false
        }
    }

    data class PersonDataClass(val name:String = "Deg", val age:Int = 18)
}