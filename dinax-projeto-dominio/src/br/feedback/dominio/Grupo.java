package br.feedback.dominio;

import java.util.List;

/**
 * Classe: Grupo 
 * Função: Criação de estrutura de Grupo
 *
 * @date 26/05/2016
 * @author Dinax
 * @version 2.1
 */

@AEntidade(tabela = "grupo")
public class Grupo {

    private String nome;
    private String descricao;
    private String nivel;
    private String nivel_grupopai;      //Herda sempre da raiz (0 = Grupo Intituição)
    private List<Usuario> usuarios;   //Todos os usuários que fazem parte do grupo

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getNivel_grupopai() {
        return nivel_grupopai;
    }

    public void setNivel_grupopai(String nivel_grupopai) {
        this.nivel_grupopai = nivel_grupopai;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

}
