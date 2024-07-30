package la;

import com.huawei.openalliance.ad.ppskit.activity.PPSActivity;
import ka.ce;

/* loaded from: classes2.dex */
public final class h implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ PPSActivity f32572s;

    public h(PPSActivity pPSActivity) {
        this.f32572s = pPSActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        new ce(this.f32572s).q(com.huawei.openalliance.ad.ppskit.handlers.l.d(r1).H(r1.N));
    }
}
