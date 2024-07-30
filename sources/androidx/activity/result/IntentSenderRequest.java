package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class IntentSenderRequest implements Parcelable {
    public static final Parcelable.Creator<IntentSenderRequest> CREATOR = new a();

    /* renamed from: s, reason: collision with root package name */
    public final IntentSender f527s;

    /* renamed from: t, reason: collision with root package name */
    public final Intent f528t;

    /* renamed from: u, reason: collision with root package name */
    public final int f529u;

    /* renamed from: v, reason: collision with root package name */
    public final int f530v;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<IntentSenderRequest> {
        @Override // android.os.Parcelable.Creator
        public final IntentSenderRequest createFromParcel(Parcel parcel) {
            return new IntentSenderRequest(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final IntentSenderRequest[] newArray(int i10) {
            return new IntentSenderRequest[i10];
        }
    }

    public IntentSenderRequest(IntentSender intentSender, Intent intent, int i10, int i11) {
        this.f527s = intentSender;
        this.f528t = intent;
        this.f529u = i10;
        this.f530v = i11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f527s, i10);
        parcel.writeParcelable(this.f528t, i10);
        parcel.writeInt(this.f529u);
        parcel.writeInt(this.f530v);
    }

    public IntentSenderRequest(Parcel parcel) {
        this.f527s = (IntentSender) parcel.readParcelable(IntentSender.class.getClassLoader());
        this.f528t = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.f529u = parcel.readInt();
        this.f530v = parcel.readInt();
    }
}
