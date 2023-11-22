package pl.piwowarski.cloudschool.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.piwowarski.cloudschool.api.entities.SchoolSubject;

@Repository
public interface SchoolSubjectRepository extends JpaRepository<SchoolSubject, Long> {

}
