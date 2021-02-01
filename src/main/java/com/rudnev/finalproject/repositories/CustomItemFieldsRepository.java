package com.rudnev.finalproject.repositories;

import com.rudnev.finalproject.domains.Collection;
import com.rudnev.finalproject.domains.CustomItemFields;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomItemFieldsRepository extends JpaRepository<CustomItemFields, Long> {
    CustomItemFields findByCollection(Collection collection);
}
