package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;

/* compiled from: AppCompatEmojiTextHelper.java */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f1181a;

    /* renamed from: b, reason: collision with root package name */
    public final w0.f f1182b;

    public h(TextView textView) {
        this.f1181a = textView;
        this.f1182b = new w0.f(textView);
    }

    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.f1182b.f36023a.a(inputFilterArr);
    }

    public final void b(AttributeSet attributeSet, int i10) {
        TypedArray obtainStyledAttributes = this.f1181a.getContext().obtainStyledAttributes(attributeSet, a0.a.K, i10, 0);
        try {
            boolean z10 = true;
            if (obtainStyledAttributes.hasValue(14)) {
                z10 = obtainStyledAttributes.getBoolean(14, true);
            }
            obtainStyledAttributes.recycle();
            d(z10);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void c(boolean z10) {
        this.f1182b.f36023a.c(z10);
    }

    public final void d(boolean z10) {
        this.f1182b.f36023a.d(z10);
    }
}
