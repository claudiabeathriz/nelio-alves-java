import java.util.Comparator;

public class MyComparator implements Comparator<ProductComparator> {

    @Override
    public int compare(ProductComparator p1, ProductComparator p2) {
        return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
    }
}
