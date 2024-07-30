package com.applovin.exoplayer2;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.applovin.exoplayer2.common.a.s;

/* loaded from: classes.dex */
public final class f extends Binder {

    /* renamed from: a, reason: collision with root package name */
    private static final int f14975a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.exoplayer2.common.a.s<Bundle> f14976b;

    static {
        int i10;
        if (com.applovin.exoplayer2.l.ai.f16274a >= 30) {
            i10 = IBinder.getSuggestedMaxIpcSizeBytes();
        } else {
            i10 = com.anythink.expressad.exoplayer.b.aX;
        }
        f14975a = i10;
    }

    public static com.applovin.exoplayer2.common.a.s<Bundle> a(IBinder iBinder) {
        int readInt;
        s.a i10 = com.applovin.exoplayer2.common.a.s.i();
        int i11 = 0;
        int i12 = 1;
        while (i12 != 0) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInt(i11);
                try {
                    iBinder.transact(1, obtain, obtain2, 0);
                    while (true) {
                        readInt = obtain2.readInt();
                        if (readInt == 1) {
                            i10.a((Bundle) com.applovin.exoplayer2.l.a.b(obtain2.readBundle()));
                            i11++;
                        }
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    i12 = readInt;
                } catch (RemoteException e10) {
                    throw new RuntimeException(e10);
                }
            } catch (Throwable th) {
                obtain2.recycle();
                obtain.recycle();
                throw th;
            }
        }
        return i10.a();
    }

    @Override // android.os.Binder
    public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return super.onTransact(i10, parcel, parcel2, i11);
        }
        int i12 = 0;
        if (parcel2 == null) {
            return false;
        }
        int size = this.f14976b.size();
        int readInt = parcel.readInt();
        while (readInt < size && parcel2.dataSize() < f14975a) {
            parcel2.writeInt(1);
            parcel2.writeBundle(this.f14976b.get(readInt));
            readInt++;
        }
        if (readInt < size) {
            i12 = 2;
        }
        parcel2.writeInt(i12);
        return true;
    }
}
