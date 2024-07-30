package com.vungle.warren.network.converters;

import java.io.IOException;
import m8.i;
import m8.j;
import m8.q;
import okhttp3.ResponseBody;

/* loaded from: classes2.dex */
public class JsonConverter implements Converter<ResponseBody, q> {
    private static final i gson = new j().a();

    @Override // com.vungle.warren.network.converters.Converter
    public q convert(ResponseBody responseBody) throws IOException {
        try {
            return (q) gson.b(q.class, responseBody.string());
        } finally {
            responseBody.close();
        }
    }
}
