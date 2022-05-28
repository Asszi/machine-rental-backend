package thorxs.machinerentalbackend.persist;

import thorxs.machinerentalbackend.model.Machine;

import java.util.List;

public interface MachineDao {
    Machine getMachine(int id);
    List<Machine> getAllMachines();
    void createMachine(Machine machine);
    void updateMachine(Machine machine);
    void deleteMachine(int id);
}
