package portalweb

class ContactoController {

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


      def u = Persona.findByEmail(params.email.trim())

       if (u) {
         if (u.claveUsuario == (params.pass)) {
            session.usuario = u

            
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
