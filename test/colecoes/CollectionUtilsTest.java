package colecoes;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;

public class CollectionUtilsTest {

	@Test
	public void testFoldNumeros() {

		FoldLeft<Integer, Integer> f = new FoldLeft<Integer, Integer>() {

			@Override
			public Integer foldLeft(Integer o, Integer e) {

				if (o == null) {
					return e;
				} else {
					return o.intValue() + e.intValue();
				}

			}
		};

		Collection<Integer> inteiros = new ArrayList<Integer>();
		inteiros.add(1);
		inteiros.add(2);
		inteiros.add(3);

		Assert.assertTrue(new Integer(6).equals(CollectionUtils.foldLeft(
				inteiros, f)));
	}

}
