package com.applovin.exoplayer2.e.g;

import com.applovin.exoplayer2.e.x;
import com.applovin.exoplayer2.l.q;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f14448a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14449b;

    /* renamed from: c, reason: collision with root package name */
    public final x.a f14450c;

    /* renamed from: d, reason: collision with root package name */
    public final int f14451d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f14452e;

    public l(boolean z10, String str, int i10, byte[] bArr, int i11, int i12, byte[] bArr2) {
        boolean z11;
        if (i10 == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        com.applovin.exoplayer2.l.a.a((bArr2 == null) ^ z11);
        this.f14448a = z10;
        this.f14449b = str;
        this.f14451d = i10;
        this.f14452e = bArr2;
        this.f14450c = new x.a(a(str), bArr, i11, i12);
    }

    private static int a(String str) {
        if (str == null) {
            return 1;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals(com.anythink.expressad.exoplayer.b.be)) {
                    c10 = 0;
                    break;
                }
                break;
            case 3046671:
                if (str.equals(com.anythink.expressad.exoplayer.b.bg)) {
                    c10 = 1;
                    break;
                }
                break;
            case 3049879:
                if (str.equals(com.anythink.expressad.exoplayer.b.f7295bd)) {
                    c10 = 2;
                    break;
                }
                break;
            case 3049895:
                if (str.equals(com.anythink.expressad.exoplayer.b.bf)) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
                return 2;
            default:
                q.c("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
            case 2:
            case 3:
                return 1;
        }
    }
}
