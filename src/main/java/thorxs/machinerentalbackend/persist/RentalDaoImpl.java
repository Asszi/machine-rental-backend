package thorxs.machinerentalbackend.persist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import thorxs.machinerentalbackend.model.Rental;

import java.time.LocalDateTime;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Component
public class RentalDaoImpl implements RentalDao {
    private Map<Integer, Rental> rentalMap;

    @Autowired
    public void RentalDao() {
        rentalMap = new HashMap<>();
        rentalMap.put(1, new Rental(1, 1, 1, LocalDateTime.now(), null));
        rentalMap.put(2, new Rental(2, 1, 2, LocalDateTime.now(), null));
        rentalMap.put(3, new Rental(3, 3, 3, LocalDateTime.now(), null));
    }

    @Override
    public Rental getRental(int id) {
        return rentalMap.get(id);
    }

    @Override
    public List<Rental> getAllRentals() {
        return new ArrayList<>(rentalMap.values());
    }

    @Override
    public List<Rental> getCompanyRentals(int companyId) {
        return rentalMap.values().stream().filter(rentalIsForCompany(companyId)).collect(Collectors.toList());
    }

    @Override
    public void createRental(Rental rental) {
        int randomId = new Random().nextInt(Integer.SIZE - 1);
        rental.setId(randomId);
        rentalMap.put(randomId, rental);
    }

    @Override
    public void updateRental(Rental rental) {
        rentalMap.replace(rental.getId(), rental);
    }

    @Override
    public void deleteRental(int id) {
        rentalMap.remove(id);
    }

    private Predicate<Rental> rentalIsForCompany(int companyId) {
        return p -> p.getCompanyId() == companyId;
    }
}
