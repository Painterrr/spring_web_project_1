package hello.hellospring.domain;

import javax.persistence.*;

@Entity
public class Member {

    // PK 구분. DB가 자동으로 생성하는 것 = IDENTITY
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
//    일반 컬럼은 이렇게 -> @Column(name = "username")
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
