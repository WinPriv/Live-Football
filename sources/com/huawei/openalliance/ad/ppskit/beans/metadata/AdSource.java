package com.huawei.openalliance.ad.ppskit.beans.metadata;

import androidx.transition.n;
import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import java.io.Serializable;
import java.util.List;

@DataKeep
/* loaded from: classes2.dex */
public class AdSource implements Serializable {
    private static final long serialVersionUID = 30457300;
    private int displayPosition;
    private String dspLogo;
    private String dspName;

    /* JADX WARN: Removed duplicated region for block: B:14:0x0023 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[LOOP:0: B:6:0x000c->B:16:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.openalliance.ad.ppskit.beans.metadata.AdSource a(java.util.List<com.huawei.openalliance.ad.ppskit.beans.metadata.AdSource> r4) {
        /*
            boolean r0 = androidx.transition.n.M(r4)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.util.Iterator r4 = r4.iterator()
        Lc:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L24
            java.lang.Object r0 = r4.next()
            com.huawei.openalliance.ad.ppskit.beans.metadata.AdSource r0 = (com.huawei.openalliance.ad.ppskit.beans.metadata.AdSource) r0
            if (r0 == 0) goto L20
            int r2 = r0.displayPosition
            r3 = 1
            if (r2 != r3) goto L20
            goto L21
        L20:
            r3 = 0
        L21:
            if (r3 == 0) goto Lc
            return r0
        L24:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.ppskit.beans.metadata.AdSource.a(java.util.List):com.huawei.openalliance.ad.ppskit.beans.metadata.AdSource");
    }

    public static AdSource c(List<AdSource> list) {
        boolean z10;
        if (n.M(list)) {
            return null;
        }
        for (AdSource adSource : list) {
            if (adSource != null && adSource.displayPosition == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return adSource;
            }
        }
        return null;
    }

    public final void b(String str) {
        this.dspName = str;
    }

    public final String k() {
        return this.dspLogo;
    }

    public final void l(String str) {
        this.dspLogo = str;
    }

    public final String a() {
        return this.dspName;
    }

    public final void a(int i10) {
        this.displayPosition = i10;
    }
}
