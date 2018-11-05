<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Portal Web</title>
</head>


<body >

 <g:if test="${!session.usuario}" >

  
 <div class="svg" role="presentation">
        <div class="grails-logo-container text-center" style="background-color: #3145A8">
            <img src="https://www.comfandi.com.co/sites/default/files/wysiwyg/comfandi_laboratorio_banner.png"  class="grails-logo" width="1500px" height="400px" no-repeat center center fixed />
        </div>
    </div>

</g:if>


<g:else>

  <g:if test="${session.usuario.rol.codigoRol == '1' }" >
    <div class="svg" role="presentation">
        <div class="grails-logo-container text-center" style="background-color: #3145A8">
            <img src="http://www.admin-magazine.com/extension/adminmag/design/admin_fe/images/admin-magazine-og.png"  class="grails-logo" width="1500px" height="400px" no-repeat center center fixed />
        </div>
    </div>
    </g:if>

    <g:else>
  <div class="svg" role="presentation">
        <div class="grails-logo-container text-center" style="background-color: #3145A8">
            <img src="https://i.imgur.com/EXW0cFw.png"  class="grails-logo" width="1500px" height="400px" no-repeat center center fixed />
        </div>
    </div>
    </g:else>

</g:else>



    <div id="content" role="main" style="background-color: #323752; color: #0799F6; border-radius: 80px">
        <section class="row colset-2-its">
            <h1>Bienvenidos a Trabajo Practico N°5<h1>

            <p>
                Congratulations, you have successfully started your first Grails application! At the moment
                this is the default page, feel free to modify it to either redirect to a controller or display
                whatever content you may choose. Below is a list of controllers that are currently deployed in
                this application, click on each to execute its default action:
            </p>

            <div id="controllers" role="navigation">
                <h2>Controladores</h2>
                <ul>
                    <g:each var="c" in="${grailsApplication.controllerClasses.sort { it.fullName } }">
                        <li class="controller">
                            <g:link controller="${c.logicalPropertyName}">${c.fullName}</g:link>
                        </li>
                    </g:each>
                    <li class="controller">
                      <g:link controller="paciente" action="estudios"  >estudios de pacientes</g:link>
                    </li>
                </ul>
            </div>
        </section>
    </div>

</body>
</html>
