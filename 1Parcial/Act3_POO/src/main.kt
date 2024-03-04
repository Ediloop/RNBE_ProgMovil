import clases.Vehiculo
import clases.Persona


fun main() {
    // Creando un objeto Vehículo
    val miCoche = Vehiculo(
        "Rojo",
        "BMW",
        "Mini Cooper",
        "EDITH44"
    )

    // Probando los métodos del vehículo
    miCoche.estado()
    miCoche.encender()
    miCoche.estado()

    println("**Nivel de gasolina:** ${miCoche.gasolina} litros")
    miCoche.recargar(20)
    println("**Nivel de gasolina:** ${miCoche.gasolina} litros")

    // Ejemplo de uso de la clase Persona
    val persona1 = Persona("Edith", "Rodriguez", "Mujer", 1.63)

    println("\nNombre: ${persona1.nombre}")
    println("Apellidos: ${persona1.apellidos}")
    println("Sexo: ${persona1.sexo}")
    println("Altura: ${persona1.altura} m")
}
