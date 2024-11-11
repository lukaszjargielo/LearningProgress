package pl.futurejavacode.enums;

public class Main {
    public static void main(String[] args) {
        DaysOfWeek day = DaysOfWeek.FRIDAY;

        if(day == DaysOfWeek.FRIDAY) {
            System.out.println("It's Friday then...");
        }

        RequestHandler requestHandler = new RequestHandler();
        System.out.println(requestHandler.getClass());
        System.out.println(requestHandler.toString());
        System.out.println(requestHandler.handleRequest());

        StatusCode statusCode = requestHandler.handleRequest();
        int code = statusCode.getCode();
        System.out.println(code);
        System.out.println(statusCode.name());

        StatusCode[] values = StatusCode.values();
        for (StatusCode value : values) {
            System.out.println(value);
        }

        System.out.println(statusCode.getClass());
        System.out.println(statusCode.toString());
    }
}
