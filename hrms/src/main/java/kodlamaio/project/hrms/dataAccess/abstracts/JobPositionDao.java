package kodlamaio.project.hrms.dataAccess.abstracts;

import kodlamaio.project.hrms.entities.concretes.JobPosition;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobPositionDao extends JpaRepository<JobPosition,Integer> {
}
