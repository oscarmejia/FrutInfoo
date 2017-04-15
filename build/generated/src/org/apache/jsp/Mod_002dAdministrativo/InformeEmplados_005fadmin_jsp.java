package org.apache.jsp.Mod_002dAdministrativo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class InformeEmplados_005fadmin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/Mod-Administrativo/../headerModulos.jspf");
    _jspx_dependants.add("/Mod-Administrativo/../footerModulos.jspf");
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
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"../css/bootstrap.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../css/estilos2.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<header>\r\n");
      out.write("   \r\n");
      out.write("        <nav class=\"navbar navbar-default\" role=\"navigation\">\r\n");
      out.write("            <!-- El logotipo y el icono que despliega el menú se agrupan\r\n");
      out.write("                 para mostrarlos mejor en los dispositivos móviles -->\r\n");
      out.write("            <div class=\"navbar-header\">\r\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\"\r\n");
      out.write("                        data-target=\".navbar-ex1-collapse\">\r\n");
      out.write("                    <span class=\"sr-only\">Desplegar navegación</span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                </button>\r\n");
      out.write("                <img src=\"../img/logo.png\" width=\"50px\" style=\"vertical-align: middle; float: left;\" alt=\"\">\r\n");
      out.write("                <a class=\"navbar-brand\" href=\"#\">LA JUGOSA</a>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- Agrupar los enlaces de navegación, los formularios y cualquier\r\n");
      out.write("                 otro elemento que se pueda ocultar al minimizar la barra -->\r\n");
      out.write("            <div class=\"collapse navbar-collapse navbar-ex1-collapse\">\r\n");
      out.write("              <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("      <li class=\"dropdown\"><a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\"><span class=\"glyphicon glyphicon-briefcase\"></span>Administrativo<span class=\"caret\"></span></a>\r\n");
      out.write("        <ul class=\"dropdown-menu\">\r\n");
      out.write("          <li><a href=\"../Mod-Administrativo/Autorizaciones_admin.jsp\">Autorizaciones</a></li>\r\n");
      out.write("          <li><a href=\"../Mod-Administrativo/Ventas_admin.jsp\">Informe de ventas</a></li>\r\n");
      out.write("          <li><a href=\"../Mod-Administrativo/Insumos_admin.jsp\">Informe de Insumos</a></li>\r\n");
      out.write("          <li><a href=\"../Mod-Administrativo/Administatrivo_InformeEmpleados.html\">Informe de empleados</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </li>\r\n");
      out.write("\r\n");
      out.write("      <li class=\"dropdown\"><a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\"><span class=\"glyphicon glyphicon-apple\">Insumos<span class=\"caret\"></span></a>\r\n");
      out.write("        <ul class=\"dropdown-menu\">\r\n");
      out.write("          <li><a href=\"../Mod-Insumos/VerlistadeInsumos.jsp\">Ver lista de insumos</a></li>\r\n");
      out.write("          <li><a href=\"../Mod-Insumos/SolicitarInsumo.jsp\">Solicitar Insumo</a></li>\r\n");
      out.write("          <li><a href=\"../Mod-Insumos/RegistrarInsumo.jsp\">Registrar insumos</a></li>\r\n");
      out.write("          <li><a href=\"#\">Inicio</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </li>\r\n");
      out.write("      \r\n");
      out.write("      <li class=\"dropdown\"><a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\"><span class=\"glyphicon glyphicon-shopping-cart\">Ventas<span class=\"caret\"></span></a>\r\n");
      out.write("        <ul class=\"dropdown-menu\">\r\n");
      out.write("          <li><a href=\"../Mod-Ventas/RegistrarVentas.jsp\">Registrar ventas</a></li>\r\n");
      out.write("          <li><a href=\"../Mod-Ventas/ListarVentas.jsp\">Listar ventas</a></li>\r\n");
      out.write("          <li><a href=\"../Mod-Ventas/InforVentas.jsp\">Realizar infrome de ventas</a></li>\r\n");
      out.write("          <li><a href=\"../Mod-Ventas/FacturaVentas.jsp\">Generar factura de ventas</a></li>\r\n");
      out.write("         \r\n");
      out.write("        </ul>\r\n");
      out.write("      </li>\r\n");
      out.write("     \r\n");
      out.write("      <li class=\"dropdown\"><a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">Recursos humanos<span class=\"caret\"></span></a>\r\n");
      out.write("        <ul class=\"dropdown-menu\">\r\n");
      out.write("          <li><a href=\"../Mod-RecursosHumanos/RegistrarEmpleados.jsp\">Registrar empleados</a></li>\r\n");
      out.write("          <li><a href=\"../Mod-RecursosHumanos/ListarEmpleados.jsp\">Listar empleados</a></li>\r\n");
      out.write("          <li><a href=\"../Mod-RecursosHumanos/Novedades.jsp\">Novedades</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </li>\r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("       \r\n");
      out.write("      \r\n");
      out.write("         <li class=\"dropdown\"><a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">Clientes<span class=\"caret\"></span></a>\r\n");
      out.write("        <ul class=\"dropdown-menu\">\r\n");
      out.write("            <li><a href=\"../Mod-Clientes/RegisCliente.jsp\">Registrar clientes</a></li>\r\n");
      out.write("          <li><a href=\"#\">Listar clientes</a></li>\r\n");
      out.write("          <li><a href=\"#\">Solicitar domicilio</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </li>\r\n");
      out.write("      \r\n");
      out.write("        <li><a href=\"#\">Cerrar sesión</a></li>\r\n");
      out.write("      \r\n");
      out.write("   \r\n");
      out.write("      </li>\r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("    </ul>\r\n");
      out.write("   <!--  <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("      <li><a href=\"#\">Cerrar sesión</a></li> >\r\n");
      out.write("    </ul> -->\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </nav>\r\n");
      out.write(" \r\n");
      out.write("</header>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("\n");
      out.write("                <h2 style=\"text-align: center;\">Informe de empleados</h2>\n");
      out.write("                <p style=\"text-align: center;\">Consulte aquí todo lo relacionado con los empleados.</p>\n");
      out.write("                <input type=\"text\" class=\"form-control\" placeholder=\"Ingrese el número de documento del empleado\"><br>\n");
      out.write("                <button class=\"btn btn-primary\">Buscar</button>\n");
      out.write("                <br><br>\n");
      out.write("                <table class=\"table table-bordered\">\n");
      out.write("                    <thead>\n");
      out.write("                        <tr>\n");
      out.write("                            <th>Nombres</th>\n");
      out.write("                            <th>Identificación</th>\n");
      out.write("                            <th>Cargo</th>\n");
      out.write("                            <th>Detalles</th>\n");
      out.write("\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Jhon Wilmar Venté</td>\n");
      out.write("                            <td>1021147942</td>\n");
      out.write("                            <td>Mesero</td>\n");
      out.write("                            <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span><a data-toggle=\"modal\" href=\"#detalle1\"><img src=\"../img/detallar.jpg\" height=\"20px\"></a></td>\n");
      out.write("\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Edwin Arturo Saénz Barón </td>\n");
      out.write("                            <td>7584422668</td>\n");
      out.write("                            <td>Mensajero</td>\n");
      out.write("                            <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span><a data-toggle=\"modal\" href=\"#detalle2\"><img src=\"../img/detallar.jpg\" height=\"20px\"></a></td>\n");
      out.write("\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Jhon Jairo Campillo Londoño</td>\n");
      out.write("                            <td>5244698223</td>\n");
      out.write("                            <td>Administrador punto de venta</td>\n");
      out.write("                            <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span><a data-toggle=\"modal\" href=\"#detalle3\"><img src=\"../img/detallar.jpg\" height=\"20px\"></a></td>\n");
      out.write("\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Oscar</td>\n");
      out.write("                            <td>8528585566</td>\n");
      out.write("                            <td>Jefe de insumos</td>\n");
      out.write("                            <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span><a data-toggle=\"modal\" href=\"#detalle4\"><img src=\"../img/detallar.jpg\" height=\"20px\"></a></td>\n");
      out.write("\n");
      out.write("                        </tr>\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"modal fade\" id=\"detalle1\" role=\"dialog\">\n");
      out.write("                <div class=\"modal-dialog\">\n");
      out.write("                    <!-- Cabecera del modal-->\n");
      out.write("                    <div class=\"modal-content\">\n");
      out.write("                        <div class=\"modal-header\">\n");
      out.write("                            <h3>Descripción detallada del empleado</h3>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- Cuerpo  del modal, tiene dos input's, y dos h3 (Usuario y contraseña)-->\n");
      out.write("                        <div class=\"modal-body\">\n");
      out.write("                            <h4>\n");
      out.write("                                <b>Nombre:</b> Jhon Wilmar Venté Riascos\n");
      out.write("                            </h4>\n");
      out.write("                            <h4><b>Documento de identificación:</b> 1021147942<br></h4>\n");
      out.write("                            <h4><b>Cargo:</b> Mesero<br></h4>\n");
      out.write("                            <h4><b>Sede en la que labora:</b> Sabaneta<br></h4>\n");
      out.write("                            <h4><b>Inicio de contrato:</b> 08/10/2016<br></h4>\n");
      out.write("                            <h4><b>Teléfono:</b> 25499852<br></h4>\n");
      out.write("                            <h4><b>Celular:</b> 3148829542<br></h4>\n");
      out.write("                            <h4><b>Dirección:</b> Calle 20 # 60-45</h4>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- Footer del modal, dos botones, cerrrar y Acceder-->\n");
      out.write("                        <div class=\"modal-footer\">\n");
      out.write("                            <button type=\"button\" class=\"btn btn-primary\" data-dismiss=\"modal\">Cerrar</button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"modal fade\" id=\"detalle2\" role=\"dialog\">\n");
      out.write("                <div class=\"modal-dialog\">\n");
      out.write("                    <!-- Cabecera del modal-->\n");
      out.write("                    <div class=\"modal-content\">\n");
      out.write("                        <div class=\"modal-header\">\n");
      out.write("                            <h3>Descripción detallada del empleado</h3>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- Cuerpo  del modal, tiene dos input's, y dos h3 (Usuario y contraseña)-->\n");
      out.write("                        <div class=\"modal-body\">\n");
      out.write("                            <h4>\n");
      out.write("                                <b>Nombre:</b> Edwin Arturo Saénz Barón \n");
      out.write("                                <h4>\n");
      out.write("                                    <h4><b>Documento de identificación:</b> 7584422668<br></h4>\n");
      out.write("                                    <h4><b>Cargo:</b>    Mensajero<br></h4>\n");
      out.write("                                    <h4><b>Sede en la que labora:</b> Sabaneta<br></h4>\n");
      out.write("                                    <h4><b>Inicio de contrato:</b> 08/10/2016<br></h4>\n");
      out.write("                                    <h4><b>Teléfono:</b> 25499852<br></h4>\n");
      out.write("                                    <h4><b>Celular:</b> 3148829542<br></h4>\n");
      out.write("                                    <h4><b>Dirección:</b> Calle 20 # 60-45</h4>\n");
      out.write("                                    </div>\n");
      out.write("                                    <!-- Footer del modal, dos botones, cerrrar y Acceder-->\n");
      out.write("                                    <div class=\"modal-footer\">\n");
      out.write("                                        <button type=\"button\" class=\"btn btn-primary\" data-dismiss=\"modal\">Cerrar</button>\n");
      out.write("                                    </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"modal fade\" id=\"detalle3\" role=\"dialog\">\n");
      out.write("                                        <div class=\"modal-dialog\">\n");
      out.write("                                            <!-- Cabecera del modal-->\n");
      out.write("                                            <div class=\"modal-content\">\n");
      out.write("                                                <div class=\"modal-header\">\n");
      out.write("                                                    <h3>Descripción detallada del empleado</h3>\n");
      out.write("                                                </div>\n");
      out.write("                                                <!-- Cuerpo  del modal, tiene dos input's, y dos h3 (Usuario y contraseña)-->\n");
      out.write("                                                <div class=\"modal-body\">\n");
      out.write("                                                    <h4>\n");
      out.write("                                                        <b>Nombre:</b> Jhon Jairo Campillo Londoño\n");
      out.write("                                                        <h4>\n");
      out.write("                                                            <h4><b>Documento de identificación:</b> 5244698223<br></h4>\n");
      out.write("                                                            <h4><b>Cargo:</b> Administrador punto de venta <br></h4>\n");
      out.write("                                                            <h4><b>Sede en la que labora:</b> Sabaneta<br></h4>\n");
      out.write("                                                            <h4><b>Inicio de contrato:</b> 08/10/2016<br></h4>\n");
      out.write("                                                            <h4><b>Teléfono:</b> 25499852<br></h4>\n");
      out.write("                                                            <h4><b>Celular:</b> 3148829542<br></h4>\n");
      out.write("                                                            <h4><b>Dirección:</b> Calle 20 # 60-45</h4>\n");
      out.write("                                                            </div>\n");
      out.write("                                                            <!-- Footer del modal, dos botones, cerrrar y Acceder-->\n");
      out.write("                                                            <div class=\"modal-footer\">\n");
      out.write("                                                                <button type=\"button\" class=\"btn btn-primary\" data-dismiss=\"modal\">Cerrar</button>\n");
      out.write("                                                            </div>\n");
      out.write("                                                            </div>\n");
      out.write("                                                            </div>\n");
      out.write("                                                            </div>\n");
      out.write("\n");
      out.write("                                                            <div class=\"modal fade\" id=\"detalle4\" role=\"dialog\">\n");
      out.write("                                                                <div class=\"modal-dialog\">\n");
      out.write("                                                                    <!-- Cabecera del modal-->\n");
      out.write("                                                                    <div class=\"modal-content\">\n");
      out.write("                                                                        <div class=\"modal-header\">\n");
      out.write("                                                                            <h3>Descripción detallada del empleado</h3>\n");
      out.write("                                                                        </div>\n");
      out.write("                                                                        <!-- Cuerpo  del modal, tiene dos input's, y dos h3 (Usuario y contraseña)-->\n");
      out.write("                                                                        <div class=\"modal-body\">\n");
      out.write("                                                                            <h4>\n");
      out.write("                                                                                <b>Nombre:</b> Oscar\n");
      out.write("                                                                                <h4>\n");
      out.write("                                                                                    <h4><b>Documento de identificación:</b> 8528585566<br></h4>\n");
      out.write("                                                                                    <h4><b>Cargo:</b>    Jefe de insumos<br></h4>\n");
      out.write("                                                                                    <h4><b>Sede en la que labora:</b> Sabaneta<br></h4>\n");
      out.write("                                                                                    <h4><b>Inicio de contrato:</b> 08/10/2016<br></h4>\n");
      out.write("                                                                                    <h4><b>Teléfono:</b> 25499852<br></h4>\n");
      out.write("                                                                                    <h4><b>Celular:</b> 3148829542<br></h4>\n");
      out.write("                                                                                    <h4><b>Dirección:</b> Calle 20 # 60-45</h4>\n");
      out.write("                                                                                    </div>\n");
      out.write("                                                                                    <!-- Footer del modal, dos botones, cerrrar y Acceder-->\n");
      out.write("                                                                                    <div class=\"modal-footer\">\n");
      out.write("                                                                                        <button type=\"button\" class=\"btn btn-primary\" data-dismiss=\"modal\">Cerrar</button>\n");
      out.write("                                                                                    </div>\n");
      out.write("                                                                                    </div>\n");
      out.write("                                                                                    </div>\n");
      out.write("                                                                                    </div>\n");
      out.write("                                                                                    <div class=\"modal fade\" id=\"actualizar\" role=\"dialog\">\n");
      out.write("                                                                                        <div class=\"modal-dialog\">\n");
      out.write("                                                                                            <!-- Cabecera del modal-->\n");
      out.write("                                                                                            <div class=\"modal-content\">\n");
      out.write("                                                                                                <div class=\"modal-header\">\n");
      out.write("                                                                                                    <div class=\"alert alert-success\">\n");
      out.write("                                                                                                        <strong>¡Éxito!</strong> Datos actualizados correctamente.\n");
      out.write("                                                                                                    </div>\n");
      out.write("                                                                                                </div>\n");
      out.write("                                                                                                <!-- Footer del modal, dos botones, cerrrar y Acceder-->\n");
      out.write("                                                                                                <div class=\"modal-footer\">\n");
      out.write("                                                                                                    <button type=\"button\" class=\"btn btn-primary\" data-dismiss=\"modal\">Cerrar</button>\n");
      out.write("                                                                                                </div>\n");
      out.write("                                                                                            </div>\n");
      out.write("                                                                                        </div>\n");
      out.write("                                                                                    </div>\n");
      out.write("                                                                                    <br>\n");
      out.write("                                                                                    <br>\n");
      out.write("                                                                                    <br>\n");
      out.write("                                                                                    </div>\n");
      out.write("                                    ");
      out.write("\r\n");
      out.write("<footer>\r\n");
      out.write("    <div class=\"navbar-fixed-bottom\">\r\n");
      out.write("        <div class=\" text-center pie\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-xs-12\">\r\n");
      out.write("                    <p>La Jugosa &copy; </p>\r\n");
      out.write("                    <p>Todos los derechos reservados</p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</footer>\r\n");
      out.write("\n");
      out.write("                                    </body>\n");
      out.write("                        </html>\n");
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
