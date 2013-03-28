package bsu.gof.factory;

public class SPARCFactory extends ComputerFactory {
	public Computer createComputer() {
		return new SPARCComputer();
		}
		public Motheboard createMotheboard() {
		return new SPARCMotherboard();
		}
		public ROM createROM() {
		return new SPARCRom();
		}
		public CPU createCPU() {
		return new SPARCCPU();
		}
}
