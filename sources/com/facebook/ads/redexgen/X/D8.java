package com.facebook.ads.redexgen.X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.internal.exoplayer2.metadata.id3.ApicFrame;

/* loaded from: assets/audience_network.dex */
public class D8 implements Parcelable.Creator<ApicFrame> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final ApicFrame createFromParcel(Parcel parcel) {
        return new ApicFrame(parcel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final ApicFrame[] newArray(int i10) {
        return new ApicFrame[i10];
    }
}
