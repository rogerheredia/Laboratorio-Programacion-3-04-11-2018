package portalweb

class Paciente extends Persona {


	static hasMany=[obraSocial: ObraSocial, estudio:Estudio]


    static constraints = {

    }
}
