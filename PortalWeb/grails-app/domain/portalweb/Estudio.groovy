package portalweb

class Estudio {
    Date fecha
    String estado
    String informe
    String dni


    static hasMany = [diagnostico:Diagnostico, practica:Practica]
    static belongTo = [solicitante:Solicitante, paciente:Paciente]

    static constraints = {
    fecha nullable:true
    informe nullable:true
    }
}
