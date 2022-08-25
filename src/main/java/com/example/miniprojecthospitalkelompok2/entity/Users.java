package com.example.miniprojecthospitalkelompok2.entity;
import lombok.*;
import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;



@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="user_table")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    private String userName;

    private String fullName;

    private String gender;

    private String email;

    private String address;

    private String role;

    @JsonProperty(access = Access.WRITE_ONLY)
    private String password;

    private String age;

    public Users(String userName, String email, String password) {
        this.userName = userName;
        this.email = email;
        this.password = password;
    }
}
