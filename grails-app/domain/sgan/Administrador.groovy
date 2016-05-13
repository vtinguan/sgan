package sgan

class Administrador {
    Usuario usuario
    String areaResponsavel

    static constraints = {
        usuario(nullable: false, blank: false)
        areaResponsavel(nullable: false, blank: false)
    }
}
