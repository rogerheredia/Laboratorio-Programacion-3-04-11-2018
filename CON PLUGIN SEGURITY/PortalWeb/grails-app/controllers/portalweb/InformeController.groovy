package portalweb

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*
import grails.plugin.springsecurity.annotation.Secured
@Secured('ROLE_ADMIN')

class InformeController {

    InformeService informeService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond informeService.list(params), model:[informeCount: informeService.count()]
    }

    def show(Long id) {
        respond informeService.get(id)
    }

    def create() {
        respond new Informe(params)
    }

    def save(Informe informe) {
        if (informe == null) {
            notFound()
            return
        }

        try {
            informeService.save(informe)
        } catch (ValidationException e) {
            respond informe.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'informe.label', default: 'Informe'), informe.id])
                redirect informe
            }
            '*' { respond informe, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond informeService.get(id)
    }

    def update(Informe informe) {
        if (informe == null) {
            notFound()
            return
        }

        try {
            informeService.save(informe)
        } catch (ValidationException e) {
            respond informe.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'informe.label', default: 'Informe'), informe.id])
                redirect informe
            }
            '*'{ respond informe, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        informeService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'informe.label', default: 'Informe'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'informe.label', default: 'Informe'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
