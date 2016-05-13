package sgan

class Usuario {

    String senha
    String nome
    String email
    String rg
    String cpf
    String genero
    Calendar dataNascimento
    String endereço
    String telefone
    boolean ativo

    static constraints = {
        senha(nullable: false, blank: false)
        nome(nullable: false, blank: false)
        email(nullable: false, blank: false)
        rg(nullable: false, blank: false)
        cpf(nullable: false, blank: false)
        genero(nullable: false, blank: false)
        dataNascimento(nullable: false, blank: false)
        endereço(nullable: false, blank: false)
        telefone(nullable: false, blank: false)
        ativo(nullable: false, blank: false)
    }
}
