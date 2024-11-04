package desafio.integranf.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {
    private Long id;
    private String name;
    private String email;
    private String password;
//    private status;
//    private createdAt;
//    private lastLogin;
}
