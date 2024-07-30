package com.iab.omid.library.ironsrc.internal;

import android.annotation.SuppressLint;
import android.view.View;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class b extends d {

    /* renamed from: d, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static b f24382d = new b();

    private b() {
    }

    public static b g() {
        return f24382d;
    }

    @Override // com.iab.omid.library.ironsrc.internal.d
    public void b(boolean z10) {
        Iterator<com.iab.omid.library.ironsrc.adsession.a> it = c.c().b().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(z10);
        }
    }

    @Override // com.iab.omid.library.ironsrc.internal.d
    public boolean d() {
        Iterator<com.iab.omid.library.ironsrc.adsession.a> it = c.c().a().iterator();
        while (it.hasNext()) {
            View c10 = it.next().c();
            if (c10 != null && c10.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
