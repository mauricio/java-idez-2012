package banco;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Agencia {

	private List<Conta> contas = new ArrayList<Conta>();
	
    public boolean addConta( Conta conta ) {
    	
    		if ( conta.getSaldo().compareTo( BigDecimal.ZERO ) > 0 ) {
    			this.contas.add( conta );
    			return true;
    		} else {
    			return false;
    		}
    	
    }
    
    public List<Conta> getContas() {
    		return this.contas;
    }
    
}

