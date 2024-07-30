package android.support.v4.media;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.ads.gl;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new a();

    /* renamed from: s, reason: collision with root package name */
    public final int f424s;

    /* renamed from: t, reason: collision with root package name */
    public final float f425t;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<RatingCompat> {
        @Override // android.os.Parcelable.Creator
        public final RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final RatingCompat[] newArray(int i10) {
            return new RatingCompat[i10];
        }
    }

    public RatingCompat(int i10, float f) {
        this.f424s = i10;
        this.f425t = f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.f424s;
    }

    public final String toString() {
        String valueOf;
        StringBuilder sb2 = new StringBuilder("Rating:style=");
        sb2.append(this.f424s);
        sb2.append(" rating=");
        float f = this.f425t;
        if (f < gl.Code) {
            valueOf = "unrated";
        } else {
            valueOf = String.valueOf(f);
        }
        sb2.append(valueOf);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f424s);
        parcel.writeFloat(this.f425t);
    }
}
