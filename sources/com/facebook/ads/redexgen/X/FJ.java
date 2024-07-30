package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import android.text.Layout;
import androidx.annotation.Nullable;

/* loaded from: assets/audience_network.dex */
public class FJ {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;

    @Nullable
    public final Bitmap A0A;

    @Nullable
    public final Layout.Alignment A0B;

    @Nullable
    public final CharSequence A0C;
    public final boolean A0D;

    public FJ(Bitmap bitmap, float f, int i10, float f10, int i11, float f11, float f12) {
        this(null, null, bitmap, f10, 0, i11, f, i10, Integer.MIN_VALUE, Float.MIN_VALUE, f11, f12, false, -16777216);
    }

    public FJ(CharSequence charSequence) {
        this(charSequence, null, Float.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE);
    }

    public FJ(CharSequence charSequence, @Nullable Layout.Alignment alignment, float f, int i10, int i11, float f10, int i12, float f11) {
        this(charSequence, alignment, f, i10, i11, f10, i12, f11, false, -16777216);
    }

    public FJ(CharSequence charSequence, @Nullable Layout.Alignment alignment, float f, int i10, int i11, float f10, int i12, float f11, int i13, float f12) {
        this(charSequence, alignment, null, f, i10, i11, f10, i12, i13, f12, f11, Float.MIN_VALUE, false, -16777216);
    }

    public FJ(CharSequence charSequence, @Nullable Layout.Alignment alignment, float f, int i10, int i11, float f10, int i12, float f11, boolean z10, int i13) {
        this(charSequence, alignment, null, f, i10, i11, f10, i12, Integer.MIN_VALUE, Float.MIN_VALUE, f11, Float.MIN_VALUE, z10, i13);
    }

    public FJ(@Nullable CharSequence charSequence, @Nullable Layout.Alignment alignment, @Nullable Bitmap bitmap, float f, int i10, int i11, float f10, int i12, int i13, float f11, float f12, float f13, boolean z10, int i14) {
        this.A0C = charSequence;
        this.A0B = alignment;
        this.A0A = bitmap;
        this.A01 = f;
        this.A06 = i10;
        this.A05 = i11;
        this.A02 = f10;
        this.A07 = i12;
        this.A03 = f12;
        this.A00 = f13;
        this.A0D = z10;
        this.A09 = i14;
        this.A08 = i13;
        this.A04 = f11;
    }
}
