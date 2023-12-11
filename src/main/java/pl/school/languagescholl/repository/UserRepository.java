package pl.school.languagescholl.repository;


import pl.school.languagescholl.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    User findByName(String name);
}
