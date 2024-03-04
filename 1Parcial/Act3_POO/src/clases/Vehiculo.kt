package clases

/* Rodríguez Nicolás Blanca Edith
 * 6NM61 */

// Actividad 3

public class Vehiculo(
    var color: String,
    var marca: String,
    var modelo: String,
    var placas: String,
    var encendido: Boolean = false,
    var gasolina: Int = 0
) {

    fun encender() {
        encendido = true
        println("Vehículo encendido\n")
    }

    fun apagar() {
        encendido = false
        println("Vehículo apagado\n")
    }

    fun recargar(litros: Int) {
        gasolina += litros
        println("Gasolina recargada: $gasolina litros")
    }



    fun estado() {
        println("**Estado del vehículo:**")
        println("Color: $color")
        println("Marca: $marca")
        println("Modelo: $modelo")
        println("Placas: $placas")
        println("Encendido: ${if (encendido) "Sí" else "No"}")
        println("Gasolina: $gasolina litros\n")
    }
}
