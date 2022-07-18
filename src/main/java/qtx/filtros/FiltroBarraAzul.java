package qtx.filtros;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet Filter implementation class FiltroBarraAzul
 */
public class FiltroBarraAzul implements Filter {

    /**
     * Default constructor. 
     */
    public FiltroBarraAzul() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("\t\tFiltroBarraAzul:PRE PROCESO ------------");
		PrintWriter salida = response.getWriter();
		String barraAzul = "<h2 style=\"color:white;background-color:blue;text-align:center\">";
		barraAzul+="FiltroBarraAzul"+"</h2>";
		salida.println(barraAzul);
		chain.doFilter(request, response);
		salida.println(barraAzul);
		System.out.println("\t\tFiltroBarraAzul:POST PROCESO ------------");
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
