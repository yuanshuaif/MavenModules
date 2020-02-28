package entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

/**
 * Created by 10326 on 2020/1/31.
 */
@Getter
@Setter
@ToString
@Entity(name = "user")
public class User {
    // @GeneratedValue 对象的自增;  如果在数据库中添加一条记录，可能导致主键冲突
    @Id
    @GeneratedValue
    private int id;
    @Column(nullable = false, unique = true)
    private String name;
    @Column(nullable = false)
    private String age;
    @Transient
    private String sex;

    public User(){

    }

    public User(String name, String age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}
