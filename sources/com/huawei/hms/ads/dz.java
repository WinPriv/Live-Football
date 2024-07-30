package com.huawei.hms.ads;

import android.opengl.Matrix;

/* loaded from: classes2.dex */
public class dz {
    private static final float[] Code;
    private float B;
    private float C;
    private float S;
    private final dy V;
    private float Z;
    private int I = -1;
    private final float[] F = new float[16];
    private boolean D = false;
    private final float[] L = new float[16];

    static {
        float[] fArr = new float[16];
        Code = fArr;
        Matrix.setIdentityM(fArr, 0);
    }

    public dz(dy dyVar) {
        this.V = dyVar;
    }

    private void Code() {
        float[] fArr = this.F;
        Matrix.setIdentityM(fArr, 0);
        Matrix.translateM(fArr, 0, this.C, this.S, gl.Code);
        Matrix.scaleM(fArr, 0, this.Z, this.B, 1.0f);
        this.D = true;
    }

    public void V(float f, float f10) {
        this.C = f;
        this.S = f10;
        this.D = false;
    }

    private float[] V() {
        if (!this.D) {
            Code();
        }
        return this.F;
    }

    public void Code(float f, float f10) {
        this.Z = f;
        this.B = f10;
        this.D = false;
    }

    public void Code(int i10) {
        this.I = i10;
    }

    public void Code(ea eaVar, float[] fArr) {
        Matrix.multiplyMM(this.L, 0, fArr, 0, V(), 0);
        eaVar.Code(new eb(this.L, this.V.Code(), 0, this.V.I(), this.V.C(), this.V.Z(), Code, this.V.V(), this.I, this.V.B()));
    }
}
