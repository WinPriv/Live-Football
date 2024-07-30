package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public abstract class zzab extends com.google.android.gms.internal.common.zzb implements IGmsCallbacks {
    public zzab() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // com.google.android.gms.internal.common.zzb
    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return false;
                }
                int readInt = parcel.readInt();
                IBinder readStrongBinder = parcel.readStrongBinder();
                zzj zzjVar = (zzj) com.google.android.gms.internal.common.zzc.zza(parcel, zzj.CREATOR);
                com.google.android.gms.internal.common.zzc.zzb(parcel);
                zzc(readInt, readStrongBinder, zzjVar);
            } else {
                int readInt2 = parcel.readInt();
                Bundle bundle = (Bundle) com.google.android.gms.internal.common.zzc.zza(parcel, Bundle.CREATOR);
                com.google.android.gms.internal.common.zzc.zzb(parcel);
                zzb(readInt2, bundle);
            }
        } else {
            int readInt3 = parcel.readInt();
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            Bundle bundle2 = (Bundle) com.google.android.gms.internal.common.zzc.zza(parcel, Bundle.CREATOR);
            com.google.android.gms.internal.common.zzc.zzb(parcel);
            onPostInitComplete(readInt3, readStrongBinder2, bundle2);
        }
        parcel2.writeNoException();
        return true;
    }
}
