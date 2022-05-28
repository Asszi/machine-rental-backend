package thorxs.machinerentalbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import thorxs.machinerentalbackend.model.Rental;
import thorxs.machinerentalbackend.service.RentalService;

import java.util.List;

@Controller
public class RentalController {
    private final RentalService rentalService;

    @Autowired
    public RentalController(RentalService rentalService) {
        this.rentalService = rentalService;
    }

    @RequestMapping("/rental/getAll")
    @ResponseBody
    public List<Rental> getRentalList() {
        return rentalService.listRentals();
    }

    @RequestMapping("/rental/getAll/{id}")
    @ResponseBody
    public List<Rental> getRentalsForCompany(@PathVariable String id) {
        return rentalService.listRentalsForCompany(Integer.parseInt(id));
    }

    @RequestMapping("/rental/{id}")
    @ResponseBody
    public Rental getRental(@PathVariable String id) {
        return rentalService.getRental(Integer.parseInt(id));
    }

    @RequestMapping("/rental/modify")
    @ResponseBody
    public String modifyBrand(@RequestBody() Rental rental) {
        rentalService.modifyRental(rental);

        return "Success";
    }

    @RequestMapping("/rental/create")
    @ResponseBody
    public String createRental(@RequestBody Rental rental) {
        rentalService.createNewRental(rental);

        return "Success";
    }

    @RequestMapping("/rental/delete/{id}")
    @ResponseBody
    public String deleteBrand(@PathVariable String id) {
        rentalService.deleteRental(Integer.parseInt(id));

        return "Success";
    }

    //TODO: Exception handling
}
