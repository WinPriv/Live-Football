package com.anythink.core.common.res.a;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static volatile c f6440a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, a> f6441b = new HashMap();

    private c() {
    }

    public static c a() {
        if (f6440a == null) {
            synchronized (c.class) {
                if (f6440a == null) {
                    f6440a = new c();
                }
            }
        }
        return f6440a;
    }

    public final void b(String str) {
        if (this.f6441b != null && !TextUtils.isEmpty(str)) {
            this.f6441b.remove(str);
        }
    }

    public final a a(String str) {
        a aVar = this.f6441b.get(str);
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a(str);
        this.f6441b.put(str, aVar2);
        return aVar2;
    }
}
