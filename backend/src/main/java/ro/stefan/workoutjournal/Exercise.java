package ro.stefan.workoutjournal;

import jakarta.persistence.*;

@Entity
@Table(name ="exercises")
public class Exercise{
    @Column(nullable = false, length = 100)
    private String name;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Exercise(String name, Long id){
        this.name = name;
        this.id = id;
    }
    protected Exercise(){
    }

    public String getName(){
        return name;
    }
    public Long getId(){
        return id;
    }

}