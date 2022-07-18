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
 * Servlet Filter implementation class FiltroEncabezadoYPie
 */
public class FiltroEncabezadoYPie implements Filter {

    /**
     * Default constructor. 
     */
    public FiltroEncabezadoYPie() {
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
		System.out.println("FiltroEncabezadoYpie:PRE PROCESO ------------");
		response.setContentType("text/html");
		PrintWriter salida = response.getWriter();
		String encabezadoHtml = this.generaCabeceraHtml("Prueba Filtro");
		salida.println(encabezadoHtml);

		chain.doFilter(request, response);
		
		salida.println("</body>\n</html>");
		System.out.println("FiltroEncabezadoYpie:POST PROCESO ------------");

	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}
	private String generaCabeceraHtml(String titulo){
		String htmlCabecera="";
		htmlCabecera+="<!DOCTYPE html>\n<html>\n<head>\n";
		htmlCabecera+="<meta charset=\"ISO-8859-1\">\n";
//		htmlCabecera+="<link rel=\"stylesheet\" href=\"css/estiloFormularioCaptura.css\" type=\"text/css\" />\n";
		htmlCabecera+="<title>"
				+ titulo
				+ "</title>\n";
		htmlCabecera+="</head>\n<body>";
		return htmlCabecera;
		
	}

}
