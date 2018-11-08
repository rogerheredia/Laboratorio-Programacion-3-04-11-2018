<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main" />
        <g:set var="entityName" value="${message(code: 'paciente.label', default: 'Paciente')}" />
        <title><g:message code="default.show.label" args="[entityName]" /></title>
    </head>
    <body>
      <a href="#show-paciente" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
      <div class="nav" role="navigation">
          <ul>
              <li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
              <li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
              <li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
          </ul>
      </div>
      <div>
        <label> Mis estudios  </label>
         <!--<f:table collection="${pacientelistaEstudio}" />   -->

         <table class="table table-hover">
           <thead>
             <tr>
               <th scope="col">#</th>
               <th scope="col">Fecha</th>
               <th scope="col">Estado</th>
               <th scope="col">Diagnostico</th>
               <th scope="col">Ver</th>
               <th scope="col">sube</th>

             </tr>
           </thead>
           <tbody>

             <g:each in="${pacientelistaEstudio}" var="a">

             <tr>
               <td>${a}</td>
               <td>${pacientelistaEstudio.fecha}</td>
               <td>${pacientelistaEstudio.estado}</td>
               <td>${pacientelistaEstudio.diagnostico}</td>
               <g:hiddenField name="idEstudio" value="${a}" />
               <g:if test="${session.usuario.rol.codigoRol == '1' }" >
                 <g:form enctype="multipart/form-data" action="upload" method="POST">
                 <td><input name="uploadedfile" type="file" /></td>
                 <td><input type="submit" value="Subir archivo" /></td>
               </g:form>


                  </g:if>
               <g:else>
               <!-- abre el directorio del archivo en pdf para ver e imprimir -->
                 <td ><input type="button" value="ver"> </td>
               </g:else>
             </tr>

           </g:each>

           </tbody>
         </table>



      </div>

    </body>
</html>
