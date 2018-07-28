package sn.iam.salle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import sn.iam.salle.entities.Utilisateur;
import sn.iam.salle.repositories.UserRepository;

@SpringBootApplication
public class GesSaleV3Application implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	public static void main(String[] args) {
		SpringApplication.run(GesSaleV3Application.class, args);
		
	}
	@Override
	public void run(String... arg0) throws Exception {
		userRepository.save(new Utilisateur(1,"lamine diop", "diop", "passer"));
		userRepository.save(new Utilisateur(2,"modou ndiaye", "ndiaye", "passer"));
	}
}
