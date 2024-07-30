package com.google.android.exoplayer2.metadata.id3;

import com.google.android.exoplayer2.metadata.Metadata;

/* loaded from: classes2.dex */
public abstract class Id3Frame implements Metadata.Entry {

    /* renamed from: s, reason: collision with root package name */
    public final String f20048s;

    public Id3Frame(String str) {
        this.f20048s = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f20048s;
    }
}
