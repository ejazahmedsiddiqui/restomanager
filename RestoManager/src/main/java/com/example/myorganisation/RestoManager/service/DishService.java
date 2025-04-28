package com.example.myorganisation.RestoManager.service;

import com.example.myorganisation.RestoManager.dto.DishInputDTO;
import com.example.myorganisation.RestoManager.dto.DishOutputDTO;

import java.util.List;

public interface DishService {

    DishOutputDTO createDish(DishInputDTO dishInputDTO);
    DishOutputDTO getDish(Long id);
    List<DishOutputDTO> getAllDish();

}
