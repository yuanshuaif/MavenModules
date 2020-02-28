package repository;

import entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by 10326 on 2020/1/31.
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
