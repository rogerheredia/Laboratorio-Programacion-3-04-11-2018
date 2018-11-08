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


                def u1 = new Usuario(email:'kematiasrolon@gmail.com',clave:'123', rol:rol1)
                if(!u1.save(flush: true)) {
                  u1.errors.each{

                  }
                }

                def u2 = new Usuario(email:'rogerheredia@gmail.com',clave:'123', rol:rol2)
                if(!u2.save(flush: true)) {
                  u2.errors.each{

                  }
                }


         def p1= new Paciente (nombre: 'Exequiel', apellido: 'Rolon', dni:'123', direccion:'micasa', telefono:'3834545199',
           email:'kematiasrolon@gmail.com',usuario:u1)
           if(!p1.save(flush: true)) {
            p1.errors.each{
              println it
            }
          }

           def p2= new Paciente (nombre: 'ROGER', apellido: 'HEREDIA', dni:'1234', direccion:'micasa', telefono:'3834545199',
           email:'rogerheredia@gmail.com',usuario:u2)
           if(!p2.save(flush: true)) {
            p2.errors.each{
              println it
            }
          }

          def e1 = new Estudio(estado:'activo', informe:'todo ok', paciente:p2, dni:'1234')
          if(!e1.save(flush: true)) {
           e1.errors.each{
             println it
           }
         }


    }
    def destroy = {
    }
}
