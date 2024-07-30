package com.huawei.hms.ads;

/* loaded from: classes2.dex */
public class fp {
    private static final String Code = "fp";

    public static fo Code(int i10, ka kaVar) {
        ex.V(Code, "create ad mediator: %s", Integer.valueOf(i10));
        if (i10 != 2 && i10 != 3) {
            return new fq(kaVar);
        }
        return new fr(kaVar);
    }
}
