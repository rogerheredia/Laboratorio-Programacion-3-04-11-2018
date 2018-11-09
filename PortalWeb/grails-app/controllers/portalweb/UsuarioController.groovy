package portalweb

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*
import portalweb.Paciente


class UsuarioController {

    UsuarioService usuarioService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {

         if (session.usuario) {

          if (session.usuario.rol.codigoRol == '3'  ){


        params.max = Math.min(max ?: 10, 100)
        respond usuarioService.list(params), model:[usuarioCount: usuarioService.count()]

         }

         else {

            render(view: "../index")

         }


        }

        else render (view: "../contacto/contacto")





    }

    def show(Long id) {
          if (session.usuario) {

          if (session.usuario.rol.codigoRol == '3'  ){


      respond usuarioService.get(id)

         }

         else {

            render(view: "../index")

         }


        }

        else render (view: "../contacto/contacto")

    }

    def create() {
                if (session.usuario) {

          if (session.usuario.rol.codigoRol == '3'  ){


         respond new Usuario(params)

         }

         else {

            render(view: "../index")

         }


        }

        else render (view: "../contacto/contacto")

    }


    def save(Usuario usuario) {
                if (session.usuario) {

          if (session.usuario.rol.codigoRol == '3' || session.usuario.rol.codigoRol == '2'  ){


         if (usuario == null) {

            notFound()
            return
        }

        try {
            Paciente pac =  Paciente.findByDniLike(params.dni)
            println(pac.dni)
            usuarioService.save(usuario)
            pac.usuario = usuario
            pac.save(flush:true)
        } catch (ValidationException e) {
            respond usuario.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'usuario.label', default: 'Usuario'), usuario.id])
                redirect usuario
            }
            '*' { respond usuario, [status: CREATED] }
        }

         }

         else {

            render(view: "../index")

         }


        }

        else render (view: "../contacto/contacto")

    }

    def edit(Long id) {
                     if (session.usuario) {

          if (session.usuario.rol.codigoRol == '3' || session.usuario.rol.codigoRol == '2'  ){
             respond usuarioService.get(id)

         }

         else {

            render(view: "../index")

         }


        }

        else render (view: "../contacto/contacto")

    }

    def update(Usuario usuario) {
        if (session.usuario) {

          if (session.usuario.rol.codigoRol == '3' || session.usuario.rol.codigoRol == '2'  ){
 if (usuario == null) {
            notFound()
            return
        }

        try {
            usuarioService.save(usuario)
        } catch (ValidationException e) {
            respond usuario.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'usuario.label', default: 'Usuario'), usuario.id])
                redirect usuario
            }
            '*'{ respond usuario, [status: OK] }
        }

         }

         else {

            render(view: "../index")

         }


        }

        else render (view: "../contacto/contacto")

    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        usuarioService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'usuario.label', default: 'Usuario'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'usuario.label', default: 'Usuario'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
