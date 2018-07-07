package vs.vasouvherokudemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import vs.vasouvherokudemo.entities.User;

/**
 * UserRepository
 */
public interface UserRepository extends JpaRepository<User, Long> {

}