import java.util.*;

public class ProgramComparator {

    public static void main(String[]args){

        List<ProductComparator> list = new ArrayList<>();

        list.add(new ProductComparator("TV", 900.0));
        list.add(new ProductComparator("Notebook", 1200.0));
        list.add(new ProductComparator("Tablet", 450.0));

        // lambda
        list.sort((p1, p2) ->  p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

        /*
        Comparator<ProductComparator> comp = new Comparator<ProductComparator>() {
            @Override
            public int compare(ProductComparator p1, ProductComparator p2) {
                return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
            }
        };
                */

        // list.sort(new MyComparator());

        for(ProductComparator p : list){
            System.out.println(p);
        }
    }
}
