package org.example.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(generator = "users_gen",strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name="users_gen",sequenceName = "users_seq",allocationSize = 1)
    private Long id;
    private String first_name;
    private String last_name;
    private String age;
    @OneToMany(mappedBy = "users")
    private List<Car> cars;

    public User(String first_name, String last_name, String age) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;

    }
}
