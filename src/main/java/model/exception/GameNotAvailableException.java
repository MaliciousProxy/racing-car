package model.exception;

public class GameNotAvailableException extends RuntimeException {
    public GameNotAvailableException() {
        super("게임이 가능하지 않은");
    }
}
