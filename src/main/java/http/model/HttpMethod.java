package http.model;

import http.supoort.IllegalHttpRequestException;
import http.supoort.NotSupportedHTTPMethod;

public enum HttpMethod {
    GET,
    POST,
    PUT,
    DELETE;

    public static void match(HttpMethod method, HttpRequest httpRequest) {
        if (httpRequest.getMethod() != method) {
            throw new NotSupportedHTTPMethod();
        }
    }

    public static HttpMethod of(String method) {
        try {
            return HttpMethod.valueOf(method);
        }catch (IllegalArgumentException e) {
            throw new IllegalHttpRequestException(e.getMessage());
        }
    }
}
