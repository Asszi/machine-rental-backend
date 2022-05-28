package thorxs.machinerentalbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import thorxs.machinerentalbackend.model.Company;
import thorxs.machinerentalbackend.service.CompanyService;

import java.util.List;

@Controller
public class CompanyController {
    private final CompanyService companyService;

    @Autowired
    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @RequestMapping("/company/getAll")
    @ResponseBody
    public List<Company> getCompanyList() {
        return companyService.listAllCompanies();
    }

    @RequestMapping("/company/{id}")
    @ResponseBody
    public Company getCompany(@PathVariable String id) {
        return companyService.getCompany(Integer.parseInt(id));
    }

    @RequestMapping("/company/modify")
    @ResponseBody
    public String modifyCompany(@RequestBody() Company company) {
        companyService.modifyCompany(company);

        return "Success";
    }

    @RequestMapping("/company/create")
    @ResponseBody
    public String createCompany(@RequestBody Company company) {
        companyService.createNewCompany(company);

        return "Success";
    }

    @RequestMapping("/company/delete/{id}")
    @ResponseBody
    public String deleteCompany(@PathVariable String id) {
        companyService.deleteCompany(Integer.parseInt(id));

        return "Success";
    }

    //TODO: Exception handling
}
