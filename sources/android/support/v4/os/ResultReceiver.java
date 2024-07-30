package android.support.v4.os;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.v4.os.a;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = new a();

    /* renamed from: s, reason: collision with root package name */
    public android.support.v4.os.a f447s;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<ResultReceiver> {
        @Override // android.os.Parcelable.Creator
        public final ResultReceiver createFromParcel(Parcel parcel) {
            return new ResultReceiver(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ResultReceiver[] newArray(int i10) {
            return new ResultReceiver[i10];
        }
    }

    /* loaded from: classes.dex */
    public class b extends a.AbstractBinderC0008a {
        public b() {
        }

        @Override // android.support.v4.os.a
        public final void l(int i10, Bundle bundle) {
            ResultReceiver resultReceiver = ResultReceiver.this;
            resultReceiver.getClass();
            resultReceiver.a(i10, bundle);
        }
    }

    public ResultReceiver(Parcel parcel) {
        android.support.v4.os.a c0009a;
        IBinder readStrongBinder = parcel.readStrongBinder();
        int i10 = a.AbstractBinderC0008a.f449a;
        if (readStrongBinder == null) {
            c0009a = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            if (queryLocalInterface != null && (queryLocalInterface instanceof android.support.v4.os.a)) {
                c0009a = (android.support.v4.os.a) queryLocalInterface;
            } else {
                c0009a = new a.AbstractBinderC0008a.C0009a(readStrongBinder);
            }
        }
        this.f447s = c0009a;
    }

    public final void c(int i10, Bundle bundle) {
        android.support.v4.os.a aVar = this.f447s;
        if (aVar != null) {
            try {
                aVar.l(i10, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        synchronized (this) {
            if (this.f447s == null) {
                this.f447s = new b();
            }
            parcel.writeStrongBinder(this.f447s.asBinder());
        }
    }

    public void a(int i10, Bundle bundle) {
    }
}
