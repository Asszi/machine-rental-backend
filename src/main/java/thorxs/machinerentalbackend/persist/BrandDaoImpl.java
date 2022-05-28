package thorxs.machinerentalbackend.persist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import thorxs.machinerentalbackend.model.Brand;

import java.util.*;

@Component
public class BrandDaoImpl implements BrandDao {
    private Map<Integer, Brand> brandMap;

    @Autowired
    public void BrandDao() {
        brandMap = new HashMap<>();
        brandMap.put(1, new Brand(1, "Bosch"));
        brandMap.put(2, new Brand(2, "Makita"));
        brandMap.put(3, new Brand(3, "DeWalt"));
    }

    @Override
    public Brand getBrand(int id) {
        return brandMap.get(id);
    }

    @Override
    public List<Brand> getAllBrands() {
        return new ArrayList<>(brandMap.values());
    }

    @Override
    public void createBrand(Brand brand) {
        int randomId = new Random().nextInt(Integer.SIZE - 1);
        brand.setId(randomId);
        brandMap.put(randomId, brand);
    }

    @Override
    public void updateBrand(Brand brand) {
        brandMap.replace(brand.getId(), brand);
    }

    @Override
    public void deleteBrand(int id) {
        brandMap.remove(id);
    }
}
