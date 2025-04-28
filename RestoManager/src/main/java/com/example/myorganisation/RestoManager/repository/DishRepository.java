package com.example.myorganisation.RestoManager.repository;

import com.example.myorganisation.RestoManager.model.Dish;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface DishRepository extends JpaRepository<Dish, Long>{
}
