package portalweb

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*
import grails.plugin.springsecurity.annotation.Secured
@Secured('ROLE_ADMIN')

class PreparacionController {

    PreparacionService preparacionService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond preparacionService.list(params), model:[preparacionCount: preparacionService.count()]
    }

    def show(Long id) {
        respond preparacionService.get(id)
    }

    def create() {
        respond new Preparacion(params)
    }

    def save(Preparacion preparacion) {
        if (preparacion == null) {
            notFound()
            return
        }

        try {
            preparacionService.save(preparacion)
        } catch (ValidationException e) {
            respond preparacion.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'preparacion.label', default: 'Preparacion'), preparacion.id])
                redirect preparacion
            }
            '*' { respond preparacion, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond preparacionService.get(id)
    }

    def update(Preparacion preparacion) {
        if (preparacion == null) {
            notFound()
            return
        }

        try {
            preparacionService.save(preparacion)
        } catch (ValidationException e) {
            respond preparacion.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'preparacion.label', default: 'Preparacion'), preparacion.id])
                redirect preparacion
            }
            '*'{ respond preparacion, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        preparacionService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'preparacion.label', default: 'Preparacion'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'preparacion.label', default: 'Preparacion'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
