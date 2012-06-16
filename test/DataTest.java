import org.junit.Assert;

import org.junit.Test;

public class DataTest {

	@Test
	public void testDataAtual() {
		Data data = new Data();
		
		data.setDia( 26 );
		data.setMes(5);
		data.setAno(2012);
		
		Assert.assertEquals( "26/05/2012" , data.toString());
	}

}