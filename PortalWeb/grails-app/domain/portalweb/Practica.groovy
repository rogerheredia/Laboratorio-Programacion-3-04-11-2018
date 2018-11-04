package portalweb

class Practica {

	Preparacion preparacion

	String nombrePractica
	String tipoPractica
	int codigoPractica
	String estadoPractica

	static hasMany = [protocolo: Protocolo]
	static belongTo = [estudio:Estudio]





    static constraints = {
    }
}
