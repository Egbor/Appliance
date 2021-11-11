package by.tc.task01.error;

import by.tc.task01.error.impl.FatalErrorHandlerImpl;

public class FatalErrorFactory {
	private static final FatalErrorFactory instance = new FatalErrorFactory();
	
	private final FatalErrorHandler fatalErrorHandler = new FatalErrorHandlerImpl();
	
	private FatalErrorFactory() {}
	
	/**
	 * Return current fatal error implementation
	 * 
	 * @return implemented FatalErrorHandler object
	 **/
	public FatalErrorHandler getFatalErrorHandler() {
		return fatalErrorHandler;
	}
	
	/**
	 * Return instance of this factory
	 * 
	 * @return instance of this FatalErrorFactory
	 */
	public static FatalErrorFactory getInstance() { 
		return instance;
	}
}
