package fas.ict.ica01.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;

@Entity
public class Employee extends Person {

    private String jobPosition;

    @ManyToMany
    private List<Canteen> canteens;
}

