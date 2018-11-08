package portalweb

import grails.gorm.services.Service
import portalweb.Estudio


@Service(Paciente)
abstract class PacienteService implements IPacienteService
{

List<Estudio> listarEstudios(Paciente paci){

			return Estudio.findAllByPaciente(paci)

}


Paciente quienSoy(String dni){

	return Paciente.findByDni(dni)


}
}
