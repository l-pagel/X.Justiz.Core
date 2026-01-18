package de.xjustiz.core.serialization;

/**
 * Exception thrown when serialization or deserialization fails.
 */
public class SerializationException extends RuntimeException {

    /**
     * Constructs a new SerializationException with the specified message.
     *
     * @param message the error message
     */
    public SerializationException(String message) {
        super(message);
    }

    /**
     * Constructs a new SerializationException with the specified message and cause.
     *
     * @param message the error message
     * @param cause   the underlying cause
     */
    public SerializationException(String message, Throwable cause) {
        super(message, cause);
    }
}
