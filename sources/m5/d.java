package m5;

import android.net.Uri;
import c6.m;
import d6.e0;
import java.util.Collections;
import java.util.Map;
import n5.i;
import n5.j;

/* compiled from: DashUtil.java */
/* loaded from: classes2.dex */
public final class d {
    public static m a(j jVar, String str, i iVar, int i10) {
        Map emptyMap = Collections.emptyMap();
        Uri d10 = e0.d(str, iVar.f33397c);
        long j10 = iVar.f33395a;
        long j11 = iVar.f33396b;
        String f = jVar.f();
        if (f == null) {
            f = e0.d(jVar.f33400t.get(0).f33350a, iVar.f33397c).toString();
        }
        d6.a.f(d10, "The uri must be set.");
        return new m(d10, 0L, 1, null, emptyMap, j10, j11, f, i10, null);
    }
}
