package pl.piwowarski.cloudschool.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.piwowarski.cloudschool.api.entities.Teacher;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {

}
