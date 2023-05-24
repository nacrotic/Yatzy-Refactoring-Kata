package net.leoperrin.nickel.yatze.exception;

public class EvaluatorException extends RuntimeException {
	public EvaluatorException(String message) {
		super(message);
	}

	public EvaluatorException(String message, Throwable cause) {
		super(message, cause);
	}
}
