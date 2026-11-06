package ro.stefan.workoutjournal;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
@RestController
public class ExerciseController {
    @GetMapping("/api/exercises")
    public List<Exercise> getExercises(){
        return List.of(
                new Exercise("Bench Press",1L),
                new Exercise("Leg Press",2L),
                new Exercise("Ramat",3L),
                new Exercise("Deadlift",4L)
        );
    }
}
