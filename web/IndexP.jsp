<%-- 
    Document   : IndexP
    Created on : 27-feb-2017, 17:07:53
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
	<meta charset="UTF-8">
	<title>LA JUGOSA</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="css/bootstrap.min.css">
       <link rel="stylesheet" href="css/estilos2.css">
       <link rel="stylesheet" href="path/to/font-awesome/css/font-awesome.min.css">


  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <script>
      
      $(document).ready(funciton(){
          
         alert("Hoola"); 
          
      });
      
      
      
      
  </script>
</head>
<body>
	<header>
		<div class="container">
			<nav class="navbar navbar-default" role="navigation">
			  <!-- El logotipo y el icono que despliega el menú se agrupan
			       para mostrarlos mejor en los dispositivos móviles -->
			  <div class="navbar-header">
			    <button type="button" class="navbar-toggle" data-toggle="collapse"
			            data-target=".navbar-ex1-collapse">
			      <span class="sr-only">Desplegar navegación</span>
			      <span class="icon-bar"></span>
			      <span class="icon-bar"></span>
			      <span class="icon-bar"></span>
			    </button>
			  <img src="img/logolj.png" width="50px" style="vertical-align: middle; float: left;" alt="">
			    <a class="navbar-brand" href="#">LA JUGOSA</a>
			  </div>
			 
			  <!-- Agrupar los enlaces de navegación, los formularios y cualquier
			       otro elemento que se pueda ocultar al minimizar la barra -->
			  <div class="collapse navbar-collapse navbar-ex1-collapse">
			    <ul class="nav navbar-nav navbar-right">
			      <li><a href="#">Inicio</a></li>
			      <li><a href="#">Productos</a></li>
			      <li><a href="#">Quines somos</a></li>
			      <li><a href="#">Contactenos</a></li>
			      <li><div class="login">
			    
			
			  <!-- Botón de Iniciar sesión -->
			  <a data-toggle="modal" href="#Login"><img src="img/user-verde.png" class="img-circle" width="50" alt="Iniciar sesión"></a>
			
			  <!-- Modal -->
			  <div class="modal fade" id="Login" role="dialog">
			    <div class="modal-dialog">
			    
			      <!-- Cabecera del modal, tiene el logo de la jugosa-->
			      <center>
				      <div class="modal-content">
				        <div class="modal-header">
				          <button type="button" class="close" data-dismiss="modal">&times;</button>
				          <img src="img/logo.png">
				        </div>
				        
				        <!-- Cuerpo  del modal, tiene dos input's, y dos h3 (Usuario y contraseña)-->
                                         <form action="Login">
                                             <h3>Usuario</h3>
                                             <input type="text" placeholder="Ingrese su usuario" class="form-control" name="Usuario">
                                             <h3>Contraseña</h3>
                                             <input type="password" placeholder="Ingrese su contraseña" name="Contra" class="form-control"><br><br>
                                             <input type="submit" value="Acccer " class="btn btn-success">
                                            
                                         </form><br>
				      </div>
			      </center>
			    </div>
			  </div>
			  
			</div>
			
			</li>
			
			    </ul>
			
			
			 
			      
			  </div>
			</nav>
		</div>
	</header>

<section>
	<div class="container">
		<div class="row">
			<div class="col-xs-12">
				<div>
  					<div id="myCarousel" class="carousel slide" data-ride="carousel">
					    <!-- INDICADORES -->
					    <ol class="carousel-indicators">
					      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
					      <li data-target="#myCarousel" data-slide-to="1"></li>
					      <li data-target="#myCarousel" data-slide-to="2"></li>
					    </ol>

					    <!-- AQUI ESTAN TODAS LAS IMAGENES DEL CAROUSEL-->
					    <div class="carousel-inner" role="listbox">
					      <div class="item active">
					       	<img src="img/ensalada.jpg" alt="Chania" class="img-responsive">
					        <div class="carousel-caption">
					         <h3>Ensalada</h3>
					         <p>Las mejores y mas ricas ensaladas de frutas</p>
					       	</div>
					   	  </div>
    
					      <div class="item">
					        <img src="img/frutas.jpg" alt="Flower" class="img-responsive">
					        <div class="carousel-caption">
					          <h3>Frutas</h3>
					          <p>Contamos con las frutas mas frescas</p>
					        </div>
					      </div>

					      <div class="item">
					        <img src="img/split.jpg" alt="Flower" class="img-responsive">
					        <div class="carousel-caption">
					          <h3>Banana Split</h3>
					          <p>Ven comete uno</p>
					        </div>
					      </div>
  
    					</div>

   						 <!-- CONTROLES ANTERIOR Y SIGUIENTE -->
					    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
					      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
					      <span class="sr-only">Previous</span>
					    </a>
					    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
					      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
					      <span class="sr-only">Next</span>
					    </a>
  					</div>
				</div>
			</div>
		</div>
	</div>
</section>

