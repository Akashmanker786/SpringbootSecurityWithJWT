package com.akashcodez.repos;

import com.akashcodez.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

    public  User findByUserEmail(String email);

}
