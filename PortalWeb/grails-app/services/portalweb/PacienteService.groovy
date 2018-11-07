package portalweb

import grails.gorm.services.Service
import portalweb.Estudio

@Service(Paciente)
abstract class PacienteService implements IPacienteService
{

List<Estudio> listaEstudios(Paciente paciente){
	return Estudio.findAllByPaciente(paciente)
}


Paciente quienSoy(String dni){
	
	return Paciente.findByDni(dni)


}
}