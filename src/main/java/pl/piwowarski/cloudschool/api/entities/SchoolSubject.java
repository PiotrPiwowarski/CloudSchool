package pl.piwowarski.cloudschool.api.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.piwowarski.cloudschool.enums.SubjectType;

import java.util.List;
import java.util.Set;

import static jakarta.persistence.CascadeType.ALL;
import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Table(name = "SCHOOL_SUBJECTS")
public class SchoolSubject {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    @NotNull
    private SubjectType subjectType;
    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;
    @OneToMany(mappedBy = "schoolSubject", cascade = ALL, orphanRemoval = true)
    private Set<StudentSchoolSubject> studentSchoolSubjects;
}
