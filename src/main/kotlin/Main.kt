import view.PersonaView

fun main(args: Array<String>) {
    println("Hello World!")

    var personaView: PersonaView = PersonaView()

    personaView.crearObjetos()

    println("Program arguments: ${args.joinToString()}")
}