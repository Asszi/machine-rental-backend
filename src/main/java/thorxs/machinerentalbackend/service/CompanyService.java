package thorxs.machinerentalbackend.service;

import thorxs.machinerentalbackend.model.Company;

import java.util.List;

public interface CompanyService {
    List<Company> listAllCompanies();
    Company getCompany(int id);
    void createNewCompany(Company company);
    void modifyCompany(Company company);
    void deleteCompany(int id);
}
