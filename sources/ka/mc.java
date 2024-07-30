package ka;

import com.huawei.openalliance.ad.ppskit.beans.metadata.VideoInfo;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;

/* loaded from: classes2.dex */
public final class mc implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ oc f31462s;

    public mc(oc ocVar) {
        this.f31462s = ocVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        oc ocVar = this.f31462s;
        VideoInfo h02 = ((ContentRecord) ocVar.f32660t).h0();
        n7.f("RewardAdPresenter", "online stream error, cache file:%s", com.huawei.openalliance.ad.ppskit.utils.y1.j(h02.a()));
        String a10 = h02.a();
        int m10 = h02.m();
        if (h02.w() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        n5 n5Var = new n5(a10, m10, z10, h02.u(), null, true, 1, ((ContentRecord) ocVar.f32660t).h(), ((ContentRecord) ocVar.f32660t).p2(), 7, false);
        n5Var.f31493m = "insre";
        p5.j(ocVar.f31607v.getApplicationContext()).m(n5Var);
    }
}
