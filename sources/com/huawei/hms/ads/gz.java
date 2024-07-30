package com.huawei.hms.ads;

import android.content.Context;
import com.huawei.hms.ads.hd;
import com.iab.omid.library.huawei.adsession.AdEvents;
import com.iab.omid.library.huawei.adsession.AdSession;
import com.iab.omid.library.huawei.adsession.media.InteractionType;
import com.iab.omid.library.huawei.adsession.media.MediaEvents;
import com.iab.omid.library.huawei.adsession.media.PlayerState;
import com.iab.omid.library.huawei.adsession.media.VastProperties;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class gz extends gy implements gw {
    public static final int Code = 200;
    private static boolean I = false;
    private static final String V = "VideoEventAgent";
    private hd C;
    private final List<MediaEvents> Z = new ArrayList();
    private final List<AdEvents> B = new ArrayList();
    private boolean S = false;
    private int F = 0;
    private float D = gl.Code;
    private boolean L = false;

    static {
        boolean z10;
        if (hb.Code("com.iab.omid.library.huawei.adsession.media.MediaEvents") && hb.Code(hb.f21700e)) {
            z10 = true;
        } else {
            z10 = false;
        }
        I = z10;
    }

    public static boolean C() {
        return I;
    }

    private String D() {
        return V + hashCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F() {
        float f;
        if (ex.Code()) {
            ex.Code(D(), "volumeChangeInner %s", Boolean.valueOf(this.S));
        }
        if (this.S) {
            f = gl.Code;
        } else {
            f = 1.0f;
        }
        V(f);
    }

    @Override // com.huawei.hms.ads.gy
    public void B() {
        if (this.B.isEmpty()) {
            ex.I(D(), "impressionOccurred, mAdEventList isEmpty");
            return;
        }
        try {
            Iterator<AdEvents> it = this.B.iterator();
            while (it.hasNext()) {
                it.next().impressionOccurred();
            }
        } catch (IllegalStateException unused) {
            ex.V(D(), "impressionOccurred, fail");
        }
    }

    @Override // com.huawei.hms.ads.gy
    public void Code() {
        if (this.Z.isEmpty()) {
            ex.I(D(), "firstQuartile, mVideoEventsList isEmpty");
            return;
        }
        try {
            for (MediaEvents mediaEvents : this.Z) {
                if (mediaEvents != null) {
                    ex.V(D(), com.huawei.openalliance.ad.constant.cp.V);
                    mediaEvents.firstQuartile();
                }
            }
        } catch (IllegalStateException unused) {
            ex.V(D(), "firstQuartile, fail");
        }
    }

    public hd S() {
        return this.C;
    }

    @Override // com.huawei.hms.ads.gy
    public void Z() {
        if (this.Z.isEmpty()) {
            ex.I(D(), "thirdQuartile, mVideoEventsList isEmpty");
            return;
        }
        try {
            for (MediaEvents mediaEvents : this.Z) {
                if (mediaEvents != null) {
                    ex.V(D(), "thirdQuartile ");
                    mediaEvents.thirdQuartile();
                }
            }
        } catch (IllegalStateException unused) {
            ex.V(D(), "thirdQuartile, fail");
        }
    }

    @Override // com.huawei.hms.ads.gy, com.huawei.hms.ads.hv
    public void a() {
        this.D = gl.Code;
        this.F = 0;
        if (this.Z.isEmpty()) {
            return;
        }
        try {
            for (MediaEvents mediaEvents : this.Z) {
                if (mediaEvents != null) {
                    if (ex.Code()) {
                        ex.Code(D(), "complete ");
                    }
                    mediaEvents.complete();
                }
            }
        } catch (IllegalStateException unused) {
            ex.V(D(), "complete, fail");
        }
    }

    @Override // com.huawei.hms.ads.gy, com.huawei.hms.ads.hv
    public void b() {
        if (this.Z.isEmpty()) {
            return;
        }
        try {
            for (MediaEvents mediaEvents : this.Z) {
                if (mediaEvents != null) {
                    if (ex.Code()) {
                        ex.Code(D(), "bufferStart ");
                    }
                    mediaEvents.bufferStart();
                }
            }
        } catch (IllegalStateException unused) {
            ex.V(D(), "bufferStart, fail");
        }
    }

    @Override // com.huawei.hms.ads.gy, com.huawei.hms.ads.hv
    public void c() {
        if (this.Z.isEmpty()) {
            return;
        }
        try {
            for (MediaEvents mediaEvents : this.Z) {
                if (mediaEvents != null) {
                    if (ex.Code()) {
                        ex.Code(D(), "bufferFinish ");
                    }
                    mediaEvents.bufferFinish();
                }
            }
        } catch (IllegalStateException unused) {
            ex.V(D(), "bufferFinish, fail");
        }
    }

    @Override // com.huawei.hms.ads.gy, com.huawei.hms.ads.hv
    public void d() {
        if (!this.L) {
            this.F = 0;
        }
        if (this.Z.isEmpty()) {
            ex.I(D(), "skipped, mVideoEventsList isEmpty");
            return;
        }
        try {
            for (MediaEvents mediaEvents : this.Z) {
                if (mediaEvents != null) {
                    if (ex.Code()) {
                        ex.Code(D(), "skipped ");
                    }
                    mediaEvents.skipped();
                }
            }
        } catch (IllegalStateException unused) {
            ex.V(D(), "skipped, fail");
        }
    }

    @Override // com.huawei.hms.ads.gy, com.huawei.hms.ads.hv
    public void e() {
        if (!this.Z.isEmpty() && 1 == this.F) {
            try {
                this.F = 2;
                for (MediaEvents mediaEvents : this.Z) {
                    if (mediaEvents != null) {
                        if (ex.Code()) {
                            ex.Code(D(), "pause ");
                        }
                        mediaEvents.pause();
                    }
                }
            } catch (IllegalStateException unused) {
                ex.V(D(), "pause, fail");
            }
        }
    }

    @Override // com.huawei.hms.ads.gy, com.huawei.hms.ads.hv
    public void f() {
        this.F = 1;
        if (this.Z.isEmpty()) {
            ex.I(D(), "resume, mVideoEventsList isEmpty");
            return;
        }
        try {
            for (MediaEvents mediaEvents : this.Z) {
                if (mediaEvents != null) {
                    if (ex.Code()) {
                        ex.Code(D(), "resume ");
                    }
                    mediaEvents.resume();
                }
            }
        } catch (IllegalStateException unused) {
            ex.V(D(), "resume, fail");
        }
    }

    @Override // com.huawei.hms.ads.hv
    public void Code(float f) {
        int Code2 = hc.Code(this.D, f);
        if (ex.Code()) {
            ex.Code(D(), "onProgress %s", Integer.valueOf(Code2));
        }
        if (Code2 == 25) {
            this.D = Code2;
            Code();
        } else if (Code2 == 50) {
            this.D = Code2;
            I();
        } else {
            if (Code2 != 75) {
                return;
            }
            this.D = Code2;
            Z();
        }
    }

    @Override // com.huawei.hms.ads.gy
    public void I() {
        if (this.Z.isEmpty()) {
            ex.I(D(), "midpoint, mVideoEventsList isEmpty");
            return;
        }
        try {
            for (MediaEvents mediaEvents : this.Z) {
                if (mediaEvents != null) {
                    ex.V(D(), "midpoint ");
                    mediaEvents.midpoint();
                }
            }
        } catch (IllegalStateException unused) {
            ex.V(D(), "midpoint, fail");
        }
    }

    @Override // com.huawei.hms.ads.gw
    public void V() {
        if (ex.Code()) {
            ex.Code(D(), "release ");
        }
        this.F = 0;
        hd hdVar = this.C;
        if (hdVar != null) {
            hdVar.V();
        }
        gb.w.a(200L, new Runnable() { // from class: com.huawei.hms.ads.gz.2
            @Override // java.lang.Runnable
            public void run() {
                gz.this.Z.clear();
                gz.this.B.clear();
            }
        });
    }

    @Override // com.huawei.hms.ads.gy
    public void Code(float f, float f10) {
        if (this.Z.isEmpty()) {
            return;
        }
        try {
            for (MediaEvents mediaEvents : this.Z) {
                if (mediaEvents != null) {
                    if (ex.Code()) {
                        ex.Code(D(), "start，duration %s", Float.valueOf(f));
                    }
                    mediaEvents.start(f, f10);
                }
            }
        } catch (IllegalStateException unused) {
            ex.V(D(), "start, fail");
        }
    }

    @Override // com.huawei.hms.ads.gy, com.huawei.hms.ads.hv
    public void V(float f) {
        hd hdVar;
        ex.V(D(), "volumeChange %s", Float.valueOf(f));
        this.S = Math.abs(f - gl.Code) < 1.0E-8f;
        if (this.Z.isEmpty() || this.F != 1) {
            return;
        }
        try {
            for (MediaEvents mediaEvents : this.Z) {
                if (mediaEvents != null && (hdVar = this.C) != null) {
                    if (f == -1.0f) {
                        mediaEvents.volumeChange(hdVar.Code(this.S));
                    } else {
                        mediaEvents.volumeChange(f);
                    }
                }
            }
        } catch (IllegalStateException unused) {
            ex.V(D(), "volumeChange, fail");
        }
    }

    @Override // com.huawei.hms.ads.hv
    public void Code(float f, boolean z10) {
        this.F = 1;
        this.S = z10;
        Code(f, z10 ? gl.Code : 1.0f);
    }

    @Override // com.huawei.hms.ads.hv
    public void V(boolean z10) {
        this.L = z10;
    }

    @Override // com.huawei.hms.ads.gw
    public void Code(hl hlVar) {
        String D;
        String str;
        if (I) {
            if ((hlVar instanceof gp) && C()) {
                gp gpVar = (gp) hlVar;
                Context I2 = gpVar.I();
                if (I2 != null) {
                    ex.V(D(), "Set VolumeChange observer");
                    hd hdVar = new hd(I2);
                    this.C = hdVar;
                    hdVar.Code(new hd.b() { // from class: com.huawei.hms.ads.gz.1
                        @Override // com.huawei.hms.ads.hd.b
                        public void Code() {
                            gz.this.F();
                        }
                    });
                }
                List<AdSession> V2 = gpVar.V();
                if (!V2.isEmpty()) {
                    for (AdSession adSession : V2) {
                        if (adSession != null) {
                            if (ex.Code()) {
                                ex.Code(D(), "setAdSessionAgent, add mVideoEventsList ");
                            }
                            this.Z.add(MediaEvents.createMediaEvents(adSession));
                            this.B.add(AdEvents.createAdEvents(adSession));
                        }
                    }
                    return;
                }
                D = D();
                str = "adSessionList is empty";
            } else {
                D = D();
                str = "adsessionAgent is null";
            }
            ex.V(D, str);
        }
    }

    @Override // com.huawei.hms.ads.gy, com.huawei.hms.ads.hv
    public void Code(hw hwVar) {
        InteractionType Code2;
        if (!hw.Code() || (Code2 = hw.Code(hwVar)) == null) {
            return;
        }
        Code(Code2);
    }

    @Override // com.huawei.hms.ads.hv
    public void Code(hx hxVar) {
        PlayerState Code2;
        if (!hx.Code() || (Code2 = hx.Code(hxVar)) == null) {
            return;
        }
        if (ex.Code()) {
            ex.Code(D(), "playerStateChange %s", hxVar.toString());
        }
        Code(Code2);
    }

    @Override // com.huawei.hms.ads.gy, com.huawei.hms.ads.hv
    public void Code(hz hzVar) {
        VastProperties V2;
        if (hzVar == null || !hz.Code() || (V2 = hzVar.V()) == null) {
            return;
        }
        Code(V2);
    }

    @Override // com.huawei.hms.ads.gy
    public void Code(InteractionType interactionType) {
        if (this.Z.isEmpty()) {
            return;
        }
        try {
            for (MediaEvents mediaEvents : this.Z) {
                if (mediaEvents != null) {
                    if (ex.Code()) {
                        ex.Code(D(), "adUserInteraction ");
                    }
                    mediaEvents.adUserInteraction(interactionType);
                }
            }
        } catch (IllegalStateException unused) {
            ex.V(D(), "adUserInteraction, fail");
        }
    }

    @Override // com.huawei.hms.ads.gy
    public void Code(PlayerState playerState) {
        if (this.Z.isEmpty()) {
            return;
        }
        try {
            for (MediaEvents mediaEvents : this.Z) {
                if (mediaEvents != null) {
                    mediaEvents.playerStateChange(PlayerState.COLLAPSED);
                }
            }
        } catch (IllegalStateException unused) {
            ex.V(D(), "playerStateChange, fail");
        }
    }

    @Override // com.huawei.hms.ads.gy
    public void Code(VastProperties vastProperties) {
        if (this.B.isEmpty()) {
            return;
        }
        try {
            for (AdEvents adEvents : this.B) {
                if (adEvents != null) {
                    if (ex.Code()) {
                        ex.Code(D(), "loaded ");
                    }
                    adEvents.loaded(vastProperties);
                }
            }
        } catch (IllegalStateException unused) {
            ex.V(D(), "loaded, fail");
        }
    }
}
