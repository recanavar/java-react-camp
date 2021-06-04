package kodlamaio.project.hrms.dataAccess.abstracts;

import kodlamaio.project.hrms.entities.concretes.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Integer> {
}
