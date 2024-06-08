package usman.springboot.springdatajpa.crmproject2.model;
import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class studentinfo {

    String name;
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    int id;

    private LocalDate dob;
   String city;

}

