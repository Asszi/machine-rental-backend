package thorxs.machinerentalbackend.service;

import thorxs.machinerentalbackend.model.MachineType;

import java.util.List;

public interface MachineTypeService {
    List<MachineType> listMachineTypes();
    MachineType getMachineType(int id);
    void createNewMachineType(MachineType machineType);
    void modifyMachineType(MachineType machineType);
    void deleteMachineType(int id);
}
