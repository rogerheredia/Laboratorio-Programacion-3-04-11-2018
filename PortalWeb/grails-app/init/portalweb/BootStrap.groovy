package portalweb

class BootStrap {

    def init = { servletContext ->

    def rol1= new Rol(nombreRol: 'Administrador', codigoRol: '1')
          if(!rol1.save(flush: true)) {
            rol1.errors.each{
              println it
            }
          }

          def rol2= new Rol(nombreRol: 'Usuario', codigoRol: '2')
                if(!rol2.save(flush: true)) {
                  rol2.errors.each{
                    println it
                  }
                }


    }
    def destroy = {
    }
}
