package retry;

public abstract class RetryService<R> {

	private int times;
	private R result;

	public RetryService() {
		this(3);
	}

	public RetryService(int times) {
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

	public final R get() {
		return this.result;
	}
	
	protected abstract R perform() throws Exception;

}