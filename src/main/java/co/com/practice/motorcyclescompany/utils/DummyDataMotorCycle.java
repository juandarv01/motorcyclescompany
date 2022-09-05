package co.com.practice.motorcyclescompany.utils;

import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;
import co.com.practice.motorcyclescompany.model.MotorCycle;
import co.com.practice.motorcyclescompany.service.MotorCycleService;

@Component
public class DummyDataMotorCycle {
    private final MotorCycleService motorCycleService;

    public DummyDataMotorCycle(MotorCycleService motorCycleService) {
        this.motorCycleService = motorCycleService;
    }

    @PostConstruct
    public void init(){
        motorCycleService.addMotorCycle(new MotorCycle(null, "Versys X", "KAWASAKI", "2023", "300", 24000000));
        try{Thread.sleep(100);} catch(InterruptedException e) {}
        motorCycleService.addMotorCycle(new MotorCycle(null, "GS", "BMW", "2022", "310", 27000000));
        try{Thread.sleep(100);} catch(InterruptedException e) {}
        motorCycleService.addMotorCycle(new MotorCycle(null, "XRE", "HONDA", "2023", "300", 22000000));
        try{Thread.sleep(100);} catch(InterruptedException e) {}
        motorCycleService.addMotorCycle(new MotorCycle(null, "Versys", "KAWASAKI", "2023", "650", 44000000));
        try{Thread.sleep(100);} catch(InterruptedException e) {}
        motorCycleService.addMotorCycle(new MotorCycle(null, "F850 GS", "BMW", "2023", "850", 86000000));
        try{Thread.sleep(100);} catch(InterruptedException e) {}
        motorCycleService.addMotorCycle(new MotorCycle(null, "F750 GS", "BMW", "2023", "750", 76000000));
        try{Thread.sleep(100);} catch(InterruptedException e) {}
    }
}
