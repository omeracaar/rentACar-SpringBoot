package com.dev3.rentACar.dataAcces.abstracts;

import com.dev3.rentACar.entities.concretes.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface BrandRepository extends JpaRepository<Brand,Integer> {


}

//
