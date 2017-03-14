package org.apache.jsp.Mod_002dRecursosHumanos;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Novedades_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Novedades</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"../css/bootstrap.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../css/estilos2.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        ");
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
      out.write("          <li><a href=\"Mod-Insumos/VerlistadeInsumos.jsp\">Ver lista de insumos</a></li>\n");
      out.write("          <li><a href=\"Mod-Insumos/SolicitarInsumo.jsp\">Solicitar Insumo</a></li>\n");
      out.write("          <li><a href=\"Mod-Insumos/RegistrarInsumo.jsp\">Registrar insumos</a></li>\n");
      out.write("          <li><a href=\"#\">Inicio</a></li>\n");
      out.write("        </ul>\n");
      out.write("      </li>\n");
      out.write("      \n");
      out.write("      <li class=\"dropdown\"><a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\"><span class=\"glyphicon glyphicon-shopping-cart\">Ventas<span class=\"caret\"></span></a>\n");
      out.write("        <ul class=\"dropdown-menu\">\n");
      out.write("          <li><a href=\"Mod-Ventas/RegistrarVentas.jsp\">Registrar ventas</a></li>\n");
      out.write("          <li><a href=\"Mod-Ventas/ListarVentas.jsp\">Listar ventas</a></li>\n");
      out.write("          <li><a href=\"Mod-Ventas/InformeVentas.jsp\">Realizar infrome de ventas</a></li>\n");
      out.write("          <li><a href=\"Mod-Ventas/FacturasVentas.jsp\">Generar factura de ventas</a></li>\n");
      out.write("         \n");
      out.write("        </ul>\n");
      out.write("      </li>\n");
      out.write("     \n");
      out.write("      <li class=\"dropdown\"><a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">Recursos humanos<span class=\"caret\"></span></a>\n");
      out.write("        <ul class=\"dropdown-menu\">\n");
      out.write("          <li><a href=\"../Mod-RecursosHumanos/RegistrarEmpleados.jsp\">Registrar empleados</a></li>\n");
      out.write("          <li><a href=\"Mod-RecursosHumanos/ListarEmpleados.jsp\">Listar empleados</a></li>\n");
      out.write("          <li><a href=\"Mod-RecursosHumanos/Novedades.jsp\">Novedades</a></li>\n");
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
      out.write(" <br><br>\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("\n");
      out.write("            <select class=\"form-control\">\n");
      out.write("                <option>Filtrar novedad</option>\n");
      out.write("                <option>Incapacidades</option>\n");
      out.write("                <option>Permisos</option>\n");
      out.write("                <option>Vacaciones</option>\n");
      out.write("                <option>Renuncias</option>\n");
      out.write("                <option>Todas</option>\n");
      out.write("\n");
      out.write("            </select><br>\n");
      out.write("            <label class=\"form-control-label\" for=\"index-form1-1-name\" class=\"label\"><span class=\"titulo\">Documento de identifición</span></label>\n");
      out.write("            <input type=\"text\" name=\"\" class=\"form-control\" placeholder=\"Ingrese el documento de identificación del empleado\">\n");
      out.write("\n");
      out.write("            <br> <button type=\"button\" class=\"btn btn-success\">Consultar</button>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("            <input type=\"button\" value=\"Registrar Novedad\" onClick=\"location.href = 'RegistrarNovedad.jsp'\" class=\"btn btn-primary\" />\n");
      out.write("\n");
      out.write("            <small class=\"mbr-section-subtitle\"></small>\n");
      out.write("            <br><br><br><br>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <br>\n");
      out.write("    <div class=\"container\">\n");
      out.write("\n");
      out.write("        <div style=\"text-align:center\">\n");
      out.write("            <h2>NOVEDADES</h2>\n");
      out.write("            <h4>Estas son todas las actividades relacionadas con  los empleados ya sean incapacidades, vacaciones, etc..</h4>\n");
      out.write("        </div>\n");
      out.write("        <br> \n");
      out.write("        <div class=\"table-responsive\">\n");
      out.write("            <table class=\"table table-bordered\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Número de novedad </th>\n");
      out.write("                        <th>Novedad</th>\n");
      out.write("                        <th>Empleado involucrado</th>\n");
      out.write("                        <th>Detalles</th>\n");
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>0015</td>\n");
      out.write("                        <td>Incapacidad</td>\n");
      out.write("                        <td>Jhon Jairo Campillo Londoño</td>\n");
      out.write("                        <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span><a data-toggle=\"modal\" href=\"#detalle1\"><img src=\"../img/detallar.jpg\" height=\"20px\"></a></td>\n");
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>0016 </td>\n");
      out.write("                        <td>Renuncia</td>\n");
      out.write("                        <td>Edwin Arturo Saénz Barón </td>\n");
      out.write("                        <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span><a data-toggle=\"modal\" href=\"#detalle2\"><img src=\"../img/detallar.jpg\" height=\"20px\"></a></td>\n");
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>0017</td>\n");
      out.write("                        <td>Permiso</td>\n");
      out.write("                        <td>Jhon Wilmar Venté Riascos</td>\n");
      out.write("                        <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span><a data-toggle=\"modal\" href=\"#detalle3\"><img src=\"../img/detallar.jpg\" height=\"20px\"></a></td>\n");
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>0018</td>\n");
      out.write("                        <td>Incapacidad</td>\n");
      out.write("                        <td>Oscar</td>\n");
      out.write("                        <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span><a data-toggle=\"modal\" href=\"#detalle4\"><img src=\"../img/detallar.jpg\" height=\"20px\"></a></td>\n");
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"modal fade\" id=\"detalle1\" role=\"dialog\">\n");
      out.write("        <div class=\"modal-dialog\">\n");
      out.write("            <!-- Cabecera del modal-->\n");
      out.write("            <div class=\"modal-content\">\n");
      out.write("                <div class=\"modal-header\">\n");
      out.write("                    <h3>Descripción detallada de la novedad</h3>\n");
      out.write("                </div>\n");
      out.write("                <!-- Cuerpo  del modal, tiene dos input's, y dos h3 (Usuario y contraseña)-->\n");
      out.write("                <div class=\"modal-body\">\n");
      out.write("                    <h4><b>Número de novedad:</b> 0015<h4>\n");
      out.write("                            <h4><b>Tipo de novedad:</b> Incapacidad<h4>\n");
      out.write("                                    <h4><b>Empleado involucrado:</b> Jhon Jairo Campillo Londoño<h4>\n");
      out.write("                                            <h4><b>Documento de identificación:</b> 1021147942<br></h4>\n");
      out.write("                                            <h4><b>Fecha de la incapacidad:</b> 06/07/2016 7:00 AM<br></h4>\n");
      out.write("                                            <h4><b>Sede en la que labora:</b> Sabaneta<br></h4>\n");
      out.write("                                            <h4><b>Descripción detallada:</b> El empleado tenía una fractura en brazo izquierdo por lo cual fue incapacitado 3 semanas<br></h4>\n");
      out.write("                                            </div>\n");
      out.write("                                            <!-- Footer del modal, dos botones, cerrrar y Acceder-->\n");
      out.write("                                            <div class=\"modal-footer\">\n");
      out.write("                                                <button type=\"button\" class=\"btn btn-primary\" data-dismiss=\"modal\">Cerrar</button>\n");
      out.write("                                            </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"modal fade\" id=\"detalle2\" role=\"dialog\">\n");
      out.write("                                                <div class=\"modal-dialog\">\n");
      out.write("                                                    <!-- Cabecera del modal-->\n");
      out.write("                                                    <div class=\"modal-content\">\n");
      out.write("                                                        <div class=\"modal-header\">\n");
      out.write("                                                            <h3>Descripción detallada de la novedad</h3>\n");
      out.write("                                                        </div>\n");
      out.write("                                                        <!-- Cuerpo  del modal, tiene dos input's, y dos h3 (Usuario y contraseña)-->\n");
      out.write("                                                        <div class=\"modal-body\">\n");
      out.write("                                                            <h4><b>Número de novedad:</b> 0016<h4>\n");
      out.write("                                                                    <h4><b>Tipo de novedad:</b> Renuncia<h4>\n");
      out.write("                                                                            <h4><b>Empleado involucrado:</b> Edwin Arturo Saénz Barón <h4>\n");
      out.write("                                                                                    <h4><b>Documento de identificación:</b> 7488558442<br></h4>\n");
      out.write("                                                                                    <h4><b>Fecha de la incapacidad:</b> 06/05/2016 7:00 AM<br></h4>\n");
      out.write("                                                                                    <h4><b>Sede en la que labora:</b> Belén<br></h4>\n");
      out.write("                                                                                    <h4><b>Descripción detallada:</b> El empleado renuncia por cuestiones de estudio<br></h4>\n");
      out.write("                                                                                    </div>\n");
      out.write("                                                                                    <!-- Footer del modal, dos botones, cerrrar y Acceder-->\n");
      out.write("                                                                                    <div class=\"modal-footer\">\n");
      out.write("                                                                                        <button type=\"button\" class=\"btn btn-primary\" data-dismiss=\"modal\">Cerrar</button>\n");
      out.write("                                                                                    </div>\n");
      out.write("                                                                                    </div>\n");
      out.write("                                                                                    </div>\n");
      out.write("                                                                                    </div>\n");
      out.write("\n");
      out.write("                                                                                    <div class=\"modal fade\" id=\"detalle3\" role=\"dialog\">\n");
      out.write("                                                                                        <div class=\"modal-dialog\">\n");
      out.write("                                                                                            <!-- Cabecera del modal-->\n");
      out.write("                                                                                            <div class=\"modal-content\">\n");
      out.write("                                                                                                <div class=\"modal-header\">\n");
      out.write("                                                                                                    <h3>Descripción detallada de la novedad</h3>\n");
      out.write("                                                                                                </div>\n");
      out.write("                                                                                                <!-- Cuerpo  del modal, tiene dos input's, y dos h3 (Usuario y contraseña)-->\n");
      out.write("                                                                                                <div class=\"modal-body\">\n");
      out.write("                                                                                                    <h4><b>Número de novedad:</b> 0017<h4>\n");
      out.write("                                                                                                            <h4><b>Tipo de novedad:</b> Permiso<h4>\n");
      out.write("                                                                                                                    <h4><b>Empleado involucrado:</b> Jhon Wilmar Venté Riascos<h4>\n");
      out.write("                                                                                                                            <h4><b>Documento de identificación:</b> 822114125<br></h4>\n");
      out.write("                                                                                                                            <h4><b>Fecha de la incapacidad:</b> 06/08/2016 7:00 AM<br></h4>\n");
      out.write("                                                                                                                            <h4><b>Sede en la que labora:</b> Sabaneta<br></h4>\n");
      out.write("                                                                                                                            <h4><b>Descripción detallada:</b> El empleado requeria de permiso para una cita médica<br></h4>\n");
      out.write("                                                                                                                            </div>\n");
      out.write("                                                                                                                            <!-- Footer del modal, dos botones, cerrrar y Acceder-->\n");
      out.write("                                                                                                                            <div class=\"modal-footer\">\n");
      out.write("                                                                                                                                <button type=\"button\" class=\"btn btn-primary\" data-dismiss=\"modal\">Cerrar</button>\n");
      out.write("                                                                                                                            </div>\n");
      out.write("                                                                                                                            </div>\n");
      out.write("                                                                                                                            </div>\n");
      out.write("                                                                                                                            </div>\n");
      out.write("                                                                                                                            <div class=\"modal fade\" id=\"detalle4\" role=\"dialog\">\n");
      out.write("                                                                                                                                <div class=\"modal-dialog\">\n");
      out.write("                                                                                                                                    <!-- Cabecera del modal-->\n");
      out.write("                                                                                                                                    <div class=\"modal-content\">\n");
      out.write("                                                                                                                                        <div class=\"modal-header\">\n");
      out.write("                                                                                                                                            <h3>Descripción detallada de la novedad</h3>\n");
      out.write("                                                                                                                                        </div>\n");
      out.write("                                                                                                                                        <!-- Cuerpo  del modal, tiene dos input's, y dos h3 (Usuario y contraseña)-->\n");
      out.write("                                                                                                                                        <div class=\"modal-body\">\n");
      out.write("                                                                                                                                            <h4><b>Número de novedad:</b> 0018<h4>\n");
      out.write("                                                                                                                                                    <h4><b>Tipo de novedad:</b> Incapacidad<h4>\n");
      out.write("                                                                                                                                                            <h4><b>Empleado involucrado:</b> Oscar<h4>\n");
      out.write("                                                                                                                                                                    <h4><b>Documento de identificación:</b> 1021147942<br></h4>\n");
      out.write("                                                                                                                                                                    <h4><b>Fecha de la incapacidad:</b> 06/07/2016 7:00 AM<br></h4>\n");
      out.write("                                                                                                                                                                    <h4><b>Sede en la que labora:</b> Sabaneta<br></h4>\n");
      out.write("                                                                                                                                                                    <h4><b>Descripción detallada:</b> El empleado tenía una fractura en brazo izquierdo por lo cual fue incapacitado 3 semanas<br></h4>\n");
      out.write("                                                                                                                                                                    </div>\n");
      out.write("                                                                                                                                                                    <!-- Footer del modal, dos botones, cerrrar y Acceder-->\n");
      out.write("                                                                                                                                                                    <div class=\"modal-footer\">\n");
      out.write("                                                                                                                                                                        <button type=\"button\" class=\"btn btn-primary\" data-dismiss=\"modal\">Cerrar</button>\n");
      out.write("                                                                                                                                                                    </div>\n");
      out.write("                                                                                                                                                                    </div>\n");
      out.write("                                                                                                                                                                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                                                                                                                                  ");
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
      out.write("                                                                                                                                                                    </body>\n");
      out.write("                                                                                                                                                                    </html>\n");
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
