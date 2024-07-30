package s1;

import android.content.Context;
import android.text.TextUtils;
import j1.c;

/* compiled from: WorkDatabase.java */
/* loaded from: classes.dex */
public final class g implements c.InterfaceC0403c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f35066a;

    public g(Context context) {
        this.f35066a = context;
    }

    @Override // j1.c.InterfaceC0403c
    public final j1.c a(c.b bVar) {
        c.a aVar = bVar.f29573c;
        if (aVar != null) {
            Context context = this.f35066a;
            if (context != null) {
                String str = bVar.f29572b;
                if (!TextUtils.isEmpty(str)) {
                    return new k1.b(context, str, aVar, true);
                }
                throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
            }
            throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
        }
        throw new IllegalArgumentException("Must set a callback to create the configuration.");
    }
}
