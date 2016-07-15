
package br.feedback.session;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Classe: PageFilter
 * Função: Filtro da Sessão
 * @date 23:31:26
 * @author Dinax
 * @version 1.0
 */

public class PageFilter implements Filter {
    
     public void destroy() {
         // TODO Auto-generated method stub
   
      }
   
      public void doFilter(ServletRequest request, ServletResponse response,
             FilterChain chain) throws IOException, ServletException {
   
         //Recupera a Sessão atual ou a cria uma nova caso não exista.
         HttpSession sess = ((HttpServletRequest) request).getSession(true);
   
         //Usamos o objeto request para capturar a sessão como um HttpSession. 
         //Depois capturamos a página atual que está sendo acessada
         String newCurrentPage = ((HttpServletRequest) request).getServletPath();
   
         //Logo em seguida verificamos se não existe uma página atual gravada na sessão, 
         //caso isso seja verdade então sabemos que é o primeiro acesso do usuário.
         //Neste caso iremos gravar a última página e a página atual como sendo as mesmas:
         if (sess.getAttribute("currentPage") == null) {
             sess.setAttribute("lastPage", newCurrentPage);
             sess.setAttribute("currentPage", newCurrentPage);
         } else {
   
             String oldCurrentPage = sess.getAttribute("currentPage").toString();
             if (!oldCurrentPage.equals(newCurrentPage)) {
               sess.setAttribute("lastPage", oldCurrentPage);
               sess.setAttribute("currentPage", newCurrentPage);
             }
         }
   
         //O usuário prossiga com o seu fluxo de navegação:
         chain.doFilter(request, response);   
      }
   
      public void init(FilterConfig arg0) throws ServletException {
         // TODO Auto-generated method stub
   
      }
   
    
}
