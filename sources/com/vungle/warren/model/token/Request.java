package com.vungle.warren.model.token;

import com.vungle.warren.model.Cookie;
import java.util.List;
import n8.b;

/* loaded from: classes2.dex */
public class Request {

    @b(Cookie.CONFIG_EXTENSION)
    public String configExtension;

    @b("ordinal_view")
    private Integer ordinalView;

    @b("precached_tokens")
    private List<String> preCachedToken;

    @b("sdk_user_agent")
    private String sdkUserAgent;

    public Request(String str, Integer num, List<String> list, String str2) {
        this.configExtension = str;
        this.ordinalView = num;
        this.preCachedToken = list;
        this.sdkUserAgent = str2;
    }
}
