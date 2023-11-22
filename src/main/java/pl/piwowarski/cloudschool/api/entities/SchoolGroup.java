package pl.piwowarski.cloudschool.api.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.piwowarski.cloudschool.enums.ClassId;
import pl.piwowarski.cloudschool.enums.Year;

import java.util.List;

import static jakarta.persistence.CascadeType.ALL;
import static jakarta.persistence.EnumType.STRING;
import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Table(name = "SCHOOL_GROUPS")
public class SchoolGroup {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    @Enumerated(STRING)
    @NotNull
    private ClassId classId;
    @Enumerated(STRING)
    @NotNull
    private Year year;
    @OneToMany(mappedBy = "schoolGroup", cascade = ALL, orphanRemoval = true)
    private List<Student> students;
    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;
}
