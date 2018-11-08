package portalweb

import grails.gorm.services.Service
import portalweb.Estudio


@Service(Paciente)
abstract class PacienteService implements IPacienteService
{

List<Estudio> listarEstudios(Paciente paci){
    		return Estudio.findAllByDni(paci.dni)

}





Paciente quienSoy(Usuario usuario){

	return Paciente.findByUsuario(usuario)


}
}
