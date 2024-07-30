package com.huawei.openalliance.ad.constant;

import com.huawei.hms.ads.ex;

/* loaded from: classes2.dex */
public class bm {
    private static final String Code = "PlacementPlayState";
    private final byte[] I;
    private a V;

    /* loaded from: classes2.dex */
    public enum a {
        SINGLE_INST,
        MAIN_VIEW,
        BACKUP_VIEW
    }

    public bm() {
        this.V = a.SINGLE_INST;
        this.I = new byte[0];
    }

    public a Code() {
        a aVar;
        synchronized (this.I) {
            aVar = this.V;
        }
        return aVar;
    }

    public boolean I(a aVar) {
        boolean z10;
        synchronized (this.I) {
            if (!V(aVar)) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public boolean V(a aVar) {
        boolean z10;
        synchronized (this.I) {
            if (aVar == this.V) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public bm(a aVar) {
        a aVar2 = a.SINGLE_INST;
        this.I = new byte[0];
        this.V = aVar;
    }

    public void Code(a aVar) {
        if (aVar == null) {
            return;
        }
        synchronized (this.I) {
            ex.V(Code, "switch to state: %s", aVar);
            this.V = aVar;
        }
    }
}
