package wb;

import com.ironsource.sdk.controller.x;
import com.ironsource.sdk.g.d;

/* loaded from: classes2.dex */
public final class f implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d.e f36199s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f36200t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ x f36201u;

    public f(x xVar, d.e eVar, String str) {
        this.f36201u = xVar;
        this.f36199s = eVar;
        this.f36200t = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d.e eVar = d.e.RewardedVideo;
        x xVar = this.f36201u;
        d.e eVar2 = this.f36199s;
        if (eVar2 != eVar && eVar2 != d.e.Interstitial) {
            if (eVar2 == d.e.OfferWall) {
                xVar.Q.onOWAdClosed();
            }
        } else {
            int i10 = x.f26249r0;
            com.ironsource.sdk.j.a.a j10 = xVar.j(eVar2);
            if (j10 != null) {
                j10.a(eVar2, this.f36200t);
            }
        }
    }
}
