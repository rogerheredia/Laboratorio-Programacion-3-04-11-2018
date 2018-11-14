package portalweb

class BootStrap {

    def init = { servletContext ->

   /* def rol1= new Rol(nombreRol: 'Administrador', codigoRol: '1')
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
           email:'kematiasrolon@gmail.com')   
           if(!per.save(flush: true)) {
            per.errors.each{
              println it
            }
          }  

           def per2= new Persona (nombre: 'ROGER', apellido: 'HEREDIA', dni:'39016816', direccion:'micasa', telefono:'3834545199',
           email:'rogerheredia@gmail.com')   
           if(!per2.save(flush: true)) {
            per2.errors.each{
              println it
            }
          }  



          def usuario1 = new Usuario(email:'kematiasrolon@gmail.com',clave:'123', rol:rol1, persona:per)
          if(!usuario1.save(flush: true)) {
            usuario1.errors.each{
              println it
            }
          } 
          def usuario2 = new Usuario(email:'rogerheredia@gmail.com',clave:'123', rol:rol2, persona:per2)
          if(!usuario2.save(flush: true)) {
            usuario2.errors.each{
              println it
            } 
          } 
 */


          def adminRole = new Rol1(authority: 'ROLE_ADMIN').save()       
          def testUser = new Usuario1(username: 'keko', password: 'keko').save()
          Usuario1Rol1.create testUser, adminRole
          Usuario1Rol1.withSession {
            it.flush()
            it.clear()
         }
         assert Usuario1.count() == 1
         assert Rol1.count() == 1
         assert Usuario1Rol1.count() == 1


           def adminRole2 = new Rol1(authority: 'ROLE_USER').save()       
          def testUser2 = new Usuario1(username: 'roger', password: 'roger').save()
          Usuario1Rol1.create testUser2, adminRole2
          Usuario1Rol1.withSession {
            it.flush()
            it.clear()
         }
         assert Usuario1.count() == 2
         assert Rol1.count() == 2
         assert Usuario1Rol1.count() == 2







    }
    def destroy = {
    }
}
