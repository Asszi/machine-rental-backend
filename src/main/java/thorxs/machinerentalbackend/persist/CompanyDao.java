package thorxs.machinerentalbackend.persist;

import thorxs.machinerentalbackend.model.Company;

import java.util.List;

public interface CompanyDao {
    Company getCompany(int id);
    List<Company> getAllCompanies();
    void createCompany(Company company);
    void updateCompany(Company company);
    void deleteCompany(int id);
}
