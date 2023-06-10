package com.dev3.rentACar.buisness.abstracts;

import com.dev3.rentACar.buisness.reponses.GetAllBrandsResponse;
import com.dev3.rentACar.buisness.requests.CreateBrandRequest;
import com.dev3.rentACar.entities.concretes.Brand;

import java.util.List;

public interface BrandService {
    List<GetAllBrandsResponse> getAll();
    void add(CreateBrandRequest createBrandRequest);

}
