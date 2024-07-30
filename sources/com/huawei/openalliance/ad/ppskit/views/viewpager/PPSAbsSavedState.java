package com.huawei.openalliance.ad.ppskit.views.viewpager;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public abstract class PPSAbsSavedState implements Parcelable {

    /* renamed from: s, reason: collision with root package name */
    public final Parcelable f23557s;

    /* renamed from: t, reason: collision with root package name */
    public static final PPSAbsSavedState f23556t = new PPSAbsSavedState() { // from class: com.huawei.openalliance.ad.ppskit.views.viewpager.PPSAbsSavedState.1
    };
    public static final Parcelable.Creator<PPSAbsSavedState> CREATOR = new a();

    /* loaded from: classes2.dex */
    public static class a implements Parcelable.ClassLoaderCreator<PPSAbsSavedState> {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            if (parcel.readParcelable(null) == null) {
                return PPSAbsSavedState.f23556t;
            }
            throw new IllegalStateException("superState should null");
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i10) {
            return new PPSAbsSavedState[i10];
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public final PPSAbsSavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return PPSAbsSavedState.f23556t;
            }
            throw new IllegalStateException("superState should null");
        }
    }

    private PPSAbsSavedState() {
        this.f23557s = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f23557s, i10);
    }

    public /* synthetic */ PPSAbsSavedState(int i10) {
        this();
    }

    public PPSAbsSavedState(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f23557s = readParcelable == null ? f23556t : readParcelable;
    }

    public PPSAbsSavedState(Parcelable parcelable) {
        if (parcelable == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        this.f23557s = parcelable == f23556t ? null : parcelable;
    }
}
