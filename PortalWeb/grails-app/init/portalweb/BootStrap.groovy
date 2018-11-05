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

 
          

          def per= new Persona (nombre: 'Exequiel', apellido: 'Rolon', dni:'39016815', direccion:'micasa', telefono:'3834545199',
           email:'kematiasrolon@gmail.com', nombreUsuario: 'kekorolon', claveUsuario:'123', rol: rol1)   
           if(!per.save(flush: true)) {
            per.errors.each{
              println it
            }
          }  

           def per2= new Persona (nombre: 'ROGER', apellido: 'HEREDIA', dni:'39016816', direccion:'micasa', telefono:'3834545199',
           email:'rogerheredia@gmail.com', nombreUsuario: 'rogerheredia', claveUsuario:'123', rol: rol2)   
           if(!per2.save(flush: true)) {
            per2.errors.each{
              println it
            }
          }  


    }
    def destroy = {
    }
}
