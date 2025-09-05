package dev.kieuanh.SpringBootFullSkill.exception;

public class ResourceNotFoundExcetion extends RuntimeException {
    public ResourceNotFoundExcetion(String message, Throwable cause) {
        super(message, cause);
    }

    public ResourceNotFoundExcetion(String message) {
        super(message);
    }
}
