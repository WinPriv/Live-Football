package com.huawei.hms.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import com.huawei.hms.ads.dynamic.ObjectWrapper;

/* loaded from: classes2.dex */
public class cd extends ia.a implements fh, fk {
    private static final String Code = "MediaPlayerAgentProxy";
    private fk I;
    private com.huawei.hms.ads.uiengine.a V;
    private fh Z;

    public cd(Context context, com.huawei.hms.ads.uiengine.a aVar) {
        super(context);
        this.V = aVar;
    }

    @Override // ia.a
    public void Code() {
        try {
            this.V.V();
        } catch (Throwable th) {
            ex.V(Code, "stop err: %s", th.getClass().getSimpleName());
        }
    }

    @Override // com.huawei.hms.ads.fk
    public void I(ia.a aVar, int i10) {
        fk fkVar = this.I;
        if (fkVar != null) {
            fkVar.I(this, i10);
        }
    }

    @Override // ia.a
    public void V(fh fhVar) {
        try {
            Bundle bundle = new Bundle();
            bundle.putBinder("listener", (IBinder) ObjectWrapper.wrap(this));
            this.V.Z(bundle);
        } catch (Throwable th) {
            ex.V(Code, "removeMediaErrorListener err: %s", th.getClass().getSimpleName());
        }
    }

    @Override // com.huawei.hms.ads.fk
    public void Z(ia.a aVar, int i10) {
        fk fkVar = this.I;
        if (fkVar != null) {
            fkVar.Z(this, i10);
        }
    }

    @Override // com.huawei.hms.ads.fk
    public void Code(int i10, int i11) {
        fk fkVar = this.I;
        if (fkVar != null) {
            fkVar.Code(i10, i11);
        }
    }

    @Override // ia.a
    public void I(String str) {
        try {
            this.V.I(str);
        } catch (Throwable th) {
            ex.V(Code, "pauseWhenUrlMatchs er: %s", th.getClass().getSimpleName());
        }
    }

    @Override // ia.a
    public void V(fk fkVar) {
        try {
            Bundle bundle = new Bundle();
            bundle.putBinder("listener", (IBinder) ObjectWrapper.wrap(this));
            this.V.I(bundle);
        } catch (Throwable th) {
            ex.V(Code, "removeMediaErrorListener err: %s", th.getClass().getSimpleName());
        }
    }

    @Override // ia.a
    public void Code(fh fhVar) {
        this.Z = fhVar;
        try {
            Bundle bundle = new Bundle();
            bundle.putBinder("listener", (IBinder) ObjectWrapper.wrap(this));
            this.V.V(bundle);
        } catch (Throwable th) {
            ex.V(Code, "addMediaErrorListener err: %s", th.getClass().getSimpleName());
        }
    }

    @Override // com.huawei.hms.ads.fk
    public void V(ia.a aVar, int i10) {
        fk fkVar = this.I;
        if (fkVar != null) {
            fkVar.V(this, i10);
        }
    }

    @Override // ia.a
    public void Code(fk fkVar) {
        this.I = fkVar;
        try {
            Bundle bundle = new Bundle();
            bundle.putBinder("listener", (IBinder) ObjectWrapper.wrap(this));
            this.V.Code(bundle);
        } catch (Throwable th) {
            ex.V(Code, "addMediaStateListener err: %s", th.getClass().getSimpleName());
        }
    }

    @Override // ia.a
    public void V(String str) {
        try {
            this.V.V(str);
        } catch (Throwable th) {
            ex.V(Code, "stopWhenUrlMatchs err: %s", th.getClass().getSimpleName());
        }
    }

    @Override // com.huawei.hms.ads.fk
    public void Code(ia.a aVar, int i10) {
        fk fkVar = this.I;
        if (fkVar != null) {
            fkVar.Code(this, i10);
        }
    }

    @Override // com.huawei.hms.ads.fh
    public void Code(ia.a aVar, int i10, int i11, int i12) {
        fh fhVar = this.Z;
        if (fhVar != null) {
            fhVar.Code(this, i10, i11, i12);
        }
    }

    @Override // ia.a
    public void Code(String str) {
        try {
            this.V.Code(str);
        } catch (Throwable th) {
            ex.V(Code, "playWhenUrlMatchs err: %s", th.getClass().getSimpleName());
        }
    }
}
