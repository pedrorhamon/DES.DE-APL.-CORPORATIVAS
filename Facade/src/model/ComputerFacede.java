package model;

public class ComputerFacede {
	private Memoria memoria;
	private Cpu cpu;
	private SO so;
	private Acessorios acessorios;
	private HD hd;
	
	public ComputerFacede() {
		this.memoria = new Memoria();
		this.cpu = new Cpu();
		this.so = new SO();
		this.acessorios = new Acessorios();
		this.hd = new HD();
	}
	public void MontarPC() {
		
		System.out.println("Montando uma máquina nova!!!\n");
		memoria.AdicionarMemoria();
		hd.AdicionarHD();
		cpu.AdicionarCPU();
		acessorios.AdicionarAcessorios();
		so.AdicionarSo();
		
		System.out.println("\nComputador montado!!!");
	}

}
