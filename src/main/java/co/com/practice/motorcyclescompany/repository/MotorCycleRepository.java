package co.com.practice.motorcyclescompany.repository;

import java.util.List;
import co.com.practice.motorcyclescompany.model.MotorCycle;

public interface MotorCycleRepository {
    public List<MotorCycle> getAll();
    public MotorCycle get(String motorcycleId);
    public List<MotorCycle> findByBrand(String brand);
    public MotorCycle save(MotorCycle motorCycle);
    public MotorCycle delete(String motorcycleId);

}
