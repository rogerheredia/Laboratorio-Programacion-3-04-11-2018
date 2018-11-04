package portalweb

class Estudio {
    Date fecha
    String estado
    String informe

    static hasMany = [diagnostico:Diagnostico, practica:Practica]
    static belongTo = [solicitante:Solicitante, paciente:Paciente]

    static constraints = {
    }
}
