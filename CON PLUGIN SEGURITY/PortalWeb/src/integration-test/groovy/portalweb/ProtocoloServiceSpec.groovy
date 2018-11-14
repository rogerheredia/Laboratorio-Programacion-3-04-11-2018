package portalweb

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class ProtocoloServiceSpec extends Specification {

    ProtocoloService protocoloService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Protocolo(...).save(flush: true, failOnError: true)
        //new Protocolo(...).save(flush: true, failOnError: true)
        //Protocolo protocolo = new Protocolo(...).save(flush: true, failOnError: true)
        //new Protocolo(...).save(flush: true, failOnError: true)
        //new Protocolo(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //protocolo.id
    }

    void "test get"() {
        setupData()

        expect:
        protocoloService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Protocolo> protocoloList = protocoloService.list(max: 2, offset: 2)

        then:
        protocoloList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        protocoloService.count() == 5
    }

    void "test delete"() {
        Long protocoloId = setupData()

        expect:
        protocoloService.count() == 5

        when:
        protocoloService.delete(protocoloId)
        sessionFactory.currentSession.flush()

        then:
        protocoloService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Protocolo protocolo = new Protocolo()
        protocoloService.save(protocolo)

        then:
        protocolo.id != null
    }
}
