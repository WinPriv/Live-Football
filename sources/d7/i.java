package d7;

import com.huawei.hms.ads.gl;

/* compiled from: RoundedCornerTreatment.java */
/* loaded from: classes2.dex */
public final class i extends androidx.activity.n {
    public final float J0;

    public i() {
        super(0);
        this.J0 = -1.0f;
    }

    @Override // androidx.activity.n
    public final void y0(float f, float f10, m mVar) {
        mVar.e(gl.Code, f10 * f, 180.0f, 90.0f);
        float f11 = f10 * 2.0f * f;
        mVar.a(gl.Code, gl.Code, f11, f11, 180.0f, 90.0f);
    }
}
