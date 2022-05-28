package thorxs.machinerentalbackend.service;

import org.springframework.stereotype.Service;
import thorxs.machinerentalbackend.model.Rental;
import thorxs.machinerentalbackend.persist.RentalDao;

import java.util.List;

@Service
public class RentalServiceImpl implements RentalService {
    private final RentalDao rentalDao;

    public RentalServiceImpl(RentalDao rentalDao) {
        this.rentalDao = rentalDao;
    }

    @Override
    public List<Rental> listRentals() {
        return rentalDao.getAllRentals();
    }

    @Override
    public List<Rental> listRentalsForCompany(int companyId) {
        return rentalDao.getCompanyRentals(companyId);
    }

    @Override
    public Rental getRental(int id) {
        return rentalDao.getRental(id);
    }

    @Override
    public void createNewRental(Rental rental) {
        rentalDao.createRental(rental);
    }

    @Override
    public void modifyRental(Rental rental) {
        rentalDao.updateRental(rental);
    }

    @Override
    public void deleteRental(int id) {
        rentalDao.deleteRental(id);
    }
}
