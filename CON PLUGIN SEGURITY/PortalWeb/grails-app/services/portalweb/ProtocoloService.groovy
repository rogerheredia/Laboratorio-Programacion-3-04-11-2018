package portalweb

import grails.gorm.services.Service

@Service(Protocolo)
interface ProtocoloService {

    Protocolo get(Serializable id)

    List<Protocolo> list(Map args)

    Long count()

    void delete(Serializable id)

    Protocolo save(Protocolo protocolo)

}