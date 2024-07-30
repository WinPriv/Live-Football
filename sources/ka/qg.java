package ka;

import com.huawei.openalliance.ad.ppskit.beans.inner.AdContentData;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import ka.af;

/* loaded from: classes2.dex */
public final class qg implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ContentRecord f31688s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ AdContentData f31689t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ long f31690u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ af.a f31691v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ tg f31692w;

    public qg(tg tgVar, ContentRecord contentRecord, AdContentData adContentData, long j10, af.a aVar) {
        this.f31692w = tgVar;
        this.f31688s = contentRecord;
        this.f31689t = adContentData;
        this.f31690u = j10;
        this.f31691v = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tg tgVar = this.f31692w;
        ContentRecord contentRecord = this.f31688s;
        tg.a(tgVar, contentRecord);
        if (tg.c(this.f31692w, this.f31688s, this.f31689t, this.f31690u, this.f31691v)) {
            tgVar.f31904d.a(contentRecord, contentRecord.b1(), contentRecord.c1());
            n7.b("NativeAdParser3", "directCacheVideo success");
        }
    }
}
