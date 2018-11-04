package portalweb

import grails.gorm.services.Service

@Service(Solicitante)
interface SolicitanteService {

    Solicitante get(Serializable id)

    List<Solicitante> list(Map args)

    Long count()

    void delete(Serializable id)

    Solicitante save(Solicitante solicitante)

}