package listaconvidados.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import listaconvidados.repository.ConvidadoRepository;

import listaconvidados.pojo.Convidado;

@Service//Componente injetável do tipo camada de serviço
public class ConvidadosService {
	@Autowired//Injetando nosso repositório (DAO) genérico
	private ConvidadoRepository convidadoRepository;//Boa prática camada de serviço lidar c/ camada de persistência
	
	public Iterable<Convidado> obterListaConvidados() {
		return convidadoRepository.findAll();
	}
	
	public void adcConvidadoLista(Convidado convidado) {
		convidadoRepository.save(convidado);
	}
}
