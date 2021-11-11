package by.tc.task01.error;

public interface FatalErrorHandler {
	/**
	 * Handle error with specified message and error code
	 * 
	 * @param message - error massage
	 * @param errorCode - error code
	 */
	void handle(String message, int errorCode);
}
