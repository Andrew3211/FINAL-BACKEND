package com.rudnev.finalproject.repositories;

import com.rudnev.finalproject.domains.Collection;
import com.rudnev.finalproject.domains.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CollectionRepository extends CrudRepository<Collection, Long> {
    List<Collection> findByUser(User user);

}
