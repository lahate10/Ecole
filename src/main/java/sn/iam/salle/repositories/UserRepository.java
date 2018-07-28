package sn.iam.salle.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import sn.iam.salle.entities.Utilisateur;

public interface UserRepository extends JpaRepository<Utilisateur, Integer> {

}
