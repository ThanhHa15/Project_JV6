package java6.java6.bean;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Brands")
public class Brand implements Serializable {
    @Id
    private String id;
    private String name;
    private String images;
    @JsonIgnore
    @OneToMany(mappedBy = "brand")
    private List<Product> products;

}
