package com.huawei.hms.ads;

import android.content.Context;
import android.view.View;
import com.anythink.expressad.foundation.d.c;
import com.huawei.openalliance.ad.inter.data.AdContentData;

/* loaded from: classes2.dex */
public class go implements ha {
    private static final String Code = "OmPresent";
    private hl I;
    private gw V;
    private boolean Z;
    private boolean B = true;
    private boolean C = false;
    private boolean S = false;
    private boolean F = false;
    private boolean D = false;

    @Override // com.huawei.hms.ads.hl
    public void B() {
        hl hlVar = this.I;
        if (hlVar == null) {
            return;
        }
        hlVar.B();
    }

    @Override // com.huawei.hms.ads.hl
    public void C() {
        hl hlVar = this.I;
        if (hlVar == null) {
            return;
        }
        hlVar.C();
    }

    public gw Code() {
        return this.V;
    }

    @Override // com.huawei.hms.ads.hq
    public void D() {
        ex.V(Code, "impressionOccurred");
        if (this.S) {
            return;
        }
        gw gwVar = this.V;
        if (gwVar instanceof gr) {
            ((gr) gwVar).D();
            this.S = true;
        }
        gw gwVar2 = this.V;
        if (gwVar2 instanceof gz) {
            ((gz) gwVar2).B();
            this.S = true;
        }
    }

    @Override // com.huawei.hms.ads.hl
    public String F() {
        hl hlVar = this.I;
        if (hlVar == null) {
            return null;
        }
        return hlVar.F();
    }

    @Override // com.huawei.hms.ads.ha
    public void I() {
        ex.V(Code, "release");
        if (this.F) {
            this.B = true;
            this.C = false;
            this.S = false;
            gw gwVar = this.V;
            if (gwVar != null) {
                gwVar.V();
            }
            hl hlVar = this.I;
            if (hlVar != null) {
                hlVar.B();
            }
            this.F = false;
        }
    }

    @Override // com.huawei.hms.ads.hq
    public void L() {
        ex.V(Code, "load");
        if (!this.B && this.S) {
            return;
        }
        gw gwVar = this.V;
        if (gwVar instanceof gr) {
            ((gr) gwVar).L();
        }
    }

    @Override // com.huawei.hms.ads.hl
    public hh S() {
        hl hlVar = this.I;
        if (hlVar == null) {
            return null;
        }
        return hlVar.S();
    }

    @Override // com.huawei.hms.ads.ha
    public hl V() {
        return this.I;
    }

    @Override // com.huawei.hms.ads.hl
    public void Z() {
        hl hlVar = this.I;
        if (hlVar == null) {
            ex.V(Code, "AdSessionAgent is null");
        } else {
            hlVar.Z();
        }
    }

    @Override // com.huawei.hms.ads.hv
    public void a() {
        ex.V(Code, "complete");
        if (!this.B && this.C) {
            return;
        }
        gw gwVar = this.V;
        if (gwVar instanceof gz) {
            ((gz) gwVar).a();
            this.C = true;
        }
    }

    @Override // com.huawei.hms.ads.hv
    public void b() {
        if (!this.B && this.C) {
            return;
        }
        gw gwVar = this.V;
        if (gwVar instanceof gz) {
            ((gz) gwVar).b();
        }
    }

    @Override // com.huawei.hms.ads.hv
    public void c() {
        if (!this.B && this.C) {
            return;
        }
        gw gwVar = this.V;
        if (gwVar instanceof gz) {
            ((gz) gwVar).c();
        }
    }

    @Override // com.huawei.hms.ads.hv
    public void d() {
        ex.V(Code, "skipped");
        gw gwVar = this.V;
        if (gwVar instanceof gz) {
            ((gz) gwVar).d();
        }
    }

    @Override // com.huawei.hms.ads.hv
    public void e() {
        ex.V(Code, c.f9459cb);
        if (!this.B && this.C) {
            ex.I(Code, "pause: Video completed");
            return;
        }
        gw gwVar = this.V;
        if (gwVar instanceof gz) {
            ((gz) gwVar).e();
        }
    }

    @Override // com.huawei.hms.ads.hv
    public void f() {
        ex.V(Code, "resume");
        if (!this.B && this.C) {
            ex.I(Code, "resume: Video completed");
            return;
        }
        gw gwVar = this.V;
        if (gwVar instanceof gz) {
            ((gz) gwVar).f();
        }
    }

