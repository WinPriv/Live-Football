package com.huawei.openalliance.ad.views;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.Matrix;
import com.huawei.hms.ads.dy;
import com.huawei.hms.ads.dz;
import com.huawei.hms.ads.ex;
import com.huawei.hms.ads.gl;
import com.huawei.hms.ads.kl;

/* loaded from: classes2.dex */
public abstract class BaseGlVideoView extends BaseVideoView implements kl {
    public final dz V0;
    public Integer W0;
    public Integer X0;
    public final float[] Y0;

    public BaseGlVideoView(Context context) {
        super(context);
        this.V0 = new dz(new dy());
        this.Y0 = new float[16];
    }

    public final void Code(int i10, int i11) {
        GLES20.glViewport(0, 0, i10, i11);
        float f = i10;
        float f10 = i11;
        Matrix.orthoM(this.Y0, 0, gl.Code, f, gl.Code, f10, -1.0f, 1.0f);
        float f11 = f / 2.0f;
        float f12 = f10 / 2.0f;
        Integer num = this.W0;
        if (num != null) {
            i10 = num.intValue();
        }
        Integer num2 = this.X0;
        if (num2 != null) {
            i11 = num2.intValue();
        }
        dz dzVar = this.V0;
        dzVar.Code(i10, i11);
        dzVar.V(f11, f12);
    }

    @Override // com.huawei.openalliance.ad.views.BaseVideoView
    public final void c(float f, float f10, int i10, int i11) {
        int i12 = this.D0;
        if (i12 != 1) {
            if (i12 == 2) {
                if (f10 < f) {
                    this.X0 = Integer.valueOf(i11);
                    this.W0 = Integer.valueOf((int) (i11 * f));
                } else {
                    this.W0 = Integer.valueOf(i10);
                    this.X0 = Integer.valueOf((int) (i10 / f));
                }
                this.V0.Code(this.W0.intValue(), this.X0.intValue());
                return;
            }
            return;
        }
        Code(0, 0);
    }

    @Override // com.huawei.openalliance.ad.views.BaseVideoView, com.huawei.hms.ads.km
    public final void destroyView() {
        super.destroyView();
    }

    public abstract String getLogTag();

    public void setVideoRatio(Float f) {
        ex.Code(getLogTag(), "setVideoRatio %s", f);
    }
}
