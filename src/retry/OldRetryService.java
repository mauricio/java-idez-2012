package retry;

public abstract class OldRetryService {

	private int times;
	private Object result;

	public OldRetryService() {
		this(3);
	}

	public OldRetryService(int times) {
		this.times = times;
		this.run();
	}

	private void run() {

		int count = 0;
		Exception lastException = null;

		while (count < this.times) {
			try {
				System.out.printf("Executando tentativa %d%n", count);
				this.result = this.perform();
				lastException = null;
				break;
			} catch (Exception e) {
				e.printStackTrace();
				lastException = e;
				count++;
			}
		}

		if ( lastException != null ) {
			throw new IllegalStateException(
					"Não foi possível executar a chamada", 
					lastException);
		}
		
	}

	public Object get() {
		return this.result;
	}
	
	protected abstract Object perform() throws Exception;

}