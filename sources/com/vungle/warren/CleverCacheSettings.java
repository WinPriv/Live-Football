package com.vungle.warren;

import com.google.gson.internal.bind.c;
import com.huawei.hms.ads.ep;
import com.vungle.warren.model.JsonUtil;
import m8.i;
import m8.j;
import m8.n;
import m8.q;
import m8.s;
import m8.u;
import n8.b;

/* loaded from: classes2.dex */
public class CleverCacheSettings {
    static final boolean DEFAULT_ENABLED = true;
    static final long DEFAULT_TIMESTAMP = -1;
    static final String KEY_CLEVER_CACHE = "clever_cache";
    static final String KEY_ENABLED = "enabled";
    static final String KEY_TIMESTAMP = "clear_shared_cache_timestamp";

    @b(KEY_ENABLED)
    private final boolean enabled;

    @b(KEY_TIMESTAMP)
    private final long timestamp;

    private CleverCacheSettings(boolean z10, long j10) {
        this.enabled = z10;
        this.timestamp = j10;
    }

    public static CleverCacheSettings deserializeFromString(String str) {
        if (str == null) {
            return null;
        }
        try {
            return fromJson((q) new j().a().b(q.class, str));
        } catch (u unused) {
            return null;
        }
    }

    public static CleverCacheSettings fromJson(q qVar) {
        boolean z10;
        if (!JsonUtil.hasNonNull(qVar, "clever_cache")) {
            return null;
        }
        q u2 = qVar.u("clever_cache");
        long j10 = -1;
        try {
            if (u2.v(KEY_TIMESTAMP)) {
                j10 = u2.s(KEY_TIMESTAMP).l();
            }
        } catch (NumberFormatException unused) {
        }
        if (u2.v(KEY_ENABLED)) {
            n s10 = u2.s(KEY_ENABLED);
            s10.getClass();
            if ((s10 instanceof s) && ep.V.equalsIgnoreCase(s10.m())) {
                z10 = false;
                return new CleverCacheSettings(z10, j10);
            }
        }
        z10 = true;
        return new CleverCacheSettings(z10, j10);
    }

    public static CleverCacheSettings getDefault() {
        return new CleverCacheSettings(true, -1L);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CleverCacheSettings cleverCacheSettings = (CleverCacheSettings) obj;
        if (this.enabled == cleverCacheSettings.enabled && this.timestamp == cleverCacheSettings.timestamp) {
            return true;
        }
        return false;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int i10 = (this.enabled ? 1 : 0) * 31;
        long j10 = this.timestamp;
        return i10 + ((int) (j10 ^ (j10 >>> 32)));
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public String serializeToString() {
        q qVar = new q();
        i a10 = new j().a();
        Class<?> cls = getClass();
        c cVar = new c();
        a10.l(this, cls, cVar);
        qVar.n(cVar.a0(), "clever_cache");
        return qVar.toString();
    }
}
