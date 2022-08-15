fun main(){

    val pi = 3.14

    print("Digite o diametro do circulo: ")
    val diametro = readln().toInt()

    var raio = diametro/2

    print("O seu circulo tem área de ${pi*(raio * raio)}, e o perimetro é de ${diametro*pi}")


}