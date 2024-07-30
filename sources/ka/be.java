package ka;

import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;

/* loaded from: classes2.dex */
public final class be implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ContentRecord f30995s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ce f30996t;

    public be(ce ceVar, ContentRecord contentRecord) {
        this.f30996t = ceVar;
        this.f30995s = contentRecord;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ce ceVar = this.f30996t;
        d5 a10 = y4.a(ceVar.f31054h, "normal");
        String j10 = a10.j(ceVar.f31054h, a0.a.F(ceVar.f31054h, this.f30995s));
        if (com.huawei.openalliance.ad.ppskit.utils.x.q(a10.h(ceVar.f31054h, j10))) {
            a10.m(ceVar.f31054h, j10);
        }
    }
}
