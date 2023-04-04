import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@NoArgsConstructor(access= AccessLevel.PUBLIC)
@Entity
public class Item implements Serializable {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    @Column
    private String name;

    @Column
    private int price;

    @Builder
    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
