package com.sjtu.pattern.structural.facade;

/**
 * 外观模式（Facade）:
 * 外观模式是为了解决类与类之家的依赖关系的，像spring一样，可以将类和类之间
 * 的关系配置到配置文件中，而外观模式就是将他们的关系放在一个Facade类中，降
 * 低了类类之间的耦合度，该模式中没有涉及到接口，（我们以一个计算机的启动过程为例）
 * 
 * @author CharlesZhu
 *
 */
public class Computer {

	private CPU cpu;  
    private Memory memory;  
    private Disk disk;  
      
    public Computer(){  
        cpu = new CPU();  
        memory = new Memory();  
        disk = new Disk();  
    }  
      
    public void startup(){  
        System.out.println("start the computer!");  
        cpu.startup();  
        memory.startup();  
        disk.startup();  
        System.out.println("start computer finished!");  
    }  
      
    public void shutdown(){  
        System.out.println("begin to close the computer!");  
        cpu.shutdown();  
        memory.shutdown();  
        disk.shutdown();  
        System.out.println("computer closed!");  
    }  
    
    
    
    public static void main(String[] args) {  
        Computer computer = new Computer();  
        computer.startup();  
        computer.shutdown();  
    }  
}
