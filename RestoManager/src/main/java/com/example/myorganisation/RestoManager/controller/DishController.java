package com.example.myorganisation.RestoManager.controller;

import com.example.myorganisation.RestoManager.dto.DishInputDTO;
import com.example.myorganisation.RestoManager.dto.DishOutputDTO;
import com.example.myorganisation.RestoManager.service.DishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dish")
public class DishController {

    @Autowired
    DishService dishService;

    @PostMapping
    public ResponseEntity<DishOutputDTO> createDish(@RequestBody DishInputDTO dishInputDTO){
        return new ResponseEntity<>(dishService.createDish(dishInputDTO), HttpStatusCode.valueOf(200));
    }

    @GetMapping("/{id}")
    public ResponseEntity<DishOutputDTO> getDish(@RequestBody Long id){
        return new ResponseEntity<>(dishService.getDish(id), HttpStatusCode.valueOf(200));
    }

    @GetMapping
    public ResponseEntity<List<DishOutputDTO>> getAllDish(){
        return new ResponseEntity<>(dishService.getAllDish(), HttpStatusCode.valueOf(200));
    }

}
