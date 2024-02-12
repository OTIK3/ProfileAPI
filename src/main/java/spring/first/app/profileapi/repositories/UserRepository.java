package spring.first.app.profileapi.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import spring.first.app.profileapi.entites.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
}
