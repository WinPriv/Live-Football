package la;

import com.huawei.openalliance.ad.ppskit.activity.PPSArActivity;
import ka.ce;

/* loaded from: classes2.dex */
public final class u implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ PPSArActivity f32587s;

    public u(PPSArActivity pPSArActivity) {
        this.f32587s = pPSArActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        new ce(this.f32587s).q(com.huawei.openalliance.ad.ppskit.handlers.l.d(r1).H(r1.D));
    }
}
