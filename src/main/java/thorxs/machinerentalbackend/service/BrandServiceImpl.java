package thorxs.machinerentalbackend.service;

import org.springframework.stereotype.Service;
import thorxs.machinerentalbackend.model.Brand;
import thorxs.machinerentalbackend.persist.BrandDao;

import java.util.List;

@Service
public class BrandServiceImpl implements BrandService {
    private final BrandDao brandDao;

    public BrandServiceImpl(BrandDao brandDao) {
        this.brandDao = brandDao;
    }

    @Override
    public List<Brand> listAllBrands() {
        return brandDao.getAllBrands();
    }

    @Override
    public Brand getBrand(int id) {
        return brandDao.getBrand(id);
    }

    @Override
    public void createNewBrand(Brand brand) {
        brandDao.createBrand(brand);
    }

    @Override
    public void modifyBrand(Brand brand) {
        brandDao.updateBrand(brand);
    }

    @Override
    public void deleteBrand(int id) {
        brandDao.deleteBrand(id);
    }
}
