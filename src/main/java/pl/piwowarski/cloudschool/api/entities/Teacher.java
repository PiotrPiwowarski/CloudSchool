package pl.piwowarski.cloudschool.api.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.piwowarski.cloudschool.enums.Role;

import java.util.Set;

import static jakarta.persistence.EnumType.STRING;
import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Table(name = "TEACHERS")
public class Teacher {

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
    @OneToMany(mappedBy = "teacher")
    private Set<SchoolSubject> schoolSubjects;
    @OneToMany(mappedBy = "teacher")
    private Set<SchoolGroup> schoolGroups;
    @ManyToOne
    @JoinColumn(name = "school_id")
    private School school;
}
