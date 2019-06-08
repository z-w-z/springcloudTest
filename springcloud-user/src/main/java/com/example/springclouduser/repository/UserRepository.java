package com.example.springclouduser.repository;


import com.example.springclouduser.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * author TODO zwz
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
