package com.ala.tp.repo;


import com.ala.tp.entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppUserRepo extends JpaRepository<AppUser,Integer> {
    AppUser findAppUserByUsername(String username);
}
