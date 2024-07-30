package com.applovin.exoplayer2.d;

import android.net.Uri;
import android.text.TextUtils;
import com.applovin.exoplayer2.d.m;
import com.applovin.exoplayer2.k.l;
import com.applovin.exoplayer2.k.t;
import com.applovin.exoplayer2.l.ai;
import java.io.Closeable;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public final class p implements r {

    /* renamed from: a, reason: collision with root package name */
    private final t.b f14052a;

    /* renamed from: b, reason: collision with root package name */
    private final String f14053b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f14054c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<String, String> f14055d;

    public p(String str, boolean z10, t.b bVar) {
        boolean z11;
        if (z10 && TextUtils.isEmpty(str)) {
            z11 = false;
        } else {
            z11 = true;
        }
        com.applovin.exoplayer2.l.a.a(z11);
        this.f14052a = bVar;
        this.f14053b = str;
        this.f14054c = z10;
        this.f14055d = new HashMap();
    }

    public void a(String str, String str2) {
        com.applovin.exoplayer2.l.a.b(str);
        com.applovin.exoplayer2.l.a.b(str2);
        synchronized (this.f14055d) {
            this.f14055d.put(str, str2);
        }
    }

    @Override // com.applovin.exoplayer2.d.r
    public byte[] a(UUID uuid, m.d dVar) throws s {
        return a(this.f14052a, dVar.b() + "&signedRequest=" + ai.a(dVar.a()), null, Collections.emptyMap());
    }

    @Override // com.applovin.exoplayer2.d.r
    public byte[] a(UUID uuid, m.a aVar) throws s {
        String str;
        String b10 = aVar.b();
        if (this.f14054c || TextUtils.isEmpty(b10)) {
            b10 = this.f14053b;
        }
        if (!TextUtils.isEmpty(b10)) {
            HashMap hashMap = new HashMap();
            UUID uuid2 = com.applovin.exoplayer2.h.f15243e;
            if (uuid2.equals(uuid)) {
                str = "text/xml";
            } else {
                str = com.applovin.exoplayer2.h.f15241c.equals(uuid) ? "application/json" : "application/octet-stream";
            }
            hashMap.put("Content-Type", str);
            if (uuid2.equals(uuid)) {
                hashMap.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
            }
            synchronized (this.f14055d) {
                hashMap.putAll(this.f14055d);
            }
            return a(this.f14052a, b10, aVar.a(), hashMap);
        }
        throw new s(new l.a().a(Uri.EMPTY).a(), Uri.EMPTY, com.applovin.exoplayer2.common.a.u.a(), 0L, new IllegalStateException("No license URL"));
    }

    private static byte[] a(t.b bVar, String str, byte[] bArr, Map<String, String> map) throws s {
        com.applovin.exoplayer2.k.z zVar = new com.applovin.exoplayer2.k.z(bVar.a());
        com.applovin.exoplayer2.k.l a10 = new l.a().a(str).a(map).a(2).a(bArr).b(1).a();
        int i10 = 0;
        com.applovin.exoplayer2.k.l lVar = a10;
        while (true) {
            try {
                com.applovin.exoplayer2.k.k kVar = new com.applovin.exoplayer2.k.k(zVar, lVar);
                try {
                    return ai.a((InputStream) kVar);
                } catch (t.e e10) {
                    String a11 = a(e10, i10);
                    if (a11 != null) {
                        i10++;
                        lVar = lVar.b().a(a11).a();
                    } else {
                        throw e10;
                    }
                } finally {
                    ai.a((Closeable) kVar);
                }
            } catch (Exception e11) {
                throw new s(a10, (Uri) com.applovin.exoplayer2.l.a.b(zVar.e()), zVar.b(), zVar.d(), e11);
            }
        }
    }

    private static String a(t.e eVar, int i10) {
        Map<String, List<String>> map;
        List<String> list;
        int i11 = eVar.f16192d;
        if (!((i11 == 307 || i11 == 308) && i10 < 5) || (map = eVar.f) == null || (list = map.get("Location")) == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
}
