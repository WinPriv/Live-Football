package r0;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.Locale;
import l0.c;

/* compiled from: TextViewCompat.java */
/* loaded from: classes.dex */
public final class j {

    /* compiled from: TextViewCompat.java */
    /* loaded from: classes.dex */
    public static class a {
        public static boolean a(TextView textView) {
            return textView.getIncludeFontPadding();
        }

        public static int b(TextView textView) {
            return textView.getMaxLines();
        }

        public static int c(TextView textView) {
            return textView.getMinLines();
        }
    }

    /* compiled from: TextViewCompat.java */
    /* loaded from: classes.dex */
    public static class b {
        public static Drawable[] a(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        public static int b(View view) {
            return view.getLayoutDirection();
        }

        public static int c(View view) {
            return view.getTextDirection();
        }

        public static Locale d(TextView textView) {
            return textView.getTextLocale();
        }

        public static void e(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        }

        public static void f(TextView textView, int i10, int i11, int i12, int i13) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(i10, i11, i12, i13);
        }

        public static void g(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        public static void h(View view, int i10) {
            view.setTextDirection(i10);
        }
    }

    /* compiled from: TextViewCompat.java */
    /* loaded from: classes.dex */
    public static class c {
        public static int a(TextView textView) {
            return textView.getBreakStrategy();
        }

        public static ColorStateList b(TextView textView) {
            return textView.getCompoundDrawableTintList();
        }

        public static PorterDuff.Mode c(TextView textView) {
            return textView.getCompoundDrawableTintMode();
        }

        public static int d(TextView textView) {
            return textView.getHyphenationFrequency();
        }

        public static void e(TextView textView, int i10) {
            textView.setBreakStrategy(i10);
        }

        public static void f(TextView textView, ColorStateList colorStateList) {
            textView.setCompoundDrawableTintList(colorStateList);
        }

        public static void g(TextView textView, PorterDuff.Mode mode) {
            textView.setCompoundDrawableTintMode(mode);
        }

        public static void h(TextView textView, int i10) {
            textView.setHyphenationFrequency(i10);
        }
    }

    /* compiled from: TextViewCompat.java */
    /* loaded from: classes.dex */
    public static class d {
        public static DecimalFormatSymbols a(Locale locale) {
            return DecimalFormatSymbols.getInstance(locale);
        }
    }

    /* compiled from: TextViewCompat.java */
    /* loaded from: classes.dex */
    public static class e {
        public static String[] a(DecimalFormatSymbols decimalFormatSymbols) {
            String[] digitStrings;
            digitStrings = decimalFormatSymbols.getDigitStrings();
            return digitStrings;
        }

        public static PrecomputedText.Params b(TextView textView) {
            PrecomputedText.Params textMetricsParams;
            textMetricsParams = textView.getTextMetricsParams();
            return textMetricsParams;
        }

        public static void c(TextView textView, int i10) {
            textView.setFirstBaselineToTopHeight(i10);
        }
    }

    /* compiled from: TextViewCompat.java */
    /* loaded from: classes.dex */
    public static class f implements ActionMode.Callback {

        /* renamed from: a, reason: collision with root package name */
        public final ActionMode.Callback f34793a;

        /* renamed from: b, reason: collision with root package name */
        public final TextView f34794b;

        /* renamed from: c, reason: collision with root package name */
        public Class<?> f34795c;

        /* renamed from: d, reason: collision with root package name */
        public Method f34796d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f34797e;
        public boolean f = false;

        public f(ActionMode.Callback callback, TextView textView) {
            this.f34793a = callback;
            this.f34794b = textView;
        }

        @Override // android.view.ActionMode.Callback
        public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f34793a.onActionItemClicked(actionMode, menuItem);
        }

        @Override // android.view.ActionMode.Callback
        public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f34793a.onCreateActionMode(actionMode, menu);
        }

        @Override // android.view.ActionMode.Callback
        public final void onDestroyActionMode(ActionMode actionMode) {
            this.f34793a.onDestroyActionMode(actionMode);
        }

        /* JADX WARN: Removed duplicated region for block: B:44:0x00d1 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:48:0x009f A[SYNTHETIC] */
        @Override // android.view.ActionMode.Callback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean onPrepareActionMode(android.view.ActionMode r14, android.view.Menu r15) {
            /*
                Method dump skipped, instructions count: 302
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: r0.j.f.onPrepareActionMode(android.view.ActionMode, android.view.Menu):boolean");
        }
    }

    public static c.a a(TextView textView) {
        TextDirectionHeuristic textDirectionHeuristic;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            return new c.a(e.b(textView));
        }
        TextPaint textPaint = new TextPaint(textView.getPaint());
        TextDirectionHeuristic textDirectionHeuristic2 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int a10 = c.a(textView);
        int d10 = c.d(textView);
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else {
            boolean z10 = true;
            if (i10 >= 28 && (textView.getInputType() & 15) == 3) {
                byte directionality = Character.getDirectionality(e.a(d.a(b.d(textView)))[0].codePointAt(0));
                if (directionality != 1 && directionality != 2) {
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                } else {
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                }
            } else {
                if (b.b(textView) != 1) {
                    z10 = false;
                }
                switch (b.c(textView)) {
                    case 2:
                        textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                        break;
                    case 3:
                        textDirectionHeuristic = TextDirectionHeuristics.LTR;
                        break;
                    case 4:
                        textDirectionHeuristic = TextDirectionHeuristics.RTL;
                        break;
                    case 5:
                        textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                        break;
                    case 6:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                        break;
                    case 7:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    default:
                        if (z10) {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            break;
                        } else {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                            break;
                        }
                }
            }
        }
        return new c.a(textPaint, textDirectionHeuristic, a10, d10);
    }

    public static void b(TextView textView, int i10) {
        int i11;
        a0.a.w0(i10);
        if (Build.VERSION.SDK_INT >= 28) {
            e.c(textView, i10);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (a.a(textView)) {
            i11 = fontMetricsInt.top;
        } else {
            i11 = fontMetricsInt.ascent;
        }
        if (i10 > Math.abs(i11)) {
            textView.setPadding(textView.getPaddingLeft(), i10 + i11, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void c(TextView textView, int i10) {
        int i11;
        a0.a.w0(i10);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (a.a(textView)) {
            i11 = fontMetricsInt.bottom;
        } else {
            i11 = fontMetricsInt.descent;
        }
        if (i10 > Math.abs(i11)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i10 - i11);
        }
    }

    public static ActionMode.Callback d(ActionMode.Callback callback) {
        if ((callback instanceof f) && Build.VERSION.SDK_INT >= 26) {
            return ((f) callback).f34793a;
        }
        return callback;
    }

    public static ActionMode.Callback e(ActionMode.Callback callback, TextView textView) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26 && i10 <= 27 && !(callback instanceof f) && callback != null) {
            return new f(callback, textView);
        }
        return callback;
    }
}
