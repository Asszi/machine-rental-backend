package thorxs.machinerentalbackend.service;

import org.springframework.stereotype.Service;
import thorxs.machinerentalbackend.model.Machine;
import thorxs.machinerentalbackend.persist.MachineDao;

import java.util.List;

@Service
public class MachineServiceImpl implements MachineService {
    private final MachineDao machineDao;

    public MachineServiceImpl(MachineDao machineDao) {
        this.machineDao = machineDao;
    }

    @Override
    public List<Machine> listAllMachines() {
        return machineDao.getAllMachines();
    }

    @Override
    public Machine getMachine(int id) {
        return machineDao.getMachine(id);
    }

    @Override
    public void createNewMachine(Machine machine) {
        machineDao.createMachine(machine);
    }

    @Override
    public void modifyMachine(Machine machine) {
        machineDao.updateMachine(machine);
    }

    @Override
    public void deleteMachine(int id) {
        machineDao.deleteMachine(id);
    }
}
