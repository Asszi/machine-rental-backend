package thorxs.machinerentalbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import thorxs.machinerentalbackend.model.Brand;
import thorxs.machinerentalbackend.service.BrandService;

import java.util.List;

@Controller
public class BrandController {
    private final BrandService brandService;

    @Autowired
    public BrandController(BrandService brandService) {
        this.brandService = brandService;
    }

    @RequestMapping("/brand/getAll")
    @ResponseBody
    public List<Brand> getBrandList() {
        return brandService.listAllBrands();
    }

    @RequestMapping("/brand/{id}")
    @ResponseBody
    public Brand getBrand(@PathVariable String id) {
        return brandService.getBrand(Integer.parseInt(id));
    }

    @RequestMapping("/brand/modify")
    @ResponseBody
    public String modifyBrand(@RequestBody() Brand brand) {
        brandService.modifyBrand(brand);

        return "Success";
    }

    @RequestMapping("/brand/create")
    @ResponseBody
    public String createBrand(@RequestBody Brand brand) {
        brandService.createNewBrand(brand);

        return "Success";
    }

    @RequestMapping("/brand/delete/{id}")
    @ResponseBody
    public String deleteBrand(@PathVariable String id) {
        brandService.deleteBrand(Integer.parseInt(id));

        return "Success";
    }

    //TODO: Exception handling
}
