package org.apache.jsp.Mod_002dRecursosHumanos;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class RegistrarNovedad_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/Mod-RecursosHumanos/../headerModulos.jspf");
    _jspx_dependants.add("/Mod-RecursosHumanos/../footer.jspf");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Registrar novedad</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"../css/bootstrap.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../css/estilos2.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("          ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<header>\n");
      out.write("    <div>\n");
      out.write("        <nav class=\"navbar navbar-default\" role=\"navigation\">\n");
      out.write("            <!-- El logotipo y el icono que despliega el menú se agrupan\n");
      out.write("                 para mostrarlos mejor en los dispositivos móviles -->\n");
      out.write("            <div class=\"navbar-header\">\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\"\n");
      out.write("                        data-target=\".navbar-ex1-collapse\">\n");
      out.write("                    <span class=\"sr-only\">Desplegar navegación</span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                </button>\n");
      out.write("                <img src=\"img/logolj.png\" width=\"50px\" style=\"vertical-align: middle; float: left;\" alt=\"\">\n");
      out.write("                <a class=\"navbar-brand\" href=\"#\">LA JUGOSA</a>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- Agrupar los enlaces de navegación, los formularios y cualquier\n");
      out.write("                 otro elemento que se pueda ocultar al minimizar la barra -->\n");
      out.write("            <div class=\"collapse navbar-collapse navbar-ex1-collapse\">\n");
      out.write("              <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("      <li class=\"dropdown\"><a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\"><span class=\"glyphicon glyphicon-briefcase\"></span>Administrativo<span class=\"caret\"></span></a>\n");
      out.write("        <ul class=\"dropdown-menu\">\n");
      out.write("          <li><a href=\"MOD-ADMINISTRATIVO/Administrativo_Autorizaciones.html\">Autorizaciones</a></li>\n");
      out.write("          <li><a href=\"MOD-ADMINISTRATIVO/Administrativo_Ventas.html\">Informe de ventas</a></li>\n");
      out.write("          <li><a href=\"MOD-ADMINISTRATIVO/Administrativo_Insumos.html\">Informe de Insumos</a></li>\n");
      out.write("          <li><a href=\"MOD-ADMINISTRATIVO/Administatrivo_InformeEmpleados.html\">Informe de empleados</a></li>\n");
      out.write("        </ul>\n");
      out.write("      </li>\n");
      out.write("\n");
      out.write("      <li class=\"dropdown\"><a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\"><span class=\"glyphicon glyphicon-apple\">Insumos<span class=\"caret\"></span></a>\n");
      out.write("        <ul class=\"dropdown-menu\">\n");
      out.write("          <li><a href=\"MOD-INSUMOS/Disponibilidad_Insumo.html\">Ver lista de insumos</a></li>\n");
      out.write("          <li><a href=\"MOD-INSUMOS/Solicitar_Insumo.html\">Solicitar Insumo</a></li>\n");
      out.write("          <li><a href=\"MOD-INSUMOS/Modificar_Insumo.html\">Modificar registro de insumo</a></li>\n");
      out.write("          <li><a href=\"#\">Inicio</a></li>\n");
      out.write("        </ul>\n");
      out.write("      </li>\n");
      out.write("      \n");
      out.write("      <li class=\"dropdown\"><a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\"><span class=\"glyphicon glyphicon-shopping-cart\">Ventas<span class=\"caret\"></span></a>\n");
      out.write("        <ul class=\"dropdown-menu\">\n");
      out.write("          <li><a href=\"#\">Registrar ventas</a></li>\n");
      out.write("          <li><a href=\"#\">Listar ventas</a></li>\n");
      out.write("          <li><a href=\"#\">Realizar infrome de ventas</a></li>\n");
      out.write("          <li><a href=\"#\">Generar factura de ventas</a></li>\n");
      out.write("          <li><a href=\"#\">Cancelar venta</a></li>\n");
      out.write("        </ul>\n");
      out.write("      </li>\n");
      out.write("     \n");
      out.write("      <li class=\"dropdown\"><a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">Recursos humanos<span class=\"caret\"></span></a>\n");
      out.write("        <ul class=\"dropdown-menu\">\n");
      out.write("          <li><a href=\"#\">Registrar empleados</a></li>\n");
      out.write("          <li><a href=\"#\">Listar empleados</a></li>\n");
      out.write("          <li><a href=\"#\">Novedades</a></li>\n");
      out.write("        </ul>\n");
      out.write("      </li>\n");
      out.write("      \n");
      out.write("      \n");
      out.write("       \n");
      out.write("      \n");
      out.write("         <li class=\"dropdown\"><a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">Clientes<span class=\"caret\"></span></a>\n");
      out.write("        <ul class=\"dropdown-menu\">\n");
      out.write("          <li><a href=\"#\">Registrar clientes</a></li>\n");
      out.write("          <li><a href=\"#\">Listar clientes</a></li>\n");
      out.write("          <li><a href=\"#\">Solicitar domicilio</a></li>\n");
      out.write("        </ul>\n");
      out.write("      </li>\n");
      out.write("      \n");
      out.write("        <li><a href=\"#\">Cerrar sesión</a></li>\n");
      out.write("      \n");
      out.write("   \n");
      out.write("      </li>\n");
      out.write("      \n");
      out.write("      \n");
      out.write("    </ul>\n");
      out.write("   <!--  <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("      <li><a href=\"#\">Cerrar sesión</a></li> >\n");
      out.write("    </ul> -->\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("    </div>\n");
      out.write("</header>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <h2 style=\"text-align: center;\"><b>REGISTRAR NOVEDAD</b></h2>\n");
      out.write("       <h4 style=\"text-align: center;\"><b>llene el formulario con los datos del empleado que desea registrarle la novedad.</b></h4><br><br>\n");
      out.write("\n");
      out.write("       \n");
      out.write("              \n");
      out.write("               <form>\n");
      out.write("                <div class=\"container\">\n");
      out.write("                                    <label class=\"form-control-label\" for=\"index-form1-1-name\"><span class=\"titulo\">Nombres</span></label><br>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"name\"required=\"\" data-form-field=\"Name\" id=\"index-form1-1-name\" placeholder=\"Ingrese los nombres del empleado\"><br>\n");
      out.write("\n");
      out.write("                                     <labe2 class=\"form-control-label\" for=\"index-form2-2-name\"><span class=\"titulo\"><b>Apellidos</b></span></labe2><br>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"name\"required=\"\" data-form-field=\"Name\" id=\"index-form2-2-name\" placeholder=\"Ingrese los apellidos del empleado\"><br>\n");
      out.write("\n");
      out.write("                                    <label class=\"form-control-label\" for=\"index-form1-1-name\"><span class=\"titulo\">Documento de identificación</span></label><br>\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" name=\"name\"required=\"\" data-form-field=\"Name\" id=\"index-form1-1-name\" placeholder=\"Ingrese el número de documento de identificación\"><br>\n");
      out.write("\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                      <label class=\"form-control-label\" for=\"index-form-4-4name\"><span class=\"titulo\">Seleccione el tipo de documento</span></label>\n");
      out.write("                                         <select class=\"form-control\">\n");
      out.write("                                            <option>Cédula de Ciudadanía(CC)</option>\n");
      out.write("                                            <option>Tarjeta de Identidad (TI)</option>\n");
      out.write("                                            <option>Registro Civil (RC)</option>\n");
      out.write("                                            <option>Cédula de Extranjería (CE)</option>\n");
      out.write("                                            <option>Otros</option>\n");
      out.write("                                      </select>\n");
      out.write("                                      </div>\n");
      out.write("                                      <label class=\"form-control\">Descripción detallada de la novedad</label>\n");
      out.write("                                     <textarea name=\"\" id=\"\" cols=\"30\" rows=\"10\" class=\"form-control\" placeholder=\"Escriba la descripcion detallada de la novedad\"></textarea>\n");
      out.write("\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                      <label class=\"form-control-label\" for=\"index-form-4-4name\"><span class=\"titulo\">Seleccione la sede del empleado</span></label>\n");
      out.write("                                       <select class=\"form-control\">\n");
      out.write("                                            <option>Envigado </option>\n");
      out.write("                                            <option>Itagüí</option>\n");
      out.write("                                            <option>Sabaneta</option>\n");
      out.write("                                            <option>Poblado</option>\n");
      out.write("                                            <option>Carrera 80</option>\n");
      out.write("                                            <option>Los Sauces</option>\n");
      out.write("                                            <option>Laureles</option>\n");
      out.write("                                            <option>Avenida Oriental</option>\n");
      out.write("                                            <option>Bello</option>\n");
      out.write("                                            <option>Belén</option>\n");
      out.write("                                      </select>\n");
      out.write("                                    </div>\n");
      out.write("                                  <label class=\"form-control-label\" for=\"index-form1-1-name\"><span class=\"titulo\">Cargo</span></label>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"name\"required=\"\" data-form-field=\"Name\" id=\"index-form1-1-name\" placeholder=\"Ingrese el cargo del empleado\"><br> \n");
      out.write("                                    <button type=\"button\" class=\"btn btn-success\" data-toggle=\"modal\" data-target=\"#registrar\">Registrar Novedad</button>             \n");
      out.write("              </form>\n");
      out.write("            </div><br><br><br><br>\n");
      out.write("              <div class=\"modal fade\" id=\"registrar\" role=\"dialog\">\n");
      out.write("         <div class=\"modal-dialog\">\n");
      out.write("            <!-- Cabecera del modal-->\n");
      out.write("            <div class=\"modal-content\">\n");
      out.write("               <div class=\"modal-header\">\n");
      out.write("                   <div class=\"alert alert-success\">\n");
      out.write("                        <strong>¡Éxito!</strong> Novedad registrada correctamente.\n");
      out.write("                     </div>\n");
      out.write("               </div>\n");
      out.write("               <!-- Footer del modal, dos botones, cerrrar y Acceder-->\n");
      out.write("               <div class=\"modal-footer\">\n");
      out.write("                  <button type=\"button\" class=\"btn btn-primary\" data-dismiss=\"modal\">Cerrar</button>\n");
      out.write("               </div>\n");
      out.write("            </div>\n");
      out.write("         </div>\n");
      out.write("      </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("         ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<footer>\n");
      out.write("    <div class=\" text-center pie\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-xs-12\">\n");
      out.write("                <p>La Jugosa &copy; </p>\n");
      out.write("                <p>Todos los derechos reservados</p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</footer>\n");
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("     \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
