package retry;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class RetryMain {

	public static void main(String[] args) throws Exception {

		final URL url = new URL("https://www.uol.com.br/");
		
		RetryService<String> retry = new RetryService<String>() {

			@Override
			protected String perform() throws Exception {				
				URLConnection connection	= url.openConnection();
				InputStream stream = connection.getInputStream();
				StringBuilder builder = new StringBuilder();

				int read = -1;

				while ((read = stream.read()) > -1) {
					builder.append((char) read);
				}

				stream.close();

				return builder.toString();
			}

		};

		String result = retry.get();
		System.out.println(result);

		RetryService<Double> newRetry = new RetryService<Double>() {
			
			@Override
			protected Double perform() throws Exception {
				return Math.sqrt( 117119819018.0 );
			}			
			
		};
		
		Double d2 = newRetry.get();
		
		OldRetryService doubleRetry = new OldRetryService() {
			
			@Override
			protected Object perform() throws Exception {
				return "";
			}
		};
		
		Double d = (Double) doubleRetry.get();
		
		System.out.println(d);
		
	}

}
