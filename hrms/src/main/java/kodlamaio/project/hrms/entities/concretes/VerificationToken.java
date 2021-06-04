package kodlamaio.project.hrms.entities.concretes;

import lombok.Data;
import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "verification_tokens")
public class VerificationToken {
    @Id
    @GeneratedValue
    private int id;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User userId;
    @Column(name = "token")
    private String token;
    @Column(name = "expiry_date")
    private Date expiryDate;
}
