package portalweb

import grails.gorm.services.Service

@Service(Informe)
interface InformeService {

    Informe get(Serializable id)

    List<Informe> list(Map args)

    Long count()

    void delete(Serializable id)

    Informe save(Informe informe)

}