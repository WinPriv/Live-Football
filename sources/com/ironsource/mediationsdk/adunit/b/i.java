package com.ironsource.mediationsdk.adunit.b;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class i extends sb.a {
    public i(d dVar) {
        super(dVar);
    }

    public final void a() {
        a(b.COLLECT_TOKEN, (HashMap) null);
    }

    public final void b(Map<String, Object> map, long j10) {
        HashMap hashMap = new HashMap();
        hashMap.put("duration", Long.valueOf(j10));
        if (map != null && !map.isEmpty()) {
            hashMap.putAll(map);
        }
        a(b.INSTANCE_COLLECT_TOKEN_TIMED_OUT, hashMap);
    }

    public final void a(long j10) {
        HashMap hashMap = new HashMap();
        hashMap.put("duration", Long.valueOf(j10));
        a(b.COLLECT_TOKENS_COMPLETED, hashMap);
    }

    public final void a(String str) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("reason", str);
        }
        a(b.COLLECT_TOKENS_FAILED, hashMap);
    }

    public final void a(Map<String, Object> map, long j10) {
        HashMap hashMap = new HashMap();
        hashMap.put("duration", Long.valueOf(j10));
        if (map != null && !map.isEmpty()) {
            hashMap.putAll(map);
        }
        a(b.INSTANCE_COLLECT_TOKEN_SUCCESS, hashMap);
    }

    public final void a(Map<String, Object> map, long j10, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("duration", Long.valueOf(j10));
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("reason", str);
        }
        if (map != null && !map.isEmpty()) {
            hashMap.putAll(map);
        }
        a(b.INSTANCE_COLLECT_TOKEN_FAILED, hashMap);
    }
}
