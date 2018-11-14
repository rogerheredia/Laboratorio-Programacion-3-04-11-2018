package portalweb

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*
import grails.plugin.springsecurity.annotation.Secured
@Secured('ROLE_ADMIN')

class DiagnosticoController {

    DiagnosticoService diagnosticoService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond diagnosticoService.list(params), model:[diagnosticoCount: diagnosticoService.count()]
    }

    def show(Long id) {
        respond diagnosticoService.get(id)
    }

    def create() {
        respond new Diagnostico(params)
    }

    def save(Diagnostico diagnostico) {
        if (diagnostico == null) {
            notFound()
            return
        }

        try {
            diagnosticoService.save(diagnostico)
        } catch (ValidationException e) {
            respond diagnostico.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'diagnostico.label', default: 'Diagnostico'), diagnostico.id])
                redirect diagnostico
            }
            '*' { respond diagnostico, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond diagnosticoService.get(id)
    }

    def update(Diagnostico diagnostico) {
        if (diagnostico == null) {
            notFound()
            return
        }

        try {
            diagnosticoService.save(diagnostico)
        } catch (ValidationException e) {
            respond diagnostico.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'diagnostico.label', default: 'Diagnostico'), diagnostico.id])
                redirect diagnostico
            }
            '*'{ respond diagnostico, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        diagnosticoService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'diagnostico.label', default: 'Diagnostico'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'diagnostico.label', default: 'Diagnostico'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
