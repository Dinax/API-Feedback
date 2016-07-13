

package br.feedback.dominio;

/**
 * Classe: Telefone
 * Função: Criação de estrutura de Telefone
 * @date   26/05/2016
 * @author Dinax
 * @version 2.1
 */

@AEntidade(tabela = "_telefone")
class Telefone {    
    
    private String ddi;
    private String dd;
    private String tipo_tel;
    private String numero_tel;

    public String getDdi() {
        return ddi;
    }

    public void setDdi(String ddi) {
        this.ddi = ddi;
    }

    public String getDd() {
        return dd;
    }

    public void setDd(String dd) {
        this.dd = dd;
    }

    public String getTipo_tel() {
        return tipo_tel;
    }

    public void setTipo_tel(String tipo_tel) {
        this.tipo_tel = tipo_tel;
    }

    public String getNumero_tel() {
        return numero_tel;
    }

    public void setNumero_tel(String numero_tel) {
        this.numero_tel = numero_tel;
    }

    

}
