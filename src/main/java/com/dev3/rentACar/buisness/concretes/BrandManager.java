package com.dev3.rentACar.buisness.concretes;

import com.dev3.rentACar.buisness.abstracts.BrandService;
import com.dev3.rentACar.buisness.reponses.*;
import com.dev3.rentACar.buisness.requests.*;
import com.dev3.rentACar.core.utilities.mappers.ModelMapperService;
import com.dev3.rentACar.dataAcces.abstracts.BrandRepository;
import com.dev3.rentACar.entities.concretes.Brand;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service// bu sinif bir buisness nesnesidir
@AllArgsConstructor
public class BrandManager implements BrandService {
    private BrandRepository brandRepository;
    private ModelMapperService modelMapperService;


    @Override
    public List<GetAllBrandsResponse> getAll() {
        List<Brand> brands=brandRepository.findAll();

        return brands.stream().
                map(brand->this.modelMapperService.forResponse().map(brand,GetAllBrandsResponse.class)).toList();

    }

    @Override
    public void add(CreateBrandRequest createBrandRequest) {

        //Brand brand=new Brand();
        //brand.setName(createBrandRequest.getName());

        Brand brand=this.modelMapperService.forResquest().map(createBrandRequest,Brand.class);

        this.brandRepository.save((brand));
    }


}
