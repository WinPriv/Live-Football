package ka;

import com.huawei.android.hms.ppskit.a;
import ka.c7;

/* loaded from: classes2.dex */
public final class b7 extends a.AbstractBinderC0244a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c7.a f30975b;

    public b7(c7.a aVar) {
        this.f30975b = aVar;
    }

    @Override // com.huawei.android.hms.ppskit.a
    public final void e(String str, int i10, String str2) {
        String concat;
        if (n7.d()) {
            n7.c("AdsCore.PPSApiServiceManager", "call: %s code: %s result: %s", str, Integer.valueOf(i10), com.huawei.openalliance.ad.ppskit.utils.y1.j(str2));
        }
        y6 y6Var = new y6(0);
        y6Var.f32210b = i10;
        c7.a aVar = this.f30975b;
        try {
            if (i10 == 200) {
                y6Var.f32211c = androidx.transition.n.r(aVar.f31030e, str2);
            } else {
                y6Var.f32209a = str2;
            }
        } catch (IllegalArgumentException e10) {
            e = e10;
            concat = "onCallResult IllegalArgumentException";
            n7.g("AdsCore.PPSApiServiceManager", concat);
            y6Var.f32210b = -1;
            y6Var.f32209a = e.getMessage();
            c7.a.c(aVar.f31029d, str, y6Var);
        } catch (Throwable th) {
            e = th;
            concat = "onCallResult ".concat(e.getClass().getSimpleName());
            n7.g("AdsCore.PPSApiServiceManager", concat);
            y6Var.f32210b = -1;
            y6Var.f32209a = e.getMessage();
            c7.a.c(aVar.f31029d, str, y6Var);
        }
        c7.a.c(aVar.f31029d, str, y6Var);
    }
}
