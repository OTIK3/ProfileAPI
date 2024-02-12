package spring.first.app.profileapi.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import spring.first.app.profileapi.entites.ProfileInfo;

@Repository
public interface ProfileRepository extends CrudRepository<ProfileInfo, Integer> {
}
