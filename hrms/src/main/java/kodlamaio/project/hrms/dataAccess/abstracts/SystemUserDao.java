package kodlamaio.project.hrms.dataAccess.abstracts;

import kodlamaio.project.hrms.entities.concretes.SystemUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SystemUserDao extends JpaRepository<SystemUser,Integer> {
}
