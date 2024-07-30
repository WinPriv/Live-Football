package k0;

import android.content.Context;
import java.util.concurrent.Callable;
import k0.k;

/* compiled from: FontRequestWorker.java */
/* loaded from: classes.dex */
public final class i implements Callable<k.a> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f30261a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f30262b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f30263c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f30264d;

    public i(String str, Context context, f fVar, int i10) {
        this.f30261a = str;
        this.f30262b = context;
        this.f30263c = fVar;
        this.f30264d = i10;
    }

    @Override // java.util.concurrent.Callable
    public final k.a call() throws Exception {
        try {
            return k.a(this.f30261a, this.f30262b, this.f30263c, this.f30264d);
        } catch (Throwable unused) {
            return new k.a(-3);
        }
    }
}
