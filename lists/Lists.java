import java.util.ArrayList;
import java.util.List;

public class Lists {

    public static void main(String[] args){

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Yulli");
        list.add("Miguel");
        list.add("Pedro");

        for(String x : list){
            System.out.println(x);
        }

        list.remove(1);
        System.out.println(String.join(", ", list));
        System.out.println(String.join("\n", list));
    }
}
