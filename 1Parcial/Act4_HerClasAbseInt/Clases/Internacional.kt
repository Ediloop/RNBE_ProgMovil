package Clases

class International(
    override val pais: String,
    override val ciudad: String
) : Travel() {

    // Mapa de impuestos por país
    private val impuestos = mapOf(
        "Alemania" to 0.16,
        "Chile" to 0.05,
        "Canadá" to 0.1
    )

    // Mapa de tarifas por país y ciudad
    private val tarifas = mapOf(
        "Alemania" to mapOf(
            "Munich" to 980,
            "Berlín" to 820,
            "Francfort" to 850
        ),
        "Chile" to mapOf(
            "Santiago" to 643,
            "Valparaíso" to 721
        ),
        "Canadá" to mapOf(
            "Vancouver" to 620,
            "Ottawa" to 680,
            "Montreal" to 600
        )
    )

    // Función para obtener el precio con impuesto incluido
    override fun obtenerPrecio(numDias: Int): Double {
        val tarifa = tarifas[pais]?.get(ciudad)
        return if (tarifa == null) 0.0 else (tarifa * numDias) * (1 + impuestos[pais]!!)
    }

    // Función para cotizar el precio
    override fun cotizarPrecio(numDias: Int) {
        val precio = obtenerPrecio(numDias)
        if (precio == 0.0) {
            println("Lo sentimos, no hacemos viajes a este país o ciudad.")
        } else {
            println("Tu viaje a $ciudad, $pais cuesta \$$precio")
        }
    }
}
