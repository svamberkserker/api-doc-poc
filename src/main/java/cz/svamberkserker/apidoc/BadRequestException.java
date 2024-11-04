package cz.svamberkserker.apidoc;

public class BadRequestException extends Exception {
    public BadRequestException(String message) {
        super(message);
    }
}
