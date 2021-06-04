package kodlamaio.project.hrms.dataAccess.abstracts;

import kodlamaio.project.hrms.entities.concretes.VerificationToken;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VerificationTokenDao extends JpaRepository<VerificationToken,Integer> {
}
