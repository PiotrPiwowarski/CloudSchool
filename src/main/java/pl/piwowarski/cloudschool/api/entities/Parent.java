package pl.piwowarski.cloudschool.api.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.piwowarski.cloudschool.enums.Role;

import static jakarta.persistence.EnumType.STRING;
import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Table(name = "PARENTS")
public class Parent {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    @NotNull
    private String firstname;
    @NotNull
    private String lastname;
    @Email
    @NotNull
    private String email;
    @NotNull
    private String password;
    @Enumerated(STRING)
    @NotNull
    private Role role;
    @OneToOne
    @JoinColumn(name = "student_id")
    private Student student;
}
