package sn.iam.salle.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sn.iam.salle.entities.Utilisateur;
import sn.iam.salle.repositories.UserRepository;

@RestController
@RequestMapping("/api")
public class UserRest {
	@Autowired
	private UserRepository utilisateurRepository;
	@GetMapping("/allusers")
 public List<Utilisateur> findAll(){
	 
	 return utilisateurRepository.findAll();
 }
	@PostMapping("/ ")
	public void addUser(@RequestBody Utilisateur u){
		utilisateurRepository.save(u);
	}
}

