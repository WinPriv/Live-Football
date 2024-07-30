package com.huawei.hms.ads;

import com.iab.omid.library.huawei.adsession.media.Position;
import com.iab.omid.library.huawei.adsession.media.VastProperties;

/* loaded from: classes2.dex */
public class hz implements hm {
    private static boolean Code = hb.Code("com.iab.omid.library.huawei.adsession.media.VastProperties");
    private final hy B;
    private Float C;
    private final boolean I;
    private final boolean V;
    private final VastProperties Z;

    private hz(float f, boolean z10, hy hyVar, VastProperties vastProperties) {
        this.V = false;
        this.C = Float.valueOf(gl.Code);
        this.C = Float.valueOf(f);
        this.I = z10;
        this.B = hyVar;
        this.Z = vastProperties;
    }

    public static hz Code(float f, boolean z10, hy hyVar) {
        Position Code2;
        return new hz(f, z10, hyVar, (hyVar == null || !Code() || (Code2 = hy.Code(hyVar)) == null) ? null : VastProperties.createVastPropertiesForSkippableMedia(f, z10, Code2));
    }

    public VastProperties V() {
        return this.Z;
    }

    private hz(boolean z10, hy hyVar, VastProperties vastProperties) {
        this.V = false;
        this.C = Float.valueOf(gl.Code);
        this.I = z10;
        this.B = hyVar;
        this.Z = vastProperties;
    }

    public static hz Code(boolean z10, hy hyVar) {
        Position Code2;
        VastProperties vastProperties = null;
        if (!Code) {
            return null;
        }
        if (hyVar != null && hy.Code() && (Code2 = hy.Code(hyVar)) != null) {
            vastProperties = VastProperties.createVastPropertiesForNonSkippableMedia(z10, Code2);
        }
        return new hz(z10, hyVar, vastProperties);
    }

    public static boolean Code() {
        return Code;
    }
}
