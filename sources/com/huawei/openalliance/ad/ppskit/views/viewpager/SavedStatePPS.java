package com.huawei.openalliance.ad.ppskit.views.viewpager;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public class SavedStatePPS extends PPSAbsSavedState {
    public static final Parcelable.Creator<SavedStatePPS> CREATOR = new a();

    /* renamed from: u, reason: collision with root package name */
    public int f23577u;

    /* renamed from: v, reason: collision with root package name */
    public Parcelable f23578v;

    /* loaded from: classes2.dex */
    public static class a implements Parcelable.ClassLoaderCreator<SavedStatePPS> {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            return new SavedStatePPS(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i10) {
            return new SavedStatePPS[i10];
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public final SavedStatePPS createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new SavedStatePPS(parcel, classLoader);
        }
    }

    public SavedStatePPS(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
        this.f23577u = parcel.readInt();
        this.f23578v = parcel.readParcelable(classLoader);
    }

    @Override // com.huawei.openalliance.ad.ppskit.views.viewpager.PPSAbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f23557s, i10);
        parcel.writeInt(this.f23577u);
        parcel.writeParcelable(this.f23578v, i10);
    }

    public SavedStatePPS(Parcelable parcelable) {
        super(parcelable);
    }
}
