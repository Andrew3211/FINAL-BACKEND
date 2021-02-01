package com.rudnev.finalproject.repositories;

import com.rudnev.finalproject.domains.Collection;
import com.rudnev.finalproject.domains.Item;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ItemRepository extends CrudRepository<Item, Long> {
    List<Item> findByCollection(Collection collection);
}
