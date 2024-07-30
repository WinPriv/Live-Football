package ka;

import com.huawei.hms.ads.Cdo;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.inter.data.AppInfo;
import com.huawei.openalliance.ad.ppskit.utils.v;
import ka.i5;

/* loaded from: classes2.dex */
public final class l5 implements v.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ContentRecord f31402a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m5 f31403b;

    /* loaded from: classes2.dex */
    public class a implements d7<String> {
        @Override // ka.d7
        public final void a(y6 y6Var) {
            if (y6Var.f32210b != -1) {
                n7.e("AlertReminder", " traffic reminder accept");
            }
        }
    }

    /* loaded from: classes2.dex */
    public class b implements d7<String> {
        @Override // ka.d7
        public final void a(y6 y6Var) {
            if (y6Var.f32210b != -1) {
                n7.e("AlertReminder", " traffic reminder reject");
            }
        }
    }

    public l5(m5 m5Var, ContentRecord contentRecord, AppInfo appInfo) {
        this.f31403b = m5Var;
        this.f31402a = contentRecord;
    }

    @Override // com.huawei.openalliance.ad.ppskit.utils.v.d
    public final void a() {
        m5 m5Var = this.f31403b;
        androidx.activity.n.R(m5Var.f31267a, Cdo.V, this.f31402a, new a());
        i5.a aVar = m5Var.f31268b;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // com.huawei.openalliance.ad.ppskit.utils.v.d
    public final void b() {
        m5 m5Var = this.f31403b;
        androidx.activity.n.R(m5Var.f31267a, Cdo.I, this.f31402a, new b());
        i5.a aVar = m5Var.f31268b;
        if (aVar != null) {
            aVar.b();
        }
    }
}
