package thorxs.machinerentalbackend.service;

import thorxs.machinerentalbackend.model.Brand;

import java.util.List;

public interface BrandService {
    List<Brand> listAllBrands();
    Brand getBrand(int id);
    void createNewBrand(Brand brand);
    void modifyBrand(Brand brand);
    void deleteBrand(Brand brand);
}
