package ka;

import android.content.Context;
import com.huawei.openalliance.ad.ppskit.db.bean.UserCloseRecord;
import java.util.Date;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class fi extends xh {

    /* renamed from: c, reason: collision with root package name */
    public final vh f31195c;

    /* renamed from: d, reason: collision with root package name */
    public final int f31196d;

    public fi(Context context, int i10) {
        super(context);
        this.f31195c = new vh(context);
        this.f31196d = i10;
    }

    @Override // ka.gi
    public final int a() {
        return this.f31196d;
    }

    @Override // ka.xh, ka.gi
    public final void b(String str) {
        vh vhVar = this.f31195c;
        vhVar.getClass();
        com.huawei.openalliance.ad.ppskit.utils.p2.a(new uh(vhVar, str), 0);
    }

    @Override // ka.xh, ka.gi
    public final void c(String str) {
        int i10;
        vh vhVar = this.f31195c;
        vhVar.getClass();
        UserCloseRecord userCloseRecord = new UserCloseRecord();
        HashMap hashMap = com.huawei.openalliance.ad.ppskit.utils.d0.f22830a;
        userCloseRecord.z(System.currentTimeMillis());
        userCloseRecord.A(com.huawei.openalliance.ad.ppskit.utils.d0.j("yyyy-MM-dd HH:mm:ss"));
        userCloseRecord.B(str);
        Date date = new Date();
        com.huawei.openalliance.ad.ppskit.handlers.l lVar = vhVar.f32034b;
        synchronized (lVar.f22585a) {
            i10 = lVar.G(str).getInt("validity_click_skip", 30);
        }
        com.huawei.openalliance.ad.ppskit.utils.p2.a(new th(vhVar, userCloseRecord, com.huawei.openalliance.ad.ppskit.utils.d0.f(date, i10).getTime(), str), 0);
    }

    @Override // ka.gi
    public final long a(String str) {
        int i10;
        com.huawei.openalliance.ad.ppskit.handlers.l d10 = com.huawei.openalliance.ad.ppskit.handlers.l.d(this.f32202b);
        synchronized (d10.f22585a) {
            i10 = d10.G(str).getInt("validity_splash_event", 2880) * com.huawei.openalliance.ad.constant.w.f22171t;
        }
        return i10;
    }
}
