package la;

import com.huawei.openalliance.ad.ppskit.activity.PPSActivity;
import ka.ij;

/* loaded from: classes2.dex */
public final class l implements ij {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PPSActivity f32576a;

    public l(PPSActivity pPSActivity) {
        this.f32576a = pPSActivity;
    }

    @Override // ka.ij
    public final void a() {
        int i10 = PPSActivity.f22351i0;
        PPSActivity pPSActivity = this.f32576a;
        pPSActivity.v("128");
        pPSActivity.f22352c0.setSource(5);
        pPSActivity.f22352c0.setClickInfo(pPSActivity.Y.getClickInfo());
        pPSActivity.f22352c0.performClick();
        pPSActivity.Y.b();
        pPSActivity.Y = null;
        pPSActivity.Z = false;
    }

    @Override // ka.ij
    public final void b() {
        int i10 = PPSActivity.f22351i0;
        PPSActivity pPSActivity = this.f32576a;
        pPSActivity.v("129");
        pPSActivity.Y.b();
        pPSActivity.Y = null;
        pPSActivity.Z = false;
    }

    @Override // ka.ij
    public final void c() {
    }
}
