package f1;

import android.content.Context;
import f1.h;
import j1.c;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: DatabaseConfiguration.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final c.InterfaceC0403c f27923a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f27924b;

    /* renamed from: c, reason: collision with root package name */
    public final String f27925c;

    /* renamed from: d, reason: collision with root package name */
    public final h.c f27926d;

    /* renamed from: e, reason: collision with root package name */
    public final List<h.b> f27927e;
    public final Executor f;

    /* renamed from: g, reason: collision with root package name */
    public final Executor f27928g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f27929h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f27930i;

    public a(Context context, String str, c.InterfaceC0403c interfaceC0403c, h.c cVar, ArrayList arrayList, boolean z10, int i10, Executor executor, Executor executor2, boolean z11, boolean z12) {
        this.f27923a = interfaceC0403c;
        this.f27924b = context;
        this.f27925c = str;
        this.f27926d = cVar;
        this.f27927e = arrayList;
        this.f = executor;
        this.f27928g = executor2;
        this.f27929h = z11;
        this.f27930i = z12;
    }

    public final boolean a(int i10, int i11) {
        boolean z10;
        if (i10 > i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((!z10 || !this.f27930i) && this.f27929h) {
            return true;
        }
        return false;
    }
}
