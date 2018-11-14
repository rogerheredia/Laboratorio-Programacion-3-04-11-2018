package portalweb

class Diagnostico {


	String nombreDiagnostico
	String detalleDiagnostico
	String codigoDiagnostico

	static belongTo = [estudio:Estudio]


    static constraints = {
    }
		String toString(){
			 return nombreDiagnostico
		}

}
