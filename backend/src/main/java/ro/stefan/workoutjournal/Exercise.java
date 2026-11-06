package ro.stefan.workoutjournal;

public class Exercise{
    private final String name;
    private final Long id;

    public Exercise(String name, Long id){
        this.name = name;
        this.id = id;
    }

    public String getName(){
        return name;
    }
    public Long getId(){
        return id;
    }

}