package ab;

import android.content.Context;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.handlers.l;
import com.huawei.openalliance.ad.ppskit.utils.o2;
import java.util.Set;
import ka.ii;

/* loaded from: classes2.dex */
public final class c extends ii {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Context context, ContentRecord contentRecord, int i10) {
        super(context, contentRecord);
        this.f = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0130 A[Catch: all -> 0x0167, ActivityNotFoundException -> 0x0178, TryCatch #4 {ActivityNotFoundException -> 0x0178, all -> 0x0167, blocks: (B:65:0x011a, B:67:0x0124, B:72:0x0130, B:74:0x013f, B:75:0x0143, B:76:0x0148, B:78:0x014e, B:80:0x015a), top: B:64:0x011a }] */
    @Override // ka.ii
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a() {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ab.c.a():boolean");
    }

    public final String e() {
        Set<String> stringSet;
        l d10 = l.d(this.f31307a);
        String h12 = this.f31308b.h1();
        synchronized (d10.f22585a) {
            stringSet = d10.G(h12).getStringSet("def_broswer_pkg_list", oa.b.f33787a);
        }
        for (String str : stringSet) {
            if (o2.c(this.f31307a, str)) {
                return str;
            }
        }
        return "";
    }
}
