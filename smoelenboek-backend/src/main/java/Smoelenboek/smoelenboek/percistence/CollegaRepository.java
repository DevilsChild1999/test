package Smoelenboek.smoelenboek.percistence;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import Smoelenboek.smoelenboek.domein.Collega;

@Component
public interface CollegaRepository extends CrudRepository <Collega, Long>{
	List<Collega> findByTeamnaam(String teamnaam);
}
