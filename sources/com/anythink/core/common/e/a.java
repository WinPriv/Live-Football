package com.anythink.core.common.e;

import android.content.Context;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public Context f5387a;

    /* renamed from: b, reason: collision with root package name */
    public com.anythink.core.common.j f5388b;

    /* renamed from: c, reason: collision with root package name */
    public String f5389c;

    /* renamed from: d, reason: collision with root package name */
    public String f5390d;

    /* renamed from: e, reason: collision with root package name */
    public int f5391e;
    public long f;

    /* renamed from: g, reason: collision with root package name */
    public long f5392g;

    /* renamed from: h, reason: collision with root package name */
    public long f5393h;

    /* renamed from: i, reason: collision with root package name */
    public List<ai> f5394i;

    /* renamed from: j, reason: collision with root package name */
    public List<ai> f5395j;

    /* renamed from: k, reason: collision with root package name */
    public List<ai> f5396k;

    /* renamed from: l, reason: collision with root package name */
    public String f5397l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f5398m;

    /* renamed from: n, reason: collision with root package name */
    public com.anythink.core.c.d f5399n;
    public String o;

    /* renamed from: p, reason: collision with root package name */
    public String f5400p;

    /* renamed from: q, reason: collision with root package name */
    public Map<String, Object> f5401q;

    /* renamed from: r, reason: collision with root package name */
    public JSONObject f5402r;

    /* renamed from: s, reason: collision with root package name */
    public e f5403s;

    /* renamed from: t, reason: collision with root package name */
    public ai f5404t;

    /* renamed from: u, reason: collision with root package name */
    public int f5405u = 2;

    /* renamed from: v, reason: collision with root package name */
    public double f5406v;

    /* renamed from: w, reason: collision with root package name */
    public al f5407w;

    /* renamed from: x, reason: collision with root package name */
    public Boolean f5408x;

    private a d(List<ai> list) {
        a aVar = new a();
        aVar.f5387a = this.f5387a;
        aVar.f5389c = this.f5389c;
        aVar.f5390d = this.f5390d;
        aVar.f5391e = this.f5391e;
        aVar.f5392g = this.f5392g;
        aVar.f5395j = this.f5395j;
        aVar.f5399n = this.f5399n;
        long j10 = this.f;
        if (j10 < 0) {
            aVar.f = 10000L;
        } else {
            aVar.f = j10;
        }
        aVar.f5398m = this.f5398m;
        aVar.o = this.o;
        aVar.f5400p = this.f5400p;
        aVar.f5394i = list;
        aVar.f5401q = this.f5401q;
        aVar.f5393h = this.f5393h;
        aVar.f5388b = this.f5388b;
        aVar.f5403s = this.f5403s;
        aVar.f5405u = this.f5405u;
        aVar.f5404t = this.f5404t;
        aVar.f5406v = this.f5406v;
        return aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c8 A[Catch: all -> 0x012a, TryCatch #0 {all -> 0x012a, blocks: (B:16:0x0069, B:25:0x00b8, B:27:0x00c8, B:28:0x00d6, B:30:0x00dc, B:32:0x00e8, B:33:0x00f3, B:36:0x00f9, B:41:0x0105, B:43:0x010b, B:44:0x0110, B:46:0x0116, B:47:0x011b, B:50:0x0096, B:51:0x009d, B:53:0x00b5, B:54:0x007d, B:57:0x0087), top: B:15:0x0069 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009d A[Catch: all -> 0x012a, TryCatch #0 {all -> 0x012a, blocks: (B:16:0x0069, B:25:0x00b8, B:27:0x00c8, B:28:0x00d6, B:30:0x00dc, B:32:0x00e8, B:33:0x00f3, B:36:0x00f9, B:41:0x0105, B:43:0x010b, B:44:0x0110, B:46:0x0116, B:47:0x011b, B:50:0x0096, B:51:0x009d, B:53:0x00b5, B:54:0x007d, B:57:0x0087), top: B:15:0x0069 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.anythink.core.common.e.a a(java.util.List<com.anythink.core.common.e.ai> r10, java.util.List<com.anythink.core.common.e.ai> r11, java.lang.Boolean r12) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.e.a.a(java.util.List, java.util.List, java.lang.Boolean):com.anythink.core.common.e.a");
    }

    public final a b(List<ai> list) {
        a d10 = d(list);
        d10.o = this.o;
        d10.f5392g = this.f5392g;
        return d10;
    }

    public final a c(List<ai> list) {
        a d10 = d(list);
        d10.f5400p = this.f5400p;
        return d10;
    }

    public final a a(List<ai> list) {
        return d(list);
    }
}
