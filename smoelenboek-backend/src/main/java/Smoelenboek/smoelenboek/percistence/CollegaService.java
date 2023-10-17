package Smoelenboek.smoelenboek.percistence;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Smoelenboek.smoelenboek.domein.Collega;

@Service
public class CollegaService {
	@Autowired
	CollegaRepository cr;
	// vind alles
	public Iterable<Collega> geefAlleCollegas() {
		return cr.findAll();
	}
	// maak aan
	public void slaCollegaOp(Collega collega) {
		cr.save(collega);
		
	}
	// delete
	public void verwijderCollega(long collegaid) {
		cr.deleteById(collegaid);
		
	}
	//vind bij id
	public Optional<Collega> vindBijID(long collegaid) {
		return cr.findById(collegaid);
	}
	// opslaan
	public void save(Collega dbcollega) {
		cr.save(dbcollega);
		
	}
	
	
}
