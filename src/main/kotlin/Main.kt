fun main() {
    var anoAtual = 2022
    var resposta1 = "sim"; "Sim"

    print("Digite o seu nome: ")
    val nome = readln()

    print("Digite sua idade: ")
    val idade = readln().toInt()

    print("Voce fez aniversario esse ano?")
    var aniversarioAno = readln()
    if(aniversarioAno == resposta1){
        print("Olá $nome, voce tem $idade anos, logo seu ano de nascimento é: ${2022 - idade}")
    } else {
        print("Olá $nome, voce tem $idade anos, logo seu ano de nascimento é: ${2022 - (idade + 1)}")
    }


}