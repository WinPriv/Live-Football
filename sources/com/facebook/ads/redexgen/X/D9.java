package com.facebook.ads.redexgen.X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.internal.exoplayer2.metadata.id3.BinaryFrame;

/* loaded from: assets/audience_network.dex */
public class D9 implements Parcelable.Creator<BinaryFrame> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final BinaryFrame createFromParcel(Parcel parcel) {
        return new BinaryFrame(parcel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final BinaryFrame[] newArray(int i10) {
        return new BinaryFrame[i10];
    }
}
