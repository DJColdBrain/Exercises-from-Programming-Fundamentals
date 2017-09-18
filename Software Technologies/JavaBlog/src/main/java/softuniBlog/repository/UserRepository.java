package softuniBlog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import softuniBlog.entity.User;

/**
 * Created by DJColdBrain on 04-Aug-17.
 */
public interface UserRepository extends JpaRepository<User, Integer> {
     User findByEmail(String email);
}
