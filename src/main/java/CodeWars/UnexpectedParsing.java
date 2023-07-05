package CodeWars;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UnexpectedParsing {

    public static HashMap <String, String> getStatus(boolean isBusy) {
        HashMap<String, String> status = new HashMap<>();

        if (isBusy) {
            status.put("status", "busy");
        } else {
            status.put("status", "available");
        }

        return status;
    }

    @Test
    public void test() {
        assertEquals("busy", UnexpectedParsing.getStatus(true).get("status"));
        assertEquals("available", UnexpectedParsing.getStatus(false).get("status"));
    }

}