package co.com.practice.motorcyclescompany.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import co.com.practice.motorcyclescompany.model.MotorCycle;
import co.com.practice.motorcyclescompany.service.MotorCycleService;

@RestController
@RequestMapping({"/api"})
public class MotorCycleController {
    
    private final MotorCycleService motorCycleService;

    public MotorCycleController(MotorCycleService motorCycleService){
        this.motorCycleService = motorCycleService;
    }

    @GetMapping("/getAllMotorCycle")
    public List<MotorCycle> getAll(){
        return this.motorCycleService.getAllMotorCycle();
    }

    @GetMapping("/getMotorcycleId/{id}")
    public MotorCycle get(@PathVariable String id){
        return motorCycleService.getMotorcycleId(id);
    }

    @PostMapping("/saveMotorCycle")
    public MotorCycle addMotorCycle(@RequestBody MotorCycle motorCycle){
        return this.motorCycleService.addMotorCycle(motorCycle);
    }

    @GetMapping("/{getMotorCycleByBrand}")
    public List<MotorCycle> getMotorCycleByBrand(@RequestParam String brand){
        return this.motorCycleService.getMotorCycleByBrand(brand);
    }

    @GetMapping("/deleteMotorCycle/{id}")
    public MotorCycle deleteMotorCycleById(@PathVariable String id){
        return this.motorCycleService.deleteMotorCycle(id);
    }




    

}
