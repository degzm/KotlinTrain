package dev.deg.holamundo.Entrenamiento

// DOC: #https://kotlinlang.org/docs/reference/visibility-modifiers.html#classes-and-interfaces

// Para hacer una clase "extensible" o "heredable" tenemos que marcarlo como open.
// En Java es open por defecto y en Kotlin es final por defecto, así que no puede ser extendida sin el uso de 'open'

open class Modificadores {

    // private      -- sólo visible dentro de la clase
    // protected    -- sólo visible dentro de la clase y de sus subclases (herencia)
    // public       -- visible desde dentro de la clase, de sus subclases y desde fuera

    val prop1 = "Publica"
    private val prop2 = "Privada"
    protected val prop3 = "Protegida"

    protected fun showCase() {
        val test = Modificadores()
        test.prop1
    }

}

class AccessModifiersChild : Modificadores() {

    private fun showCaseX() {
        super.showCase()
        prop1
        this.prop1
        // prop2 // Por ser private no puede ser accesible
        prop3
    }
}

class AnotherClass {
    private fun showCase() {
        val test = Modificadores()

        test.prop1

    }

}