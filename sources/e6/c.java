package e6;

import d6.w;
import m8.o;
import o8.s;

/* compiled from: DolbyVisionConfig.java */
/* loaded from: classes2.dex */
public final class c implements s {

    /* renamed from: a, reason: collision with root package name */
    public String f27764a;

    public /* synthetic */ c() {
    }

    public static c b(w wVar) {
        String str;
        wVar.F(2);
        int t10 = wVar.t();
        int i10 = t10 >> 1;
        int t11 = ((wVar.t() >> 3) & 31) | ((t10 & 1) << 5);
        if (i10 != 4 && i10 != 5 && i10 != 7) {
            if (i10 == 8) {
                str = "hev1";
            } else if (i10 == 9) {
                str = "avc3";
            } else {
                return null;
            }
        } else {
            str = "dvhe";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        String str2 = ".0";
        sb2.append(".0");
        sb2.append(i10);
        if (t11 >= 10) {
            str2 = ".";
        }
        sb2.append(str2);
        sb2.append(t11);
        return new c(sb2.toString());
    }

    @Override // o8.s
    public Object a() {
        throw new o(this.f27764a);
    }

    public /* synthetic */ c(String str) {
        this.f27764a = str;
    }
}
