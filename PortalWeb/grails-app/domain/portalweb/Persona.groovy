package portalweb

class Persona {

	String nombre
	String apellido
	String dni
	Date fechaNacimiento
	String direccion
	String telefono
	String email
	String nombreUsuario
	String claveUsuario
	
	Rol rol





    static constraints = {

    	nombre nullable:false, maxSize:40, blank:false
    	apellido nullable:false, maxSize:40, blank:false
    	dni nullable:false, maxSize:8,blank:false
    	email email:true, unique:true,blank:false

    }
}