    @Override // com.huawei.hms.ads.hv
    public void Code(float f) {
        if (ex.Code()) {
            ex.Code(Code, "onProgress, isAllowRepeat= %s, isVideoComplete= %s", Boolean.valueOf(this.B), Boolean.valueOf(this.C));
        }
        if (this.B || !this.C) {
            gw gwVar = this.V;
            if (gwVar instanceof gz) {
                ((gz) gwVar).Code(f);
            }
        }
    }

    @Override // com.huawei.hms.ads.hl
    public void I(View view) {
        hl hlVar = this.I;
        if (hlVar == null) {
            return;
        }
        hlVar.I(view);
    }

    @Override // com.huawei.hms.ads.hv
    public void V(float f) {
        if (!this.B && this.C) {
            ex.I(Code, "volumeChange: Video completed");
            return;
        }
        gw gwVar = this.V;
        if (gwVar instanceof gz) {
            ((gz) gwVar).V(f);
        }
    }

    @Override // com.huawei.hms.ads.hv
    public void Code(float f, boolean z10) {
        ex.V(Code, "start");
        if (!this.B && this.C) {
            ex.I(Code, "start: Video completed");
            return;
        }
        gw gwVar = this.V;
        if (gwVar instanceof gz) {
            ((gz) gwVar).Code(f, z10);
        }
    }

    @Override // com.huawei.hms.ads.hl
    public void V(View view) {
        hl hlVar = this.I;
        if (hlVar == null) {
            return;
        }
        hlVar.V(view);
    }

    @Override // com.huawei.hms.ads.ha
    public void Code(Context context, AdContentData adContentData, gk gkVar, boolean z10) {
        if ((adContentData != null ? adContentData.q0() : null) == null) {
            ex.V(Code, "om is null, no initialization is required");
            return;
        }
        if (this.F) {
            return;
        }
        ex.V(Code, "init omPresent");
        this.I = gq.Code(context, adContentData, gkVar, z10);
        gw Code2 = gv.Code(adContentData);
        this.V = Code2;
        Code2.Code(this.I);
        this.Z = z10;
        this.F = true;
        this.D = false;
        this.S = false;
    }

    @Override // com.huawei.hms.ads.hv
    public void V(boolean z10) {
        gw gwVar = this.V;
        if (gwVar instanceof gz) {
            ((gz) gwVar).V(z10);
        }
    }

    @Override // com.huawei.hms.ads.hl
    public void Code(View view) {
        if (this.Z) {
            return;
        }
        hl hlVar = this.I;
        if (hlVar == null) {
            ex.V(Code, "AdSessionAgent is null");
        } else {
            hlVar.Code(view);
        }
    }

    @Override // com.huawei.hms.ads.hl
    public void Code(View view, hk hkVar, String str) {
        hl hlVar = this.I;
        if (hlVar == null) {
            return;
        }
        hlVar.Code(view, hkVar, str);
    }

    @Override // com.huawei.hms.ads.hl
    public void Code(hj hjVar, String str) {
        hl hlVar = this.I;
        if (hlVar == null) {
            return;
        }
        hlVar.Code(hjVar, str);
    }

    @Override // com.huawei.hms.ads.hq
    public void Code(hu huVar) {
        ex.V(Code, "load vastPropertiesWrapper");
        if (this.B || !this.S) {
            gw gwVar = this.V;
            if (gwVar instanceof gr) {
                ((gr) gwVar).Code(huVar);
            }
        }
    }

    @Override // com.huawei.hms.ads.hv
    public void Code(hw hwVar) {
        gw gwVar = this.V;
        if (gwVar instanceof gz) {
            ((gz) gwVar).Code(hwVar);
        }
    }

    @Override // com.huawei.hms.ads.hv
    public void Code(hx hxVar) {
        gw gwVar = this.V;
        if (gwVar instanceof gz) {
            ((gz) gwVar).Code(hxVar);
        }
    }

    @Override // com.huawei.hms.ads.hv
    public void Code(hz hzVar) {
        if (!this.B && this.C) {
            ex.I(Code, "loaded: Video completed");
            return;
        }
        if (this.D) {
            if (ex.Code()) {
                ex.Code(Code, "Already loaded");
            }
        } else {
            gw gwVar = this.V;
            if (gwVar instanceof gz) {
                ((gz) gwVar).Code(hzVar);
            }
            this.D = true;
        }
    }

    @Override // com.huawei.hms.ads.ha
    public void Code(boolean z10) {
        this.B = z10;
    }
}
