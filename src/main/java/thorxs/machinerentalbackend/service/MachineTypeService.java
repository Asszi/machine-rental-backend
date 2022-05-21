package thorxs.machinerentalbackend.service;

import thorxs.machinerentalbackend.model.MachineType;

import java.util.List;

public interface MachineTypeService {
    List<MachineType> listMachineTypes();
    MachineType getMachineType(int id);
    void createMachineType(MachineType machineType);
    void modifyMachineType(MachineType machineType);
    void deleteMachineType(MachineType machineType);
}
