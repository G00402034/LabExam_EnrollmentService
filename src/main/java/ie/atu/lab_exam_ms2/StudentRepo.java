package ie.atu.lab_exam_ms2;

import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaReository<Student,Long>{
}
