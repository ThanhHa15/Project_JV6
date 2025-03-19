package java6.java6.bean;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.criteria.Order;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Accounts")
public class Account implements Serializable {
    @Id
    private String name;
    private String password;
    private String fullname;
    private String email;
    private String photo;
    private boolean actived;
    @OneToMany(mappedBy = "account", fetch = FetchType.EAGER)
    // @Column(name = "roledetails")
    private List<RoleDetail> roleDetails;
    @JsonIgnore
    @OneToMany(mappedBy = "account")
    private List<Order> orders;
}
