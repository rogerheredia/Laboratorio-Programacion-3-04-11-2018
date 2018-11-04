<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main" />
        <g:set var="entityName" value="${message(code: 'estudio.label', default: 'Estudio')}" />
        <title><g:message code="default.create.label" args="[entityName]" /></title>
    </head>
    <body>
        <a href="#create-estudio" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
        <div class="nav" role="navigation">
            <ul>
                <li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
                <li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
            </ul>
        </div>
        <div id="create-estudio" class="content scaffold-create" role="main">
            <h1><g:message code="default.create.label" args="[entityName]" /></h1>
            <g:if test="${flash.message}">
            <div class="message" role="status">${flash.message}</div>
            </g:if>
            <g:hasErrors bean="${this.estudio}">
            <ul class="errors" role="alert">
                <g:eachError bean="${this.estudio}" var="error">
                <li <g:if test="${error in org.springframework.validation.FieldError}">data-field-id="${error.field}"</g:if>><g:message error="${error}"/></li>
                </g:eachError>
            </ul>
            </g:hasErrors>
            <form class="form-horizontal" action="save" method="post">
              <div class="form-group">
                <label class="control-label col-sm-2" for="fecha">Fecha:</label>
                <div class="col-sm-10">
                  <g:datePicker name="fecha" precision="day"/>
                </div>
              </div>
              <div class="form-group">
                <label class="control-label col-sm-2" for="informe">Informe:</label>
                <div class="col-sm-10">
                  <input type="text" class="form-control" id="informe" name="informe" >
                </div>
              </div>


              <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                  <div class="checkbox">
                    <label> Estado:</label>
                    <label><input type="radio" name="estado"> Informado</label>
                    <label><input type="radio" name="estado" checked> Sin Informe</label>
                  </div>
                </div>
              </div>

           <div class="form-group">
             <div class="col-sm-offset-2 col-sm-10">
              <label for="sel1">Diagnostico:</label>
              <select class="form-control" id="sel1">
                <g:each var="diagnosticos" in="${listaDiagnosticos}">
                <option value="${diagnosticos.codigoDiagnostico}">${diagnosticos.nombreDiagnostico}</option>
              </g:each>
              </select>
            </div>
              </div>

              <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                 <label for="sel1">Practicas:</label>
                 <select class="form-control" id="sel1">
                   <g:each var="practicas" in="${listaPracticas}">
                   <option value="${practicas.codigoPractica}">${practicas.nombrePractica}</option>
                 </g:each>
                 </select>
               </div>
                 </div>

              <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                  <g:submitButton name="create" class="save" value="${message(code: 'default.button.create.label', default: 'Create')}" />
                </div>
              </div>
            </form>
        <!--    <g:form resource="${this.estudio}" method="POST">
                <fieldset class="form">
                    <f:all bean="estudio"/>
                </fieldset>
                <fieldset class="buttons">
                    <g:submitButton name="create" class="save" value="${message(code: 'default.button.create.label', default: 'Create')}" />
                </fieldset>
            </g:form>
          -->
        </div>
    </body>
</html>
