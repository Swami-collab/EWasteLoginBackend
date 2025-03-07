package com.Ewaste2.Ecoins2.Repository;


import com.Ewaste2.Ecoins2.Model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsersRepository extends JpaRepository<Users,Integer>{

    Optional<Users> findByUserName(String userName);

}