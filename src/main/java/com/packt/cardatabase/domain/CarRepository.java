package com.packt.cardatabase.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CarRepository extends CrudRepository<Car, Long> {
    //fetch cars by brand
    List<Car> findByBrand(@Param("brand") String brand);

    //fetch by color
    List<Car> findByColor(@Param("color") String color);
}
