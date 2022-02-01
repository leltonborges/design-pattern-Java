package org.com.db.http;

import java.util.Map;

public interface HttpAdapter {
    void post(String url, Map<String, Object> dados);
}
