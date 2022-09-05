package co.com.practice.motorcyclescompany.service;

import java.util.List;
import org.springframework.stereotype.Service;

import co.com.practice.motorcyclescompany.model.MotorCycle;
import co.com.practice.motorcyclescompany.repository.MotorCycleRepository;

@Service
public class MotorCycleService {
    
    private final MotorCycleRepository motorCycleRepository;

    public MotorCycleService(MotorCycleRepository motorCycleRepository) {
        this.motorCycleRepository = motorCycleRepository;
    }

    public List<MotorCycle> getAllMotorCycle(){
        return motorCycleRepository.getAll();
    }

    public MotorCycle getMotorcycleId(String motorCycleId){
        return motorCycleRepository.get(motorCycleId);
    }

    public List<MotorCycle> getMotorCycleByBrand(String brand){
        return motorCycleRepository.findByBrand(brand);
    }

    public MotorCycle addMotorCycle(MotorCycle motorCycle){
        return motorCycleRepository.save(motorCycle);
    }   

    public MotorCycle updateMotorCycle(String motorCycleId, MotorCycle motorCycle){
        MotorCycle motorCycle2 = motorCycleRepository.get(motorCycleId);
        if(motorCycle2 == null){
            return null;
        }
        else{
        motorCycle.setMotorcycleId(motorCycleId);
        return motorCycleRepository.save(motorCycle);
        }
    }
        
    public MotorCycle deleteMotorCycle(String id){
        return motorCycleRepository.delete(id);
    }        
            
}
