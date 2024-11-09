package pl.futurejavacode.enums;

public enum StatusCode {
    NOT_FOUND(400),
    NOT_CREATED(300),
    NOT_AUTHORIZED(200),
    OK(0);

    private final int code;

    StatusCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
