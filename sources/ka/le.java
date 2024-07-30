package ka;

import java.util.HashMap;

/* loaded from: classes2.dex */
public final class le implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ vf f31420s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ke f31421t;

    public le(ke keVar, vf vfVar) {
        this.f31421t = keVar;
        this.f31420s = vfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = com.huawei.openalliance.ad.ppskit.utils.d0.f22830a;
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        vf vfVar = this.f31420s;
        vfVar.f32016g = valueOf;
        this.f31421t.y(vfVar);
    }
}
