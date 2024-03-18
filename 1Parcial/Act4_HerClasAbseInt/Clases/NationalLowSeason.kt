package Clases

import Interfaces.Cancelable
import Interfaces.Descuento

class NationalLowSeason(ciudad: String) : Nacional(ciudad), Descuento, Cancelable {

    override val descuento = 15 // porcentaje (15%)
    override val tipoDescuento = 0 // 0 para porcentaje, 1 para cantidad

    override fun obtenerPrecio(numDias: Int): Double {
        val monto = super.obtenerPrecio(numDias)
        return if (monto == 0.0) 0.0 else obtenerPrecioConDescuento(monto).toDouble()
    }

    override fun cancelar(): String {
        if (!reservado) {
            return "No se ha realizado ninguna reserva para cancelar."
        }
        reservado = false
        montoPagado = 0.0
        return "¡Viaje cancelado exitosamente!"
    }
}
