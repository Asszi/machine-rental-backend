package thorxs.machinerentalbackend.persist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import thorxs.machinerentalbackend.model.Machine;

import java.util.*;

@Component
public class MachineDaoImpl implements MachineDao {
    private Map<Integer, Machine> machineMap;

    @Autowired
    public void MachineDao() {
        machineMap = new HashMap<>();
        machineMap.put(1, new Machine(1, 1, "Test tool", 1, 100, 12.1, 5000, 15000));
        machineMap.put(2, new Machine(2, 2, "Another tool", 2, 50, 5.6, 3000, 10000));
        machineMap.put(3, new Machine(3, 3, "Just a tool", 3, 75, 10, 12000, 50000));
    }

    @Override
    public Machine getMachine(int id) {
        return machineMap.get(id);
    }

    @Override
    public List<Machine> getAllMachines() {
        return new ArrayList<>(machineMap.values());
    }

    @Override
    public void createMachine(Machine machine) {
        int randomId = new Random().nextInt(Integer.SIZE - 1);
        machine.setId(randomId);
        machineMap.put(randomId, machine);
    }

    @Override
    public void updateMachine(Machine machine) {
        machineMap.replace(machine.getId(), machine);
    }

    @Override
    public void deleteMachine(int id) {
        machineMap.remove(id);
    }
}
