fun main() {
    val nome : String;                                            //Val considera como contante
    var sobreNome: String;                                        //Var Considera como Variavel
    println("Informe seu nome:");
    nome = readLine() ?: "Nome padrao";
    /*
    readLine vai ter 3 tipos por conta que o kotlin nao faz auto cast
    primeiro metodo para se utiliza-lo: (var ou val) nomevariavel : (tipoDeVariavel)?
        Deixa o possivel que a entrada dessa variavel seja nulll
    segundo metodo: readLine()!!
        Garante que o readLine nao seja null
    terceiro metodo: readline() ?: "mensagem caso seja null"
        Caso seja null converte em um valo predefinido
     */
    println("Informe seu Sobre Nome:")
    sobreNome = readLine()!!;
    println("Bem vindo ao mundo de Kotlin $nome $sobreNome");
}