package by.tc.task01.error.impl;

import by.tc.task01.error.FatalErrorHandler;

public class FatalErrorHandlerImpl implements FatalErrorHandler {
	
	/**
	 * Handle error with specified message and error code
	 * 
	 * @param message - error massage
	 * @param errorCode - error code
	 */
	@Override
	public void handle(String message, int errorCode) {
		System.out.printf("Fatal error(%d): %s\n", errorCode, message);
		System.exit(errorCode);
	}
}
