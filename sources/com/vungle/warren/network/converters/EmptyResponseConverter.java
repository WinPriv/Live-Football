package com.vungle.warren.network.converters;

import okhttp3.ResponseBody;

/* loaded from: classes2.dex */
public class EmptyResponseConverter implements Converter<ResponseBody, Void> {
    @Override // com.vungle.warren.network.converters.Converter
    public Void convert(ResponseBody responseBody) {
        responseBody.close();
        return null;
    }
}
