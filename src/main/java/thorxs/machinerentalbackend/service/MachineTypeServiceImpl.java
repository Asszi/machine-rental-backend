package thorxs.machinerentalbackend.service;

import org.springframework.stereotype.Service;
import thorxs.machinerentalbackend.model.MachineType;
import thorxs.machinerentalbackend.persist.MachineTypeDao;

import java.util.List;

@Service
public class MachineTypeServiceImpl implements MachineTypeService {
    private final MachineTypeDao machineTypeDao;

    public MachineTypeServiceImpl(MachineTypeDao machineTypeDao) {
        this.machineTypeDao = machineTypeDao;
    }

    @Override
    public List<MachineType> listMachineTypes() {
        return machineTypeDao.getAllMachineTypes();
    }

    @Override
    public MachineType getMachineType(int id) {
        return machineTypeDao.getMachineType(id);
    }

    @Override
    public void createNewMachineType(MachineType machineType) {
        machineTypeDao.createMachineType(machineType);
    }

    @Override
    public void modifyMachineType(MachineType machineType) {
        machineTypeDao.updateMachineType(machineType);
    }

    @Override
    public void deleteMachineType(int id) {
        machineTypeDao.deleteMachineType(id);
    }
}
