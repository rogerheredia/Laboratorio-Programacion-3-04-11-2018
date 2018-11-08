package portalweb

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class PacienteController {

    PacienteService pacienteService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]



    def index(Integer max) {


         if (session.usuario.rol.codigoRol == '1' ){

                 params.max = Math.min(max ?: 10, 100)
        respond pacienteService.list(params), model:[pacienteCount: pacienteService.count()]

         }

         else {

            render(view: "../index")

         }








    }

    def show(Long id) {
         if (session.usuario.rol.codigoRol == '1' ){


        respond pacienteService.get(id)

         }
         else {

            render(view: "../index")

         }




    }

    def create() {
            if (session.usuario.rol.codigoRol == '1' ){


        respond new Paciente(params)

         }
         else {

            render(view: "../index")

         }

    }

    def save(Paciente paciente) {
             if (session.usuario.rol.codigoRol == '1' ){


          if (paciente == null) {
            notFound()
            return
        }

        try {
            pacienteService.save(paciente)
        } catch (ValidationException e) {
            respond paciente.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'paciente.label', default: 'Paciente'), paciente.id])
                redirect paciente
            }
            '*' { respond paciente, [status: CREATED] }
        }

         }
         else {

            render(view: "../index")

         }


    }

    def edit(Long id) {
        respond pacienteService.get(id)
    }

    def agregarOB(Long id){
        respond pacienteService.get(id)
    }

    def estudios(){
        respond pacienteService.listaEstudio(params)

    }


    def update(Paciente paciente) {
        if (paciente == null) {
            notFound()
            return
        }

        try {
            pacienteService.save(paciente)
        } catch (ValidationException e) {
            respond paciente.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'paciente.label', default: 'Paciente'), paciente.id])
                redirect paciente
            }
            '*'{ respond paciente, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        pacienteService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'paciente.label', default: 'Paciente'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'paciente.label', default: 'Paciente'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }


    def listaEstudioPaciente (){
            Paciente  pac = pacienteService.quienSoy(session.usuario)
          //  Paciente pac= Paciente.findByDniLike('1234')
            if (pac!=null) {
                  //def lista = pacienteService.listarEstudios(pac)
                  render (view:'estudios', model:[pacientelistaEstudio:pacienteService.listarEstudios(pac)])
         }
            else
            {

            render view:'main'

            }

    }


    def listarEstudioPaciente (){

            Paciente pac= Paciente.findByDniLike(params.dni2)
            println(pac.dni)
            if (pac!=null) {
                  render (view:'estudios', model:[pacientelistaEstudio:pacienteService.listarEstudios(pac)])
                          }
            else
            {
            render view:'../main'
            }
                                           }
             def  upload(){
                  def archivo= request.getFile(params.uploadedfile)
              // creamos el directorio en la ruta donde esta nuestra aplicacion y agragamos la carpeta
                  //cargaUsuarios ese nombre cambia para lo que ustedes necesiten
                  def webRootDir = servletContext.getRealPath("/")
                  def userDir = new File(webRootDir, "c:/otros2")
                  userDir.mkdirs()
              // se guarda el archivo en esa carpeta
                  archivo.transferTo( new File( userDir, archivo.originalFilename))
                 return userDir.toString()+ File.separator + archivo.originalFilename
                                                      }
}
