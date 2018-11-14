package portalweb


interface IPacienteService {

    Paciente get(Serializable id)

    List<Paciente> list(Map args)

    Long count()

    void delete(Serializable id)

    Paciente save(Paciente paciente)


}
