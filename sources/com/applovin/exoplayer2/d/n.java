package com.applovin.exoplayer2.d;

import com.applovin.exoplayer2.l.ai;
import com.vungle.warren.utility.platform.Platform;
import java.util.UUID;

/* loaded from: classes.dex */
public final class n implements com.applovin.exoplayer2.c.b {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f14044a;

    /* renamed from: b, reason: collision with root package name */
    public final UUID f14045b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f14046c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f14047d;

    static {
        boolean z10;
        if (Platform.MANUFACTURER_AMAZON.equals(ai.f16276c)) {
            String str = ai.f16277d;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z10 = true;
                f14044a = z10;
            }
        }
        z10 = false;
        f14044a = z10;
    }

    public n(UUID uuid, byte[] bArr, boolean z10) {
        this.f14045b = uuid;
        this.f14046c = bArr;
        this.f14047d = z10;
    }
}
