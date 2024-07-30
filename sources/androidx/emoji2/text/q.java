package androidx.emoji2.text;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* compiled from: UnprecomputeTextOnModificationSpannable.java */
/* loaded from: classes.dex */
public final class q implements Spannable {

    /* renamed from: s, reason: collision with root package name */
    public boolean f1675s = false;

    /* renamed from: t, reason: collision with root package name */
    public Spannable f1676t;

    /* compiled from: UnprecomputeTextOnModificationSpannable.java */
    /* loaded from: classes.dex */
    public static class a {
        public boolean a(Spannable spannable) {
            return spannable instanceof l0.c;
        }
    }

    /* compiled from: UnprecomputeTextOnModificationSpannable.java */
    /* loaded from: classes.dex */
    public static class b extends a {
        @Override // androidx.emoji2.text.q.a
        public final boolean a(Spannable spannable) {
            if (!(spannable instanceof PrecomputedText) && !(spannable instanceof l0.c)) {
                return false;
            }
            return true;
        }
    }

    public q(Spannable spannable) {
        this.f1676t = spannable;
    }

    public final void a() {
        a bVar;
        Spannable spannable = this.f1676t;
        if (!this.f1675s) {
            if (Build.VERSION.SDK_INT < 28) {
                bVar = new a();
            } else {
                bVar = new b();
            }
            if (bVar.a(spannable)) {
                this.f1676t = new SpannableString(spannable);
            }
        }
        this.f1675s = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i10) {
        return this.f1676t.charAt(i10);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.f1676t.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.f1676t.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f1676t.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f1676t.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f1676t.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final <T> T[] getSpans(int i10, int i11, Class<T> cls) {
        return (T[]) this.f1676t.getSpans(i10, i11, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f1676t.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i10, int i11, Class cls) {
        return this.f1676t.nextSpanTransition(i10, i11, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.f1676t.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i10, int i11, int i12) {
        a();
        this.f1676t.setSpan(obj, i10, i11, i12);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i10, int i11) {
        return this.f1676t.subSequence(i10, i11);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f1676t.toString();
    }

    public q(CharSequence charSequence) {
        this.f1676t = new SpannableString(charSequence);
    }
}
