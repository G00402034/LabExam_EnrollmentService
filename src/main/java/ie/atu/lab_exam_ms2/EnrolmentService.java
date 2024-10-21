package ie.atu.lab_exam_ms2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
@RequestMapping("/enrol")
public class EnrolmentService {
    private final StudentClient studentClient;

    @Autowired
    public EnrolmentService(StudentClient studentClient){
        this.studentClient = studentClient;
    }

    @GetMapping("/{id}")
        public EnrolmentDetails getEnrollmentDetails(@PathVariable long studentId){
        Student StudentDetails = studentClient.getStudentDetails(studentId);
        StudentRepo.save(Student);
        return StudentDetails;
    }

}
