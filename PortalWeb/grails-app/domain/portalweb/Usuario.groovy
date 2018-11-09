package portalweb

class Usuario  {

	String email
	String clave
	Rol rol



    static constraints = {
			rol nullable:true

    }

		String toString(){
			return email


		}

}
