package com.applovin.exoplayer2.g;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.ac;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.v;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator<a>() { // from class: com.applovin.exoplayer2.g.a.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC0172a[] f15101a;

    /* renamed from: com.applovin.exoplayer2.g.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0172a extends Parcelable {
        default v a() {
            return null;
        }

        default byte[] b() {
            return null;
        }

        default void a(ac.a aVar) {
        }
    }

    public a(InterfaceC0172a... interfaceC0172aArr) {
        this.f15101a = interfaceC0172aArr;
    }

    public int a() {
        return this.f15101a.length;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            return Arrays.equals(this.f15101a, ((a) obj).f15101a);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f15101a);
    }

    public String toString() {
        return "entries=" + Arrays.toString(this.f15101a);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f15101a.length);
        for (InterfaceC0172a interfaceC0172a : this.f15101a) {
            parcel.writeParcelable(interfaceC0172a, 0);
        }
    }

    public InterfaceC0172a a(int i10) {
        return this.f15101a[i10];
    }

    public a(List<? extends InterfaceC0172a> list) {
        this.f15101a = (InterfaceC0172a[]) list.toArray(new InterfaceC0172a[0]);
    }

    public a a(a aVar) {
        return aVar == null ? this : a(aVar.f15101a);
    }

    public a a(InterfaceC0172a... interfaceC0172aArr) {
        return interfaceC0172aArr.length == 0 ? this : new a((InterfaceC0172a[]) ai.a((Object[]) this.f15101a, (Object[]) interfaceC0172aArr));
    }

    public a(Parcel parcel) {
        this.f15101a = new InterfaceC0172a[parcel.readInt()];
        int i10 = 0;
        while (true) {
            InterfaceC0172a[] interfaceC0172aArr = this.f15101a;
            if (i10 >= interfaceC0172aArr.length) {
                return;
            }
            interfaceC0172aArr[i10] = (InterfaceC0172a) parcel.readParcelable(InterfaceC0172a.class.getClassLoader());
            i10++;
        }
    }
}
