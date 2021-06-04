package kodlamaio.project.hrms.entities.concretes;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "job_positions")
public class JobPosition {
    @Id
    @GeneratedValue
    private int id;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "recruiter_id",referencedColumnName = "user_id")
    private Recruiter recruiterId;
    @Column(name = "position_title")
    private String positionTitle;
    @Column(name = "description")
    private String description;
}
