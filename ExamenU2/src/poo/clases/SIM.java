package poo.clases;
import java.time.LocalDate;
public class SIM {
	
	public SIM(String string, float saldo, LocalDate localDate, LocalDate fechaUltimaRecarga) {
		super();
		this.numero = numero;
		this.saldo = saldo;
		this.ultimaRecarga = localDate;
		this.fechaUltimaRecarga = fechaUltimaRecarga;
	}
	
		// TODO Auto-generated constructor stub
	
	public SIM(int numero2, int saldo2, LocalDate of, LocalDate of2) {
		// TODO Auto-generated constructor stub
	}

	private long numero;
	private float saldo;
	private LocalDate ultimaRecarga;
	private LocalDate fechaUltimaRecarga;
	public long getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
		if(numero>10) {
			System.out.println("El numero es valido");
		if(numero<10){
			System.out.println("El numero no es valido");
		}
		}
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public LocalDate getUltimaRecarga() {
		return ultimaRecarga;
	}
	public void setUltimaRecarga(LocalDate ultimaRecarga) {
		this.ultimaRecarga = ultimaRecarga;
	}
	public LocalDate getFechaUltimaRecarga() {
		return fechaUltimaRecarga;
	}
	public void setFechaUltimaRecarga(LocalDate fechaUltimaRecarga) {
		this.fechaUltimaRecarga = fechaUltimaRecarga;
	}
	public void hacerRecarga(int cantidad) {
		cantidad=cantidad;
		
	}
	@Override
	public String toString() {
		return "SIM [numero=" + numero + ", saldo=" + saldo + ", ultimaRecarga=" + ultimaRecarga
				+ ", fechaUltimaRecarga=" + fechaUltimaRecarga + "]";
	}


public static void main(String[] args) {
	
	System.out.println(new SIM(2731017567, 50, LocalDate.of(2001, 04, 28),
			LocalDate.of(2021, 05, 12)));
}
}

