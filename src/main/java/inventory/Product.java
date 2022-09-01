package inventory;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
@Builder
@ToString
@Entity
@Table(name ="Product") /*Bu etiket etity'nin databasede hangi isimle yaratılacağını belirler. name = "deneme" yazsaydım
 databasede deneme tablosu oluşturulacak ve nesneler onun altına eklenecekti */
public class Product implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "productId") // Databaseye yazılacak sütun adını belirler. Etiketi kullanmazsak değerin adı sütun olarak yazılır
    private long productId;
    @Column(name = "productName")
    private String productName;
    @Column(name = "salesPrice")
    private double salesPrice;

}
