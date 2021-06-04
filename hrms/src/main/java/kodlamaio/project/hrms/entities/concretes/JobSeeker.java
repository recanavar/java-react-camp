package kodlamaio.project.hrms.entities.concretes;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "job_seekers")
@PrimaryKeyJoinColumn(name = "user_id")
public class JobSeeker extends User {
    /*@OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private User user;*/
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "tc_no")
    private String tcNo;
    @Column(name = "birth_year")
    private String birthYear;
}
