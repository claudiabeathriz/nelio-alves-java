import java.util.List;
import java.util.function.Consumer;

public class MainFunctionalInterfaces {

    public static void main(String[] args){

        List<User> users = List.of(new User("Maria", 20),
                new User("Lucia", 30),
                new User("Eduardo", 15),
                new User("Ana", 42));

        // lambda

        users.forEach(user -> System.out.println(user));

        // users.forEach((User user) -> {
          //  System.out.println(user);
        // });

        //users.forEach(new Consumer<User>() {
           // @Override
           // public void accept(User user) {
           //     System.out.println(user);
           // }
        // });
    }
}
