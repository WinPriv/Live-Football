package ib;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class l implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f29500s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ k f29501t;

    public l(k kVar, String str) {
        this.f29501t = kVar;
        this.f29500s = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f29501t.k(Arrays.asList(this.f29500s));
    }
}
