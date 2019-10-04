package model.exception;

public class WrongPositionException extends RuntimeException {
    public WrongPositionException() {
        super("0 이하는 허용하지 않습니다.");
    }
}
