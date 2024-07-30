package com.google.android.exoplayer2.drm;

import android.net.Uri;
import android.text.TextUtils;
import c6.j;
import c6.m;
import c6.r;
import com.google.android.exoplayer2.drm.i;
import d6.g0;
import j7.w1;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* compiled from: HttpMediaDrmCallback.java */
/* loaded from: classes2.dex */
public final class k implements l {

    /* renamed from: a, reason: collision with root package name */
    public final j.a f19993a;

    /* renamed from: b, reason: collision with root package name */
    public final String f19994b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f19995c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f19996d;

    public k(String str, boolean z10, r.a aVar) {
        boolean z11;
        if (z10 && TextUtils.isEmpty(str)) {
            z11 = false;
        } else {
            z11 = true;
        }
        d6.a.a(z11);
        this.f19993a = aVar;
        this.f19994b = str;
        this.f19995c = z10;
        this.f19996d = new HashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008b A[Catch: all -> 0x004b, TRY_LEAVE, TryCatch #4 {all -> 0x004b, blocks: (B:5:0x0035, B:6:0x0040, B:8:0x0047, B:10:0x0050, B:23:0x005a, B:32:0x008b, B:41:0x00d3, B:42:0x006d, B:44:0x0071, B:46:0x007b, B:48:0x0081), top: B:22:0x005a, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d3 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] b(c6.j.a r38, java.lang.String r39, byte[] r40, java.util.Map<java.lang.String, java.lang.String> r41) throws o4.j {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.drm.k.b(c6.j$a, java.lang.String, byte[], java.util.Map):byte[]");
    }

    public final byte[] a(UUID uuid, i.a aVar) throws o4.j {
        String str;
        String str2 = aVar.f19986b;
        if (this.f19995c || TextUtils.isEmpty(str2)) {
            str2 = this.f19994b;
        }
        if (!TextUtils.isEmpty(str2)) {
            HashMap hashMap = new HashMap();
            UUID uuid2 = k4.g.f30467e;
            if (uuid2.equals(uuid)) {
                str = "text/xml";
            } else if (k4.g.f30465c.equals(uuid)) {
                str = "application/json";
            } else {
                str = "application/octet-stream";
            }
            hashMap.put("Content-Type", str);
            if (uuid2.equals(uuid)) {
                hashMap.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
            }
            synchronized (this.f19996d) {
                hashMap.putAll(this.f19996d);
            }
            return b(this.f19993a, str2, aVar.f19985a, hashMap);
        }
        Map emptyMap = Collections.emptyMap();
        Uri uri = Uri.EMPTY;
        d6.a.f(uri, "The uri must be set.");
        throw new o4.j(new m(uri, 0L, 1, null, emptyMap, 0L, -1L, null, 0, null), Uri.EMPTY, w1.y, 0L, new IllegalStateException("No license URL"));
    }

    public final byte[] c(i.d dVar) throws o4.j {
        return b(this.f19993a, dVar.f19988b + "&signedRequest=" + g0.m(dVar.f19987a), null, Collections.emptyMap());
    }
}
