package pl.piwowarski.cloudschool.api.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import static jakarta.persistence.CascadeType.ALL;
import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Table(name = "STUDENT_SCHOOL_SUBJECTS")
public class StudentSchoolSubject {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    @ManyToOne
    private SchoolSubject schoolSubject;
    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;
    @OneToMany(mappedBy = "studentSchoolSubject", cascade = ALL, orphanRemoval = true)
    private List<Grade> grades;
}
