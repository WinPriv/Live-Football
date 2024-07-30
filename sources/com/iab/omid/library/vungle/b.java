package com.iab.omid.library.vungle;

import android.content.Context;
import com.iab.omid.library.vungle.b.d;
import com.iab.omid.library.vungle.b.f;
import com.iab.omid.library.vungle.d.e;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private boolean f24487a;

    private void b(Context context) {
        e.a(context, "Application Context cannot be null");
    }

    public String a() {
        return "1.3.21-Vungle";
    }

    public void a(Context context) {
        b(context);
        if (b()) {
            return;
        }
        a(true);
        f.a().a(context);
        com.iab.omid.library.vungle.b.b.a().a(context);
        com.iab.omid.library.vungle.d.b.a(context);
        d.a().a(context);
    }

    public boolean b() {
        return this.f24487a;
    }

    public void a(boolean z10) {
        this.f24487a = z10;
    }
}
