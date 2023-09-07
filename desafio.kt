enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

data class Usuario(val nome: String)

data class ConteudoEducacional(var nome: String, val duracao: Int, val nivel : Nivel)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }
}

fun main() {
    var user = Usuario("jose")
    
    var modulo = Formacao("Exemplo", arrayListOf(ConteudoEducacional("oop", 1, Nivel.BASICO), ConteudoEducacional("dbs", 1, Nivel.INTERMEDIARIO)))
    
    modulo.matricular(user)
    
}