package ka;

import com.huawei.openalliance.ad.ppskit.db.bean.ContentResource;

/* loaded from: classes2.dex */
public final class z4 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ContentResource f32234s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ com.huawei.openalliance.ad.ppskit.utils.h f32235t;

    public z4(com.huawei.openalliance.ad.ppskit.utils.h hVar, ContentResource contentResource) {
        this.f32235t = hVar;
        this.f32234s = contentResource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.huawei.openalliance.ad.ppskit.utils.h hVar = this.f32235t;
        com.huawei.openalliance.ad.ppskit.handlers.s.n(hVar.f22856a).o(this.f32234s, hVar.f22857b);
    }
}
