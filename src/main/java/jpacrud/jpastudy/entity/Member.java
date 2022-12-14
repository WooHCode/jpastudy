package jpacrud.jpastudy.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "member_id")
    private Long id;

    private int age;

    @NotEmpty
    private String username;
    private String email;
    @Builder
    public Member(Long id, int age, String username, String email) {
        this.id = id;
        this.age = age;
        this.username = username;
        this.email = email;
    }

    public void changeMember(String username) {
        this.username = username;
    }
}
