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
        <div id="show-paciente" class="content scaffold-show" role="main">
            <h1><g:message code="default.show.label" args="[entityName]" /></h1>
            <g:if test="${flash.message}">
            <div class="message" role="status">${flash.message}</div>
            </g:if>
            <f:display bean="paciente" except="usuario"/>
            <g:form resource="${this.paciente}" method="DELETE">
                <fieldset class="buttons">
                    <g:hiddenField name="dni" value="${this.paciente.dni}" />
                    <g:link class="edit" action="edit" resource="${this.paciente}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
                    <g:link class="edit" action="agregarOB"  resource="${this.paciente}">Generar usuario</g:link>
                    <g:link class="edit" controller='Estudio' action="create"  >Agregar Nuevo Estudio</g:link>
                    <g:link class="edit" controller='paciente' action="listarEstudioPaciente" params="[dni2:1234]"  >Ver Estudios</g:link>
                    <input class="delete" type="submit" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
                </fieldset>
            </g:form>
        </div>
    </body>
</html>