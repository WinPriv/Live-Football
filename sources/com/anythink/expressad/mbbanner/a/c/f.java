package com.anythink.expressad.mbbanner.a.c;

import com.anythink.expressad.foundation.h.o;
import com.anythink.expressad.videocommon.b.i;

/* loaded from: classes.dex */
public class f implements i.b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f10334a = "f";

    /* renamed from: b, reason: collision with root package name */
    private com.anythink.expressad.mbbanner.a.d.b f10335b;

    /* renamed from: c, reason: collision with root package name */
    private String f10336c;

    public f(com.anythink.expressad.mbbanner.a.d.b bVar, String str) {
        this.f10335b = bVar;
        this.f10336c = str;
    }

    @Override // com.anythink.expressad.videocommon.b.i.a
    public final void a(String str) {
        o.b(f10334a, "DownloadBannerUrlListener HTML SUCCESS:".concat(String.valueOf(str)));
        com.anythink.expressad.mbbanner.a.d.b bVar = this.f10335b;
        if (bVar != null) {
            bVar.a(this.f10336c, 3, str, true);
        }
    }

    @Override // com.anythink.expressad.videocommon.b.i.a
    public final void a(String str, String str2) {
        o.b(f10334a, "DownloadBannerUrlListener HTML FAIL:".concat(String.valueOf(str)));
        com.anythink.expressad.mbbanner.a.d.b bVar = this.f10335b;
        if (bVar != null) {
            bVar.a(this.f10336c, 3, str, false);
        }
    }
}
