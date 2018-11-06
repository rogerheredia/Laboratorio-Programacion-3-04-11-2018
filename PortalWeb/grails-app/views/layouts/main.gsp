<!doctype html>
<html lang="en" class="no-js">
<head>

    <meta name="viewport" content="width=device-width, initial-scale=1">


    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <title>
        <g:layoutTitle default="PortalWeb   "/>
    </title>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    <asset:link rel="icon" href="favicon.ico" type="image/x-ico" />


    <asset:stylesheet src="application.css"/>
<meta name="viewport" content="width=device-width, initial-scale=1">
    <g:layoutHead/>

<style class="cp-pen-styles">@import url("https://fonts.googleapis.com/css?family=Lora:700");
@import url("https://fonts.googleapis.com/css?family=Open+Sans");

:root {
  --z-distance: 8.519vw;
  --from-left: 1;
  --mobile-bkp: 650px;
}

body {
 
  
  font-family: Lora, serif;
  font-size: calc(14px + .3vw);
}

  



</style>


</head>




<body style=" background-image: url(https://www.basepyme.es/wp-content/uploads/2015/10/fachada_I-D-i2.jpg); background-size: 100%;background-repeat: no-repeat;">




    <nav class="navbar navbar-default navbar-inverse" role="navigation" id="menukeko">
            <div class="container-fluid">
                <!-- Brand and toggle get grouped for better mobile display -->
                <div class="navbar-header">
                  <button type="button" class="navbar-toggle collapsed"
                        data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                  </button>
                </div>

          <div class="container-fluid">

            <!-- Marca y alternar se agrupan para una mejor visualización móvil -->

            <div class="navbar-header" style="padding-right: 40px" >

                     <a class="navbar-brand" href="/#" id="logo">PortalWeb </a>
             </div>


                 <g:if test="${!session.usuario}" >


                 <!-- Recoge los enlaces de navegación, formularios y otro contenido para alternar -->
                  <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                     <ul class="navbar-nav row text-center" style="padding-top: 30px">
                                                       <marquee>
                            <li style="color: yellow; font-style: italic; font-size: 20px">Debe Iniciar Sesion para ver las opciones</li>                      
                     </marquee>
                           
                              
                            


                    </ul>
                       
                       
                  


                         


                            

                          <ul class="nav navbar-nav navbar-right" >
                            <li><p class="navbar-text" style="color: black; font-size: 20px">  ${message}</p></li>
                            <li class="dropdown">
                       

                              <a href="#" class="dropdown-toggle" data-toggle="dropdown"><b>Iniciar Sesión</b> <span class="caret"></span></a>
                                <ul id="login-dp" class="dropdown-menu">
                                    <li>
                                         <div class="row">

                                                    Inicia Sesión con tu cuenta
                                                     <g:form class="form" method="post" controller="contacto" action="login" accept-charset="UTF-8" id="login">
                                                            <div class="form-group">
                                                                 <label class="sr-only" for="exampleInputEmail2">Direccion de Correo Electronico</label>
                                                                 <input type="text" class="form-control" id="email" name="email" placeholder="Direccion de Correo" required>
                                                            </div>
                                                            <div class="form-group">
                                                                 <label class="sr-only" for="exampleInputPassword2">Contraseña</label>
                                                                 <input type="text" class="form-control" id="pass" name="pass" placeholder="Contraseña" required>
                                                                 <div class="help-block text-right"><a href="">¿Olvidaste la contraseña?</a></div>
                                                            </div>
                                                            <div class="form-group">
                                                                 <button type="submit" class="btn btn-primary btn-block">Iniciar Sesión</button>
                                                            </div>
                                                            <div class="checkbox">
                                                                 <label>
                                                                 <input type="checkbox"> Mantenme conectado
                                                                 </label>
                                                            </div>
                                                     </g:form>
                                                </div>
                                                <div class="bottom text-center " style="color: red;">
                                                    Nuevo aquí? <g:link controller="contacto" action="showRegistro">Registrate AQUI</g:link></a>
                                                </div>
                                         </div>
                                    </li>
                                </ul>
                            </li>
                          </ul>

                        </g:if>

        

                        <g:else>



                         <!-- Recoge los enlaces de navegación, formularios y otro contenido para alternar -->
                  <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                     <ul class="nav navbar-nav">
                            <li class="active" ><g:link controller="contacto" action="showIndex">Inicio</g:link></li>
                            <li ><a href="#">Quienes Somos</a></li>
                            <li ><g:link controller="contacto" action="showNuestrosLaboratorios">Nuestros Laboratorios</g:link></li>
                            <li ><g:link controller="contacto" action="showContacto">Contactanos</g:link></li>
                            <li ><g:link controller="paciente" action="listaEstudioPaciente">Ver Estudios</g:link></li>

                          <g:if test="${session.usuario.rol.codigoRol == '1' }" >

                            <li ><g:link controller="paciente" action="index">Paciente</g:link></li>
                               <UL>
                                   <label style="color: red">ADMINISTRADOR</label>
                               </UL> 

                           </g:if>

                           <g:else> 
                                 <UL>
                                   <label style="color: red">Usuario Normal</label>
                               </UL> 
                           </g:else>

                    </ul>


                                
                          <div class="collapse navbar-collapse navbar-right" id="bs-example-navbar-collapse-1" style="padding-top: 20px; color:yellow;font-size: 20px">
                              <ul class="nav navbar-nav navbar-right" >
                              Usuario : ${  session.usuario.email}
                              <ul>
                                <g:link controller="contacto" action="logout"> Cerrar Sesion  </g:link>
                              </ul>
                            </ul>
                          </div>

                           </g:else>


                     </div><!-- /.navbar-collapse -->
          </div><!-- /.container-fluid -->
</nav>










    <!-- ESTE ES EL BODY PRINCIPAL QUE ESTA EN INDEX.GSP -->
    <g:layoutBody/>
      <!-- ESTE ES EL BODY PRINCIPAL QUE ESTA EN INDEX.GSP -->




    <br><br><br><br><hr>
    <div class="footer text-center" role="contentinfo" ><MARQUEE> Todos los derechos Reservados @  Contacto +543834545199 San Fernando del Valle de Catamarca </MARQUEE></div>



<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
         <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>
</html>
