package com.vinay.Programming_SpringBoot_H2DB.repository;

import com.vinay.Programming_SpringBoot_H2DB.domain.User;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Transactional
@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Integer> {

    @Modifying
    @Query("update User set firstName = :fName, lastName = :lName where id = :id")
    void updateUserData(@Param(value = "id") int id,
                        @Param(value = "fName") String fName, @Param(value = "lName") String lName);

}
