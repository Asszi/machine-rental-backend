package thorxs.machinerentalbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import thorxs.machinerentalbackend.model.Machine;
import thorxs.machinerentalbackend.service.MachineService;

import java.util.List;

@Controller
public class MachineController {
    public final MachineService machineService;

    @Autowired
    public MachineController(MachineService machineService) {
        this.machineService = machineService;
    }

    @RequestMapping("/machine/getAll")
    @ResponseBody
    public List<Machine> getBrandList() {
        return machineService.listAllMachines();
    }

    @RequestMapping("/machine/{id}")
    @ResponseBody
    public Machine getBrand(@PathVariable String id) {
        return machineService.getMachine(Integer.parseInt(id));
    }

    @RequestMapping("/machine/modify")
    @ResponseBody
    public String modifyBrand(@RequestBody() Machine machine) {
        machineService.modifyMachine(machine);

        return "Success";
    }

    @RequestMapping("/machine/create")
    @ResponseBody
    public String createBrand(@RequestBody Machine machine) {
        machineService.createNewMachine(machine);

        return "Success";
    }

    @RequestMapping("/machine/delete/{id}")
    @ResponseBody
    public String deleteBrand(@PathVariable String id) {
        machineService.deleteMachine(Integer.parseInt(id));

        return "Success";
    }

    //TODO: Exception handling
}
