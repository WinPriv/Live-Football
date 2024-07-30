package com.huawei.hms.ads;

/* loaded from: classes2.dex */
public class jg {
    Long B;
    Boolean C;
    Long Code;
    String F;
    Integer I;
    String S;
    Integer V;
    String Z;

    /* loaded from: classes2.dex */
    public static final class a {
        Long B;
        Boolean C;
        Long Code;
        String F;
        Integer I;
        String S;
        Integer V;
        String Z;

        public a Code(Boolean bool) {
            this.C = bool;
            return this;
        }

        public a I(String str) {
            this.F = str;
            return this;
        }

        public a V(Integer num) {
            this.I = num;
            return this;
        }

        public a Code(Integer num) {
            this.V = num;
            return this;
        }

        public a V(Long l10) {
            this.B = l10;
            return this;
        }

        public a Code(Long l10) {
            this.Code = l10;
            return this;
        }

        public a V(String str) {
            this.S = str;
            return this;
        }

        public a Code(String str) {
            this.Z = str;
            return this;
        }

        public jg Code() {
            jg jgVar = new jg();
            jgVar.Code = this.Code;
            jgVar.V = this.V;
            jgVar.I = this.I;
            jgVar.B = this.B;
            jgVar.Z = this.Z;
            jgVar.C = this.C;
            jgVar.S = this.S;
            jgVar.F = this.F;
            return jgVar;
        }
    }

    public Long B() {
        return this.B;
    }

    public Boolean C() {
        return this.C;
    }

    public Long Code() {
        return this.Code;
    }

    public String F() {
        return this.F;
    }

    public Integer I() {
        return this.I;
    }

    public String S() {
        return this.S;
    }

    public Integer V() {
        return this.V;
    }

    public String Z() {
        return this.Z;
    }

    public void Code(Boolean bool) {
        this.C = bool;
    }

    public void I(String str) {
        this.F = str;
    }

    public void V(Integer num) {
        this.I = num;
    }

    public void Code(Integer num) {
        this.V = num;
    }

    public void V(Long l10) {
        this.B = l10;
    }

    public void Code(Long l10) {
        this.Code = l10;
    }

    public void V(String str) {
        this.S = str;
    }

    public void Code(String str) {
        this.Z = str;
    }
}
