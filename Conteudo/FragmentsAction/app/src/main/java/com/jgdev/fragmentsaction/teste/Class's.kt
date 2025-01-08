class Posto(
    val motoristaNome : String,
    val postoNome : String){

    fun exibirposto() = println("Bem vindo ao Posto $postoNome ")



// TODO NESTD CLASS - BASICAMENTE UMA CLASS INTERNA QUE NÂO DEPENDE DA INSTANCIA DA CLASS PRINCIPAL
    // NÂO TENDO QUALQUER RELÇAO DE DEPENDENCIA COM  CLASSE PRINCIPAL
    class Motorista (val motoristaNome : String) {
        fun exibirMotorista() = println("O Motorista disponivel hoje é $motoristaNome")
    }


    // TODO INNER CLASS - BASICAMENTE UMA CLASS INTERNA QUE  DEPENDE DA INSTANCIA DA CLASS PRINCIPAL
    inner  class Caminhao(val caminhaoNome : String,){
        fun exibirCaminhao() = println("O Caminhão disponivel é o $caminhaoNome")

    }

}




fun main() {
val posto : Posto = Posto("Adilson","Posto Petronio")
    posto.exibirposto()


 val motorista : Posto.Motorista = Posto.Motorista("Jucelio")
    motorista.exibirMotorista()

    val caminhao : Posto.Caminhao = posto.Caminhao("PH 200")
    caminhao.exibirCaminhao()
}