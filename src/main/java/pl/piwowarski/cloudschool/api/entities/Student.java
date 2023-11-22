package pl.piwowarski.cloudschool.api.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import pl.piwowarski.cloudschool.enums.Role;

import java.util.List;

import static jakarta.persistence.CascadeType.ALL;
import static jakarta.persistence.EnumType.STRING;
import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Table(name = "STUDENTS")
public class Student {

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
    @OneToOne(mappedBy = "student", cascade = ALL, orphanRemoval = true)
    private Parent parent;
    @ManyToOne
    @JoinColumn(name = "school_group_id")
    private SchoolGroup schoolGroup;
    @ManyToOne
    @JoinColumn(name = "school_id")
    private School school;
    @OneToMany(mappedBy = "student", cascade = ALL, orphanRemoval = true)
    private List<StudentSchoolSubject> studentSchoolSubjects;
}
