package com.vungle.warren.network;

import android.text.TextUtils;
import com.vungle.warren.network.converters.Converter;
import com.vungle.warren.network.converters.EmptyResponseConverter;
import com.vungle.warren.network.converters.JsonConverter;
import java.util.Map;
import m8.q;
import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

/* loaded from: classes2.dex */
public class VungleApiImpl implements VungleApi {
    private static final String CONFIG = "config";
    String appId;
    HttpUrl baseUrl;
    Call.Factory okHttpClient;
    private static final Converter<ResponseBody, q> jsonConverter = new JsonConverter();
    private static final Converter<ResponseBody, Void> emptyResponseConverter = new EmptyResponseConverter();

    public VungleApiImpl(HttpUrl httpUrl, Call.Factory factory) {
        this.baseUrl = httpUrl;
        this.okHttpClient = factory;
    }

    private <T> Call<T> createNewGetCall(String str, String str2, Map<String, String> map, Converter<ResponseBody, T> converter) {
        HttpUrl.Builder newBuilder = HttpUrl.get(str2).newBuilder();
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                newBuilder.addQueryParameter(entry.getKey(), entry.getValue());
            }
        }
        return new OkHttpCall(this.okHttpClient.newCall(defaultBuilder(str, newBuilder.build().toString()).get().build()), converter);
    }

    private Call<q> createNewPostCall(String str, String str2, q qVar) {
        String str3;
        if (qVar != null) {
            str3 = qVar.toString();
        } else {
            str3 = "";
        }
        return new OkHttpCall(this.okHttpClient.newCall(defaultBuilder(str, str2).post(RequestBody.create((MediaType) null, str3)).build()), jsonConverter);
    }

    private Request.Builder defaultBuilder(String str, String str2) {
        Request.Builder addHeader = new Request.Builder().url(str2).addHeader("User-Agent", str).addHeader("Vungle-Version", "5.10.0").addHeader("Content-Type", "application/json");
        if (!TextUtils.isEmpty(this.appId)) {
            addHeader.addHeader("X-Vungle-App-Id", this.appId);
        }
        return addHeader;
    }

    @Override // com.vungle.warren.network.VungleApi
    public Call<q> ads(String str, String str2, q qVar) {
        return createNewPostCall(str, str2, qVar);
    }

    @Override // com.vungle.warren.network.VungleApi
    public Call<q> cacheBust(String str, String str2, q qVar) {
        return createNewPostCall(str, str2, qVar);
    }

    @Override // com.vungle.warren.network.VungleApi
    public Call<q> config(String str, q qVar) {
        return createNewPostCall(str, this.baseUrl.toString() + CONFIG, qVar);
    }

    @Override // com.vungle.warren.network.VungleApi
    public Call<Void> pingTPAT(String str, String str2) {
        return createNewGetCall(str, str2, null, emptyResponseConverter);
    }

    @Override // com.vungle.warren.network.VungleApi
    public Call<q> reportAd(String str, String str2, q qVar) {
        return createNewPostCall(str, str2, qVar);
    }

    @Override // com.vungle.warren.network.VungleApi
    public Call<q> reportNew(String str, String str2, Map<String, String> map) {
        return createNewGetCall(str, str2, map, jsonConverter);
    }

    @Override // com.vungle.warren.network.VungleApi
    public Call<q> ri(String str, String str2, q qVar) {
        return createNewPostCall(str, str2, qVar);
    }

    @Override // com.vungle.warren.network.VungleApi
    public Call<q> sendBiAnalytics(String str, String str2, q qVar) {
        return createNewPostCall(str, str2, qVar);
    }

    @Override // com.vungle.warren.network.VungleApi
    public Call<q> sendLog(String str, String str2, q qVar) {
        return createNewPostCall(str, str2, qVar);
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    @Override // com.vungle.warren.network.VungleApi
    public Call<q> willPlayAd(String str, String str2, q qVar) {
        return createNewPostCall(str, str2, qVar);
    }
}
