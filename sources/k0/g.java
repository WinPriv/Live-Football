package k0;

import android.content.Context;
import java.util.concurrent.Callable;
import k0.k;

/* compiled from: FontRequestWorker.java */
/* loaded from: classes.dex */
public final class g implements Callable<k.a> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f30256a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f30257b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f30258c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f30259d;

    public g(String str, Context context, f fVar, int i10) {
        this.f30256a = str;
        this.f30257b = context;
        this.f30258c = fVar;
        this.f30259d = i10;
    }

    @Override // java.util.concurrent.Callable
    public final k.a call() throws Exception {
        return k.a(this.f30256a, this.f30257b, this.f30258c, this.f30259d);
    }
}
