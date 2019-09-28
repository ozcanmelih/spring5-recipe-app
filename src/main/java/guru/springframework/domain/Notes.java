package guru.springframework.domain;

import lombok.Data;

import javax.persistence.*;

@Data
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
