package portalweb

class Paciente extends Persona{


   Usuario usuario

	static hasMany=[obraSocial: ObraSocial, estudio:Estudio]


    static constraints = {


    }
}
