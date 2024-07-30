package com.facebook.ads.redexgen.X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.internal.exoplayer2.source.TrackGroupArray;

/* renamed from: com.facebook.ads.redexgen.X.Er, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0869Er implements Parcelable.Creator<TrackGroupArray> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final TrackGroupArray createFromParcel(Parcel parcel) {
        return new TrackGroupArray(parcel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final TrackGroupArray[] newArray(int i10) {
        return new TrackGroupArray[i10];
    }
}
