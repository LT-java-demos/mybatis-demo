import com.lt.rs.model.User;
import com.lt.rs.service.UserService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        List<User> users = userService.findAllUsers();
        users.forEach(System.out::println);
        System.out.println("No.1:" + userService.findUserById(1));
    }
}
