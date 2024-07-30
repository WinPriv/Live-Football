package com.anythink.core.common;

import android.text.TextUtils;
import com.anythink.core.api.AdError;
import com.anythink.core.api.ErrorCode;
import com.anythink.core.common.e.ai;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static String f5267a = "c";
    private static volatile c f;

    /* renamed from: b, reason: collision with root package name */
    ConcurrentHashMap<String, Long> f5268b = new ConcurrentHashMap<>();

    /* renamed from: c, reason: collision with root package name */
    ConcurrentHashMap<String, Long> f5269c = new ConcurrentHashMap<>();

    /* renamed from: d, reason: collision with root package name */
    Map<String, a> f5270d = new ConcurrentHashMap(5);

    /* renamed from: e, reason: collision with root package name */
    Map<String, Map<String, Long>> f5271e;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        String f5273a;

        /* renamed from: b, reason: collision with root package name */
        long f5274b;
    }

    private c() {
    }

    public static c a() {
        if (f == null) {
            synchronized (c.class) {
                if (f == null) {
                    f = new c();
                }
            }
        }
        return f;
    }

    public final boolean b(ai aiVar) {
        if (aiVar.l() == 7) {
            return false;
        }
        if (aiVar.I() == 0) {
            return false;
        }
        return aiVar.I() + (this.f5269c.get(aiVar.t()) != null ? this.f5269c.get(aiVar.t()).longValue() : 0L) >= System.currentTimeMillis();
    }

    private void b(String str, long j10) {
        this.f5269c.put(str, Long.valueOf(j10));
    }

    public final boolean a(ai aiVar) {
        if (aiVar.H() == 0) {
            return false;
        }
        return aiVar.H() + (this.f5268b.get(aiVar.t()) != null ? this.f5268b.get(aiVar.t()).longValue() : 0L) >= System.currentTimeMillis();
    }

    public final void a(String str, long j10) {
        this.f5268b.put(str, Long.valueOf(j10));
    }

    public final void a(String str) {
        this.f5271e = new ConcurrentHashMap(3);
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                try {
                    String next = keys.next();
                    JSONObject optJSONObject = jSONObject.optJSONObject(next);
                    HashMap hashMap = new HashMap(3);
                    Iterator<String> keys2 = optJSONObject.keys();
                    while (keys2.hasNext()) {
                        try {
                            String next2 = keys2.next();
                            hashMap.put(next2, Long.valueOf(optJSONObject.getLong(next2)));
                        } catch (Throwable unused) {
                        }
                    }
                    this.f5271e.put(next, hashMap);
                } catch (Throwable unused2) {
                }
            }
        } catch (Throwable unused3) {
        }
    }

    public final void a(String str, long j10, AdError adError) {
        if (TextUtils.equals(adError.getCode(), ErrorCode.noADError)) {
            a aVar = this.f5270d.get(str);
            if (aVar == null) {
                aVar = new a();
            }
            aVar.f5273a = adError.getPlatformCode();
            aVar.f5274b = j10;
            this.f5270d.put(str, aVar);
        }
    }

    public final boolean a(int i10, com.anythink.core.c.d dVar, ai aiVar) {
        int i11;
        Long l10;
        if (this.f5271e == null) {
            return false;
        }
        List<Integer> b10 = dVar.b();
        if (b10.size() == 0) {
            return false;
        }
        a aVar = this.f5270d.get(aiVar.t());
        if (aVar == null) {
            return false;
        }
        switch (i10) {
            case 1:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                i11 = 3;
                break;
            case 2:
            default:
                i11 = 1;
                break;
            case 8:
                i11 = 2;
                break;
        }
        if (!b10.contains(Integer.valueOf(i11))) {
            return false;
        }
        Map<String, Long> map = this.f5271e.get(String.valueOf(aiVar.c()));
        if (map == null || (l10 = map.get(aVar.f5273a)) == null) {
            return false;
        }
        return l10.longValue() + aVar.f5274b >= System.currentTimeMillis();
    }
}
