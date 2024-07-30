package android.support.v4.media.session;

import a3.l;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a();
    public final ArrayList A;
    public final long B;
    public final Bundle C;

    /* renamed from: s, reason: collision with root package name */
    public final int f436s;

    /* renamed from: t, reason: collision with root package name */
    public final long f437t;

    /* renamed from: u, reason: collision with root package name */
    public final long f438u;

    /* renamed from: v, reason: collision with root package name */
    public final float f439v;

    /* renamed from: w, reason: collision with root package name */
    public final long f440w;

    /* renamed from: x, reason: collision with root package name */
    public final int f441x;
    public final CharSequence y;

    /* renamed from: z, reason: collision with root package name */
    public final long f442z;

    /* loaded from: classes.dex */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new a();

        /* renamed from: s, reason: collision with root package name */
        public final String f443s;

        /* renamed from: t, reason: collision with root package name */
        public final CharSequence f444t;

        /* renamed from: u, reason: collision with root package name */
        public final int f445u;

        /* renamed from: v, reason: collision with root package name */
        public final Bundle f446v;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<CustomAction> {
            @Override // android.os.Parcelable.Creator
            public final CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final CustomAction[] newArray(int i10) {
                return new CustomAction[i10];
            }
        }

        public CustomAction(Parcel parcel) {
            this.f443s = parcel.readString();
            this.f444t = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f445u = parcel.readInt();
            this.f446v = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "Action:mName='" + ((Object) this.f444t) + ", mIcon=" + this.f445u + ", mExtras=" + this.f446v;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f443s);
            TextUtils.writeToParcel(this.f444t, parcel, i10);
            parcel.writeInt(this.f445u);
            parcel.writeBundle(this.f446v);
        }
    }

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<PlaybackStateCompat> {
        @Override // android.os.Parcelable.Creator
        public final PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final PlaybackStateCompat[] newArray(int i10) {
            return new PlaybackStateCompat[i10];
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f436s = parcel.readInt();
        this.f437t = parcel.readLong();
        this.f439v = parcel.readFloat();
        this.f442z = parcel.readLong();
        this.f438u = parcel.readLong();
        this.f440w = parcel.readLong();
        this.y = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.A = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.B = parcel.readLong();
        this.C = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f441x = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PlaybackState {state=");
        sb2.append(this.f436s);
        sb2.append(", position=");
        sb2.append(this.f437t);
        sb2.append(", buffered position=");
        sb2.append(this.f438u);
        sb2.append(", speed=");
        sb2.append(this.f439v);
        sb2.append(", updated=");
        sb2.append(this.f442z);
        sb2.append(", actions=");
        sb2.append(this.f440w);
        sb2.append(", error code=");
        sb2.append(this.f441x);
        sb2.append(", error message=");
        sb2.append(this.y);
        sb2.append(", custom actions=");
        sb2.append(this.A);
        sb2.append(", active item id=");
        return l.n(sb2, this.B, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f436s);
        parcel.writeLong(this.f437t);
        parcel.writeFloat(this.f439v);
        parcel.writeLong(this.f442z);
        parcel.writeLong(this.f438u);
        parcel.writeLong(this.f440w);
        TextUtils.writeToParcel(this.y, parcel, i10);
        parcel.writeTypedList(this.A);
        parcel.writeLong(this.B);
        parcel.writeBundle(this.C);
        parcel.writeInt(this.f441x);
    }
}
