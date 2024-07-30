package com.ironsource.sdk.a;

import com.ironsource.sdk.utils.SDKUtils;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public HashMap<String, Object> f25984a = new HashMap<>();

    public final a a(String str, Object obj) {
        if (obj != null) {
            this.f25984a.put(str, SDKUtils.encodeString(obj.toString()));
        }
        return this;
    }
}
