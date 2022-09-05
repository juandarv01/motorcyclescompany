package co.com.practice.motorcyclescompany.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import co.com.practice.motorcyclescompany.model.MotorCycle;

@Repository
public class MotorCycleDBRepository implements MotorCycleRepository{

    private Map<String, MotorCycle> motorCycleMap;

    public MotorCycleDBRepository(){
        motorCycleMap = new HashMap<>();
    }


    @Override
    public List<MotorCycle> getAll() {
        List<MotorCycle> motorCycles = new ArrayList<>();
        motorCycles.addAll(motorCycleMap.values());
        return motorCycles;
    }

    @Override
    public MotorCycle get(String motorcycleId) {
        return motorCycleMap.get(motorcycleId);
    }

    @Override
    public List<MotorCycle> findByBrand(String brand) {
        List<MotorCycle> mot = new ArrayList<>();
        for(String motorcycleId : motorCycleMap.keySet()){
            MotorCycle motorCycle = motorCycleMap.get(motorcycleId);
            if (motorCycle.getMarca().equals(brand)){  
                mot.add(motorCycle);
            }
        }
        return mot;
    }

    @Override
    public MotorCycle save(MotorCycle motorCycle) {
        if (motorCycle.getMotorcycleId()==null){
            motorCycle.setMotorcycleId(String.valueOf(System.currentTimeMillis()));
        }
        motorCycleMap.put(motorCycle.getMotorcycleId(),motorCycle);
        return motorCycle;
    }

    @Override
    public MotorCycle delete(String motorcycleId) {
        return motorCycleMap.remove(motorcycleId);
    }
    
}
