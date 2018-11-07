package portalweb
import grails.plugin.springsecurity.annotation.Secured

@Secured('ROLE_USER')

class ContactoController {


 
def username= session['SPRING_SECURITY_LAST_USERNAME']


    def contacto() {

    }


    def showContacto(){


    	render(view:"contacto")

    }


    def showNuestrosLaboratorios(){


    	render(view:"../nuestroslaboratorios/nuestroslaboratorios")
    }


    def showRegistro(){

    	render(view:"../registro/registro")


    }

    def showIndex(){

        render(view: "../index")

    }



    def login() {
     if (request.get) {
       return render(view: 'login')
     }


      def u = Usuario.findByEmail(params.email.trim())

       if (u) {
         if (u.clave == (params.pass)) {
            session.usuario = u

        println(session.usuario.rol.codigoRol)

            
            render(view: "../index")
          } else {
            render(view: "../index", model: [message: "Constraseña Incorrecta"])
          }
        } else {
          render(view: "../index", model: [message: "No existe el usuario ingresado"])
        }
      }

      def logout() {
        session.usuario=null
        render(view: "../index")
      }

}
