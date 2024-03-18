package Clases

import kotlin.time.times

open class Nacional(
    override val ciudad: String
) : Travel() {

    override val pais = "México"

    // Mapa de tarifas por ciudad
    private val tarifas = mapOf(
        "Monterrey" to 400,
        "Guadalajara" to 350,
        "CDMX" to 360,
        "San Cristóbal de las Casas" to 240,
        "San Miguel de Allende" to 320
    )

    // Función para obtener el precio
    override fun obtenerPrecio(numDias: Int): Double {
        val tarifa = tarifas[ciudad]
        return if (tarifa == null) 0.0 else (tarifa * numDias).toDouble()
    }

    // Función para cotizar el precio
    override fun cotizarPrecio(numDias: Int) {
        val precio = obtenerPrecio(numDias)
        if (precio == 0.0) {
            println("Lo sentimos, no hacemos viajes a esta ciudad")
        } else {
            println("Tu viaje a $ciudad cuesta \$$precio")
        }
    }
}
