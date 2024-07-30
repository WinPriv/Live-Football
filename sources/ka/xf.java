package ka;

import android.content.Context;

/* loaded from: classes2.dex */
public final class xf implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f32195s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f32196t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ zf f32197u;

    public xf(zf zfVar, boolean z10, String str) {
        this.f32197u = zfVar;
        this.f32195s = z10;
        this.f32196t = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zf zfVar = this.f32197u;
        try {
            boolean Z = com.huawei.openalliance.ad.ppskit.utils.m.Z(zfVar.f32255a);
            gi giVar = zfVar.f32257c;
            Context context = zfVar.f32255a;
            boolean z10 = this.f32195s;
            String str = this.f32196t;
            if (!Z) {
                if (z10) {
                    hg.f31255g.execute(new com.huawei.openalliance.ad.ppskit.utils.b2(new gg(new hg(context, giVar), str)));
                }
                zf.g(zfVar, str);
                return;
            }
            androidx.activity.n.T(context, str, giVar, z10);
        } catch (Throwable unused) {
            n7.i(zfVar.l(), "onAnalysis.reportCachedEvents exception");
            n7.a();
        }
    }
}
