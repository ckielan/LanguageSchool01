package pl.school.languageschool.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.school.languageschool.domain.Users;
import pl.school.languageschool.repository.UserRepository;

import java.util.List;

@Service
@Transactional
public class userService {

    private final UserRepository userRepository;

    public userService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void saveUser(Users users) {
        userRepository.save(users);
    }

    public List<Users> findAllUser(){
        return userRepository.findAll();
    }
}