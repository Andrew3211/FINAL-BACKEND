package com.rudnev.finalproject.repositories;

import com.rudnev.finalproject.domains.UserData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDataRepository extends JpaRepository<UserData, Long> {

}
