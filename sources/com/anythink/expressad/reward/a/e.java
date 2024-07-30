package com.anythink.expressad.reward.a;

import com.anythink.expressad.foundation.h.o;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class e implements com.anythink.expressad.e.b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f10776a = "RewardUnitCacheManager";

    /* renamed from: b, reason: collision with root package name */
    private ConcurrentHashMap<String, com.anythink.expressad.videocommon.e.d> f10777b;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final e f10778a = new e(0);

        private a() {
        }
    }

    public /* synthetic */ e(byte b10) {
        this();
    }

    public static e a() {
        return a.f10778a;
    }

    private e() {
        this.f10777b = new ConcurrentHashMap<>();
    }

    public final void a(String str, String str2, com.anythink.expressad.videocommon.e.d dVar) {
        try {
            String str3 = str + "_" + str2;
            if (dVar != null && this.f10777b.containsKey(str3)) {
                this.f10777b.remove(str3);
            }
            this.f10777b.put(str3, dVar);
        } catch (Exception e10) {
            o.d(f10776a, e10.getMessage());
        }
    }

    public final com.anythink.expressad.videocommon.e.d a(String str, String str2) {
        try {
            try {
                return this.f10777b.remove(str + "_" + str2);
            } catch (Exception e10) {
                o.d(f10776a, e10.getMessage());
                return null;
            }
        } catch (Throwable unused) {
            return null;
        }
    }
}
