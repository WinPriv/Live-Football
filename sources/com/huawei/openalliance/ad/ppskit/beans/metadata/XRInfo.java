package com.huawei.openalliance.ad.ppskit.beans.metadata;

import com.huawei.openalliance.ad.ppskit.constant.NetworkTypeForControl;
import java.io.Serializable;
import ma.h;

/* loaded from: classes2.dex */
public class XRInfo implements Serializable {
    private static final long serialVersionUID = 30439300;
    private ImageInfo bg;
    private String cta;
    private String df;

    @h(b = NetworkTypeForControl.class, c = 0)
    private int downNet = 0;
    private String mfn;
    private ImageInfo prv;
    private String title;
    private ImageInfo xrFile;

    public final String c() {
        return this.df;
    }

    public final ImageInfo k() {
        return this.xrFile;
    }

    public final String p() {
        return this.mfn;
    }

    public final ImageInfo q() {
        return this.bg;
    }

    public final ImageInfo r() {
        return this.prv;
    }

    public final String u() {
        return this.title;
    }

    public final String v() {
        return this.cta;
    }

    public final int x() {
        return this.downNet;
    }
}
