package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public interface IAccountAccessor extends IInterface {

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends com.google.android.gms.internal.common.zzb implements IAccountAccessor {
        public Stub() {
            super("com.google.android.gms.common.internal.IAccountAccessor");
        }

        public static IAccountAccessor asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            if (queryLocalInterface instanceof IAccountAccessor) {
                return (IAccountAccessor) queryLocalInterface;
            }
            return new zzv(iBinder);
        }

        @Override // com.google.android.gms.internal.common.zzb
        public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 == 2) {
                Account zzb = zzb();
                parcel2.writeNoException();
                com.google.android.gms.internal.common.zzc.zze(parcel2, zzb);
                return true;
            }
            return false;
        }
    }

    Account zzb() throws RemoteException;
}
