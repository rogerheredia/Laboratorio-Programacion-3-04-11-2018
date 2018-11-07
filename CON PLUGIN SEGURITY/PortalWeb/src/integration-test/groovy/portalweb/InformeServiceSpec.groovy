package portalweb

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class InformeServiceSpec extends Specification {

    InformeService informeService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Informe(...).save(flush: true, failOnError: true)
        //new Informe(...).save(flush: true, failOnError: true)
        //Informe informe = new Informe(...).save(flush: true, failOnError: true)
        //new Informe(...).save(flush: true, failOnError: true)
        //new Informe(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //informe.id
    }

    void "test get"() {
        setupData()

        expect:
        informeService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Informe> informeList = informeService.list(max: 2, offset: 2)

        then:
        informeList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        informeService.count() == 5
    }

    void "test delete"() {
        Long informeId = setupData()

        expect:
        informeService.count() == 5

        when:
        informeService.delete(informeId)
        sessionFactory.currentSession.flush()

        then:
        informeService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Informe informe = new Informe()
        informeService.save(informe)

        then:
        informe.id != null
    }
}
