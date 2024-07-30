package la;

import com.huawei.openalliance.ad.ppskit.activity.PPSActivity;
import ka.n7;

/* loaded from: classes2.dex */
public final class o implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ PPSActivity f32579s;

    public o(PPSActivity pPSActivity) {
        this.f32579s = pPSActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n7.e("PPSActivity", "finishSelfDelayed");
        this.f32579s.finish();
    }
}
