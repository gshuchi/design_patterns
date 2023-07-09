package Factory.Factory;

import Factory.Bean.Computer;
import Factory.Bean.PC;
import Factory.Bean.Server;

public class ComputerFactory {

    public static Computer createComputer(ComputerType type, String ram, String hdd, String cpu){

        Computer computer = null;
        switch(type){
            case PC :
                computer = new PC(ram, hdd, cpu);
                break;
            case SERVER :
                computer = new Server(ram, hdd, cpu);
        }
        return computer;
    }
}
