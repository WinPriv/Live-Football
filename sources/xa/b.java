package xa;

import androidx.transition.n;
import com.huawei.openalliance.ad.constant.ba;
import com.huawei.openalliance.ad.ppskit.activity.SafeIntent;
import ka.d7;
import ka.y6;

/* loaded from: classes2.dex */
public final class b implements d7<String> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f36512a;

    public b(a aVar) {
        this.f36512a = aVar;
    }

    @Override // ka.d7
    public final void a(y6 y6Var) {
        SafeIntent m10;
        a aVar = this.f36512a;
        if (aVar != null && y6Var.f32210b == 200 && (m10 = n.m((String) y6Var.f32211c)) != null) {
            aVar.n(m10.getStringExtra(ba.f22070t), m10);
        }
    }
}
