package d7;

import com.huawei.hms.ads.gl;

/* compiled from: CutCornerTreatment.java */
/* loaded from: classes2.dex */
public final class d extends androidx.activity.n {
    public final float J0;

    public d() {
        super(0);
        this.J0 = -1.0f;
    }

    @Override // androidx.activity.n
    public final void y0(float f, float f10, m mVar) {
        mVar.e(gl.Code, f10 * f, 180.0f, 90.0f);
        double d10 = f10;
        double d11 = f;
        mVar.d((float) (Math.sin(Math.toRadians(90.0f)) * d10 * d11), (float) (Math.sin(Math.toRadians(gl.Code)) * d10 * d11));
    }
}
