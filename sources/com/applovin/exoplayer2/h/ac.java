package com.applovin.exoplayer2.h;

import android.os.Bundle;
import com.applovin.exoplayer2.g;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class ac implements com.applovin.exoplayer2.g {

    /* renamed from: b */
    public static final g.a<ac> f15280b = new l0();

    /* renamed from: a */
    public final int f15281a;

    /* renamed from: c */
    private final com.applovin.exoplayer2.v[] f15282c;

    /* renamed from: d */
    private int f15283d;

    public ac(com.applovin.exoplayer2.v... vVarArr) {
        boolean z10;
        if (vVarArr.length > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        com.applovin.exoplayer2.l.a.a(z10);
        this.f15282c = vVarArr;
        this.f15281a = vVarArr.length;
        a();
    }

    private static int c(int i10) {
        return i10 | 16384;
    }

    public com.applovin.exoplayer2.v a(int i10) {
        return this.f15282c[i10];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ac.class != obj.getClass()) {
            return false;
        }
        ac acVar = (ac) obj;
        if (this.f15281a == acVar.f15281a && Arrays.equals(this.f15282c, acVar.f15282c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.f15283d == 0) {
            this.f15283d = IronSourceError.ERROR_NON_EXISTENT_INSTANCE + Arrays.hashCode(this.f15282c);
        }
        return this.f15283d;
    }

    private static String b(int i10) {
        return Integer.toString(i10, 36);
    }

    public int a(com.applovin.exoplayer2.v vVar) {
        int i10 = 0;
        while (true) {
            com.applovin.exoplayer2.v[] vVarArr = this.f15282c;
            if (i10 >= vVarArr.length) {
                return -1;
            }
            if (vVar == vVarArr[i10]) {
                return i10;
            }
            i10++;
        }
    }

    public static /* synthetic */ ac a(Bundle bundle) {
        return new ac((com.applovin.exoplayer2.v[]) com.applovin.exoplayer2.l.c.a(com.applovin.exoplayer2.v.F, bundle.getParcelableArrayList(b(0)), com.applovin.exoplayer2.common.a.s.g()).toArray(new com.applovin.exoplayer2.v[0]));
    }

    private void a() {
        String a10 = a(this.f15282c[0].f16830c);
        int c10 = c(this.f15282c[0].f16832e);
        int i10 = 1;
        while (true) {
            com.applovin.exoplayer2.v[] vVarArr = this.f15282c;
            if (i10 >= vVarArr.length) {
                return;
            }
            if (!a10.equals(a(vVarArr[i10].f16830c))) {
                com.applovin.exoplayer2.v[] vVarArr2 = this.f15282c;
                a("languages", vVarArr2[0].f16830c, vVarArr2[i10].f16830c, i10);
                return;
            } else {
                if (c10 != c(this.f15282c[i10].f16832e)) {
                    a("role flags", Integer.toBinaryString(this.f15282c[0].f16832e), Integer.toBinaryString(this.f15282c[i10].f16832e), i10);
                    return;
                }
                i10++;
            }
        }
    }

    private static String a(String str) {
        return (str == null || str.equals(com.anythink.expressad.exoplayer.b.ar)) ? "" : str;
    }

    private static void a(String str, String str2, String str3, int i10) {
        StringBuilder o = a3.k.o("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        o.append(str3);
        o.append("' (track ");
        o.append(i10);
        o.append(")");
        com.applovin.exoplayer2.l.q.c("TrackGroup", "", new IllegalStateException(o.toString()));
    }
}
