package Factory.Runner;

import Factory.Bean.Computer;
import Factory.Factory.ComputerFactory;
import Factory.Factory.ComputerType;

public class RunnerClientClass {

    public static void main(String[] args) {
        Computer PC = ComputerFactory.createComputer(ComputerType.PC, "8GB", "256GB", "Apple M2");
        System.out.println("PC instance created successfully");
        Computer Server = ComputerFactory.createComputer(ComputerType.SERVER, "16GB", "512GB", "Apple M2 Ultra");
        System.out.println("Server instance created successfully");
    }
}
