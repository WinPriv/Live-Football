package com.applovin.exoplayer2.i;

import android.os.Bundle;
import android.os.Parcel;
import com.applovin.exoplayer2.common.a.s;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b {
    public s<a> a(byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        Bundle readBundle = obtain.readBundle(Bundle.class.getClassLoader());
        obtain.recycle();
        return com.applovin.exoplayer2.l.c.a(a.f15506s, (ArrayList) com.applovin.exoplayer2.l.a.b(readBundle.getParcelableArrayList("c")));
    }
}
