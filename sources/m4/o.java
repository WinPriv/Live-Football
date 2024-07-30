package m4;

import com.huawei.hms.ads.gl;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: AuxEffectInfo.java */
/* loaded from: classes2.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final int f32789a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final float f32790b = gl.Code;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        if (this.f32789a == oVar.f32789a && Float.compare(oVar.f32790b, this.f32790b) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f32790b) + ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f32789a) * 31);
    }
}
