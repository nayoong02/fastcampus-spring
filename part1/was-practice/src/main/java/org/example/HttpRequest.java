package org.example;

import java.io.BufferedReader;
import java.io.IOException;

public class HttpRequest {

    private final RequestLine requestLine;
    // private final HttpHeaders httpHeaders;
    // private final Body body;

    public HttpRequest(BufferedReader br) throws IOException {
        this.requestLine = new RequestLine(br.readLine());

    }

    // GET method인지 체크
    public boolean isGetRequest() {
        return requestLine.isGetRequest();
    }

    public QueryStrings getQueryStrings() {
        return requestLine.getQueryStrings();
    }

    // 요청한 url이 제대로 들어왔는지 체크
    public boolean matchPath(String requestPath) {
        return requestLine.matchPath(requestPath);
    }
}
