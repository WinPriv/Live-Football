package k8;

import android.content.Context;
import s7.b;
import s7.l;
import s7.v;

/* compiled from: LibraryVersionComponent.java */
/* loaded from: classes2.dex */
public final class f {

    /* compiled from: LibraryVersionComponent.java */
    /* loaded from: classes2.dex */
    public interface a<T> {
        String c(Context context);
    }

    public static s7.b<?> a(String str, String str2) {
        k8.a aVar = new k8.a(str, str2);
        b.a a10 = s7.b.a(d.class);
        a10.f35222e = 1;
        a10.f = new s7.a(aVar);
        return a10.b();
    }

    public static s7.b<?> b(final String str, final a<Context> aVar) {
        b.a a10 = s7.b.a(d.class);
        a10.f35222e = 1;
        a10.a(l.a(Context.class));
        a10.f = new s7.e() { // from class: k8.e
            @Override // s7.e
            public final Object d(v vVar) {
                return new a(str, aVar.c((Context) vVar.a(Context.class)));
            }
        };
        return a10.b();
    }
}
