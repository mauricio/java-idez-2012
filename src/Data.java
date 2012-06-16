import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class Data {

	private Calendar calendar = Calendar.getInstance();
	
	public int getDia() {
		return this.calendar.get( Calendar.DAY_OF_MONTH );
	}
	
	public void setDia(int dia) {
		this.calendar.set( Calendar.DAY_OF_MONTH , dia);
	}
	
	public int getMes() {
		return this.calendar.get( Calendar.MONTH ) + 1;
	}
	
	public void setMes( int mes) {
		this.calendar.set( Calendar.MONTH, mes - 1 );
	}
	
	public int getAno() {
		return this.calendar.get( Calendar.YEAR );
	}
	
	public void setAno(int ano) {
		this.calendar.set(Calendar.YEAR, ano);
	}
	
	@Override
	public String toString() {		
		DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		
		return format.format( this.calendar.getTime() );
	}
	
}
