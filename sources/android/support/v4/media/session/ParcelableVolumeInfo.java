package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new a();

    /* renamed from: s, reason: collision with root package name */
    public final int f431s;

    /* renamed from: t, reason: collision with root package name */
    public final int f432t;

    /* renamed from: u, reason: collision with root package name */
    public final int f433u;

    /* renamed from: v, reason: collision with root package name */
    public final int f434v;

    /* renamed from: w, reason: collision with root package name */
    public final int f435w;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<ParcelableVolumeInfo> {
        @Override // android.os.Parcelable.Creator
        public final ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ParcelableVolumeInfo[] newArray(int i10) {
            return new ParcelableVolumeInfo[i10];
        }
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f431s = parcel.readInt();
        this.f433u = parcel.readInt();
        this.f434v = parcel.readInt();
        this.f435w = parcel.readInt();
        this.f432t = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f431s);
        parcel.writeInt(this.f433u);
        parcel.writeInt(this.f434v);
        parcel.writeInt(this.f435w);
        parcel.writeInt(this.f432t);
    }
}
