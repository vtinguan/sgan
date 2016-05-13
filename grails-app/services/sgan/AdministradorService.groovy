package sgan

import org.codehaus.groovy.grails.web.json.JSONObject

import java.text.DateFormat
import java.text.SimpleDateFormat

class AdministradorService {

    def save(JSONObject administradorJSON) {
        String nome = administradorJSON.nome
        String senha = administradorJSON.senha
        String email = administradorJSON.email
        String rg = administradorJSON.rg
        String cpf = administradorJSON.cpf
        String genero = administradorJSON.genero

        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Calendar dataNascimento  = Calendar.getInstance();
        dataNascimento.setTime(df.parse(administradorJSON.dataNascimento));

        String endereco = administradorJSON.endereco
        String telefone = administradorJSON.telefone
        String areaResponsavel = administradorJSON.areaResponsavel

        Usuario usuario = new Usuario(nome: nome, senha: senha, email: email, rg: rg, cpf: cpf, genero: genero, dataNascimento: dataNascimento, endereço: endereco, telefone: telefone, ativo: true).save(failOnError: true)
        Administrador adm = new Administrador(usuario: usuario, areaResponsavel: administradorJSON.areaResponsavel).save(failOnError: true)

    }
}
