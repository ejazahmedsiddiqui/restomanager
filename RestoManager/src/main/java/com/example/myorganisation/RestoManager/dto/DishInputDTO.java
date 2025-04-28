package com.example.myorganisation.RestoManager.dto;

import com.example.myorganisation.RestoManager.model.enums.DishCategory;
import lombok.Data;

@Data
public class DishInputDTO {

    private String name;
    private Long price;
    private DishCategory category;

}
