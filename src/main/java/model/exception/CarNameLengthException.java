package model.exception;

public class CarNameLengthException extends RuntimeException {
    public CarNameLengthException() {
        super("이름의 길이는 0 ~ 5");
    }
}
