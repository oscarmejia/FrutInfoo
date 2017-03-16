package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class IndexP_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("\t<meta charset=\"UTF-8\">\r\n");
      out.write("\t<title>LA JUGOSA</title>\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\r\n");
      out.write("       <link rel=\"stylesheet\" href=\"css/estilos2.css\">\r\n");
      out.write("       <link rel=\"stylesheet\" href=\"path/to/font-awesome/css/font-awesome.min.css\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\r\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write(" \r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<header>\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<nav class=\"navbar navbar-default\" role=\"navigation\">\r\n");
      out.write("\t\t\t  <!-- El logotipo y el icono que despliega el menú se agrupan\r\n");
      out.write("\t\t\t       para mostrarlos mejor en los dispositivos móviles -->\r\n");
      out.write("\t\t\t  <div class=\"navbar-header\">\r\n");
      out.write("\t\t\t    <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\"\r\n");
      out.write("\t\t\t            data-target=\".navbar-ex1-collapse\">\r\n");
      out.write("\t\t\t      <span class=\"sr-only\">Desplegar navegación</span>\r\n");
      out.write("\t\t\t      <span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t      <span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t      <span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t    </button>\r\n");
      out.write("\t\t\t  <img src=\"img/logolj.png\" width=\"50px\" style=\"vertical-align: middle; float: left;\" alt=\"\">\r\n");
      out.write("\t\t\t    <a class=\"navbar-brand\" href=\"#\">LA JUGOSA</a>\r\n");
      out.write("\t\t\t  </div>\r\n");
      out.write("\t\t\t \r\n");
      out.write("\t\t\t  <!-- Agrupar los enlaces de navegación, los formularios y cualquier\r\n");
      out.write("\t\t\t       otro elemento que se pueda ocultar al minimizar la barra -->\r\n");
      out.write("\t\t\t  <div class=\"collapse navbar-collapse navbar-ex1-collapse\">\r\n");
      out.write("\t\t\t    <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("\t\t\t      <li><a href=\"#\">Inicio</a></li>\r\n");
      out.write("\t\t\t      <li><a href=\"#\">Productos</a></li>\r\n");
      out.write("\t\t\t      <li><a href=\"#\">Quines somos</a></li>\r\n");
      out.write("\t\t\t      <li><a href=\"#\">Contactenos</a></li>\r\n");
      out.write("\t\t\t      <li><div class=\"login\">\r\n");
      out.write("\t\t\t    \r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t  <!-- Botón de Iniciar sesión -->\r\n");
      out.write("\t\t\t  <a data-toggle=\"modal\" href=\"#Login\"><img src=\"img/user-verde.png\" class=\"img-circle\" width=\"50\" alt=\"Iniciar sesión\"></a>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t  <!-- Modal -->\r\n");
      out.write("\t\t\t  <div class=\"modal fade\" id=\"Login\" role=\"dialog\">\r\n");
      out.write("\t\t\t    <div class=\"modal-dialog\">\r\n");
      out.write("\t\t\t    \r\n");
      out.write("\t\t\t      <!-- Cabecera del modal, tiene el logo de la jugosa-->\r\n");
      out.write("\t\t\t      <center>\r\n");
      out.write("\t\t\t\t      <div class=\"modal-content\">\r\n");
      out.write("\t\t\t\t        <div class=\"modal-header\">\r\n");
      out.write("\t\t\t\t          <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\r\n");
      out.write("\t\t\t\t          <img src=\"img/logo.png\">\r\n");
      out.write("\t\t\t\t        </div>\r\n");
      out.write("\t\t\t\t        \r\n");
      out.write("\t\t\t\t        <!-- Cuerpo  del modal, tiene dos input's, y dos h3 (Usuario y contraseña)-->\r\n");
      out.write("                                         <form action=\"Login\">\r\n");
      out.write("                                             <h3>Usuario</h3>\r\n");
      out.write("                                             <input type=\"text\" placeholder=\"Ingrese su usuario\" class=\"form-control\" name=\"Usuario\">\r\n");
      out.write("                                             <h3>Contraseña</h3>\r\n");
      out.write("                                             <input type=\"password\" placeholder=\"Ingrese su contraseña\" name=\"Contra\" class=\"form-control\"><br><br>\r\n");
      out.write("                                             <input type=\"submit\" value=\"Acccer \" class=\"btn btn-success\">\r\n");
      out.write("                                            \r\n");
      out.write("                                         </form><br>\r\n");
      out.write("\t\t\t\t      </div>\r\n");
      out.write("\t\t\t      </center>\r\n");
      out.write("\t\t\t    </div>\r\n");
      out.write("\t\t\t  </div>\r\n");
      out.write("\t\t\t  \r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t    </ul>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t \r\n");
      out.write("\t\t\t      \r\n");
      out.write("\t\t\t  </div>\r\n");
      out.write("\t\t\t</nav>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</header>\r\n");
      out.write("\r\n");
      out.write("<section>\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div class=\"col-xs-12\">\r\n");
      out.write("\t\t\t\t<div>\r\n");
      out.write("  \t\t\t\t\t<div id=\"myCarousel\" class=\"carousel slide\" data-ride=\"carousel\">\r\n");
      out.write("\t\t\t\t\t    <!-- INDICADORES -->\r\n");
      out.write("\t\t\t\t\t    <ol class=\"carousel-indicators\">\r\n");
      out.write("\t\t\t\t\t      <li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\r\n");
      out.write("\t\t\t\t\t      <li data-target=\"#myCarousel\" data-slide-to=\"1\"></li>\r\n");
      out.write("\t\t\t\t\t      <li data-target=\"#myCarousel\" data-slide-to=\"2\"></li>\r\n");
      out.write("\t\t\t\t\t    </ol>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t    <!-- AQUI ESTAN TODAS LAS IMAGENES DEL CAROUSEL-->\r\n");
      out.write("\t\t\t\t\t    <div class=\"carousel-inner\" role=\"listbox\">\r\n");
      out.write("\t\t\t\t\t      <div class=\"item active\">\r\n");
      out.write("\t\t\t\t\t       \t<img src=\"img/ensalada.jpg\" alt=\"Chania\" class=\"img-responsive\">\r\n");
      out.write("\t\t\t\t\t        <div class=\"carousel-caption\">\r\n");
      out.write("\t\t\t\t\t         <h3>Ensalada</h3>\r\n");
      out.write("\t\t\t\t\t         <p>Las mejores y mas ricas ensaladas de frutas</p>\r\n");
      out.write("\t\t\t\t\t       \t</div>\r\n");
      out.write("\t\t\t\t\t   \t  </div>\r\n");
      out.write("    \r\n");
      out.write("\t\t\t\t\t      <div class=\"item\">\r\n");
      out.write("\t\t\t\t\t        <img src=\"img/frutas.jpg\" alt=\"Flower\" class=\"img-responsive\">\r\n");
      out.write("\t\t\t\t\t        <div class=\"carousel-caption\">\r\n");
      out.write("\t\t\t\t\t          <h3>Frutas</h3>\r\n");
      out.write("\t\t\t\t\t          <p>Contamos con las frutas mas frescas</p>\r\n");
      out.write("\t\t\t\t\t        </div>\r\n");
      out.write("\t\t\t\t\t      </div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t      <div class=\"item\">\r\n");
      out.write("\t\t\t\t\t        <img src=\"img/split.jpg\" alt=\"Flower\" class=\"img-responsive\">\r\n");
      out.write("\t\t\t\t\t        <div class=\"carousel-caption\">\r\n");
      out.write("\t\t\t\t\t          <h3>Banana Split</h3>\r\n");
      out.write("\t\t\t\t\t          <p>Ven comete uno</p>\r\n");
      out.write("\t\t\t\t\t        </div>\r\n");
      out.write("\t\t\t\t\t      </div>\r\n");
      out.write("  \r\n");
      out.write("    \t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("   \t\t\t\t\t\t <!-- CONTROLES ANTERIOR Y SIGUIENTE -->\r\n");
      out.write("\t\t\t\t\t    <a class=\"left carousel-control\" href=\"#myCarousel\" role=\"button\" data-slide=\"prev\">\r\n");
      out.write("\t\t\t\t\t      <span class=\"glyphicon glyphicon-chevron-left\" aria-hidden=\"true\"></span>\r\n");
      out.write("\t\t\t\t\t      <span class=\"sr-only\">Previous</span>\r\n");
      out.write("\t\t\t\t\t    </a>\r\n");
      out.write("\t\t\t\t\t    <a class=\"right carousel-control\" href=\"#myCarousel\" role=\"button\" data-slide=\"next\">\r\n");
      out.write("\t\t\t\t\t      <span class=\"glyphicon glyphicon-chevron-right\" aria-hidden=\"true\"></span>\r\n");
      out.write("\t\t\t\t\t      <span class=\"sr-only\">Next</span>\r\n");
      out.write("\t\t\t\t\t    </a>\r\n");
      out.write("  \t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</section>\r\n");
      out.write("\r\n");
      out.write("<section>\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t  <div class=\"row\">\r\n");
      out.write("\t    <div class=\"col-xs-12 col-sm-6 col-md-3\">\r\n");
      out.write("\t      <div class=\"thumbnail\">\r\n");
      out.write("\t        <a href=\"#myModal\" data-toggle=\"modal\" target=\"_blank\">\r\n");
      out.write("\t          <img src=\"img/split.jpg\" alt=\"Pulpit Rock\" style=\"width:100%\">\r\n");
      out.write("\t        </a>\r\n");
      out.write("          \t<div class=\"caption\">\r\n");
      out.write("          \t\t<h3>Helados</h3>\r\n");
      out.write("           \t\t<p>Lorem ipsum donec id elit non mi porta gravida at eget metus.</p>\r\n");
      out.write("          \t</div>\r\n");
      out.write("          \t<div id=\"myModal\" class=\"modal fade\" role=\"dialog\">\r\n");
      out.write("\t\t\t\t\t\t  <div class=\"modal-dialog\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t    <!-- Modal content-->\r\n");
      out.write("\t\t\t\t\t\t    <div class=\"modal-content\">\r\n");
      out.write("\t\t\t\t\t\t      <div class=\"modal-header\">\r\n");
      out.write("\t\t\t\t\t\t        <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\r\n");
      out.write("\t\t\t\t\t\t        <h4 class=\"modal-title\">Modal Header</h4>\r\n");
      out.write("\t\t\t\t\t\t      </div>\r\n");
      out.write("\t\t\t\t\t\t      <div class=\"modal-body\">\r\n");
      out.write("\t\t\t\t\t\t        <p>Some text in the modal.</p>\r\n");
      out.write("\t\t\t\t\t\t      </div>\r\n");
      out.write("\t\t\t\t\t\t      <div class=\"modal-footer\">\r\n");
      out.write("\t\t\t\t\t\t        <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\r\n");
      out.write("\t\t\t\t\t\t      </div>\r\n");
      out.write("\t\t\t\t\t\t    </div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t      </div>\r\n");
      out.write("\t    </div>\r\n");
      out.write("\t    <div class=\"col-xs-12 col-sm-6 col-md-3\">\r\n");
      out.write("\t      <div class=\"thumbnail\">\r\n");
      out.write("\t        <a href=\"#myModal\" data-toggle=\"modal\" data-toggle=\"modal\" >\r\n");
      out.write("\t          <img src=\"img/frutas.jpg\" alt=\"Moustiers Sainte Marie\" style=\"width:100%\">\r\n");
      out.write("\t        </a>\r\n");
      out.write("          \t<div class=\"caption\">\r\n");
      out.write("          \t\t<h3>Frutas</h3>\r\n");
      out.write("            \t<p>Lorem ipsum donec id elit non mi porta gravida at eget metus.</p>\r\n");
      out.write("          \t</div>\r\n");
      out.write("          \t\t\t\t<!-- Modal -->\r\n");
      out.write("\t\t\t\t\t\t<div id=\"myModal\" class=\"modal fade\" role=\"dialog\">\r\n");
      out.write("\t\t\t\t\t\t  <div class=\"modal-dialog\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t    <!-- Modal content-->\r\n");
      out.write("\t\t\t\t\t\t    <div class=\"modal-content\">\r\n");
      out.write("\t\t\t\t\t\t      <div class=\"modal-header\">\r\n");
      out.write("\t\t\t\t\t\t        <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\r\n");
      out.write("\t\t\t\t\t\t        <h4 class=\"modal-title\">Modal Header</h4>\r\n");
      out.write("\t\t\t\t\t\t      </div>\r\n");
      out.write("\t\t\t\t\t\t      <div class=\"modal-body\">\r\n");
      out.write("\t\t\t\t\t\t        <p>Some text in the modal.</p>\r\n");
      out.write("\t\t\t\t\t\t      </div>\r\n");
      out.write("\t\t\t\t\t\t      <div class=\"modal-footer\">\r\n");
      out.write("\t\t\t\t\t\t        <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\r\n");
      out.write("\t\t\t\t\t\t      </div>\r\n");
      out.write("\t\t\t\t\t\t    </div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t      </div>\r\n");
      out.write("\t    </div>\r\n");
      out.write("\t    <div class=\"col-xs-12 col-sm-6 col-md-3\">\r\n");
      out.write("\t      <div class=\"thumbnail\">\r\n");
      out.write("\t        <a href=\"#myModal\" data-toggle=\"modal\" target=\"_blank\">\r\n");
      out.write("\t          <img src=\"img/ensalada.jpg\" alt=\"Cinque Terre\" style=\"width:100%\">\r\n");
      out.write("\t        </a>\r\n");
      out.write("\t      \t<div class=\"caption\">\r\n");
      out.write("\t      \t\t<h3>Ensaladas</h3>\r\n");
      out.write("\t      \t<div id=\"myModal\" class=\"modal fade\" role=\"dialog\">\r\n");
      out.write("\t\t\t\t\t\t  <div class=\"modal-dialog\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t    <!-- Modal content-->\r\n");
      out.write("\t\t\t\t\t\t    <div class=\"modal-content\">\r\n");
      out.write("\t\t\t\t\t\t      <div class=\"modal-header\">\r\n");
      out.write("\t\t\t\t\t\t        <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\r\n");
      out.write("\t\t\t\t\t\t        <h4 class=\"modal-title\">Modal Header</h4>\r\n");
      out.write("\t\t\t\t\t\t      </div>\r\n");
      out.write("\t\t\t\t\t\t      <div class=\"modal-body\">\r\n");
      out.write("\t\t\t\t\t\t        <p>Some text in the modal.</p>\r\n");
      out.write("\t\t\t\t\t\t      </div>\r\n");
      out.write("\t\t\t\t\t\t      <div class=\"modal-footer\">\r\n");
      out.write("\t\t\t\t\t\t        <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\r\n");
      out.write("\t\t\t\t\t\t      </div>\r\n");
      out.write("\t\t\t\t\t\t    </div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t      </div>\r\n");
      out.write("\t    </div>\r\n");
      out.write("\t    <div class=\"col-xs-12 col-sm-6 col-md-3\">\r\n");
      out.write("\t      <div class=\"thumbnail\">\r\n");
      out.write("\t        <a href=\"#myModal\" data-toggle=\"modal\" target=\"_blank\">\r\n");
      out.write("\t          <img src=\"img/jugo.jpg\" alt=\"Cinque Terre\" style=\"width:100%\">\r\n");
      out.write("\t        </a>\r\n");
      out.write("\t      \t<div class=\"caption\">\r\n");
      out.write("\t      \t\t<h3>Jugos</h3>\r\n");
      out.write("\t        \t<p>Lorem ipsum donec id elit non mi porta gravida at eget metus.</p>\r\n");
      out.write("\t      \t</div>\r\n");
      out.write("\t      \t<div id=\"myModal\" class=\"modal fade\" role=\"dialog\">\r\n");
      out.write("\t\t\t\t\t\t  <div class=\"modal-dialog\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t    <!-- Modal content-->\r\n");
      out.write("\t\t\t\t\t\t    <div class=\"modal-content\">\r\n");
      out.write("\t\t\t\t\t\t      <div class=\"modal-header\">\r\n");
      out.write("\t\t\t\t\t\t        <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\r\n");
      out.write("\t\t\t\t\t\t        <h4 class=\"modal-title\">Modal Header</h4>\r\n");
      out.write("\t\t\t\t\t\t      </div>\r\n");
      out.write("\t\t\t\t\t\t      <div class=\"modal-body\">\r\n");
      out.write("\t\t\t\t\t\t        <p>Some text in the modal.</p>\r\n");
      out.write("\t\t\t\t\t\t      </div>\r\n");
      out.write("\t\t\t\t\t\t      <div class=\"modal-footer\">\r\n");
      out.write("\t\t\t\t\t\t        <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\r\n");
      out.write("\t\t\t\t\t\t      </div>\r\n");
      out.write("\t\t\t\t\t\t    </div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t      </div>\r\n");
      out.write("\t    </div>\r\n");
      out.write("\t  </div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</section>\r\n");
      out.write("\r\n");
      out.write("<section>\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div class=\"col-xs-12\">\r\n");
      out.write("\t\t\t\t<div class=\"panel panel-default\">\r\n");
      out.write("    \t\t\t\t<div class=\"panel-body\">\r\n");
      out.write("    \t\t\t\t\t<h1 class=\"text-center\" id=\"quienes\">Quienes somos</h1>\r\n");
      out.write("    \t\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Reprehenderit nulla veritatis aliquid dolor, impedit magnam. Accusamus, quisquam ad sapiente! Magni et nostrum ipsum mollitia sint dicta id sapiente repellendus eum.</p>\r\n");
      out.write("    \t\t\t\t</div>\r\n");
      out.write("  \t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div class=\"col-xs-12\">\r\n");
      out.write("\t\t\t\t<div class=\"panel panel-default\">\r\n");
      out.write("    \t\t\t\t<div class=\"panel-body\">\r\n");
      out.write("    \t\t\t\t\t<h1 class=\"text-center\">Contactenos</h1>\r\n");
      out.write("    \t\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Reprehenderit nulla veritatis aliquid dolor, impedit magnam. Accusamus, quisquam ad sapiente! Magni et nostrum ipsum mollitia sint dicta id sapiente repellendus eum.</p>\r\n");
      out.write("    \t\t\t\t</div>\r\n");
      out.write("  \t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</section>\r\n");
      out.write("\r\n");
      out.write("<footer>\r\n");
      out.write("\t<div class=\"container text-center pie\">\r\n");
      out.write("  \t\t<div class=\"row\">\r\n");
      out.write("  \t\t\t<div class=\"col-xs-12\">\r\n");
      out.write("  \t\t\t\t<p>La Jugosa &copy; </p>\r\n");
      out.write("  \t\t\t\t<p>Todos los derechos reservados</p>\r\n");
      out.write("  \t\t\t</div>\r\n");
      out.write("  \t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</footer>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
