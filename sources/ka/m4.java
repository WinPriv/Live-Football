package ka;

import android.content.Context;

/* loaded from: classes2.dex */
public final class m4 extends b3.c {

    /* renamed from: b, reason: collision with root package name */
    public final com.huawei.openalliance.ad.ppskit.handlers.l f31447b;

    public m4(Context context) {
        super(1);
        this.f31447b = com.huawei.openalliance.ad.ppskit.handlers.l.d(context);
    }

    @Override // b3.c
    public final boolean c(String str) {
        int i10;
        String string;
        int i11;
        String j10 = com.huawei.openalliance.ad.ppskit.utils.d0.j("yyyy-MM-dd");
        com.huawei.openalliance.ad.ppskit.handlers.l lVar = this.f31447b;
        synchronized (lVar.f22585a) {
            i10 = lVar.G(str).getInt("splash_app_day_impfc", 1);
        }
        com.huawei.openalliance.ad.ppskit.handlers.l lVar2 = this.f31447b;
        synchronized (lVar2.f22585a) {
            string = lVar2.G(str).getString("today_date", "");
        }
        if (j10.equals(string) && i10 > 0) {
            com.huawei.openalliance.ad.ppskit.handlers.l lVar3 = this.f31447b;
            synchronized (lVar3.f22585a) {
                i11 = lVar3.G(str).getInt("today_show_times", 0);
            }
            if (i11 >= i10) {
                n7.e("AppDayFcRule", "disturb is triggered");
                return true;
            }
        }
        return e(str);
    }
}
