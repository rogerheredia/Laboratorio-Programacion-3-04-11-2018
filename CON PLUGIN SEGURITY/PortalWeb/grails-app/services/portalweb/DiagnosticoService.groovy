package portalweb

import grails.gorm.services.Service

@Service(Diagnostico)
interface DiagnosticoService {

    Diagnostico get(Serializable id)

    List<Diagnostico> list(Map args)

    Long count()

    void delete(Serializable id)

    Diagnostico save(Diagnostico diagnostico)

}