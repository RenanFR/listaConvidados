package listaconvidados.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import listaconvidados.pojo.Convidado;
import listaconvidados.service.ConvidadosService;
import renan.academico.enviadoremail.service.EnviadorEmailService;
@Controller//Convertendo a classe de configuração em controladora para testar
public class ConvidadosController {
	@Autowired
	private ConvidadosService convidadosService;
	@RequestMapping("/inicio")//Mapeamento simples para demonstração
//	@ResponseBody//Para retornar o corpo puro da mensagem de retorno
	public String olaMundo() {
		return "inicioAplicacao";
	}
	@RequestMapping(value="/meusConvidados", method=RequestMethod.GET)
	public String listagemConvidados(Model model) {
		model.addAttribute("allConvidados", convidadosService.obterListaConvidados());
		return "paginaConvidados";
	}
	@RequestMapping(value="/adicionarConvidado", method=RequestMethod.POST)
	public String inserirConvidado(@RequestParam("convidadoid")Integer convidadoId, 
			@RequestParam("nome")String nome, @RequestParam("email")String email, Model model) {
		Convidado convidado = new Convidado(convidadoId, nome, email);
		convidadosService.adcConvidadoLista(convidado);
		EnviadorEmailService.enviar(convidado.getNomeConvidado(), convidado.getEmailConvidado());
		model.addAttribute("allConvidados", convidadosService.obterListaConvidados());
		return "paginaConvidados";		
	}
}
