package com.anythink.expressad.foundation.g.f;

import android.content.Context;
import com.anythink.core.common.b.n;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: c, reason: collision with root package name */
    private static m f10064c;

    /* renamed from: a, reason: collision with root package name */
    private j f10065a;

    /* renamed from: b, reason: collision with root package name */
    private com.anythink.expressad.foundation.g.f.d.b f10066b;

    private m() {
    }

    public static void a(Context context) {
        if (f10064c == null) {
            m mVar = new m();
            f10064c = mVar;
            mVar.f10065a = new j(context.getApplicationContext());
            f10064c.f10066b = new com.anythink.expressad.foundation.g.f.d.b(b());
        }
    }

    private static j b() {
        m mVar = f10064c;
        if (mVar != null) {
            j jVar = mVar.f10065a;
            if (jVar != null) {
                return jVar;
            }
            mVar.f10065a = new j(n.a().g());
            return f10064c.f10065a;
        }
        m mVar2 = new m();
        f10064c = mVar2;
        if (mVar2.f10065a == null) {
            mVar2.f10065a = new j(n.a().g());
        }
        return f10064c.f10065a;
    }

    private static void c() {
        com.anythink.expressad.foundation.g.f.d.b bVar;
        m mVar = f10064c;
        if (mVar != null && (bVar = mVar.f10066b) != null) {
            bVar.a();
            f10064c.f10066b = null;
        }
    }

    public static void a(i iVar) {
        b().a(iVar);
    }

    public static com.anythink.expressad.foundation.g.f.d.b a() {
        m mVar = f10064c;
        if (mVar != null) {
            com.anythink.expressad.foundation.g.f.d.b bVar = mVar.f10066b;
            if (bVar != null) {
                return bVar;
            }
            mVar.f10066b = new com.anythink.expressad.foundation.g.f.d.b(b());
            return f10064c.f10066b;
        }
        m mVar2 = new m();
        f10064c = mVar2;
        if (mVar2.f10066b == null) {
            mVar2.f10066b = new com.anythink.expressad.foundation.g.f.d.b(b());
        }
        return f10064c.f10066b;
    }
}
