package bsu.gof.factory;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestFactory {

@Test
public void testMACComputer() {
ComputerFactory factory = ComputerFactory.getInstance(ComputerType.MAC);
Computer comp = factory.createComputer();
comp.setCpu(factory.createCPU());
comp.setMotheboard(factory.createMotheboard());
comp.setRom(factory.createROM());

assertTrue(comp.getType() == ComputerType.MAC);

}
@Test
public void testPCComputer() {
ComputerFactory factory = ComputerFactory.getInstance(ComputerType.PC);
Computer comp = factory.createComputer();
comp.setCpu(factory.createCPU());
comp.setMotheboard(factory.createMotheboard());
comp.setRom(factory.createROM());

assertTrue(comp.getType() == ComputerType.PC);

}

@Test
public void testSPARCComputer() {
ComputerFactory factory = ComputerFactory.getInstance(ComputerType.SPARC);
Computer comp = factory.createComputer();
comp.setCpu(factory.createCPU());
comp.setMotheboard(factory.createMotheboard());
comp.setRom(factory.createROM());

assertTrue(comp.getType() == ComputerType.SPARC);

}

}
