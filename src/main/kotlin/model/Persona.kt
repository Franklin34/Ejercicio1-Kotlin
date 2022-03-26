package model

class Persona {

    var nombre: String = ""
        get() = field
        set(value) {
            field = value
        }

    var edad: Int = 0
        get() = field
        set(value) {
            field = value
        }

    var cedula: String = ""
        get() = field
        set(value) {
            field = value
        }

    var sexo: Char = 'x'
        get() = field
        set(value) {
            field = value
        }

    var peso: Double = 0.0
        get() = field
        set(value) {
            field = value
        }

    var altura: Double = 0.0
        get() = field
        set(value) {
            field = value
        }

    constructor(nombre: String?, edad: Int?, sexo: Char?){
        if (nombre != null) {
            this.nombre = nombre
        }
        if (edad != null) {
            this.edad = edad
        }
        if (sexo != null) {
            this.sexo = sexo
        }
    }

    constructor(nombre: String?, edad: Int?, sexo: Char?, peso: Double?, altura: Double?, cedula: String?){
        if (nombre != null) {
            this.nombre = nombre
        }
        if (edad != null) {
            this.edad = edad
        }
        if (sexo != null) {
            this.sexo = sexo
        }
        if (peso != null) {
            this.peso = peso
        }
        if (altura != null) {
            this.altura = altura
        }
        if (cedula != null) {
            this.cedula = cedula
        }
    }

    constructor()
}