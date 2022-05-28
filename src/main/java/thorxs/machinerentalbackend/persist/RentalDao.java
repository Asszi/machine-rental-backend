package thorxs.machinerentalbackend.persist;

import thorxs.machinerentalbackend.model.Rental;

import java.util.List;

public interface RentalDao {
    Rental getRental(int id);
    List<Rental> getAllRentals();
    List<Rental> getCompanyRentals(int companyId);
    void createRental(Rental rental);
    void updateRental(Rental rental);
    void deleteRental(int id);
}
