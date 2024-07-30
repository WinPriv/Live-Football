package com.vungle.warren.network;

import okhttp3.Call;
import okhttp3.HttpUrl;
import s.f;

/* loaded from: classes2.dex */
public class APIFactory {
    private static final String TAG = "APIFactory";
    private HttpUrl baseUrl;
    private Call.Factory okHttpClient;

    public APIFactory(Call.Factory factory, String str) {
        HttpUrl httpUrl = HttpUrl.get(str);
        this.baseUrl = httpUrl;
        this.okHttpClient = factory;
        if ("".equals(httpUrl.pathSegments().get(r2.size() - 1))) {
        } else {
            throw new IllegalArgumentException(f.b("baseUrl must end in /: ", str));
        }
    }

    public VungleApi createAPI(String str) {
        VungleApiImpl vungleApiImpl = new VungleApiImpl(this.baseUrl, this.okHttpClient);
        vungleApiImpl.setAppId(str);
        return vungleApiImpl;
    }
}
