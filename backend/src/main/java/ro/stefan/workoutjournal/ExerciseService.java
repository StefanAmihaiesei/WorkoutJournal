package ro.stefan.workoutjournal;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class ExerciseService {
    private final ExerciseRepository exerciseRepository;
    public ExerciseService(ExerciseRepository exerciseRepository){
        this.exerciseRepository = exerciseRepository;
    }
    public List<Exercise> getExercises(){
        return exerciseRepository.findAll();
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
