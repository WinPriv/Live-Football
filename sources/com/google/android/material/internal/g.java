package com.google.android.material.internal;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import com.huawei.hms.ads.gl;

/* compiled from: StaticLayoutBuilderCompat.java */
/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f20863a;

    /* renamed from: b, reason: collision with root package name */
    public final TextPaint f20864b;

    /* renamed from: c, reason: collision with root package name */
    public final int f20865c;

    /* renamed from: d, reason: collision with root package name */
    public int f20866d;

    /* renamed from: k, reason: collision with root package name */
    public boolean f20872k;

    /* renamed from: e, reason: collision with root package name */
    public Layout.Alignment f20867e = Layout.Alignment.ALIGN_NORMAL;
    public int f = Integer.MAX_VALUE;

    /* renamed from: g, reason: collision with root package name */
    public float f20868g = gl.Code;

    /* renamed from: h, reason: collision with root package name */
    public float f20869h = 1.0f;

    /* renamed from: i, reason: collision with root package name */
    public int f20870i = 1;

    /* renamed from: j, reason: collision with root package name */
    public boolean f20871j = true;

    /* renamed from: l, reason: collision with root package name */
    public TextUtils.TruncateAt f20873l = null;

    /* compiled from: StaticLayoutBuilderCompat.java */
    /* loaded from: classes2.dex */
    public static class a extends Exception {
    }

    public g(CharSequence charSequence, TextPaint textPaint, int i10) {
        this.f20863a = charSequence;
        this.f20864b = textPaint;
        this.f20865c = i10;
        this.f20866d = charSequence.length();
    }

    public final StaticLayout a() throws a {
        TextDirectionHeuristic textDirectionHeuristic;
        if (this.f20863a == null) {
            this.f20863a = "";
        }
        int max = Math.max(0, this.f20865c);
        CharSequence charSequence = this.f20863a;
        int i10 = this.f;
        TextPaint textPaint = this.f20864b;
        if (i10 == 1) {
            charSequence = TextUtils.ellipsize(charSequence, textPaint, max, this.f20873l);
        }
        int min = Math.min(charSequence.length(), this.f20866d);
        this.f20866d = min;
        if (this.f20872k && this.f == 1) {
            this.f20867e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, min, textPaint, max);
        obtain.setAlignment(this.f20867e);
        obtain.setIncludePad(this.f20871j);
        if (this.f20872k) {
            textDirectionHeuristic = TextDirectionHeuristics.RTL;
        } else {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        }
        obtain.setTextDirection(textDirectionHeuristic);
        TextUtils.TruncateAt truncateAt = this.f20873l;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f);
        float f = this.f20868g;
        if (f != gl.Code || this.f20869h != 1.0f) {
            obtain.setLineSpacing(f, this.f20869h);
        }
        if (this.f > 1) {
            obtain.setHyphenationFrequency(this.f20870i);
        }
        return obtain.build();
    }
}
