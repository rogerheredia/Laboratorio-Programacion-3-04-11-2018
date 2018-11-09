<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main" />
        <g:set var="entityName" value="${message(code: 'paciente.label', default: 'Paciente')}" />
        <title><g:message code="default.edit.label" args="[entityName]" /></title>
    </head>
    <body>
        <a href="#edit-paciente" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
        <div class="nav" role="navigation">
            <ul>
                <li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
                <li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
                <li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
            </ul>
        </div>
        <div id="edit-paciente" class="content scaffold-edit" role="main">
            <!--    <h1><g:message code="default.edit.label" args="[entityName]" /></h1> -->
            <h1> Generar usuario del Paciente  ${this.paciente.nombre}</h1>
            <g:if test="${flash.message}">
            <div class="message" role="status">${flash.message}</div>
            </g:if>
            <g:hasErrors bean="${this.paciente}">
            <ul class="errors" role="alert">
                <g:eachError bean="${this.paciente}" var="error">
                <li <g:if test="${error in org.springframework.validation.FieldError}">data-field-id="${error.field}"</g:if>><g:message error="${error}"/></li>
                </g:eachError>
            </ul>
            </g:hasErrors>
        <!--    <g:form resource="${this.paciente}" method="PUT">
                <g:hiddenField name="version" value="${this.paciente?.version}" />
                <fieldset class="form">
                    <f:display bean="paciente"  except="obraSocial,estudio,email,fechaNacimiento,nombreUsuario,claveUsuario,telefono,direccion,usuario"/>
        -->
                    <g:form url="[action:'save',controller:'usuario']" method="post" resource="${this.paciente}">
                    <br>
                    <Label> nombre Usuario: </label>
                    <input type="email" name="email" >
                    <br>
                    <Label> Clave: </label>
                    <input type="password" name="clave" >
                    <br>
                    <label for="sel1">Rol:</label>
                    <select class="form-control" id="sel1" mane="rol">
                      <g:each var="roles" in="${listaRol}">
                      <option value="${roles.codigoRol}">${roles.nombreRol}</option>
                    </g:each>
                    </select>
                    <br>
                  <!--  <g:link controller="usuario" action="save"> Aceptar</g:link>  -->
                    <input class="save"  type="submit" value="Aceptar" />
                  </g:form>
        <!--        </fieldset>
                <fieldset class="buttons">
                    1 marca
                   <!--<input class="save" type="submit" value="${message(code: 'default.button.update.label', default: 'Update')}" />

                   <input class="save" type="submit" value="Aceptar" />

                  <!-- hacer una tabla con las obras sociales
                </fieldset>
            </g:form>
        -->
        </div>
        <!-- Para hacer una tabla de todas las obras sociales que no tenga el pacinte -->
        <div>
          <label> Bucar obra social </label>


        </div>

    </body>
</html>
