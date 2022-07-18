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
 * Servlet Filter implementation class FiltroBarraRoja
 */
public class FiltroBarraRoja implements Filter {

    /**
     * Default constructor. 
     */
    public FiltroBarraRoja() {
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
	public void doFilter(ServletRequest request, ServletResponse response, 
						FilterChain chain) throws IOException, ServletException {
		System.out.println("\tFiltroBarraRoja:PRE PROCESO ------------");
		PrintWriter salida = response.getWriter();
		String barraRoja = "<h2 style=\"color:white;background-color:red\">";
		barraRoja+="FiltroBarraRoja"+"</h2>";
		salida.println(barraRoja);
		chain.doFilter(request, response);
		salida.println(barraRoja);
		System.out.println("\tFiltroBarraRoja:POST PROCESO ------------");
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
