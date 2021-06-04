package kodlamaio.project.hrms.business.abstracts;

import kodlamaio.project.hrms.entities.concretes.JobPosition;

import java.util.List;

public interface JobPositionService {
    List<JobPosition> getAll();
}
