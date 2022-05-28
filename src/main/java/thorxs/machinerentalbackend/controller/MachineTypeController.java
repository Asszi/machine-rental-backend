package thorxs.machinerentalbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import thorxs.machinerentalbackend.model.MachineType;
import thorxs.machinerentalbackend.service.MachineTypeService;

import java.util.List;

@Controller
public class MachineTypeController {
    private final MachineTypeService machineTypeService;

    @Autowired
    public MachineTypeController(MachineTypeService machineTypeService) { this.machineTypeService = machineTypeService; }

    @RequestMapping("/machineType/getAll")
    @ResponseBody
    public List<MachineType> getMachineTypeList() {
        return machineTypeService.listMachineTypes();
    }

    @RequestMapping("/machineType/{id}")
    @ResponseBody
    public MachineType getMachineType(@PathVariable String id) {
        return  machineTypeService.getMachineType(Integer.parseInt(id));
    }

    @RequestMapping("/machineType/modify")
    @ResponseBody
    public String modifyMachineType(@RequestBody() MachineType machineType) {
        machineTypeService.modifyMachineType(machineType);

        return "Success";
    }

    @RequestMapping("/machineType/create")
    @ResponseBody
    public String createMachineType(@RequestBody MachineType machineType) {
        machineTypeService.createNewMachineType(machineType);

        return "Success";
    }

    @RequestMapping("/machineType/delete/{id}")
    @ResponseBody
    public String deleteMachineType(@PathVariable String id) {
        machineTypeService.deleteMachineType(Integer.parseInt(id));

        return "Success";
    }

    //TODO: Exception handling
}
