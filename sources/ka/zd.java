package ka;

import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.beans.metadata.AdSlot30;
import com.huawei.openalliance.ad.ppskit.beans.metadata.App;
import com.huawei.openalliance.ad.ppskit.beans.metadata.Device;
import com.huawei.openalliance.ad.ppskit.beans.metadata.Location;
import com.huawei.openalliance.ad.ppskit.beans.server.AdContentReq;
import com.huawei.openalliance.ad.ppskit.db.bean.AdSampleRecord;
import java.util.List;

/* loaded from: classes2.dex */
public final class zd implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ AdContentReq f32248s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ yd f32249t;

    public zd(yd ydVar, AdContentReq adContentReq) {
        this.f32249t = ydVar;
        this.f32248s = adContentReq;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j10;
        AdSlot30 adSlot30;
        boolean z10;
        AdSampleRecord e10;
        App A = this.f32248s.A();
        String str = "";
        if (A != null) {
            str = A.e();
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Location I = this.f32248s.I();
        yd ydVar = this.f32249t;
        AdContentReq adContentReq = this.f32248s;
        com.huawei.openalliance.ad.ppskit.handlers.l d10 = com.huawei.openalliance.ad.ppskit.handlers.l.d(ydVar.f32222d);
        synchronized (d10.f22585a) {
            j10 = d10.G(str).getLong("lastAdReq", 0L);
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - j10 < 86400000) {
            n7.b("BfeProcessor", "cache ad req - still in interval");
        } else {
            synchronized (d10.f22585a) {
                d10.G(str).edit().putLong("lastAdReq", currentTimeMillis).apply();
            }
            AdSampleRecord e11 = ydVar.e("request");
            if (e11 != null) {
                AdSampleRecord.MetaData F = e11.F();
                F.d(adContentReq.G());
                F.m(str);
                Integer H = adContentReq.H();
                if (H != null) {
                    F.w(H);
                }
                F.s(Integer.valueOf(adContentReq.r()));
                Device D = adContentReq.D();
                if (D != null) {
                    F.z(D.I());
                    if (!TextUtils.isEmpty(D.p()) && D.q() != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    F.x(String.valueOf(z10));
                    Integer q10 = com.huawei.openalliance.ad.ppskit.utils.y1.q(D.D());
                    if (q10 != null) {
                        F.u(q10);
                    }
                    F.j(D.r());
                }
                List<AdSlot30> E = adContentReq.E();
                if (!androidx.transition.n.M(E) && (adSlot30 = E.get(0)) != null) {
                    F.a(adSlot30.i());
                }
                if (I != null && I.l()) {
                    try {
                        F.v(com.huawei.openalliance.ad.ppskit.utils.n2.a(com.huawei.openalliance.ad.ppskit.utils.y0.q(null, I)));
                    } catch (Throwable th) {
                        n7.h("BfeProcessor", "set encryptL ex:%s", th.getClass().getSimpleName());
                    }
                }
                e11.G(F);
                ydVar.d(e11);
            }
        }
        yd ydVar2 = this.f32249t;
        ydVar2.getClass();
        if (I != null && I.l()) {
            try {
                String H2 = a0.a.H(ydVar2.f32222d, str, I);
                if (!TextUtils.isEmpty(H2) && (e10 = ydVar2.e("poi")) != null) {
                    e10.F().C(H2);
                    ydVar2.d(e10);
                }
            } catch (Throwable th2) {
                n7.h("BfeProcessor", "set encryptL ex:%s", th2.getClass().getSimpleName());
            }
        }
    }
}
