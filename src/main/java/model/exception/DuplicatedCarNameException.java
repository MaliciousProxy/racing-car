package model.exception;

public class DuplicatedCarNameException extends RuntimeException {
    public DuplicatedCarNameException() {
        super("이름 중복");
    }
}
