package kodlamaio.project.hrms.dataAccess.abstracts;

import kodlamaio.project.hrms.entities.concretes.Recruiter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecruiterDao extends JpaRepository<Recruiter,Integer> {
}
