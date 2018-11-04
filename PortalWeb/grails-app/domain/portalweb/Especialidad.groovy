package portalweb

class Especialidad {


	String nombreEspecialidad
	int matriculaEspecialidad
	


	static hasMany = [solicitante:Solicitante]


    static constraints = {
    }
}
