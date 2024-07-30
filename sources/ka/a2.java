package ka;

import android.content.ContentValues;
import android.content.Context;
import com.huawei.openalliance.ad.ppskit.beans.inner.AdContentData;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class a2 extends y {
    public a2() {
        super("updateContentOnAdLoad");
    }

    @Override // ka.y, ka.b2
    public final void b(Context context, String str, String str2, String str3, com.huawei.android.hms.ppskit.a aVar) {
        ContentRecord n10;
        com.huawei.openalliance.ad.ppskit.handlers.e0 e0Var;
        AdContentData adContentData = (AdContentData) com.huawei.openalliance.ad.ppskit.utils.y0.b(null, str3, AdContentData.class, new Class[0]);
        ArrayList arrayList = new ArrayList();
        arrayList.add("priority");
        arrayList.add(ContentRecord.LAST_SHOW_TIME);
        arrayList.add(ContentRecord.DISPLAY_COUNT);
        if (adContentData.o() == 3) {
            e0Var = com.huawei.openalliance.ad.ppskit.handlers.f0.E(context);
            n10 = e0Var.o(str, adContentData.B(), adContentData.p(), adContentData.A());
        } else {
            com.huawei.openalliance.ad.ppskit.handlers.e0 e0Var2 = new com.huawei.openalliance.ad.ppskit.handlers.e0(context);
            n10 = e0Var2.n(str, adContentData.B(), adContentData.A());
            e0Var = e0Var2;
        }
        n10.y2(adContentData.N());
        n10.A0(adContentData.G());
        n10.r2(adContentData.I());
        e0Var.t(n10, arrayList);
        String i10 = n10.i();
        long F2 = n10.F2();
        ContentValues contentValues = new ContentValues();
        contentValues.put(ContentRecord.LAST_SHOW_TIME, Long.valueOf(F2));
        e0Var.l(e0Var.B(), contentValues, 23, new String[]{str, i10});
        e(aVar);
    }
}
