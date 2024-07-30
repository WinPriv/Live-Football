package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* compiled from: EmojiSpan.java */
/* loaded from: classes.dex */
public abstract class k extends ReplacementSpan {

    /* renamed from: t, reason: collision with root package name */
    public final i f1654t;

    /* renamed from: s, reason: collision with root package name */
    public final Paint.FontMetricsInt f1653s = new Paint.FontMetricsInt();

    /* renamed from: u, reason: collision with root package name */
    public float f1655u = 1.0f;

    public k(i iVar) {
        if (iVar != null) {
            this.f1654t = iVar;
            return;
        }
        throw new NullPointerException("metadata cannot be null");
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        short s10;
        Paint.FontMetricsInt fontMetricsInt2 = this.f1653s;
        paint.getFontMetricsInt(fontMetricsInt2);
        float abs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        i iVar = this.f1654t;
        v0.a c10 = iVar.c();
        int a10 = c10.a(14);
        short s11 = 0;
        if (a10 != 0) {
            s10 = c10.f35905b.getShort(a10 + c10.f35904a);
        } else {
            s10 = 0;
        }
        this.f1655u = abs / s10;
        v0.a c11 = iVar.c();
        int a11 = c11.a(14);
        if (a11 != 0) {
            c11.f35905b.getShort(a11 + c11.f35904a);
        }
        v0.a c12 = iVar.c();
        int a12 = c12.a(12);
        if (a12 != 0) {
            s11 = c12.f35905b.getShort(a12 + c12.f35904a);
        }
        short s12 = (short) (s11 * this.f1655u);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s12;
    }
}
