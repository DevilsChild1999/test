package Smoelenboek.smoelenboek.rest;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import Smoelenboek.smoelenboek.domein.Collega;
import Smoelenboek.smoelenboek.percistence.CollegaService;

@RestController
public class CollegaEndpoint {
	@Autowired
	CollegaService cs;
	//vind alles
	@GetMapping ("decollegas")
	public Iterable<Collega> alleCollegas() {
		return cs.geefAlleCollegas();
	}
	//voeg toe
	@PostMapping("voegcollegatoe")
	public void voegCollegaToe(@RequestBody Collega collega) {
		cs.slaCollegaOp(collega);
	}
	// delete
	@DeleteMapping("verwijdercollega/{collegaid}")
		public void verwijderCollega(@PathVariable("collegaid")int collegaid) {
			cs.verwijderCollega(collegaid);
	}
	
	//vind bij id
	@RequestMapping("vindcollegabijid/{collegaid}")
	public Optional <Collega> find(@PathVariable long collegaid){
		return cs.vindBijID(collegaid);
	}
	
	// update
	// @PutMapping 
	@RequestMapping(method=RequestMethod.PUT, value= "updatecollega/{collegaid}")
		public void updatecollega(@PathVariable int collegaid, @RequestBody Collega newCollega) {
		Optional<Collega>optional=cs.vindBijID(collegaid);
		Collega dbcollega = optional.get();
		dbcollega.setVoornaam(newCollega.getVoornaam());
		cs.save(dbcollega);
		
	}
}