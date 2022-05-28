package thorxs.machinerentalbackend.service;

import org.springframework.stereotype.Service;
import thorxs.machinerentalbackend.model.Company;
import thorxs.machinerentalbackend.persist.CompanyDao;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {
    private final CompanyDao companyDao;

    public CompanyServiceImpl(CompanyDao companyDao) {
        this.companyDao = companyDao;
    }

    @Override
    public List<Company> listAllCompanies() {
        return companyDao.getAllCompanies();
    }

    @Override
    public Company getCompany(int id) {
        return companyDao.getCompany(id);
    }

    @Override
    public void createNewCompany(Company company) {
        companyDao.createCompany(company);
    }

    @Override
    public void modifyCompany(Company company) {
        companyDao.updateCompany(company);
    }

    @Override
    public void deleteCompany(int id) {
        companyDao.deleteCompany(id);
    }
}
