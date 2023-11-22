package pl.piwowarski.cloudschool.api.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
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
@Table(name = "SCHOOL_GROUPS")
public class School {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    @NotNull
    private String name;
    @NotNull
    private String city;
    @OneToMany(mappedBy = "school", cascade = ALL, orphanRemoval = true)
    private List<Student> students;
    @OneToMany(mappedBy = "school", cascade = ALL, orphanRemoval = true)
    private List<Teacher> teachers;
}
