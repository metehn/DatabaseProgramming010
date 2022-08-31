package persistence;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.io.Serializable;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Sample implements Serializable {

    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)  // GeneratedValue id'nin database tarafından otomatik verilmesini sağlıyor
    private long sampleId;
    private String sampleName;
    private double sampleValue;

}
