package com.example.myorganisation.RestoManager.model;

import com.example.myorganisation.RestoManager.model.enums.DishCategory;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity //maps object with relation
@Table(name = "dish")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Dish {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Long price;

    @Enumerated(EnumType.STRING)
    private DishCategory Category;

}
