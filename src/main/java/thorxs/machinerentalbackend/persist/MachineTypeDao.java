package thorxs.machinerentalbackend.persist;

import thorxs.machinerentalbackend.model.MachineType;

import java.util.List;

public interface MachineTypeDao {
    MachineType getMachineType(int id);
    List<MachineType> getAllMachineTypes();
    void createMachineType(MachineType machineType);
    void updateMachineType(MachineType machineType);
    void deleteMachineType(int id);
}
