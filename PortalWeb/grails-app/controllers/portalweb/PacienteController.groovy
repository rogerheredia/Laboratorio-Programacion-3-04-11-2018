package portalweb

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class PacienteController {

    PacienteService pacienteService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]



    def index(Integer max) {

        if (session.usuario) {

          if (session.usuario.rol.codigoRol == '1'  ){

                 params.max = Math.min(max ?: 10, 100)
        respond pacienteService.list(params), model:[pacienteCount: pacienteService.count()]

         }

         else {

            render(view: "../index")

         }

<<<<<<< HEAD
=======
          
        }

        else render (view: "../contacto/contacto")
 


>>>>>>> 90a706195439a067f7886bc72002fec6ddce4d62
    }

    def show(Long id) {
       


          if (session.usuario) {

          if (session.usuario.rol.codigoRol == '1'  ){

                respond pacienteService.get(id)

         }

         else {

            render(view: "../index")

         }

<<<<<<< HEAD
=======
          
        }

        else render (view: "../contacto/contacto")




>>>>>>> 90a706195439a067f7886bc72002fec6ddce4d62
    }

    def create() {

         if (session.usuario) {

          if (session.usuario.rol.codigoRol == '1' ){

               respond new Paciente(params)

         }

         else {

            render(view: "../index")

         }

          
        }

        else render (view: "../contacto/contacto")




            

    }

    def save(Paciente paciente) {
         if (session.usuario) {

          if (session.usuario.rol.codigoRol == '1'  ){


                
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

        else render (view: "../contacto/contacto")




            


    }

    def edit(Long id) {
        if (session.usuario) {

          if (session.usuario.rol.codigoRol == '1' ){

               respond pacienteService.get(id)

         }

         else {

            render(view: "../index")

         }

          
        }

        else render (view: "../contacto/contacto")

      
    }

    def agregarOB(Long id){
      if (session.usuario) {

          if (session.usuario.rol.codigoRol == '1' ){

                     def listaRol = Rol.list()
        respond pacienteService.get(id), model:[listaRol:listaRol,usuario:new Usuario(params)]

         }

         else {

            render(view: "../index")

         }

          
        }

        else render (view: "../contacto/contacto")
  
    }

    def estudios(){
      if (session.usuario) {

          if (session.usuario.rol.codigoRol == '1' ){

                    respond pacienteService.listaEstudio(params)

         }

         else {

            render(view: "../index")

         }

          
        }

        else render (view: "../contacto/contacto")
    

    }


    def update(Paciente paciente) {
           if (session.usuario) {

          if (session.usuario.rol.codigoRol == '1' ){

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

         else {

            render(view: "../index")

         }

          
        }

        else render (view: "../contacto/contacto")
       
    }

    def delete(Long id) {
               if (session.usuario) {

          if (session.usuario.rol.codigoRol == '1' ){
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

         else {

            render(view: "../index")

         }

          
        }

        else render (view: "../contacto/contacto")
        
    }

    protected void notFound() {
      if (session.usuario) {

          if (session.usuario.rol.codigoRol == '1' ){

               request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'paciente.label', default: 'Paciente'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }

         }

         else {

            render(view: "../index")

         }

          
        }

        else render (view: "../contacto/contacto")
       
    }


    def listaEstudioPaciente (){

            if (session.usuario) {

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

        else render (view: "../contacto/contacto")

           

    }


    def listarEstudioPaciente (){
       if (session.usuario) {

         Paciente pac= Paciente.findByDniLike(params.dni2)
          //  println(pac.dni)
            if (pac!=null) {
                  render (view:'estudios', model:[pacientelistaEstudio:pacienteService.listarEstudios(pac)])
                          }
            else
            {
            render view:'main'
            }
                                           }
                                             else render (view: "../contacto/contacto")
                   }


     def  upload(){

          if (session.usuario) {

        
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
                                             else render (view: "../contacto/contacto")



                  }
        
          
        

      

           
}
