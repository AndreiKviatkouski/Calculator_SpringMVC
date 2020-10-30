package by.tms.service;

import by.tms.models.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Service
public class UserService {

    private List<User> users = new ArrayList<>();

    public void save(User user){
        users.add(user);
    }

    public User getUserByLogin(String login){
        for (User user : users) {
            if (user.getLogin().equals(login)) {
                return user;
            }
        }
        throw new UserNotFoundException("Authorization error!");
    }
}
