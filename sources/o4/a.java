package o4;

import com.google.android.exoplayer2.drm.e;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f33611s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ e.a f33612t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ com.google.android.exoplayer2.drm.e f33613u;

    public /* synthetic */ a(e.a aVar, com.google.android.exoplayer2.drm.e eVar, int i10) {
        this.f33611s = i10;
        this.f33612t = aVar;
        this.f33613u = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f33611s;
        com.google.android.exoplayer2.drm.e eVar = this.f33613u;
        e.a aVar = this.f33612t;
        switch (i10) {
            case 0:
                eVar.P(aVar.f19977a, aVar.f19978b);
                return;
            default:
                eVar.A(aVar.f19977a, aVar.f19978b);
                return;
        }
    }
}
