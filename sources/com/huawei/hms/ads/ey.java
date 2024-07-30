package com.huawei.hms.ads;

/* loaded from: classes2.dex */
public class ey {
    private static final String Code = "HiAdSDKLog";
    private static final int I = 10;
    private static final String V = "HiAdSDK.";
    private static fc Z = fd.Code();
    private String C;
    private int B = 4;
    private boolean S = false;

    private fe I(int i10, String str, String str2) {
        fe feVar = new fe(this.C, i10, str);
        feVar.Code((fe) str2);
        return feVar;
    }

    public fc Code() {
        return Z;
    }

    public void V(int i10, String str, String str2) {
        if (Code(i10)) {
            String b10 = s.f.b(V, str);
            Z.Code(I(i10, b10, str2), i10, b10);
        }
    }

    public void Code(int i10, String str, String str2) {
        this.B = i10;
        this.C = str2;
        Z.Code(str, Code);
        this.S = true;
    }

    public void Code(int i10, String str, String str2, Throwable th) {
        if (th != null) {
            Code(i10);
        }
    }

    public void Code(int i10, String str, Throwable th) {
        if (th != null) {
            Code(i10);
        }
    }

    public void Code(String str, String str2) {
        Z.Code(I(4, str, str2), 4, str);
    }

    public boolean Code(int i10) {
        return this.S && i10 >= this.B;
    }
}
