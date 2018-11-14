package portalweb

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class ProtocoloController {

    ProtocoloService protocoloService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond protocoloService.list(params), model:[protocoloCount: protocoloService.count()]
    }

    def show(Long id) {
        respond protocoloService.get(id)
    }

    def create() {
        respond new Protocolo(params)
    }

    def save(Protocolo protocolo) {
        if (protocolo == null) {
            notFound()
            return
        }

        try {
            protocoloService.save(protocolo)
        } catch (ValidationException e) {
            respond protocolo.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'protocolo.label', default: 'Protocolo'), protocolo.id])
                redirect protocolo
            }
            '*' { respond protocolo, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond protocoloService.get(id)
    }

    def update(Protocolo protocolo) {
        if (protocolo == null) {
            notFound()
            return
        }

        try {
            protocoloService.save(protocolo)
        } catch (ValidationException e) {
            respond protocolo.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'protocolo.label', default: 'Protocolo'), protocolo.id])
                redirect protocolo
            }
            '*'{ respond protocolo, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        protocoloService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'protocolo.label', default: 'Protocolo'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'protocolo.label', default: 'Protocolo'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
