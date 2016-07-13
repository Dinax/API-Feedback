
package br.feedback.dominio;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Classe: AEntidade
 * Função: Anotação de Entidade para servir de parametro para nome de tabela
 * @date   26/05/2016
 * @author Dinax
 * @version 2.1
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface AEntidade {
    
    public String tabela() default "VAZIA";

}//Fim da anotação
