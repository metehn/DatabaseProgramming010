package human;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
@Entity
public class Employee implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @NonNull
    private long employeeId;
    @NonNull
    private String employeeName;
    @NonNull
    private double monthlySalary;
    @ManyToOne
    @JoinColumn(name = "departmentId") //Foreign key olarak departmentId adlı yeni bir column atıyor. name kısmına ne yazarsak o isimle sütun yaratılıyor.
    private Department department;

}
