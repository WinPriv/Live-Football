package com.applovin.exoplayer2.m;

import com.applovin.exoplayer2.m.n;
import d6.g0;
import e6.m;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class s implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f16554s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f16555t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ long f16556u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ long f16557v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f16558w;

    public /* synthetic */ s(Object obj, String str, long j10, long j11, int i10) {
        this.f16554s = i10;
        this.f16558w = obj;
        this.f16555t = str;
        this.f16556u = j10;
        this.f16557v = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f16554s;
        Object obj = this.f16558w;
        switch (i10) {
            case 0:
                ((n.a) obj).b(this.f16555t, this.f16556u, this.f16557v);
                return;
            default:
                String str = this.f16555t;
                long j10 = this.f16556u;
                long j11 = this.f16557v;
                e6.m mVar = ((m.a) obj).f27841b;
                int i11 = g0.f27302a;
                mVar.j(j10, str, j11);
                return;
        }
    }
}
