
package br.feedback.dominio;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Interface: Id 
 * Função:
 *
 * @date 26/05/2016
 * @author Dinax
 * @version 2.1
 */

@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AIdentificador {
    
    public String id();   

}//Fim da anotação
