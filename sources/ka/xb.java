package ka;

import com.huawei.hms.ads.gl;
import com.iab.omid.library.huawei.adsession.media.Position;
import com.iab.omid.library.huawei.adsession.media.VastProperties;

/* loaded from: classes2.dex */
public final class xb {

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f32184b = jb.a("com.iab.omid.library.huawei.adsession.media.VastProperties");

    /* renamed from: a, reason: collision with root package name */
    public final VastProperties f32185a;

    public xb(VastProperties vastProperties) {
        this.f32185a = vastProperties;
    }

    public static xb a(boolean z10) {
        VastProperties vastProperties;
        Position k10;
        boolean z11 = wb.f32132t;
        if (f32184b && (k10 = wb.k()) != null) {
            vastProperties = VastProperties.createVastPropertiesForSkippableMedia(gl.Code, z10, k10);
        } else {
            vastProperties = null;
        }
        return new xb(vastProperties);
    }
}
