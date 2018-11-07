package portalweb

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*
import grails.plugin.springsecurity.annotation.Secured
@Secured('ROLE_ADMIN')

class ObraSocialController {

    ObraSocialService obraSocialService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond obraSocialService.list(params), model:[obraSocialCount: obraSocialService.count()]
    }

    def show(Long id) {
        respond obraSocialService.get(id)
    }

    def create() {
        respond new ObraSocial(params)
    }

    def save(ObraSocial obraSocial) {
        if (obraSocial == null) {
            notFound()
            return
        }

        try {
            obraSocialService.save(obraSocial)
        } catch (ValidationException e) {
            respond obraSocial.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'obraSocial.label', default: 'ObraSocial'), obraSocial.id])
                redirect obraSocial
            }
            '*' { respond obraSocial, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond obraSocialService.get(id)
    }

    def update(ObraSocial obraSocial) {
        if (obraSocial == null) {
            notFound()
            return
        }

        try {
            obraSocialService.save(obraSocial)
        } catch (ValidationException e) {
            respond obraSocial.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'obraSocial.label', default: 'ObraSocial'), obraSocial.id])
                redirect obraSocial
            }
            '*'{ respond obraSocial, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        obraSocialService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'obraSocial.label', default: 'ObraSocial'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'obraSocial.label', default: 'ObraSocial'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
