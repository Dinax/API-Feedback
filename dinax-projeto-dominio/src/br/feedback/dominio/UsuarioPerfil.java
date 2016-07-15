package br.feedback.dominio;

/**
 * Classe: Usuario 
 * Função:  Criação de estrutura de Usuario
 *
 * @date 26/05/2016
 * @author Dinax
 * @version 2.1
 */

@AEntidade(tabela = "_usuarioperfil")
public class UsuarioPerfil {

    private String usuario;
    private String senha;
    private String perfil;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }
    
    

}
