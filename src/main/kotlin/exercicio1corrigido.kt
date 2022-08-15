import java.time.LocalDate

fun main(){

    var anoAtual = LocalDate.now().year

    print("Digite sua idade: ")
    val idade = readln().toInt()

    print("Voce ja fez aniversário esse ano? s/n : ")
    val resp = readln()

    var nasc: Int

    if(resp == "s"){
        nasc = anoAtual - idade
    } else {
        nasc = anoAtual - (idade + 1)
    }
    print("O seu ano de nascimento é $nasc")
}