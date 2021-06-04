package kodlamaio.project.hrms.dataAccess.abstracts;

import kodlamaio.project.hrms.entities.concretes.JobSeeker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobSeekerDao extends JpaRepository<JobSeeker,Integer> {
}
