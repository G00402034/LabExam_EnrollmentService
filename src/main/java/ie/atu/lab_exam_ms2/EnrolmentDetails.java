package ie.atu.lab_exam_ms2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EnrolmentDetails {

    private long studentId;
    private String firstName;
    private String lastName;
    private String email;
    private String DOB;

}
