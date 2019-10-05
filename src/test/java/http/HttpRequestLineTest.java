package http;

import http.request.HttpMethod;
import http.request.HttpRequestLine;
import http.request.HttpUri;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HttpRequestLineTest {

    @Test
    void 시작줄_정상_생성() {
        assertDoesNotThrow(() ->
                new HttpRequestLine(HttpMethod.GET, new HttpUri("/index.html"), HttpVersion.V_1_1));
    }

    @Test
    void 시작줄_정보_가져오기() {
        HttpRequestLine requestLine = new HttpRequestLine(HttpMethod.GET, new HttpUri("/index.html"), HttpVersion.V_1_1);

        assertEquals(requestLine.toString(), "GET /index.html HTTP/1.1\r\n");
    }
}
