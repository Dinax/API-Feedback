
package br.feedback.dominio;

/**
 * Classe: Mensagem
 * Função: Criação de estrutura de Mensagem
 * @date   26/05/2016
 * @author Dinax
 * @version 2.1
 */

@AEntidade(tabela = "_permissao")
public class Permissao {

    private Pessoa pessoa;
    private Grupo grupo;   
    private Boolean leitura;
    private Boolean escrita;

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public Boolean getLeitura() {
        return leitura;
    }

    public void setLeitura(Boolean leitura) {
        this.leitura = leitura;
    }

    public Boolean getEscrita() {
        return escrita;
    }

    public void setEscrita(Boolean escrita) {
        this.escrita = escrita;
    }
    
    


}