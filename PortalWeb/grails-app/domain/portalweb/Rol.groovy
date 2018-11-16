package portalweb
import grails.rest.Resource

@Resource(uri='/roles')
class Rol {
    String codigoRol
    String nombreRol

    static constraints = {
    }

    String toString(){
      return nombreRol
    }
}
