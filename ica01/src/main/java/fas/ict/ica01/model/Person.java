package fas.ict.ica01.model;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Person {
    @Id
    private String id;

    private String name;
    private int age;
    private String gender;
}
