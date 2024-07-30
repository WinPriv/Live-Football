package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.appcompat.widget.o;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import l0.c;
import r0.j;

/* loaded from: classes.dex */
public class AppCompatTextView extends TextView {

    /* renamed from: s, reason: collision with root package name */
    public final androidx.appcompat.widget.c f990s;

    /* renamed from: t, reason: collision with root package name */
    public final p f991t;

    /* renamed from: u, reason: collision with root package name */
    public final o f992u;

    /* renamed from: v, reason: collision with root package name */
    public h f993v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f994w;

    /* renamed from: x, reason: collision with root package name */
    public b f995x;
    public Future<l0.c> y;

    /* loaded from: classes.dex */
    public interface a {
        void a(int i10);

        void b(int i10);
    }

    /* loaded from: classes.dex */
    public class c extends b {
        public c() {
            super();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.b, androidx.appcompat.widget.AppCompatTextView.a
        public final void a(int i10) {
            AppCompatTextView.super.setLastBaselineToBottomHeight(i10);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.b, androidx.appcompat.widget.AppCompatTextView.a
        public final void b(int i10) {
            AppCompatTextView.super.setFirstBaselineToTopHeight(i10);
        }
    }

    public AppCompatTextView() {
        throw null;
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private h getEmojiTextViewHelper() {
        if (this.f993v == null) {
            this.f993v = new h(this);
        }
        return this.f993v;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        androidx.appcompat.widget.c cVar = this.f990s;
        if (cVar != null) {
            cVar.a();
        }
        p pVar = this.f991t;
        if (pVar != null) {
            pVar.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (u0.f1274b) {
            return super.getAutoSizeMaxTextSize();
        }
        p pVar = this.f991t;
        if (pVar != null) {
            return Math.round(pVar.f1221i.f1260e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (u0.f1274b) {
            return super.getAutoSizeMinTextSize();
        }
        p pVar = this.f991t;
        if (pVar != null) {
            return Math.round(pVar.f1221i.f1259d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (u0.f1274b) {
            return super.getAutoSizeStepGranularity();
        }
        p pVar = this.f991t;
        if (pVar != null) {
            return Math.round(pVar.f1221i.f1258c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (u0.f1274b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        p pVar = this.f991t;
        if (pVar != null) {
            return pVar.f1221i.f;
        }
        return new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (u0.f1274b) {
            if (super.getAutoSizeTextType() != 1) {
                return 0;
            }
            return 1;
        }
        p pVar = this.f991t;
        if (pVar == null) {
            return 0;
        }
        return pVar.f1221i.f1256a;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return r0.j.d(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public a getSuperCaller() {
        if (this.f995x == null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 28) {
                this.f995x = new c();
            } else if (i10 >= 26) {
                this.f995x = new b();
            }
        }
        return this.f995x;
    }

    public ColorStateList getSupportBackgroundTintList() {
        androidx.appcompat.widget.c cVar = this.f990s;
        if (cVar != null) {
            return cVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        androidx.appcompat.widget.c cVar = this.f990s;
        if (cVar != null) {
            return cVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f991t.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f991t.e();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future<l0.c> future = this.y;
        if (future != null) {
            try {
                this.y = null;
                l0.c cVar = future.get();
                if (Build.VERSION.SDK_INT >= 29) {
                    cVar.getClass();
                    setText((CharSequence) null);
                } else {
                    c.a a10 = r0.j.a(this);
                    cVar.getClass();
                    a10.a(null);
                    throw null;
                }
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        o oVar;
        if (Build.VERSION.SDK_INT < 28 && (oVar = this.f992u) != null) {
            TextClassifier textClassifier = oVar.f1211b;
            if (textClassifier == null) {
                return o.a.a(oVar.f1210a);
            }
            return textClassifier;
        }
        return super.getTextClassifier();
    }

    public c.a getTextMetricsParamsCompat() {
        return r0.j.a(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f991t.getClass();
        p.h(this, onCreateInputConnection, editorInfo);
        a0.a.T0(this, editorInfo, onCreateInputConnection);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        p pVar = this.f991t;
        if (pVar != null && !u0.f1274b) {
            pVar.f1221i.a();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        Future<l0.c> future = this.y;
        if (future != null) {
            try {
                this.y = null;
                l0.c cVar = future.get();
                if (Build.VERSION.SDK_INT >= 29) {
                    cVar.getClass();
                    setText((CharSequence) null);
                } else {
                    c.a a10 = r0.j.a(this);
                    cVar.getClass();
                    a10.a(null);
                    throw null;
                }
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i10, i11);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        boolean z10;
        super.onTextChanged(charSequence, i10, i11, i12);
        boolean z11 = false;
        p pVar = this.f991t;
        if (pVar != null && !u0.f1274b) {
            s sVar = pVar.f1221i;
            if (sVar.i() && sVar.f1256a != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                z11 = true;
            }
        }
        if (z11) {
            pVar.f1221i.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().c(z10);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) throws IllegalArgumentException {
        if (u0.f1274b) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
            return;
        }
        p pVar = this.f991t;
        if (pVar != null) {
            pVar.i(i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10) throws IllegalArgumentException {
        if (u0.f1274b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
            return;
        }
        p pVar = this.f991t;
        if (pVar != null) {
            pVar.j(iArr, i10);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (u0.f1274b) {
            super.setAutoSizeTextTypeWithDefaults(i10);
            return;
        }
        p pVar = this.f991t;
        if (pVar != null) {
            pVar.k(i10);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        androidx.appcompat.widget.c cVar = this.f990s;
        if (cVar != null) {
            cVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        androidx.appcompat.widget.c cVar = this.f990s;
        if (cVar != null) {
            cVar.f(i10);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        p pVar = this.f991t;
        if (pVar != null) {
            pVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        p pVar = this.f991t;
        if (pVar != null) {
            pVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        p pVar = this.f991t;
        if (pVar != null) {
            pVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        p pVar = this.f991t;
        if (pVar != null) {
            pVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(r0.j.e(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().b(i10);
        } else {
            r0.j.b(this, i10);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().a(i10);
        } else {
            r0.j.c(this, i10);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i10) {
        a0.a.w0(i10);
        if (i10 != getPaint().getFontMetricsInt(null)) {
            setLineSpacing(i10 - r0, 1.0f);
        }
    }

    public void setPrecomputedText(l0.c cVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            cVar.getClass();
            setText((CharSequence) null);
        } else {
            c.a a10 = r0.j.a(this);
            cVar.getClass();
            a10.a(null);
            throw null;
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        androidx.appcompat.widget.c cVar = this.f990s;
        if (cVar != null) {
            cVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        androidx.appcompat.widget.c cVar = this.f990s;
        if (cVar != null) {
            cVar.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        p pVar = this.f991t;
        pVar.l(colorStateList);
        pVar.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        p pVar = this.f991t;
        pVar.m(mode);
        pVar.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        p pVar = this.f991t;
        if (pVar != null) {
            pVar.g(i10, context);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        o oVar;
        if (Build.VERSION.SDK_INT >= 28 || (oVar = this.f992u) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            oVar.f1211b = textClassifier;
        }
    }

    public void setTextFuture(Future<l0.c> future) {
        this.y = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(c.a aVar) {
        int i10;
        TextDirectionHeuristic textDirectionHeuristic = aVar.f32301b;
        if (textDirectionHeuristic != TextDirectionHeuristics.FIRSTSTRONG_RTL && textDirectionHeuristic != TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
                i10 = 2;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
                i10 = 3;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
                i10 = 4;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
                i10 = 5;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
                i10 = 6;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL) {
                i10 = 7;
            }
            j.b.h(this, i10);
            getPaint().set(aVar.f32300a);
            j.c.e(this, aVar.f32302c);
            j.c.h(this, aVar.f32303d);
        }
        i10 = 1;
        j.b.h(this, i10);
        getPaint().set(aVar.f32300a);
        j.c.e(this, aVar.f32302c);
        j.c.h(this, aVar.f32303d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i10, float f) {
        boolean z10;
        boolean z11 = u0.f1274b;
        if (z11) {
            super.setTextSize(i10, f);
            return;
        }
        p pVar = this.f991t;
        if (pVar != null && !z11) {
            s sVar = pVar.f1221i;
            if (sVar.i() && sVar.f1256a != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                sVar.f(f, i10);
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i10) {
        Typeface typeface2;
        if (this.f994w) {
            return;
        }
        if (typeface != null && i10 > 0) {
            Context context = getContext();
            f0.l lVar = f0.e.f27906a;
            if (context != null) {
                typeface2 = Typeface.create(typeface, i10);
            } else {
                throw new IllegalArgumentException("Context cannot be null");
            }
        } else {
            typeface2 = null;
        }
        this.f994w = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i10);
        } finally {
            this.f994w = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        j0.a(context);
        this.f994w = false;
        this.f995x = null;
        h0.a(getContext(), this);
        androidx.appcompat.widget.c cVar = new androidx.appcompat.widget.c(this);
        this.f990s = cVar;
        cVar.d(attributeSet, i10);
        p pVar = new p(this);
        this.f991t = pVar;
        pVar.f(attributeSet, i10);
        pVar.b();
        this.f992u = new o(this);
        getEmojiTextViewHelper().b(attributeSet, i10);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i10 != 0 ? g.a.a(context, i10) : null, i11 != 0 ? g.a.a(context, i11) : null, i12 != 0 ? g.a.a(context, i12) : null, i13 != 0 ? g.a.a(context, i13) : null);
        p pVar = this.f991t;
        if (pVar != null) {
            pVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i10 != 0 ? g.a.a(context, i10) : null, i11 != 0 ? g.a.a(context, i11) : null, i12 != 0 ? g.a.a(context, i12) : null, i13 != 0 ? g.a.a(context, i13) : null);
        p pVar = this.f991t;
        if (pVar != null) {
            pVar.b();
        }
    }

    /* loaded from: classes.dex */
    public class b implements a {
        public b() {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public void a(int i10) {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public void b(int i10) {
        }
    }
}
