package controller

import model.Persona

class PersonaController {

    lateinit var persona: Persona

    constructor(persona: Persona) {
        this.persona = persona
    }

    constructor()

    fun calcularIMC(): Int {
        var pesoIdeal: Double = persona.peso/(Math.pow(persona.altura, 2.0)).toInt()

        if(this.persona.peso < pesoIdeal){
            return -1
        }
        else if(this.persona.peso == pesoIdeal){
            return 0
        }
        else{
            return 1
        }
    }

    fun esMayorDeEdad():Boolean {
        return persona.edad > 17
    }

    fun comprobarSexo(sexo: Char) {
        if(sexo == 'H' || sexo == 'M'){
            this.persona.sexo = sexo;
        } else {
            this.persona.sexo = 'H';
        }
    }

    override fun toString(): String {
        return "Persona(nombre='${persona.nombre}', edad=${persona.edad}, cedula='${persona.cedula}', sexo=${persona.sexo}, peso=${persona.peso}, " +
                "altura=${persona.altura})"
    }
}