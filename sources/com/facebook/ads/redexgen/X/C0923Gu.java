package com.facebook.ads.redexgen.X;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;

/* renamed from: com.facebook.ads.redexgen.X.Gu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0923Gu implements Comparable<C0923Gu> {
    public final long A00;
    public final long A01;
    public final long A02;

    @Nullable
    public final File A03;
    public final String A04;
    public final boolean A05;

    public C0923Gu(String str, long j10, long j11, long j12, @Nullable File file) {
        this.A04 = str;
        this.A02 = j10;
        this.A01 = j11;
        this.A05 = file != null;
        this.A03 = file;
        this.A00 = j12;
    }

    @Override // java.lang.Comparable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(@NonNull C0923Gu c0923Gu) {
        if (!this.A04.equals(c0923Gu.A04)) {
            return this.A04.compareTo(c0923Gu.A04);
        }
        long j10 = this.A02 - c0923Gu.A02;
        if (j10 == 0) {
            return 0;
        }
        return j10 < 0 ? -1 : 1;
    }

    public final boolean A01() {
        return !this.A05;
    }

    public final boolean A02() {
        return this.A01 == -1;
    }
}
