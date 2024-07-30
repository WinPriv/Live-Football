package com.ironsource.sdk.a;

import android.content.Context;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class b implements com.ironsource.a.c {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f25985a = new HashMap();

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public String f25986a;

        /* renamed from: b, reason: collision with root package name */
        public String f25987b;

        /* renamed from: c, reason: collision with root package name */
        public Context f25988c;

        /* renamed from: d, reason: collision with root package name */
        public String f25989d;
    }

    public b(a aVar, byte b10) {
        Context context = aVar.f25988c;
        com.ironsource.sdk.utils.a a10 = com.ironsource.sdk.utils.a.a(context);
        HashMap hashMap = f25985a;
        hashMap.put("deviceos", SDKUtils.encodeString(a10.f26564c));
        hashMap.put("deviceosversion", SDKUtils.encodeString(a10.f26565d));
        hashMap.put("deviceapilevel", Integer.valueOf(a10.f26566e));
        hashMap.put("deviceoem", SDKUtils.encodeString(a10.f26562a));
        hashMap.put("devicemodel", SDKUtils.encodeString(a10.f26563b));
        hashMap.put("bundleid", SDKUtils.encodeString(context.getPackageName()));
        hashMap.put("applicationkey", SDKUtils.encodeString(aVar.f25987b));
        hashMap.put("sessionid", SDKUtils.encodeString(aVar.f25986a));
        hashMap.put("sdkversion", SDKUtils.encodeString(SDKUtils.getSDKVersion()));
        hashMap.put("applicationuserid", SDKUtils.encodeString(aVar.f25989d));
        hashMap.put("env", "prod");
        hashMap.put(AppMeasurementSdk.ConditionalUserProperty.ORIGIN, "n");
        hashMap.put("connectiontype", com.ironsource.d.a.a(aVar.f25988c));
    }

    @Override // com.ironsource.a.c
    public final Map<String, Object> a() {
        return f25985a;
    }

    public static void a(String str) {
        f25985a.put("connectiontype", SDKUtils.encodeString(str));
    }
}
