package com.anythink.expressad.exoplayer.g.c;

import com.anythink.expressad.exoplayer.g.a;

/* loaded from: classes.dex */
public abstract class b implements a.InterfaceC0105a {
    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "SCTE-35 splice command: type=".concat(getClass().getSimpleName());
    }
}
