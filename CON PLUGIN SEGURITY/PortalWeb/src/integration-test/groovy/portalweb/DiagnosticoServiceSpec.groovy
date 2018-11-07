package portalweb

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class DiagnosticoServiceSpec extends Specification {

    DiagnosticoService diagnosticoService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Diagnostico(...).save(flush: true, failOnError: true)
        //new Diagnostico(...).save(flush: true, failOnError: true)
        //Diagnostico diagnostico = new Diagnostico(...).save(flush: true, failOnError: true)
        //new Diagnostico(...).save(flush: true, failOnError: true)
        //new Diagnostico(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //diagnostico.id
    }

    void "test get"() {
        setupData()

        expect:
        diagnosticoService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Diagnostico> diagnosticoList = diagnosticoService.list(max: 2, offset: 2)

        then:
        diagnosticoList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        diagnosticoService.count() == 5
    }

    void "test delete"() {
        Long diagnosticoId = setupData()

        expect:
        diagnosticoService.count() == 5

        when:
        diagnosticoService.delete(diagnosticoId)
        sessionFactory.currentSession.flush()

        then:
        diagnosticoService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Diagnostico diagnostico = new Diagnostico()
        diagnosticoService.save(diagnostico)

        then:
        diagnostico.id != null
    }
}
