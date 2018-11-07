package portalweb

class Protocolo {


	String nombreProtocolo
	int codigoProtocolo
	String estadoProtocolo


static belongTo = [practica: Practica]


    static constraints = {
    }
}
