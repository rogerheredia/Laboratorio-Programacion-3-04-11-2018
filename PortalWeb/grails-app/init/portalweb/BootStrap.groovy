package portalweb

class BootStrap {

    def init = { servletContext ->

    def rol1= new Rol(nombreRol: 'Administrativo', codigoRol: '1')
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

                def rol3= new Rol(nombreRol: 'Administrador', codigoRol: '3')
                      if(!rol3.save(flush: true)) {
                        rol3.errors.each{
                          println it
                        }
                      }



                def u1 = new Usuario(email:'kematiasrolon@gmail.com',clave:'123', rol:rol3)
                if(!u1.save(flush: true)) {
                  u1.errors.each{

                  }
                }

                def u2 = new Usuario(email:'rogerheredia@gmail.com',clave:'123', rol:rol2)
                if(!u2.save(flush: true)) {
                  u2.errors.each{

                  }
                }

                def u3 = new Usuario(email:'administrativo@gmail.com',clave:'123', rol:rol1)
                if(!u3.save(flush: true)) {
                  u3.errors.each{

                  }
                }
                  def u4 = new Usuario(email:'us4@gmail.com',clave:'123', rol:rol2)
                if(!u4.save(flush: true)) {
                  u4.errors.each{

                  }
                }
                  def u5 = new Usuario(email:'us5@gmail.com',clave:'123', rol:rol2)
                if(!u5.save(flush: true)) {
                  u5.errors.each{

                  }
                }


         def p1= new Paciente (nombre: 'Exequiel', apellido: 'Rolon', dni:'123', direccion:'micasa', telefono:'3834545199',
           email:'kematiasrolon@gmail.com',usuario:u3)
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

          def p3= new Paciente (nombre: 'Administrativo', apellido: 'LABORATORIO', dni:'12344', direccion:'micasa', telefono:'3834545199',
          email:'administrativo@gmail.com',usuario:u1)
          if(!p3.save(flush: true)) {
           p3.errors.each{
             println it
           }
         }
         def p4= new Paciente (nombre: 'Roberto', apellido: 'Roldan', dni:'12341234', direccion:'micasasda', telefono:'3834545199',
          email:'us4@gmail.com',usuario:u4)
          if(!p4.save(flush: true)) {
           p4.errors.each{
             println it
           }
         }
         def p5= new Paciente (nombre: 'Agustin', apellido: 'Paez', dni:'12344', direccion:'micasa', telefono:'3834545199',
          email:'us5@gmail.com',usuario:u5)
          if(!p5.save(flush: true)) {
           p5.errors.each{
             println it
           }
         }
         def p6= new Paciente (nombre: 'Matias', apellido: 'Lampalagua', dni:'12344', direccion:'micasa', telefono:'3834545199',
          email:'lampa@gmail.com',usuario:u4)
          if(!p6.save(flush: true)) {
           p6.errors.each{
             println it
           }
         }


          def e1 = new Estudio(estado:'activo', informe:'todo ok', paciente:p2,dni:'1234')
          if(!e1.save(flush: true)) {
           e1.errors.each{
             println it
           }
         }


         



    }
    def destroy = {
    }
}
