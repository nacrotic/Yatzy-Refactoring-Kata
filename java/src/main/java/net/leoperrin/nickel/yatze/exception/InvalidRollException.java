package net.leoperrin.nickel.yatze.exception;

public class InvalidRollException extends RuntimeException {

	public InvalidRollException(String message) {
		super(message);
	}

	public InvalidRollException(String message, Throwable cause) {
		super(message, cause);
	}
}
