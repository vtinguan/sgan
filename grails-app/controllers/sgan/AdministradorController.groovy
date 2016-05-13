package sgan

import grails.converters.JSON
import org.codehaus.groovy.grails.web.json.JSONObject

class AdministradorController {

    def administradorService


    //http://localhost:8080/sgan/Administrador/saveAdm
    def saveAdm() {
        try{
            JSONObject param = request.JSON as JSONObject
            administradorService.save(param)
            String resposta = "Sucesso"
            //render resposta as JSON
        } catch (Exception e){
            String resposta = "Falha"
            //render resposta as JSON
        }
    }
}
