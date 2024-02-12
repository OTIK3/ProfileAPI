package spring.first.app.profileapi.dto;

import lombok.Data;

@Data
public class ProfileDto {
    private String name;
    private String firstname;
    private String surname;
    private String phone;
    private String email;
}
