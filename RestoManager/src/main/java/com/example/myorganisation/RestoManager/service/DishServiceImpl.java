package com.example.myorganisation.RestoManager.service;

import com.example.myorganisation.RestoManager.dto.DishInputDTO;
import com.example.myorganisation.RestoManager.dto.DishOutputDTO;
import com.example.myorganisation.RestoManager.model.Dish;
import com.example.myorganisation.RestoManager.repository.DishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DishServiceImpl implements DishService {

    @Autowired
    DishRepository dishRepository;
    @Override
    public DishOutputDTO createDish(DishInputDTO dishInputDTO) {
        Dish dish = new Dish();
        dish.setName(dishInputDTO.getName());
        dish.setCategory(dishInputDTO.getCategory());
        dish.setPrice(dishInputDTO.getPrice());

        dish = dishRepository.save(dish);

        DishOutputDTO dishOutputDTO = new DishOutputDTO();
        dishOutputDTO.setName(dish.getName());
        dishOutputDTO.setPrice(dish.getPrice());
        dishOutputDTO.setCategory(dish.getCategory());

        return dishOutputDTO;
    }

    @Override
    public DishOutputDTO getDish(Long id) {
        Dish dish = dishRepository.findById(id).orElse(null);
        DishOutputDTO dishOutputDTO = DishOutputDTO.builder()
                .id(dish.getId())
                .name(dish.getName())
                .price(dish.getPrice())
                .category(dish.getCategory())
                .build();
        return dishOutputDTO;
    }

    @Override
    public List<DishOutputDTO> getAllDish() {
        List<Dish> dishList = dishRepository.findAll();
        List<DishOutputDTO> dishOutputDTOList = new ArrayList<>();
        for (Dish dish : dishList) {
            DishOutputDTO dishOutputDTO = DishOutputDTO.builder()
                    .id(dish.getId())
                    .name(dish.getName())
                    .price(dish.getPrice())
                    .category(dish.getCategory())
                    .build();
            dishOutputDTOList.add(dishOutputDTO);
        }
        return dishOutputDTOList;
    }
}
