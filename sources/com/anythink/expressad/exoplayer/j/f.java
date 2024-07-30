package com.anythink.expressad.exoplayer.j;

import android.net.Uri;
import android.util.Base64;
import com.anythink.expressad.exoplayer.k.af;
import java.net.URLDecoder;

/* loaded from: classes.dex */
public final class f implements h {

    /* renamed from: a, reason: collision with root package name */
    public static final String f8802a = "data";

    /* renamed from: b, reason: collision with root package name */
    private k f8803b;

    /* renamed from: c, reason: collision with root package name */
    private int f8804c;

    /* renamed from: d, reason: collision with root package name */
    private byte[] f8805d;

    @Override // com.anythink.expressad.exoplayer.j.h
    public final long a(k kVar) {
        this.f8803b = kVar;
        Uri uri = kVar.f8815c;
        String scheme = uri.getScheme();
        if ("data".equals(scheme)) {
            String[] a10 = af.a(uri.getSchemeSpecificPart(), ",");
            if (a10.length == 2) {
                String str = a10[1];
                if (a10[0].contains(";base64")) {
                    try {
                        this.f8805d = Base64.decode(str, 0);
                    } catch (IllegalArgumentException e10) {
                        throw new com.anythink.expressad.exoplayer.t("Error while parsing Base64 encoded string: ".concat(String.valueOf(str)), e10);
                    }
                } else {
                    this.f8805d = URLDecoder.decode(str, com.anythink.expressad.exoplayer.b.f7301i).getBytes();
                }
                return this.f8805d.length;
            }
            throw new com.anythink.expressad.exoplayer.t("Unexpected URI format: ".concat(String.valueOf(uri)));
        }
        throw new com.anythink.expressad.exoplayer.t("Unsupported scheme: ".concat(String.valueOf(scheme)));
    }

    @Override // com.anythink.expressad.exoplayer.j.h
    public final void b() {
        this.f8803b = null;
        this.f8805d = null;
    }

    @Override // com.anythink.expressad.exoplayer.j.h
    public final int a(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int length = this.f8805d.length - this.f8804c;
        if (length == 0) {
            return -1;
        }
        int min = Math.min(i11, length);
        System.arraycopy(this.f8805d, this.f8804c, bArr, i10, min);
        this.f8804c += min;
        return min;
    }

    @Override // com.anythink.expressad.exoplayer.j.h
    public final Uri a() {
        k kVar = this.f8803b;
        if (kVar != null) {
            return kVar.f8815c;
        }
        return null;
    }
}
