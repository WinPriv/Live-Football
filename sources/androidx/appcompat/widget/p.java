package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import com.huawei.hms.ads.gl;
import e0.f;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.WeakHashMap;
import n0.c0;
import r0.j;

/* compiled from: AppCompatTextHelper.java */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f1214a;

    /* renamed from: b, reason: collision with root package name */
    public k0 f1215b;

    /* renamed from: c, reason: collision with root package name */
    public k0 f1216c;

    /* renamed from: d, reason: collision with root package name */
    public k0 f1217d;

    /* renamed from: e, reason: collision with root package name */
    public k0 f1218e;
    public k0 f;

    /* renamed from: g, reason: collision with root package name */
    public k0 f1219g;

    /* renamed from: h, reason: collision with root package name */
    public k0 f1220h;

    /* renamed from: i, reason: collision with root package name */
    public final s f1221i;

    /* renamed from: j, reason: collision with root package name */
    public int f1222j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f1223k = -1;

    /* renamed from: l, reason: collision with root package name */
    public Typeface f1224l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1225m;

    /* compiled from: AppCompatTextHelper.java */
    /* loaded from: classes.dex */
    public static class b {
        public static Drawable[] a(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        public static void b(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        public static void c(TextView textView, Locale locale) {
            textView.setTextLocale(locale);
        }
    }

    /* compiled from: AppCompatTextHelper.java */
    /* loaded from: classes.dex */
    public static class c {
        public static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }

        public static void b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    /* compiled from: AppCompatTextHelper.java */
    /* loaded from: classes.dex */
    public static class d {
        public static int a(TextView textView) {
            int autoSizeStepGranularity;
            autoSizeStepGranularity = textView.getAutoSizeStepGranularity();
            return autoSizeStepGranularity;
        }

        public static void b(TextView textView, int i10, int i11, int i12, int i13) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
        }

        public static void c(TextView textView, int[] iArr, int i10) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
        }

        public static boolean d(TextView textView, String str) {
            boolean fontVariationSettings;
            fontVariationSettings = textView.setFontVariationSettings(str);
            return fontVariationSettings;
        }
    }

    /* compiled from: AppCompatTextHelper.java */
    /* loaded from: classes.dex */
    public static class e {
        public static Typeface a(Typeface typeface, int i10, boolean z10) {
            Typeface create;
            create = Typeface.create(typeface, i10, z10);
            return create;
        }
    }

    public p(TextView textView) {
        this.f1214a = textView;
        this.f1221i = new s(textView);
    }

    public static k0 c(Context context, f fVar, int i10) {
        ColorStateList h10;
        synchronized (fVar) {
            h10 = fVar.f1160a.h(i10, context);
        }
        if (h10 != null) {
            k0 k0Var = new k0();
            k0Var.f1199d = true;
            k0Var.f1196a = h10;
            return k0Var;
        }
        return null;
    }

    public static void h(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        int i10;
        int i11;
        boolean z10;
        int i12;
        CharSequence subSequence;
        int i13 = Build.VERSION.SDK_INT;
        if (i13 < 30 && inputConnection != null) {
            CharSequence text = textView.getText();
            if (i13 >= 30) {
                editorInfo.setInitialSurroundingSubText(text, 0);
                return;
            }
            text.getClass();
            if (i13 >= 30) {
                editorInfo.setInitialSurroundingSubText(text, 0);
                return;
            }
            int i14 = editorInfo.initialSelStart;
            int i15 = editorInfo.initialSelEnd;
            if (i14 > i15) {
                i10 = i15 + 0;
            } else {
                i10 = i14 + 0;
            }
            if (i14 > i15) {
                i11 = i14 - 0;
            } else {
                i11 = i15 + 0;
            }
            int length = text.length();
            if (i10 >= 0 && i11 <= length) {
                int i16 = editorInfo.inputType & 4095;
                if (i16 != 129 && i16 != 225 && i16 != 18) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    q0.c.a(editorInfo, null, 0, 0);
                    return;
                }
                if (length <= 2048) {
                    q0.c.a(editorInfo, text, i10, i11);
                    return;
                }
                int i17 = i11 - i10;
                if (i17 > 1024) {
                    i12 = 0;
                } else {
                    i12 = i17;
                }
                int i18 = 2048 - i12;
                int min = Math.min(text.length() - i11, i18 - Math.min(i10, (int) (i18 * 0.8d)));
                int min2 = Math.min(i10, i18 - min);
                int i19 = i10 - min2;
                if (Character.isLowSurrogate(text.charAt(i19))) {
                    i19++;
                    min2--;
                }
                if (Character.isHighSurrogate(text.charAt((i11 + min) - 1))) {
                    min--;
                }
                int i20 = min2 + i12 + min;
                if (i12 != i17) {
                    subSequence = TextUtils.concat(text.subSequence(i19, i19 + min2), text.subSequence(i11, min + i11));
                } else {
                    subSequence = text.subSequence(i19, i20 + i19);
                }
                int i21 = min2 + 0;
                q0.c.a(editorInfo, subSequence, i21, i12 + i21);
                return;
            }
            q0.c.a(editorInfo, null, 0, 0);
        }
    }

    public final void a(Drawable drawable, k0 k0Var) {
        if (drawable != null && k0Var != null) {
            f.e(drawable, k0Var, this.f1214a.getDrawableState());
        }
    }

    public final void b() {
        k0 k0Var = this.f1215b;
        TextView textView = this.f1214a;
        if (k0Var != null || this.f1216c != null || this.f1217d != null || this.f1218e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f1215b);
            a(compoundDrawables[1], this.f1216c);
            a(compoundDrawables[2], this.f1217d);
            a(compoundDrawables[3], this.f1218e);
        }
        if (this.f != null || this.f1219g != null) {
            Drawable[] a10 = b.a(textView);
            a(a10[0], this.f);
            a(a10[2], this.f1219g);
        }
    }

    public final ColorStateList d() {
        k0 k0Var = this.f1220h;
        if (k0Var != null) {
            return k0Var.f1196a;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        k0 k0Var = this.f1220h;
        if (k0Var != null) {
            return k0Var.f1197b;
        }
        return null;
    }

    @SuppressLint({"NewApi"})
    public final void f(AttributeSet attributeSet, int i10) {
        boolean z10;
        boolean z11;
        String str;
        String str2;
        float f;
        float f10;
        float f11;
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Drawable drawable4;
        Drawable drawable5;
        Drawable drawable6;
        int i11;
        Paint.FontMetricsInt fontMetricsInt;
        int i12;
        int resourceId;
        int i13;
        TextView textView = this.f1214a;
        Context context = textView.getContext();
        f a10 = f.a();
        int[] iArr = a0.a.J;
        m0 m10 = m0.m(context, attributeSet, iArr, i10);
        n0.c0.k(textView, textView.getContext(), iArr, attributeSet, m10.f1206b, i10);
        int i14 = m10.i(0, -1);
        if (m10.l(3)) {
            this.f1215b = c(context, a10, m10.i(3, 0));
        }
        if (m10.l(1)) {
            this.f1216c = c(context, a10, m10.i(1, 0));
        }
        if (m10.l(4)) {
            this.f1217d = c(context, a10, m10.i(4, 0));
        }
        if (m10.l(2)) {
            this.f1218e = c(context, a10, m10.i(2, 0));
        }
        int i15 = Build.VERSION.SDK_INT;
        if (m10.l(5)) {
            this.f = c(context, a10, m10.i(5, 0));
        }
        if (m10.l(6)) {
            this.f1219g = c(context, a10, m10.i(6, 0));
        }
        m10.n();
        boolean z12 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = a0.a.Y;
        if (i14 != -1) {
            m0 m0Var = new m0(context, context.obtainStyledAttributes(i14, iArr2));
            if (!z12 && m0Var.l(14)) {
                z10 = m0Var.a(14, false);
                z11 = true;
            } else {
                z10 = false;
                z11 = false;
            }
            n(context, m0Var);
            if (m0Var.l(15)) {
                str = m0Var.j(15);
                i13 = 26;
            } else {
                i13 = 26;
                str = null;
            }
            if (i15 >= i13 && m0Var.l(13)) {
                str2 = m0Var.j(13);
            } else {
                str2 = null;
            }
            m0Var.n();
        } else {
            z10 = false;
            z11 = false;
            str = null;
            str2 = null;
        }
        m0 m0Var2 = new m0(context, context.obtainStyledAttributes(attributeSet, iArr2, i10, 0));
        if (!z12 && m0Var2.l(14)) {
            z10 = m0Var2.a(14, false);
            z11 = true;
        }
        if (m0Var2.l(15)) {
            str = m0Var2.j(15);
        }
        if (i15 >= 26 && m0Var2.l(13)) {
            str2 = m0Var2.j(13);
        }
        String str3 = str2;
        if (i15 >= 28 && m0Var2.l(0) && m0Var2.d(0, -1) == 0) {
            textView.setTextSize(0, gl.Code);
        }
        n(context, m0Var2);
        m0Var2.n();
        if (!z12 && z11) {
            textView.setAllCaps(z10);
        }
        Typeface typeface = this.f1224l;
        if (typeface != null) {
            if (this.f1223k == -1) {
                textView.setTypeface(typeface, this.f1222j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (str3 != null) {
            d.d(textView, str3);
        }
        if (str != null) {
            c.b(textView, c.a(str));
        }
        int[] iArr3 = a0.a.K;
        s sVar = this.f1221i;
        Context context2 = sVar.f1264j;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr3, i10, 0);
        TextView textView2 = sVar.f1263i;
        n0.c0.k(textView2, textView2.getContext(), iArr3, attributeSet, obtainStyledAttributes, i10);
        if (obtainStyledAttributes.hasValue(5)) {
            sVar.f1256a = obtainStyledAttributes.getInt(5, 0);
        }
        if (obtainStyledAttributes.hasValue(4)) {
            f = obtainStyledAttributes.getDimension(4, -1.0f);
        } else {
            f = -1.0f;
        }
        if (obtainStyledAttributes.hasValue(2)) {
            f10 = obtainStyledAttributes.getDimension(2, -1.0f);
        } else {
            f10 = -1.0f;
        }
        if (obtainStyledAttributes.hasValue(1)) {
            f11 = obtainStyledAttributes.getDimension(1, -1.0f);
        } else {
            f11 = -1.0f;
        }
        if (obtainStyledAttributes.hasValue(3) && (resourceId = obtainStyledAttributes.getResourceId(3, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            int length = obtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i16 = 0; i16 < length; i16++) {
                    iArr4[i16] = obtainTypedArray.getDimensionPixelSize(i16, -1);
                }
                sVar.f = s.b(iArr4);
                sVar.h();
            }
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (sVar.i()) {
            if (sVar.f1256a == 1) {
                if (!sVar.f1261g) {
                    DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                    if (f10 == -1.0f) {
                        i12 = 2;
                        f10 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                    } else {
                        i12 = 2;
                    }
                    if (f11 == -1.0f) {
                        f11 = TypedValue.applyDimension(i12, 112.0f, displayMetrics);
                    }
                    if (f == -1.0f) {
                        f = 1.0f;
                    }
                    sVar.j(f10, f11, f);
                }
                sVar.g();
            }
        } else {
            sVar.f1256a = 0;
        }
        if (u0.f1274b && sVar.f1256a != 0) {
            int[] iArr5 = sVar.f;
            if (iArr5.length > 0) {
                if (d.a(textView) != -1.0f) {
                    d.b(textView, Math.round(sVar.f1259d), Math.round(sVar.f1260e), Math.round(sVar.f1258c), 0);
                } else {
                    d.c(textView, iArr5, 0);
                }
            }
        }
        m0 m0Var3 = new m0(context, context.obtainStyledAttributes(attributeSet, iArr3));
        int i17 = m0Var3.i(8, -1);
        if (i17 != -1) {
            drawable = a10.b(context, i17);
        } else {
            drawable = null;
        }
        int i18 = m0Var3.i(13, -1);
        if (i18 != -1) {
            drawable2 = a10.b(context, i18);
        } else {
            drawable2 = null;
        }
        int i19 = m0Var3.i(9, -1);
        if (i19 != -1) {
            drawable3 = a10.b(context, i19);
        } else {
            drawable3 = null;
        }
        int i20 = m0Var3.i(6, -1);
        if (i20 != -1) {
            drawable4 = a10.b(context, i20);
        } else {
            drawable4 = null;
        }
        int i21 = m0Var3.i(10, -1);
        if (i21 != -1) {
            drawable5 = a10.b(context, i21);
        } else {
            drawable5 = null;
        }
        int i22 = m0Var3.i(7, -1);
        if (i22 != -1) {
            drawable6 = a10.b(context, i22);
        } else {
            drawable6 = null;
        }
        if (drawable5 == null && drawable6 == null) {
            if (drawable != null || drawable2 != null || drawable3 != null || drawable4 != null) {
                Drawable[] a11 = b.a(textView);
                Drawable drawable7 = a11[0];
                if (drawable7 == null && a11[2] == null) {
                    Drawable[] compoundDrawables = textView.getCompoundDrawables();
                    if (drawable == null) {
                        drawable = compoundDrawables[0];
                    }
                    if (drawable2 == null) {
                        drawable2 = compoundDrawables[1];
                    }
                    if (drawable3 == null) {
                        drawable3 = compoundDrawables[2];
                    }
                    if (drawable4 == null) {
                        drawable4 = compoundDrawables[3];
                    }
                    textView.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
                } else {
                    if (drawable2 == null) {
                        drawable2 = a11[1];
                    }
                    Drawable drawable8 = a11[2];
                    if (drawable4 == null) {
                        drawable4 = a11[3];
                    }
                    b.b(textView, drawable7, drawable2, drawable8, drawable4);
                }
            }
        } else {
            Drawable[] a12 = b.a(textView);
            if (drawable5 == null) {
                drawable5 = a12[0];
            }
            if (drawable2 == null) {
                drawable2 = a12[1];
            }
            if (drawable6 == null) {
                drawable6 = a12[2];
            }
            if (drawable4 == null) {
                drawable4 = a12[3];
            }
            b.b(textView, drawable5, drawable2, drawable6, drawable4);
        }
        if (m0Var3.l(11)) {
            j.c.f(textView, m0Var3.b(11));
        }
        if (m0Var3.l(12)) {
            i11 = -1;
            fontMetricsInt = null;
            j.c.g(textView, x.c(m0Var3.h(12, -1), null));
        } else {
            i11 = -1;
            fontMetricsInt = null;
        }
        int d10 = m0Var3.d(15, i11);
        int d11 = m0Var3.d(18, i11);
        int d12 = m0Var3.d(19, i11);
        m0Var3.n();
        if (d10 != i11) {
            r0.j.b(textView, d10);
        }
        if (d11 != i11) {
            r0.j.c(textView, d11);
        }
        if (d12 != i11) {
            a0.a.w0(d12);
            if (d12 != textView.getPaint().getFontMetricsInt(fontMetricsInt)) {
                textView.setLineSpacing(d12 - r1, 1.0f);
            }
        }
    }

    public final void g(int i10, Context context) {
        String j10;
        m0 m0Var = new m0(context, context.obtainStyledAttributes(i10, a0.a.Y));
        boolean l10 = m0Var.l(14);
        TextView textView = this.f1214a;
        if (l10) {
            textView.setAllCaps(m0Var.a(14, false));
        }
        int i11 = Build.VERSION.SDK_INT;
        if (m0Var.l(0) && m0Var.d(0, -1) == 0) {
            textView.setTextSize(0, gl.Code);
        }
        n(context, m0Var);
        if (i11 >= 26 && m0Var.l(13) && (j10 = m0Var.j(13)) != null) {
            d.d(textView, j10);
        }
        m0Var.n();
        Typeface typeface = this.f1224l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f1222j);
        }
    }

    public final void i(int i10, int i11, int i12, int i13) throws IllegalArgumentException {
        s sVar = this.f1221i;
        if (sVar.i()) {
            DisplayMetrics displayMetrics = sVar.f1264j.getResources().getDisplayMetrics();
            sVar.j(TypedValue.applyDimension(i13, i10, displayMetrics), TypedValue.applyDimension(i13, i11, displayMetrics), TypedValue.applyDimension(i13, i12, displayMetrics));
            if (sVar.g()) {
                sVar.a();
            }
        }
    }

    public final void j(int[] iArr, int i10) throws IllegalArgumentException {
        s sVar = this.f1221i;
        if (sVar.i()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i10 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = sVar.f1264j.getResources().getDisplayMetrics();
                    for (int i11 = 0; i11 < length; i11++) {
                        iArr2[i11] = Math.round(TypedValue.applyDimension(i10, iArr[i11], displayMetrics));
                    }
                }
                sVar.f = s.b(iArr2);
                if (!sVar.h()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                sVar.f1261g = false;
            }
            if (sVar.g()) {
                sVar.a();
            }
        }
    }

    public final void k(int i10) {
        s sVar = this.f1221i;
        if (sVar.i()) {
            if (i10 != 0) {
                if (i10 == 1) {
                    DisplayMetrics displayMetrics = sVar.f1264j.getResources().getDisplayMetrics();
                    sVar.j(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                    if (sVar.g()) {
                        sVar.a();
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException(a3.l.i("Unknown auto-size text type: ", i10));
            }
            sVar.f1256a = 0;
            sVar.f1259d = -1.0f;
            sVar.f1260e = -1.0f;
            sVar.f1258c = -1.0f;
            sVar.f = new int[0];
            sVar.f1257b = false;
        }
    }

    public final void l(ColorStateList colorStateList) {
        boolean z10;
        if (this.f1220h == null) {
            this.f1220h = new k0();
        }
        k0 k0Var = this.f1220h;
        k0Var.f1196a = colorStateList;
        if (colorStateList != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        k0Var.f1199d = z10;
        this.f1215b = k0Var;
        this.f1216c = k0Var;
        this.f1217d = k0Var;
        this.f1218e = k0Var;
        this.f = k0Var;
        this.f1219g = k0Var;
    }

    public final void m(PorterDuff.Mode mode) {
        boolean z10;
        if (this.f1220h == null) {
            this.f1220h = new k0();
        }
        k0 k0Var = this.f1220h;
        k0Var.f1197b = mode;
        if (mode != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        k0Var.f1198c = z10;
        this.f1215b = k0Var;
        this.f1216c = k0Var;
        this.f1217d = k0Var;
        this.f1218e = k0Var;
        this.f = k0Var;
        this.f1219g = k0Var;
    }

    public final void n(Context context, m0 m0Var) {
        String j10;
        boolean z10;
        boolean z11;
        this.f1222j = m0Var.h(2, this.f1222j);
        int i10 = Build.VERSION.SDK_INT;
        boolean z12 = false;
        if (i10 >= 28) {
            int h10 = m0Var.h(11, -1);
            this.f1223k = h10;
            if (h10 != -1) {
                this.f1222j = (this.f1222j & 2) | 0;
            }
        }
        int i11 = 10;
        if (!m0Var.l(10) && !m0Var.l(12)) {
            if (m0Var.l(1)) {
                this.f1225m = false;
                int h11 = m0Var.h(1, 1);
                if (h11 != 1) {
                    if (h11 != 2) {
                        if (h11 == 3) {
                            this.f1224l = Typeface.MONOSPACE;
                            return;
                        }
                        return;
                    }
                    this.f1224l = Typeface.SERIF;
                    return;
                }
                this.f1224l = Typeface.SANS_SERIF;
                return;
            }
            return;
        }
        this.f1224l = null;
        if (m0Var.l(12)) {
            i11 = 12;
        }
        int i12 = this.f1223k;
        int i13 = this.f1222j;
        if (!context.isRestricted()) {
            try {
                Typeface g6 = m0Var.g(i11, this.f1222j, new a(i12, i13, new WeakReference(this.f1214a)));
                if (g6 != null) {
                    if (i10 >= 28 && this.f1223k != -1) {
                        Typeface create = Typeface.create(g6, 0);
                        int i14 = this.f1223k;
                        if ((this.f1222j & 2) != 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.f1224l = e.a(create, i14, z11);
                    } else {
                        this.f1224l = g6;
                    }
                }
                if (this.f1224l == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f1225m = z10;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f1224l == null && (j10 = m0Var.j(i11)) != null) {
            if (Build.VERSION.SDK_INT >= 28 && this.f1223k != -1) {
                Typeface create2 = Typeface.create(j10, 0);
                int i15 = this.f1223k;
                if ((this.f1222j & 2) != 0) {
                    z12 = true;
                }
                this.f1224l = e.a(create2, i15, z12);
                return;
            }
            this.f1224l = Typeface.create(j10, this.f1222j);
        }
    }

    /* compiled from: AppCompatTextHelper.java */
    /* loaded from: classes.dex */
    public class a extends f.e {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f1226a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f1227b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ WeakReference f1228c;

        public a(int i10, int i11, WeakReference weakReference) {
            this.f1226a = i10;
            this.f1227b = i11;
            this.f1228c = weakReference;
        }

        @Override // e0.f.e
        public final void d(Typeface typeface) {
            int i10;
            boolean z10;
            if (Build.VERSION.SDK_INT >= 28 && (i10 = this.f1226a) != -1) {
                if ((this.f1227b & 2) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                typeface = e.a(typeface, i10, z10);
            }
            p pVar = p.this;
            if (pVar.f1225m) {
                pVar.f1224l = typeface;
                TextView textView = (TextView) this.f1228c.get();
                if (textView != null) {
                    WeakHashMap<View, n0.l0> weakHashMap = n0.c0.f33054a;
                    if (c0.g.b(textView)) {
                        textView.post(new q(textView, typeface, pVar.f1222j));
                    } else {
                        textView.setTypeface(typeface, pVar.f1222j);
                    }
                }
            }
        }

        @Override // e0.f.e
        public final void c(int i10) {
        }
    }
}
