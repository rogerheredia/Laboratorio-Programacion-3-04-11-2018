package portalweb

class ObraSocial {

		String nombreObraSocial
		String direccionObraSocial
		String telefonoObraSocial
		String cuitObraSocial


	//static belongTo=[paciente:Paciente]


    static constraints = {

    	nombreObraSocial nullable:false, maxSize:40, blank:false
    	direccionObraSocial nullable:true, blank:false
    	cuitObraSocial nullable:true, maxSize:8,blank:false
    	telefonoObraSocial nullable:true


    }

		String toString(){
			 return nombreObraSocial
		}
}
