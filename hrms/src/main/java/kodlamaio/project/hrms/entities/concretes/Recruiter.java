package kodlamaio.project.hrms.entities.concretes;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "recruiters")
@PrimaryKeyJoinColumn(name = "user_id")
public class Recruiter extends User {
    @Column(name = "company_name")
    private String companyName;
    @Column(name = "website")
    private String website;
    @Column(name = "phone")
    private String phone;
    @Column(name = "is_verified_by_system_user")
    private boolean isVerifiedBySystemUser;

}
