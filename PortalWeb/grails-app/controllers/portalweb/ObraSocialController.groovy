package portalweb

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class ObraSocialController {


    ObraSocialService obraSocialService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]




    def index(Integer max) {


       if (session.usuario) {

       params.max = Math.min(max ?: 10, 100)
        respond obraSocialService.list(params), model:[obraSocialCount: obraSocialService.count()]

          
        }

        else render (view: "../contacto/contacto")

      
    }

    def show(Long id) {
           if (session.usuario) {

       respond obraSocialService.get(id)

          
        }

        else render (view: "../contacto/contacto")

      
    }

    def create() {
            if (session.usuario) {

         respond new ObraSocial(params)

          
        }

        else render (view: "../contacto/contacto")
      
    }

    def save(ObraSocial obraSocial) {
             if (session.usuario) {

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

        else render (view: "../contacto/contacto")
       
    }

    def edit(Long id) {

                     if (session.usuario) {
                         respond obraSocialService.get(id)
          
        }

        else render (view: "../contacto/contacto")

       
    }

    def update(ObraSocial obraSocial) {

          if (session.usuario) {
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

        else render (view: "../contacto/contacto")

      
    }

    def delete(Long id) {
             if (session.usuario) {
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

        else render (view: "../contacto/contacto")
        
    }


    protected void notFound() {

           if (session.usuario) {
          request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'obraSocial.label', default: 'ObraSocial'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
          
        

        else render (view: "../contacto/contacto")
    }
      
}
