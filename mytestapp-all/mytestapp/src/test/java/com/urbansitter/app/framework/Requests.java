package com.urbansitter.app.framework;

import com.urbansitter.app.json.SearchRequest;

public class Requests {
    public static SearchRequest createSearchRequest() {
        SearchRequest req = new SearchRequest();
        req.setQuery("my query");
        return req;
    }
}
