package view

import controller.PersonaController
import model.Persona

class PersonaView {

    var persona1: Persona
    var persona2: Persona
    var persona3: Persona

    var personaController: PersonaController

    constructor(){
        persona1 = Persona()
        persona2 = Persona()
        persona3 = Persona()
        personaController = PersonaController()
    }

    fun crearObjetos() {
        println("Digite el nombre: ")
        var nombre: String? = readLine()

        println("Digite el edad: ")
        var edad: Int? = readLine()?.toInt()

        println("Digite el sexo: ")
        var sexo: String? = readLine()

        println("Digite el peso: ")
        var peso: Double? = readLine()?.toDouble()

        println("Digite el altura: ")
        var altura: Double? = readLine()?.toDouble()

        persona1 = Persona(nombre, edad, sexo?.first(), peso, altura, "208150490")
        persona2 = Persona(nombre, edad, sexo?.first())
        persona3 = Persona()

        persona3.nombre = "Franklin"
        persona3.cedula = "208150490"
        persona3.sexo = 'H'
        persona3.edad = 21
        persona3.altura = 1.70
        persona3.peso = 70.0

        verificarPesoIdeal(persona1)
        verificarPesoIdeal(persona2)
        verificarPesoIdeal(persona3)

        verificarEdad(persona1)
        verificarEdad(persona2)
        verificarEdad(persona3)

        imprimirToString(persona1)
        imprimirToString(persona2)
        imprimirToString(persona3)
    }

    fun verificarPesoIdeal(persona: Persona){
        personaController = PersonaController(persona)

        if(personaController.calcularIMC() == -1){
            println("La persona " + personaController.persona.nombre + " esta por debajo del peso ideal")
        }
        else if(personaController.calcularIMC() == 0){
            println("La persona " + personaController.persona.nombre + " esta en su peso ideal")
        }
        else{
            println("La persona " + personaController.persona.nombre + " tiene sobrepeso")
        }
    }

    fun verificarEdad(persona: Persona){
        personaController = PersonaController(persona)

        if(personaController.esMayorDeEdad() == false){
            println("La persona " + personaController.persona.nombre + " es menor de edad")
        }
        else{
            println("La persona " + personaController.persona.nombre + " es mayor de edad")
        }
    }

    fun imprimirToString(persona: Persona){
        personaController = PersonaController(persona)

        println(personaController.toString())
    }
}