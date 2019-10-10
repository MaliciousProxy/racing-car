package model.exception;

public class NotFoundMaxPositionException extends RuntimeException{
    public NotFoundMaxPositionException() {
        super("경주하는 자동차가 없어 최댓값을 구하지 못할 때 발생한다.");
    }
}
