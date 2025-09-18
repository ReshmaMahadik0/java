import java.util.Arrays;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
        myList.stream()
                .map(s -> s + "")
                .filter(s -> s.startsWith("1"))
                .forEach(i -> System.out.println(i));


        
        List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);
        list.stream()
                .map(s -> s + "")
                .filter(s -> s.startsWith("1"))
                .forEach(i -> System.out.println(i));
    }
}
