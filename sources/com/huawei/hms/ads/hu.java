package com.huawei.hms.ads;

import com.iab.omid.library.huawei.adsession.media.Position;
import com.iab.omid.library.huawei.adsession.media.VastProperties;

/* loaded from: classes2.dex */
public class hu implements hm {
    private static boolean Code = hb.Code("com.iab.omid.library.huawei.adsession.media.VastProperties");
    private final ht B;
    private Float C;
    private final boolean I;
    private final boolean V;
    private final VastProperties Z;

    private hu(float f, boolean z10, ht htVar, VastProperties vastProperties) {
        this.V = false;
        this.C = Float.valueOf(gl.Code);
        this.C = Float.valueOf(f);
        this.I = z10;
        this.B = htVar;
        this.Z = vastProperties;
    }

    public static hu Code(float f, boolean z10, ht htVar) {
        Position Code2;
        return new hu(f, z10, htVar, (htVar == null || !Code() || (Code2 = ht.Code(htVar)) == null) ? null : VastProperties.createVastPropertiesForSkippableMedia(f, z10, Code2));
    }

    public ht B() {
        return this.B;
    }

    public VastProperties C() {
        return this.Z;
    }

    public Float I() {
        return this.C;
    }

    public boolean V() {
        return false;
    }

    public boolean Z() {
        return this.I;
    }

    private hu(boolean z10, ht htVar, VastProperties vastProperties) {
        this.V = false;
        this.C = Float.valueOf(gl.Code);
        this.I = z10;
        this.B = htVar;
        this.Z = vastProperties;
    }

    public static hu Code(boolean z10, ht htVar) {
        Position Code2;
        return new hu(z10, htVar, (htVar == null || !Code() || (Code2 = ht.Code(htVar)) == null) ? null : VastProperties.createVastPropertiesForNonSkippableMedia(z10, Code2));
    }

    public static boolean Code() {
        return Code;
    }
}
