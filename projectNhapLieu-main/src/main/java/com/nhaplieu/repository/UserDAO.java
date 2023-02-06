package com.nhaplieu.repository;



import com.nhaplieu.domain.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO extends JpaRepository<User,String>{

    // User findByUsernameAndPassword(String username,String password);
    User findByUsernameAndPassword(String username,String password);

}
