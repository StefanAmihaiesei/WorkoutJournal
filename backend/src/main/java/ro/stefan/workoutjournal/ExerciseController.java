package ro.stefan.workoutjournal;

import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
@RestController
public class ExerciseController {
    private final ExerciseService exerciseService;
    public ExerciseController(ExerciseService exerciseService){
        this.exerciseService = exerciseService;
    }
    @GetMapping("/api/exercises")
    public List<Exercise> getExercises(){
            return exerciseService.getExercises();
    }
    @GetMapping("/api/exercises/{id}")
    public Exercise getExerciseById(@PathVariable("id") Long id){
       Exercise result = exerciseService.getExerciseById(id);
       if (result == null){
           throw new ResponseStatusException(
                   HttpStatus.NOT_FOUND,
                   "Exercitiul nu exista"
           );
       }
       else return result;
    }
}
