package thorxs.machinerentalbackend.persist;

import thorxs.machinerentalbackend.model.Brand;

import java.util.List;

public interface BrandDao {
    Brand getBrand(int id);
    List<Brand> getAllBrands();
    void createBrand(Brand brand);
    void updateBrand(Brand brand);
    void deleteBrand(Brand brand);
}
