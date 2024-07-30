package androidx.emoji2.text;

import android.text.TextPaint;
import androidx.emoji2.text.f;

/* compiled from: DefaultGlyphChecker.java */
/* loaded from: classes.dex */
public final class d implements f.d {

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal<StringBuilder> f1615b = new ThreadLocal<>();

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f1616a;

    public d() {
        TextPaint textPaint = new TextPaint();
        this.f1616a = textPaint;
        textPaint.setTextSize(10.0f);
    }
}
