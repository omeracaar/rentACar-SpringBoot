package com.dev3.rentACar.webApi.controllers;


import com.dev3.rentACar.buisness.abstracts.BrandService;
import com.dev3.rentACar.buisness.reponses.GetAllBrandsResponse;
import com.dev3.rentACar.entities.concretes.Brand;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController//annotation
@RequestMapping("/api/brands")
@AllArgsConstructor
public class BrandsController {
    private BrandService brandService;


    @GetMapping("/getAll")
    public List<GetAllBrandsResponse> getAll(){
        return brandService.getAll();
    }

    @PostMapping("/add")
    public void add(com.dev3.rentACar.buisness.requests.CreateBrandRequest createBrandRequest){
        this.brandService.add(createBrandRequest);
    }

}
