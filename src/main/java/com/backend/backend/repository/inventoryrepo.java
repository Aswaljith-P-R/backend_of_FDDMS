package com.backend.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.backend.backend.model.inventory;
import java.util.Optional;


@Repository
public interface inventoryrepo extends JpaRepository<inventory, Long> {
    Optional<inventory> findByFoodItem(String foodItem);
}