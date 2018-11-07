package portalweb

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*
import grails.plugin.springsecurity.annotation.Secured
@Secured('ROLE_ADMIN')

class SolicitanteController {

    SolicitanteService solicitanteService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond solicitanteService.list(params), model:[solicitanteCount: solicitanteService.count()]
    }

    def show(Long id) {
        respond solicitanteService.get(id)
    }

    def create() {
        respond new Solicitante(params)
    }

    def save(Solicitante solicitante) {
        if (solicitante == null) {
            notFound()
            return
        }

        try {
            solicitanteService.save(solicitante)
        } catch (ValidationException e) {
            respond solicitante.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'solicitante.label', default: 'Solicitante'), solicitante.id])
                redirect solicitante
            }
            '*' { respond solicitante, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond solicitanteService.get(id)
    }

    def update(Solicitante solicitante) {
        if (solicitante == null) {
            notFound()
            return
        }

        try {
            solicitanteService.save(solicitante)
        } catch (ValidationException e) {
            respond solicitante.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'solicitante.label', default: 'Solicitante'), solicitante.id])
                redirect solicitante
            }
            '*'{ respond solicitante, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        solicitanteService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'solicitante.label', default: 'Solicitante'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'solicitante.label', default: 'Solicitante'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
