package listaconvidados.repository;

import org.springframework.data.repository.CrudRepository;

import listaconvidados.pojo.Convidado;

public interface ConvidadoRepository extends CrudRepository<Convidado, Integer>{
//Podemos fazer uso do repositório genérico previamente implementado em nossa aplicação, basta informar os tipos genéricos
}
