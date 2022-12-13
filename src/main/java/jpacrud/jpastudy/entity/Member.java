package jpacrud.jpastudy.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;

@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "member_id")
    private Long id;

    @NotEmpty
    private String username;
    private String email;
}
