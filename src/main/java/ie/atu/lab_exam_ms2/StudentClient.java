package ie.atu.lab_exam_ms2;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "student-service" , url = "http://localhost:8080")
public interface StudentClient {

    @GetMapping("/student/{id}")
    Student getStudentDetails(@PathVariable("id") long id);

}
