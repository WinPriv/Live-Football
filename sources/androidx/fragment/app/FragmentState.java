package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new a();
    public final boolean A;
    public final Bundle B;
    public final boolean C;
    public final int D;
    public Bundle E;

    /* renamed from: s, reason: collision with root package name */
    public final String f1767s;

    /* renamed from: t, reason: collision with root package name */
    public final String f1768t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f1769u;

    /* renamed from: v, reason: collision with root package name */
    public final int f1770v;

    /* renamed from: w, reason: collision with root package name */
    public final int f1771w;

    /* renamed from: x, reason: collision with root package name */
    public final String f1772x;
    public final boolean y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f1773z;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<FragmentState> {
        @Override // android.os.Parcelable.Creator
        public final FragmentState createFromParcel(Parcel parcel) {
            return new FragmentState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final FragmentState[] newArray(int i10) {
            return new FragmentState[i10];
        }
    }

    public FragmentState(Fragment fragment) {
        this.f1767s = fragment.getClass().getName();
        this.f1768t = fragment.mWho;
        this.f1769u = fragment.mFromLayout;
        this.f1770v = fragment.mFragmentId;
        this.f1771w = fragment.mContainerId;
        this.f1772x = fragment.mTag;
        this.y = fragment.mRetainInstance;
        this.f1773z = fragment.mRemoving;
        this.A = fragment.mDetached;
        this.B = fragment.mArguments;
        this.C = fragment.mHidden;
        this.D = fragment.mMaxState.ordinal();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentState{");
        sb2.append(this.f1767s);
        sb2.append(" (");
        sb2.append(this.f1768t);
        sb2.append(")}:");
        if (this.f1769u) {
            sb2.append(" fromLayout");
        }
        int i10 = this.f1771w;
        if (i10 != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(i10));
        }
        String str = this.f1772x;
        if (str != null && !str.isEmpty()) {
            sb2.append(" tag=");
            sb2.append(str);
        }
        if (this.y) {
            sb2.append(" retainInstance");
        }
        if (this.f1773z) {
            sb2.append(" removing");
        }
        if (this.A) {
            sb2.append(" detached");
        }
        if (this.C) {
            sb2.append(" hidden");
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f1767s);
        parcel.writeString(this.f1768t);
        parcel.writeInt(this.f1769u ? 1 : 0);
        parcel.writeInt(this.f1770v);
        parcel.writeInt(this.f1771w);
        parcel.writeString(this.f1772x);
        parcel.writeInt(this.y ? 1 : 0);
        parcel.writeInt(this.f1773z ? 1 : 0);
        parcel.writeInt(this.A ? 1 : 0);
        parcel.writeBundle(this.B);
        parcel.writeInt(this.C ? 1 : 0);
        parcel.writeBundle(this.E);
        parcel.writeInt(this.D);
    }

    public FragmentState(Parcel parcel) {
        this.f1767s = parcel.readString();
        this.f1768t = parcel.readString();
        this.f1769u = parcel.readInt() != 0;
        this.f1770v = parcel.readInt();
        this.f1771w = parcel.readInt();
        this.f1772x = parcel.readString();
        this.y = parcel.readInt() != 0;
        this.f1773z = parcel.readInt() != 0;
        this.A = parcel.readInt() != 0;
        this.B = parcel.readBundle();
        this.C = parcel.readInt() != 0;
        this.E = parcel.readBundle();
        this.D = parcel.readInt();
    }
}
