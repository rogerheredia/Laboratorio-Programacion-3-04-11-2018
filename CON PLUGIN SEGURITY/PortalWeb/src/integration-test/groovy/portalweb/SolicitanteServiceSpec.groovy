package portalweb

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class SolicitanteServiceSpec extends Specification {

    SolicitanteService solicitanteService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Solicitante(...).save(flush: true, failOnError: true)
        //new Solicitante(...).save(flush: true, failOnError: true)
        //Solicitante solicitante = new Solicitante(...).save(flush: true, failOnError: true)
        //new Solicitante(...).save(flush: true, failOnError: true)
        //new Solicitante(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //solicitante.id
    }

    void "test get"() {
        setupData()

        expect:
        solicitanteService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Solicitante> solicitanteList = solicitanteService.list(max: 2, offset: 2)

        then:
        solicitanteList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        solicitanteService.count() == 5
    }

    void "test delete"() {
        Long solicitanteId = setupData()

        expect:
        solicitanteService.count() == 5

        when:
        solicitanteService.delete(solicitanteId)
        sessionFactory.currentSession.flush()

        then:
        solicitanteService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Solicitante solicitante = new Solicitante()
        solicitanteService.save(solicitante)

        then:
        solicitante.id != null
    }
}
