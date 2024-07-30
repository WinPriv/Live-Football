package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class ActivityResult implements Parcelable {
    public static final Parcelable.Creator<ActivityResult> CREATOR = new a();

    /* renamed from: s, reason: collision with root package name */
    public final int f521s;

    /* renamed from: t, reason: collision with root package name */
    public final Intent f522t;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<ActivityResult> {
        @Override // android.os.Parcelable.Creator
        public final ActivityResult createFromParcel(Parcel parcel) {
            return new ActivityResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ActivityResult[] newArray(int i10) {
            return new ActivityResult[i10];
        }
    }

    public ActivityResult(int i10, Intent intent) {
        this.f521s = i10;
        this.f522t = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("ActivityResult{resultCode=");
        int i10 = this.f521s;
        if (i10 != -1) {
            if (i10 != 0) {
                str = String.valueOf(i10);
            } else {
                str = "RESULT_CANCELED";
            }
        } else {
            str = "RESULT_OK";
        }
        sb2.append(str);
        sb2.append(", data=");
        sb2.append(this.f522t);
        sb2.append('}');
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11;
        parcel.writeInt(this.f521s);
        Intent intent = this.f522t;
        if (intent == null) {
            i11 = 0;
        } else {
            i11 = 1;
        }
        parcel.writeInt(i11);
        if (intent != null) {
            intent.writeToParcel(parcel, i10);
        }
    }

    public ActivityResult(Parcel parcel) {
        this.f521s = parcel.readInt();
        this.f522t = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }
}
