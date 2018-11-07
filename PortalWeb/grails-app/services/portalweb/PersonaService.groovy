package portalweb

import grails.gorm.services.Service
import portalweb.Paciente
import portalweb.Usuario

@Service(Persona)
interface PersonaService {

    Persona get(Serializable id)

    List<Persona> list(Map args)

    Long count()

    void delete(Serializable id)

    Persona save(Persona persona)




}