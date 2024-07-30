package com.anythink.expressad.exoplayer.d;

import android.annotation.TargetApi;
import android.media.MediaCrypto;

@TargetApi(16)
/* loaded from: classes.dex */
public final class k implements i {

    /* renamed from: a, reason: collision with root package name */
    private final MediaCrypto f7713a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f7714b;

    private k(MediaCrypto mediaCrypto) {
        this(mediaCrypto, false);
    }

    public final MediaCrypto a() {
        return this.f7713a;
    }

    public k(MediaCrypto mediaCrypto, boolean z10) {
        this.f7713a = (MediaCrypto) com.anythink.expressad.exoplayer.k.a.a(mediaCrypto);
        this.f7714b = z10;
    }

    @Override // com.anythink.expressad.exoplayer.d.i
    public final boolean a(String str) {
        return !this.f7714b && this.f7713a.requiresSecureDecoderComponent(str);
    }
}
