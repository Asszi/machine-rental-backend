package thorxs.machinerentalbackend.service;

import thorxs.machinerentalbackend.model.Machine;

import java.util.List;

public interface MachineService {
    List<Machine> listAllMachines();
    Machine getMachine(int id);
    void createNewMachine(Machine machine);
    void modifyMachine(Machine machine);
    void deleteMachine(int id);
}
