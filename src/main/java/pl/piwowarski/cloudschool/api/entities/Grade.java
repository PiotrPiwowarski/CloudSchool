package pl.piwowarski.cloudschool.api.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.piwowarski.cloudschool.enums.GradeValue;
import pl.piwowarski.cloudschool.enums.GradeWeight;

import static jakarta.persistence.CascadeType.ALL;
import static jakarta.persistence.EnumType.STRING;
import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Table(name = "GRADES")
public class Grade {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    @Enumerated(STRING)
    @NotNull
    private GradeWeight gradeWeight;
    @Enumerated(STRING)
    @NotNull
    private GradeValue gradeValue;
    @ManyToOne
    @JoinColumn(name = "student_school_subject_id")
    private StudentSchoolSubject studentSchoolSubject;
}
