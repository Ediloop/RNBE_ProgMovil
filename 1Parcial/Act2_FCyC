/* Rodríguez Nicolás Blanca Edith
 * 6NM61 */

// Funciones condicionales y ciclos

fun main() {
    println("1. Área de un rectángulo")
    println("Ejemplo área: ${areaRectangulo(3.0f,5.0f)} m2 \n")

    println("2. Volumen de un Prisma Rectangular")
    println("Volumen: ${volumenPrisma(8.0f)} cm3 \n")

    println("3. Promedio calificaciones") //Se ingresa una sola calificación
    println("Promedio final: ${promedioCalif(c=10.0f)} \n")

    println("4. Promedio calificaciones") //Se ingresan dos calificaciones
    println("Promedio final: ${promedioCalif(b=10.0f, c=10.0f)}")

    /*  Si se ingresa solo una calificación (c), la función toma los valores por defecto de a y b (8.0f) para calcular el promedio.
        Si se ingresan dos calificaciones (c y b), la función toma el valor por defecto de a (8.0f) para calcular el promedio. */

    println("\n 5. Tipo triangulo")
    tipoTriangulo()

    println("\n 6. Tipo de dato")
    identificarTipoDato("Edith")
    identificarTipoDato(21)
    identificarTipoDato(1.62)
    identificarTipoDato(true)
    identificarTipoDato('a')

    println("\n 7. Contar cantidad de nombres")
    conteoNombre()
}

// 1. Área de un rectángulo
fun areaRectangulo(base:Float, altura:Float): Float{
    return base*altura
}
// 2. Volumen de un Prisma Rectangular
fun volumenPrisma(profundidad:Float):Float{
    return areaRectangulo(3.0f,5.0f)*profundidad
}
// 3. Promedio calificaciones
fun promedioCalif(a:Float=8.0f, b:Float=8.0f, c:Float):Float{
    val promedio = (a+b+c)
    return promedio/3
}
// 5. Tipo de triangulo
fun tipoTriangulo(){
    println("Ingrese la medida del primer lado del triángulo: ")
    val lado1 = readLine()?.toDouble()
    println("Ingrese la medida del segundo lado del triángulo: ")
    val lado2 = readLine()?.toDouble()
    println("Ingrese la medida del tercer lado del triángulo: ")
    val lado3 = readLine()?.toDouble()
    //Operadores
    if (lado1 == lado2 && lado2 == lado3){
        println("Es un triangulo: Equilátero")
    } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
        println("Es un triangulo:Isóceles")
    } else {
        println("Es un triangulo:Escaleno")
    }
}

// 6. Tipo de dato
fun identificarTipoDato(valor: Any) {
    when (valor) {
        is String -> println("El valor es un String: $valor")
        is Int -> println("El valor es un Int: $valor")
        is Double -> println("El valor es un Double: $valor")
        else -> println("El valor es de tipo: ${valor::class.simpleName}")
    }
}
// 7. Contar cantidad de nombres
fun conteoNombre(){
    val lista =listOf("Pedro Luis", "Juan Manuel", "Juan Luis", "Maria Ines", "Romeo", "Ernesto", "Juan Pedro", "Ariadna", "Mireya Maria", "Ana Sofia", "Jose Juan")
    println("Ingresa un nombre: ")
    val nombre=readLine()
    println("El nombre ($nombre) se repite ${lista.count{it.contains("$nombre")}} veces")
}
