package com.applovin.exoplayer2.ui;

import android.graphics.Typeface;
import android.view.accessibility.CaptioningManager;
import com.applovin.exoplayer2.l.ai;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f16703a = new c(-1, -16777216, 0, 0, -1, null);

    /* renamed from: b, reason: collision with root package name */
    public final int f16704b;

    /* renamed from: c, reason: collision with root package name */
    public final int f16705c;

    /* renamed from: d, reason: collision with root package name */
    public final int f16706d;

    /* renamed from: e, reason: collision with root package name */
    public final int f16707e;
    public final int f;

    /* renamed from: g, reason: collision with root package name */
    public final Typeface f16708g;

    public c(int i10, int i11, int i12, int i13, int i14, Typeface typeface) {
        this.f16704b = i10;
        this.f16705c = i11;
        this.f16706d = i12;
        this.f16707e = i13;
        this.f = i14;
        this.f16708g = typeface;
    }

    public static c a(CaptioningManager.CaptionStyle captionStyle) {
        if (ai.f16274a >= 21) {
            return c(captionStyle);
        }
        return b(captionStyle);
    }

    private static c b(CaptioningManager.CaptionStyle captionStyle) {
        return new c(captionStyle.foregroundColor, captionStyle.backgroundColor, 0, captionStyle.edgeType, captionStyle.edgeColor, captionStyle.getTypeface());
    }

    private static c c(CaptioningManager.CaptionStyle captionStyle) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        if (captionStyle.hasForegroundColor()) {
            i10 = captionStyle.foregroundColor;
        } else {
            i10 = f16703a.f16704b;
        }
        int i15 = i10;
        if (captionStyle.hasBackgroundColor()) {
            i11 = captionStyle.backgroundColor;
        } else {
            i11 = f16703a.f16705c;
        }
        int i16 = i11;
        if (captionStyle.hasWindowColor()) {
            i12 = captionStyle.windowColor;
        } else {
            i12 = f16703a.f16706d;
        }
        int i17 = i12;
        if (captionStyle.hasEdgeType()) {
            i13 = captionStyle.edgeType;
        } else {
            i13 = f16703a.f16707e;
        }
        int i18 = i13;
        if (captionStyle.hasEdgeColor()) {
            i14 = captionStyle.edgeColor;
        } else {
            i14 = f16703a.f;
        }
        return new c(i15, i16, i17, i18, i14, captionStyle.getTypeface());
    }
}
