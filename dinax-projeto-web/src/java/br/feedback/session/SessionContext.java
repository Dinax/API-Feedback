package br.feedback.session;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

/**
 * Classe: SessionContext 
 * Função: padrão Singleton para evitar múltiplas instâncias se sessões
 * @date 23:31:26
 * @author Dinax
 * @version 1.0
 */
public class SessionContext {

    private static SessionContext instance;

    //Verifica se contem nenhuma sessão e a cria
    public static SessionContext getInstance() {
        if (instance == null) {
            instance = new SessionContext();
        }

        return instance;
    }

    private SessionContext() {

    }
    

    //ExternalContext trabalha com HTTP servlet, HTTP request e etc.
    private ExternalContext currentExternalContext() {
        
        //FacesContext trabalha diretamente com recursos do JSF
        if (FacesContext.getCurrentInstance() == null) {
            throw new RuntimeException("O FacesContext não pode ser chamado fora de uma requisição HTTP");
        } else {
            return FacesContext.getCurrentInstance().getExternalContext();
        }
    }

    //Encerra a sessão, invalidando a mesma. 
    //o método currentExternalContext() encerra todos os atributos da sessão,realizando um logout.
    public void encerrarSessao() {
        currentExternalContext().invalidateSession();
    }
    
    
    //o método getSessionMap() que retorna um Map com os atributos salvos na sessão corrente.
    public Object getAttribute(String nome) {
        return currentExternalContext().getSessionMap().get(nome);
    }

    //o método getSessionMap() retorna os atributos da sessão em forma de Map, 
    //mas usando o put() para inserir os valores necessários.
    public void setAttribute(String nome, Object valor) {
        currentExternalContext().getSessionMap().put(nome, valor);
    }



}//fim da classe SessionContext   



/*Como usaremos nossa sessão? 
Lembre-se que só podemos fazer uso desta classe quando houver uma requisição HTTP, 
isso significa que você não pode chamar o SessionContext sem que haja uma requisição vinda do cliente (browser). 
Veja como podemos usar adicionando atributos a sessão:

SessionContext.getInstance().setAttribute(“valor”,123);

Podemos recuperar estas informações em qualquer parte da nossa aplicação. 
Muito útil para manter valores como: usuário logado, tempo logado, última página acessada,
atributos do banco que podem perdurar durante toda a aplicação, 
evitando a busca contínua destes dados.*/
