package com.facebook.ads.internal.exoplayer2.metadata;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.facebook.ads.redexgen.X.C0828Cz;
import java.util.Arrays;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class Metadata implements Parcelable {
    public static String[] A01 = {"JICwwT8G5kbXiXHOOMThkmmR", "YwNgc7idcv9rJFlnp1abcUxGz", "KSwlDsi", "Z", "0246QI2TxmfSwaLWPqM7pslFpj9YbyND", "Xr5SiPlZDFoSUesanKDgUhWdC", "ROXHenNovbqvYQv4gdp5KTMra8", "BPS7NXJzE3eQ4STyzWDaFmaROpCtx1Hv"};
    public static final Parcelable.Creator<Metadata> CREATOR = new C0828Cz();
    public final Entry[] A00;

    /* loaded from: assets/audience_network.dex */
    public interface Entry extends Parcelable {
    }

    public Metadata(Parcel parcel) {
        this.A00 = new Entry[parcel.readInt()];
        int i10 = 0;
        while (true) {
            Entry[] entryArr = this.A00;
            int i11 = entryArr.length;
            if (i10 < i11) {
                entryArr[i10] = (Entry) parcel.readParcelable(Entry.class.getClassLoader());
                i10++;
            } else {
                return;
            }
        }
    }

    public Metadata(List<? extends Entry> entries) {
        if (entries != null) {
            this.A00 = new Entry[entries.size()];
            entries.toArray(this.A00);
        } else {
            this.A00 = new Entry[0];
        }
    }

    public Metadata(Entry... entryArr) {
        this.A00 = entryArr == null ? new Entry[0] : entryArr;
    }

    public final int A00() {
        return this.A00.length;
    }

    public final Entry A01(int i10) {
        return this.A00[i10];
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return Arrays.equals(this.A00, ((Metadata) obj).A00);
        }
        String[] strArr = A01;
        if (strArr[2].length() == strArr[0].length()) {
            throw new RuntimeException();
        }
        A01[3] = "ZgMQrDUDbDT4";
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.A00);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.A00.length);
        for (Entry entry : this.A00) {
            if (A01[3].length() == 24) {
                throw new RuntimeException();
            }
            A01[6] = "4bWMxAxjkYjebJNSgeb4pE4Ns8";
            parcel.writeParcelable(entry, 0);
        }
    }
}
