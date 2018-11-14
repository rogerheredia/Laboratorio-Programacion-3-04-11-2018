package portalweb

 class Persona {

	String nombre
	String apellido
	String dni
	Date fechaNacimiento
	String direccion
	String telefono
	String email


    static constraints = {

    nombre nullable:true, maxSize:40, blank:false
    apellido nullable:true, maxSize:40, blank:false
    dni nullable:false, maxSize:8,blank:false
    email email:true, unique:true,blank:false
    fechaNacimiento nullable:true

    }
}
