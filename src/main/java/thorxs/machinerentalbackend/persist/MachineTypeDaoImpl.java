package thorxs.machinerentalbackend.persist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import thorxs.machinerentalbackend.model.MachineType;

import java.util.*;

@Component
public class MachineTypeDaoImpl implements MachineTypeDao {
    private Map<Integer, MachineType> machineTypeMap;

    @Autowired
    public void MachineTypeDao() {
        machineTypeMap = new HashMap<>();
        machineTypeMap.put(1, new MachineType(1, "Drill"));
        machineTypeMap.put(2, new MachineType(2, "Hammer"));
        machineTypeMap.put(3, new MachineType(3, "Grinder"));
        machineTypeMap.put(4, new MachineType(4, "Sander"));
    }

    @Override
    public MachineType getMachineType(int id) {
        return machineTypeMap.get(id);
    }

    @Override
    public List<MachineType> getAllMachineTypes() {
        return new ArrayList<MachineType>(machineTypeMap.values());
    }

    @Override
    public void createMachineType(MachineType machineType) {
        int randomId = new Random().nextInt(Integer.SIZE - 1);
        machineType.setId(randomId);
        machineTypeMap.put(randomId, machineType);
    }

    @Override
    public void updateMachineType(MachineType machineType) {
        machineTypeMap.replace(machineType.getId(), machineType);
    }

    @Override
    public void deleteMachineType(MachineType machineType) {
        machineTypeMap.remove(machineType.getId());
    }
}
