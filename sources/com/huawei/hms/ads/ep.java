package com.huawei.hms.ads;

/* loaded from: classes2.dex */
public class ep {
    public static final String Code = "true";
    private static final String I = "LinkedAdConfiguration";
    public static final String V = "false";
    private int Z = 0;
    private String B = null;
    private int C = 0;
    private String S = "n";
    private boolean F = false;
    private boolean D = false;

    public int B() {
        return this.Z;
    }

    public String C() {
        return this.B;
    }

    public int Code() {
        return this.C;
    }

    public boolean I() {
        return this.F;
    }

    public String V() {
        return this.S;
    }

    public boolean Z() {
        return this.D;
    }

    public void Code(int i10) {
        this.C = i10;
    }

    public void V(int i10) {
        ex.Code(I, "setLinkedVideoMode %s", Integer.valueOf(i10));
        this.Z = i10;
    }

    public void Code(String str) {
        this.S = str;
    }

    public void V(String str) {
        this.B = str;
    }

    public void Code(boolean z10) {
        this.F = z10;
    }

    public void V(boolean z10) {
        this.D = z10;
    }
}
