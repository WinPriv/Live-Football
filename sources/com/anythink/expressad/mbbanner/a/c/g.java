package com.anythink.expressad.mbbanner.a.c;

import android.graphics.Bitmap;
import com.anythink.expressad.foundation.h.o;

/* loaded from: classes.dex */
public class g implements com.anythink.expressad.foundation.g.d.c {

    /* renamed from: a, reason: collision with root package name */
    private static final String f10337a = "g";

    /* renamed from: b, reason: collision with root package name */
    private com.anythink.expressad.mbbanner.a.d.b f10338b;

    /* renamed from: c, reason: collision with root package name */
    private String f10339c;

    public g(com.anythink.expressad.mbbanner.a.d.b bVar, String str) {
        this.f10338b = bVar;
        this.f10339c = str;
    }

    @Override // com.anythink.expressad.foundation.g.d.c
    public final void a(Bitmap bitmap, String str) {
        o.b(f10337a, "DownloadImageListener campaign image success");
        this.f10338b.a(this.f10339c, 1, str, true);
    }

    @Override // com.anythink.expressad.foundation.g.d.c
    public final void a(String str, String str2) {
        o.b(f10337a, "DownloadImageListener campaign image fail");
        this.f10338b.a(this.f10339c, 1, str2, false);
    }
}
