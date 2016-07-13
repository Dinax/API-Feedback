

package br.feedback.dominio;

import java.util.Date;

/**
 * Classe: Mensagem
 * Função: Criação de estrutura de Mensagem
 * @date   26/05/2016
 * @author Dinax
 * @version 2.1
 */

@AEntidade(tabela = "_mensagem")
public class Mensagem {

    private Pessoa remetente;
    private Pessoa destinatario;
    private Object anexo;
    private String mensagem;
    private String dia;
    private Date data;
    private Boolean conf_enviar;
    private Boolean conf_receber;
    private Date data_ini;
    private Date data_final;
    private Object men_voz;

    public Pessoa getRemetente() {
        return remetente;
    }

    public void setRemetente(Pessoa remetente) {
        this.remetente = remetente;
    }

    public Pessoa getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Pessoa destinatario) {
        this.destinatario = destinatario;
    }

    public Object getAnexo() {
        return anexo;
    }

    public void setAnexo(Object anexo) {
        this.anexo = anexo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Boolean getConf_enviar() {
        return conf_enviar;
    }

    public void setConf_enviar(Boolean conf_enviar) {
        this.conf_enviar = conf_enviar;
    }

    public Boolean getConf_receber() {
        return conf_receber;
    }

    public void setConf_receber(Boolean conf_receber) {
        this.conf_receber = conf_receber;
    }

    public Date getData_ini() {
        return data_ini;
    }

    public void setData_ini(Date data_ini) {
        this.data_ini = data_ini;
    }

    public Date getData_final() {
        return data_final;
    }

    public void setData_final(Date data_final) {
        this.data_final = data_final;
    }

    public Object getMen_voz() {
        return men_voz;
    }

    public void setMen_voz(Object men_voz) {
        this.men_voz = men_voz;
    }
 
 


}
