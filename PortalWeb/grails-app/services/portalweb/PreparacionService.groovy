package portalweb

import grails.gorm.services.Service

@Service(Preparacion)
interface PreparacionService {

    Preparacion get(Serializable id)

    List<Preparacion> list(Map args)

    Long count()

    void delete(Serializable id)

    Preparacion save(Preparacion preparacion)

}