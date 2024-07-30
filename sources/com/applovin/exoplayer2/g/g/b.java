package com.applovin.exoplayer2.g.g;

import com.applovin.exoplayer2.g.a;

/* loaded from: classes.dex */
public abstract class b implements a.InterfaceC0172a {
    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "SCTE-35 splice command: type=".concat(getClass().getSimpleName());
    }
}
