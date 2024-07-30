package ka;

import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.inter.data.AppInfo;
import com.huawei.openalliance.ad.ppskit.utils.v;
import ka.i5;

/* loaded from: classes2.dex */
public final class j5 implements v.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ContentRecord f31319a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k5 f31320b;

    public j5(k5 k5Var, ContentRecord contentRecord, AppInfo appInfo) {
        this.f31320b = k5Var;
        this.f31319a = contentRecord;
    }

    @Override // com.huawei.openalliance.ad.ppskit.utils.v.d
    public final void a() {
        ContentRecord contentRecord = this.f31319a;
        k5 k5Var = this.f31320b;
        k5Var.a("116", contentRecord);
        i5.a aVar = k5Var.f31268b;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // com.huawei.openalliance.ad.ppskit.utils.v.d
    public final void b() {
        ContentRecord contentRecord = this.f31319a;
        k5 k5Var = this.f31320b;
        k5Var.a("117", contentRecord);
        i5.a aVar = k5Var.f31268b;
        if (aVar != null) {
            aVar.b();
        }
    }
}
