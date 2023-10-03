import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Luffy", "Zoro", "Nami");

        long namesCount = names.stream().count();
        System.out.println(namesCount);


    }
}