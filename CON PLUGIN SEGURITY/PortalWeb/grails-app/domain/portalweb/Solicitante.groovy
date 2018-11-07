package portalweb

class Solicitante extends Persona {
    String matricula


    static hasMany = [estudio:Estudio]
    static constraints = {
    }
}