<section>
	<div class="container">
	  <div class="row">
	    <div class="col-xs-12 col-sm-6 col-md-3">
	      <div class="thumbnail">
	        <a href="#myModal" data-toggle="modal" target="_blank">
	          <img src="img/split.jpg" alt="Pulpit Rock" style="width:100%">
	        </a>
          	<div class="caption">
          		<h3>Helados</h3>
           		<p>Lorem ipsum donec id elit non mi porta gravida at eget metus.</p>
          	</div>
          	<div id="myModal" class="modal fade" role="dialog">
						  <div class="modal-dialog">

						    <!-- Modal content-->
						    <div class="modal-content">
						      <div class="modal-header">
						        <button type="button" class="close" data-dismiss="modal">&times;</button>
						        <h4 class="modal-title">Modal Header</h4>
						      </div>
						      <div class="modal-body">
						        <p>Some text in the modal.</p>
						      </div>
						      <div class="modal-footer">
						        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
						      </div>
						    </div>

						  </div>
						</div>
	      </div>
	    </div>
	    <div class="col-xs-12 col-sm-6 col-md-3">
	      <div class="thumbnail">
	        <a href="#myModal" data-toggle="modal" data-toggle="modal" >
	          <img src="img/frutas.jpg" alt="Moustiers Sainte Marie" style="width:100%">
	        </a>
          	<div class="caption">
          		<h3>Frutas</h3>
            	<p>Lorem ipsum donec id elit non mi porta gravida at eget metus.</p>
          	</div>
          				<!-- Modal -->
						<div id="myModal" class="modal fade" role="dialog">
						  <div class="modal-dialog">

						    <!-- Modal content-->
						    <div class="modal-content">
						      <div class="modal-header">
						        <button type="button" class="close" data-dismiss="modal">&times;</button>
						        <h4 class="modal-title">Modal Header</h4>
						      </div>
						      <div class="modal-body">
						        <p>Some text in the modal.</p>
						      </div>
						      <div class="modal-footer">
						        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
						      </div>
						    </div>

						  </div>
						</div>
	      </div>
	    </div>
	    <div class="col-xs-12 col-sm-6 col-md-3">
	      <div class="thumbnail">
	        <a href="#myModal" data-toggle="modal" target="_blank">
	          <img src="img/ensalada.jpg" alt="Cinque Terre" style="width:100%">
	        </a>
	      	<div class="caption">
	      		<h3>Ensaladas</h3>
	      	<div id="myModal" class="modal fade" role="dialog">
						  <div class="modal-dialog">

						    <!-- Modal content-->
						    <div class="modal-content">
						      <div class="modal-header">
						        <button type="button" class="close" data-dismiss="modal">&times;</button>
						        <h4 class="modal-title">Modal Header</h4>
						      </div>
						      <div class="modal-body">
						        <p>Some text in the modal.</p>
						      </div>
						      <div class="modal-footer">
						        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
						      </div>
						    </div>

						  </div>
						</div>
	      </div>
	    </div>
	    <div class="col-xs-12 col-sm-6 col-md-3">
	      <div class="thumbnail">
	        <a href="#myModal" data-toggle="modal" target="_blank">
	          <img src="img/jugo.jpg" alt="Cinque Terre" style="width:100%">
	        </a>
	      	<div class="caption">
	      		<h3>Jugos</h3>
	        	<p>Lorem ipsum donec id elit non mi porta gravida at eget metus.</p>
	      	</div>
	      	<div id="myModal" class="modal fade" role="dialog">
						  <div class="modal-dialog">

						    <!-- Modal content-->
						    <div class="modal-content">
						      <div class="modal-header">
						        <button type="button" class="close" data-dismiss="modal">&times;</button>
						        <h4 class="modal-title">Modal Header</h4>
						      </div>
						      <div class="modal-body">
						        <p>Some text in the modal.</p>
						      </div>
						      <div class="modal-footer">
						        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
						      </div>
						    </div>

						  </div>
						</div>
	      </div>
	    </div>
	  </div>
	</div>
</section>

<section>
	<div class="container">
		<div class="row">
			<div class="col-xs-12">
				<div class="panel panel-default">
    				<div class="panel-body">
    					<h1 class="text-center" id="quienes">Quienes somos</h1>
    					<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Reprehenderit nulla veritatis aliquid dolor, impedit magnam. Accusamus, quisquam ad sapiente! Magni et nostrum ipsum mollitia sint dicta id sapiente repellendus eum.</p>
    				</div>
  				</div>
			</div>
		</div>

		<div class="row">
			<div class="col-xs-12">
				<div class="panel panel-default">
    				<div class="panel-body">
    					<h1 class="text-center">Contactenos</h1>
    					<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Reprehenderit nulla veritatis aliquid dolor, impedit magnam. Accusamus, quisquam ad sapiente! Magni et nostrum ipsum mollitia sint dicta id sapiente repellendus eum.</p>
    				</div>
  				</div>
			</div>
		</div>
	</div>
</section>

<footer>
	<div class="container text-center pie">
  		<div class="row">
  			<div class="col-xs-12">
  				<p>La Jugosa &copy; </p>
  				<p>Todos los derechos reservados</p>
  			</div>
  		</div>
	</div>
</footer>


</body>
</html>
