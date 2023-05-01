package org.example.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="cars")
@Getter
@Setter
@NoArgsConstructor
public class Car {
    @Id
    @GeneratedValue(generator = "cars_gen",strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name="cars_gen",sequenceName = "cars_seq",allocationSize = 1)
    private Long id;
    private String name;
    private String marka;
    private int date;

    @ManyToOne(cascade = {CascadeType.DETACH,
                                            CascadeType.MERGE,
                                            CascadeType.REFRESH})
    private User user;
    public Car(String name, String marka, int date) {
        this.name = name;
        this.marka = marka;
        this.date = date;
    }
}
