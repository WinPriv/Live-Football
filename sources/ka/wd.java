package ka;

import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;

/* loaded from: classes2.dex */
public final class wd implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ContentRecord f32138s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ xd f32139t;

    public wd(xd xdVar, ContentRecord contentRecord) {
        this.f32139t = xdVar;
        this.f32138s = contentRecord;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f32139t.f32188a.r(this.f32138s);
    }
}
