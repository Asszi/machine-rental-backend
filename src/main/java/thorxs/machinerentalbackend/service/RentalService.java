package thorxs.machinerentalbackend.service;

import thorxs.machinerentalbackend.model.Rental;

import java.util.List;

public interface RentalService {
    List<Rental> listRentals();
    List<Rental> listRentalsForCompany(int companyId);
    Rental getRental(int id);
    void createNewRental(Rental rental);
    void modifyRental(Rental rental);
    void deleteRental(int id);
}
