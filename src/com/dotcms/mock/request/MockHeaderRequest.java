package com.dotcms.mock.request;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class MockHeaderRequest extends HttpServletRequestWrapper implements MockRequest {
    final Map<String, String> headers = new HashMap<String, String>();


    public MockHeaderRequest(HttpServletRequest request) {
        super(request);
    }

    public MockHeaderRequest(HttpServletRequest request, final String key, final String value) {
        super(request);
        headers.put(key, value);
    }

    public HttpServletRequest request() {
        return this;
    }

    @Override
    public String getHeader(String name) {

        return headers.get(name);
    }

    @Override
    public Enumeration<String> getHeaderNames() {
        return new Vector<String>(headers.keySet()).elements();
    }


    public void setHeader(final String name, final String o) {
        headers.put(name, o);
    }

    @Override
    public Enumeration<String> getHeaders(final String name) {

        return super.getHeaders(name);
    }


}
