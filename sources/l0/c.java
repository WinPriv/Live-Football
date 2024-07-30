package l0;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import e0.i;

/* compiled from: PrecomputedTextCompat.java */
/* loaded from: classes.dex */
public final class c implements Spannable {
    @Override // java.lang.CharSequence
    public final char charAt(int i10) {
        throw null;
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        throw null;
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        throw null;
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        throw null;
    }

    @Override // android.text.Spanned
    public final <T> T[] getSpans(int i10, int i11, Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 29) {
            com.ironsource.adapters.facebook.a.o(i10, i11, cls);
            throw null;
        }
        throw null;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        throw null;
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i10, int i11, Class cls) {
        throw null;
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        if (!(obj instanceof MetricAffectingSpan)) {
            if (Build.VERSION.SDK_INT >= 29) {
                com.ironsource.adapters.facebook.a.p(obj);
                throw null;
            }
            throw null;
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i10, int i11, int i12) {
        if (!(obj instanceof MetricAffectingSpan)) {
            if (Build.VERSION.SDK_INT >= 29) {
                i.l(obj, i10, i11, i12);
                throw null;
            }
            throw null;
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i10, int i11) {
        throw null;
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        throw null;
    }

    /* compiled from: PrecomputedTextCompat.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final TextPaint f32300a;

        /* renamed from: b, reason: collision with root package name */
        public final TextDirectionHeuristic f32301b;

        /* renamed from: c, reason: collision with root package name */
        public final int f32302c;

        /* renamed from: d, reason: collision with root package name */
        public final int f32303d;

        public a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i10, int i11) {
            if (Build.VERSION.SDK_INT >= 29) {
                new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i10).setHyphenationFrequency(i11).setTextDirection(textDirectionHeuristic).build();
            }
            this.f32300a = textPaint;
            this.f32301b = textDirectionHeuristic;
            this.f32302c = i10;
            this.f32303d = i11;
        }

        public final boolean a(a aVar) {
            if (this.f32302c != aVar.f32302c || this.f32303d != aVar.f32303d) {
                return false;
            }
            TextPaint textPaint = this.f32300a;
            if (textPaint.getTextSize() != aVar.f32300a.getTextSize()) {
                return false;
            }
            float textScaleX = textPaint.getTextScaleX();
            TextPaint textPaint2 = aVar.f32300a;
            if (textScaleX != textPaint2.getTextScaleX() || textPaint.getTextSkewX() != textPaint2.getTextSkewX() || textPaint.getLetterSpacing() != textPaint2.getLetterSpacing() || !TextUtils.equals(textPaint.getFontFeatureSettings(), textPaint2.getFontFeatureSettings()) || textPaint.getFlags() != textPaint2.getFlags() || !textPaint.getTextLocales().equals(textPaint2.getTextLocales())) {
                return false;
            }
            if (textPaint.getTypeface() == null) {
                if (textPaint2.getTypeface() != null) {
                    return false;
                }
                return true;
            }
            if (!textPaint.getTypeface().equals(textPaint2.getTypeface())) {
                return false;
            }
            return true;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (a(aVar) && this.f32301b == aVar.f32301b) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            TextPaint textPaint = this.f32300a;
            return m0.b.b(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), this.f32301b, Integer.valueOf(this.f32302c), Integer.valueOf(this.f32303d));
        }

        public final String toString() {
            String fontVariationSettings;
            StringBuilder sb2 = new StringBuilder("{");
            StringBuilder sb3 = new StringBuilder("textSize=");
            TextPaint textPaint = this.f32300a;
            sb3.append(textPaint.getTextSize());
            sb2.append(sb3.toString());
            sb2.append(", textScaleX=" + textPaint.getTextScaleX());
            sb2.append(", textSkewX=" + textPaint.getTextSkewX());
            int i10 = Build.VERSION.SDK_INT;
            sb2.append(", letterSpacing=" + textPaint.getLetterSpacing());
            sb2.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
            sb2.append(", textLocale=" + textPaint.getTextLocales());
            sb2.append(", typeface=" + textPaint.getTypeface());
            if (i10 >= 26) {
                StringBuilder sb4 = new StringBuilder(", variationSettings=");
                fontVariationSettings = textPaint.getFontVariationSettings();
                sb4.append(fontVariationSettings);
                sb2.append(sb4.toString());
            }
            sb2.append(", textDir=" + this.f32301b);
            sb2.append(", breakStrategy=" + this.f32302c);
            sb2.append(", hyphenationFrequency=" + this.f32303d);
            sb2.append("}");
            return sb2.toString();
        }

        public a(PrecomputedText.Params params) {
            TextPaint textPaint;
            TextDirectionHeuristic textDirection;
            int breakStrategy;
            int hyphenationFrequency;
            textPaint = params.getTextPaint();
            this.f32300a = textPaint;
            textDirection = params.getTextDirection();
            this.f32301b = textDirection;
            breakStrategy = params.getBreakStrategy();
            this.f32302c = breakStrategy;
            hyphenationFrequency = params.getHyphenationFrequency();
            this.f32303d = hyphenationFrequency;
        }
    }
}
