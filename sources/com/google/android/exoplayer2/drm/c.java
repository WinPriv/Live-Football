package com.google.android.exoplayer2.drm;

import android.net.Uri;
import c6.r;
import c6.t;
import com.huawei.openalliance.ad.constant.w;
import d6.g0;
import j7.t2;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import k4.n0;

/* compiled from: DefaultDrmSessionManagerProvider.java */
/* loaded from: classes2.dex */
public final class c implements o4.c {

    /* renamed from: a, reason: collision with root package name */
    public final Object f19973a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public n0.d f19974b;

    /* renamed from: c, reason: collision with root package name */
    public b f19975c;

    public static b b(n0.d dVar) {
        String uri;
        byte[] bArr;
        r.a aVar = new r.a();
        aVar.f3440b = null;
        Uri uri2 = dVar.f30604b;
        if (uri2 == null) {
            uri = null;
        } else {
            uri = uri2.toString();
        }
        k kVar = new k(uri, dVar.f, aVar);
        t2<Map.Entry<String, String>> it = dVar.f30605c.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> next = it.next();
            String key = next.getKey();
            String value = next.getValue();
            key.getClass();
            value.getClass();
            synchronized (kVar.f19996d) {
                kVar.f19996d.put(key, value);
            }
        }
        HashMap hashMap = new HashMap();
        UUID uuid = k4.g.f30463a;
        t tVar = new t();
        UUID uuid2 = dVar.f30603a;
        e0.i iVar = j.f19989d;
        uuid2.getClass();
        boolean z10 = dVar.f30606d;
        boolean z11 = dVar.f30607e;
        int[] j02 = l7.a.j0(dVar.f30608g);
        for (int i10 : j02) {
            boolean z12 = true;
            if (i10 != 2 && i10 != 1) {
                z12 = false;
            }
            d6.a.a(z12);
        }
        b bVar = new b(uuid2, iVar, kVar, hashMap, z10, (int[]) j02.clone(), z11, tVar, w.as);
        byte[] bArr2 = dVar.f30609h;
        if (bArr2 != null) {
            bArr = Arrays.copyOf(bArr2, bArr2.length);
        } else {
            bArr = null;
        }
        d6.a.d(bVar.f19953m.isEmpty());
        bVar.f19961v = 0;
        bVar.f19962w = bArr;
        return bVar;
    }

    @Override // o4.c
    public final f a(n0 n0Var) {
        b bVar;
        n0Var.f30575t.getClass();
        n0.d dVar = n0Var.f30575t.f30631c;
        if (dVar != null && g0.f27302a >= 18) {
            synchronized (this.f19973a) {
                if (!g0.a(dVar, this.f19974b)) {
                    this.f19974b = dVar;
                    this.f19975c = b(dVar);
                }
                bVar = this.f19975c;
                bVar.getClass();
            }
            return bVar;
        }
        return f.f19982a;
    }
}
