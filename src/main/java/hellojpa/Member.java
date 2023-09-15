package hellojpa;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity // JPA 필수 어노테이션
@Getter @Setter
public class Member {
    @Id // PK 설정
    private Long id;
    private String name;
}
