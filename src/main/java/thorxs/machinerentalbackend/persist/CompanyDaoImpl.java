package thorxs.machinerentalbackend.persist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import thorxs.machinerentalbackend.model.Company;

import java.util.*;

@Component
public class CompanyDaoImpl implements CompanyDao {
    private Map<Integer, Company> companyMap;

    @Autowired
    public void CompanyDao() {
        companyMap = new HashMap<>();
        companyMap.put(1, new Company(1, "Test Company 1", "Test Representative", "11111111111", "123123", "Miskolc xyz 2"));
        companyMap.put(2, new Company(2, "Test Company 2", "Another Representative", "22222222222", "321321", "Budapest xyz 2"));
        companyMap.put(3, new Company(3, "Test Company 3", "More Representative", "33333333333", "1233321", "Eger xyz 2"));
    }

    @Override
    public Company getCompany(int id) {
        return companyMap.get(id);
    }

    @Override
    public List<Company> getAllCompanies() {
        return new ArrayList<>(companyMap.values());
    }

    @Override
    public void createCompany(Company company) {
        int randomId = new Random().nextInt(Integer.SIZE - 1);
        company.setId(randomId);
        companyMap.put(randomId, company);
    }

    @Override
    public void updateCompany(Company company) {
        companyMap.replace(company.getId(), company);
    }

    @Override
    public void deleteCompany(int id) {
        companyMap.remove(id);
    }
}
