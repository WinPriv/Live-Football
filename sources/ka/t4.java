package ka;

import com.huawei.openalliance.ad.ppskit.db.bean.AdSampleRecord;
import java.util.List;

/* loaded from: classes2.dex */
public final class t4 extends y6.m {
    public t4(s4 s4Var) {
        super(s4Var);
    }

    @Override // y6.m
    public final void a() {
        ((List) this.f36805b).add(new AdSampleRecord());
        ((List) this.f36806c).add(new AdSampleRecord());
    }

    @Override // y6.m
    public final String b() {
        return "BFEDbUpdateHelper";
    }
}
