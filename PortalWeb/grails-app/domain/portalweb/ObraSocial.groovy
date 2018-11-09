package portalweb

class ObraSocial {

		String nombreObraSocial
		String direccionObraSocial
		String telefonoObraSocial
		String cuitObraSocial


	//static belongTo=[paciente:Paciente]


    static constraints = {

    	nombreObraSocial nullable:false, maxSize:40, blank:false
    	direccionObraSocial nullable:false, blank:false
    	cuitObraSocial nullable:false, maxSize:8,blank:false


    }

		String toString(){
			 return nombreObraSocial
		}
}
