import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ServiseStudent {
    public  static ArrayList<Student> surnameSearch (List<Student> students,String word) {
        return students.stream()
                .filter(x->x.getSurname().startsWith(word))
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
