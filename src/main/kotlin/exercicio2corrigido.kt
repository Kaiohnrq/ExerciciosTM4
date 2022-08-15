import kotlin.math.pow

fun main(){

    val pi = 3.14

    print("Digite o diametro do seu circulo: ")
    val diam = readln().toDouble()

    val raio = diam/2

    val area = pi * raio.pow(2)
    val perim = diam * pi

    println("A área do circulo é de: ${"%.2f".format(area)}")
    println("O perimetro do circulo é de: ${"%.2f".format(perim)}")


}