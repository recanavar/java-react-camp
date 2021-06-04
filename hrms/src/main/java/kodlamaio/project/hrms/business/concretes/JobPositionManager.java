package kodlamaio.project.hrms.business.concretes;

import kodlamaio.project.hrms.business.abstracts.JobPositionService;
import kodlamaio.project.hrms.dataAccess.abstracts.JobPositionDao;
import kodlamaio.project.hrms.entities.concretes.JobPosition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobPositionManager implements JobPositionService {
    private JobPositionDao jobPositionDao;

    @Autowired
    public JobPositionManager(JobPositionDao jobPositionDao) {
        this.jobPositionDao = jobPositionDao;
    }

    @Override
    public List<JobPosition> getAll() {
        return this.jobPositionDao.findAll();
    }
}
