package portalweb

import grails.gorm.DetachedCriteria
import groovy.transform.ToString

import org.codehaus.groovy.util.HashCodeHelper
import grails.compiler.GrailsCompileStatic

@GrailsCompileStatic
@ToString(cache=true, includeNames=true, includePackage=false)
class Usuario1Rol1 implements Serializable {

	private static final long serialVersionUID = 1

	Usuario1 usuario1
	Rol1 rol1

	@Override
	boolean equals(other) {
		if (other instanceof Usuario1Rol1) {
			other.usuario1Id == usuario1?.id && other.rol1Id == rol1?.id
		}
	}

    @Override
	int hashCode() {
	    int hashCode = HashCodeHelper.initHash()
        if (usuario1) {
            hashCode = HashCodeHelper.updateHash(hashCode, usuario1.id)
		}
		if (rol1) {
		    hashCode = HashCodeHelper.updateHash(hashCode, rol1.id)
		}
		hashCode
	}

	static Usuario1Rol1 get(long usuario1Id, long rol1Id) {
		criteriaFor(usuario1Id, rol1Id).get()
	}

	static boolean exists(long usuario1Id, long rol1Id) {
		criteriaFor(usuario1Id, rol1Id).count()
	}

	private static DetachedCriteria criteriaFor(long usuario1Id, long rol1Id) {
		Usuario1Rol1.where {
			usuario1 == Usuario1.load(usuario1Id) &&
			rol1 == Rol1.load(rol1Id)
		}
	}

	static Usuario1Rol1 create(Usuario1 usuario1, Rol1 rol1, boolean flush = false) {
		def instance = new Usuario1Rol1(usuario1: usuario1, rol1: rol1)
		instance.save(flush: flush)
		instance
	}

	static boolean remove(Usuario1 u, Rol1 r) {
		if (u != null && r != null) {
			Usuario1Rol1.where { usuario1 == u && rol1 == r }.deleteAll()
		}
	}

	static int removeAll(Usuario1 u) {
		u == null ? 0 : Usuario1Rol1.where { usuario1 == u }.deleteAll() as int
	}

	static int removeAll(Rol1 r) {
		r == null ? 0 : Usuario1Rol1.where { rol1 == r }.deleteAll() as int
	}

	static constraints = {
	    usuario1 nullable: false
		rol1 nullable: false, validator: { Rol1 r, Usuario1Rol1 ur ->
			if (ur.usuario1?.id) {
				if (Usuario1Rol1.exists(ur.usuario1.id, r.id)) {
				    return ['userRole.exists']
				}
			}
		}
	}

	static mapping = {
		id composite: ['usuario1', 'rol1']
		version false
	}
}
