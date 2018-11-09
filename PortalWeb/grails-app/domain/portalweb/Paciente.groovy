package portalweb

class Paciente extends Persona{


   Usuario usuario
   ObraSocial obraSocial
	static hasMany=[estudio:Estudio]


    static constraints = {


    obraSocial nullable:true  
    usuario    nullable:true


    }
}
