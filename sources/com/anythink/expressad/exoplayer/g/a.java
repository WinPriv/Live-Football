package com.anythink.expressad.exoplayer.g;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator<a>() { // from class: com.anythink.expressad.exoplayer.g.a.1
        private static a[] a() {
            return new a[0];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ a[] newArray(int i10) {
            return new a[0];
        }

        private static a a(Parcel parcel) {
            return new a(parcel);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC0105a[] f8023a;

    /* renamed from: com.anythink.expressad.exoplayer.g.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0105a extends Parcelable {
    }

    public a(InterfaceC0105a... interfaceC0105aArr) {
        this.f8023a = interfaceC0105aArr;
    }

    public final int a() {
        return this.f8023a.length;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            return Arrays.equals(this.f8023a, ((a) obj).f8023a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f8023a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f8023a.length);
        for (InterfaceC0105a interfaceC0105a : this.f8023a) {
            parcel.writeParcelable(interfaceC0105a, 0);
        }
    }

    public final InterfaceC0105a a(int i10) {
        return this.f8023a[i10];
    }

    public a(List<? extends InterfaceC0105a> list) {
        InterfaceC0105a[] interfaceC0105aArr = new InterfaceC0105a[list.size()];
        this.f8023a = interfaceC0105aArr;
        list.toArray(interfaceC0105aArr);
    }

    public a(Parcel parcel) {
        this.f8023a = new InterfaceC0105a[parcel.readInt()];
        int i10 = 0;
        while (true) {
            InterfaceC0105a[] interfaceC0105aArr = this.f8023a;
            if (i10 >= interfaceC0105aArr.length) {
                return;
            }
            interfaceC0105aArr[i10] = (InterfaceC0105a) parcel.readParcelable(InterfaceC0105a.class.getClassLoader());
            i10++;
        }
    }
}
