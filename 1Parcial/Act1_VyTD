/* Rodríguez Nicolás Blanca Edith
 * 6NM61 */

// Variables y tipos de datos

const val PI = 3.1415926535

fun main() {
// 1. Variable decimal por defecto: Double
  var decimal = 77.22222222
  println("Valor: $decimal / Tipo de dato por defecto: ${decimal::class.simpleName}")

// 2. Convertir a flotante
  var decimalf = decimal.toFloat()
  println("Variable flotante: $decimalf")
    
// 3. Calcular perímetro de un círculo: P=2*PI*r
  var perimetro = (2 * PI * decimal)
  
// 4. Imprimir el resultado con String Template
  println("El perímetro del círculo es: $perimetro")
  
// 5. Ecuación de la pendiente con operadores: m = (y2 - y1) / (x2 - x1) 

// 6. Calcular la pendiente para P1(4,3) y P2(-3,-2)
  var x1 = 4
  var y1 = 3
  var x2 = -3
  var y2 = -2
    
  var m = (y2 - y1) / (x2 - x1) 
  println("Pendiente = $m")
  
/* 7. El resultado obtenido difiere del resultado esperado porque se detecta automaticamente 
 * un dato de tipo entero y no toma en cuenta los decimales, enviando únicamente el valor de 0*/
 
// 8. Solución para que se refleje el resultado: Definir desde un inicio los valores como flotantes
  var x1f = 4f
  var y1f = 3f
  var x2f = -3f
  var y2f = -2f
    
  var pendiente = (y2f - y1f) / (x2f - x1f)   
  println("Pendiente = $pendiente")
}

