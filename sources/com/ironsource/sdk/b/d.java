package com.ironsource.sdk.b;

import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public final int f26034b = 4;

    /* renamed from: c, reason: collision with root package name */
    public final int f26035c = 4;

    /* renamed from: a, reason: collision with root package name */
    public final a f26033a = new a(this);

    /* loaded from: classes2.dex */
    public class a extends HashMap<String, Boolean> {
        public a(d dVar) {
            boolean z10;
            if (dVar.f26034b == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            put("isVisible", Boolean.valueOf(z10));
            put("isWindowVisible", Boolean.valueOf(dVar.f26035c == 0));
            Boolean bool = Boolean.FALSE;
            put("isShown", bool);
            put("isViewVisible", bool);
        }
    }

    public final JSONObject a() {
        return new JSONObject(this.f26033a);
    }
}
