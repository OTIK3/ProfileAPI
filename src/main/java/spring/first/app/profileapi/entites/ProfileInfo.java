package spring.first.app.profileapi.entites;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="profile_info")
public class ProfileInfo {
    @Id
    private Integer id;
    private String name;
    private String firstname;
    private String surname;
    private String phone;
    private String email;
}
