package kodlamaio.project.hrms.entities.concretes;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "system_users")
@PrimaryKeyJoinColumn(name = "user_id")
public class SystemUser extends User{
    @Column(name = "username")
    private String username;
    @Column(name = "role")
    private String role;
}
