package guru.springframework.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Data
@EqualsAndHashCode(exclude = {"recipe"})
@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne //Note silindiginde Recipe silinmesin diye CASCADE koyulmadi
    private Recipe recipe;

    @Lob //CLOB
    private String recipeNotes;

}
