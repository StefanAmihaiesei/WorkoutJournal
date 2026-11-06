package ro.stefan.workoutjournal;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
@Service
public class ExerciseService {
    public List<Exercise> getExercises(){
        return List.of(
                new Exercise("Bench Press",1L),
                new Exercise("Leg Press",2L),
                new Exercise("Ramat",3L),
                new Exercise("Deadlift",4L)
        );
    }
    public Exercise getExerciseById(Long id) {
        List<Exercise> exercises = getExercises();
        for (Exercise exercise : exercises) {
            if (id.equals(exercise.getId())) {
                return exercise;
            }
        }
       return null;
    }
}
