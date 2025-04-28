package com.example.myorganisation.RestoManager.dto;

import com.example.myorganisation.RestoManager.model.enums.DishCategory;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder //uses contructors to insert values
@NoArgsConstructor
@AllArgsConstructor
public class DishOutputDTO {

    private Long id;
    private String name;
    private Long price;
    private DishCategory category;

}
