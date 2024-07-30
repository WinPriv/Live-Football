package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import com.huawei.hms.ads.gl;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: AppCompatTextViewAutoSizeHelper.java */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: l, reason: collision with root package name */
    public static final RectF f1254l = new RectF();

    /* renamed from: m, reason: collision with root package name */
    @SuppressLint({"BanConcurrentHashMap"})
    public static final ConcurrentHashMap<String, Method> f1255m = new ConcurrentHashMap<>();

    /* renamed from: a, reason: collision with root package name */
    public int f1256a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1257b = false;

    /* renamed from: c, reason: collision with root package name */
    public float f1258c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f1259d = -1.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f1260e = -1.0f;
    public int[] f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public boolean f1261g = false;

    /* renamed from: h, reason: collision with root package name */
    public TextPaint f1262h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f1263i;

    /* renamed from: j, reason: collision with root package name */
    public final Context f1264j;

    /* renamed from: k, reason: collision with root package name */
    public final d f1265k;

    /* compiled from: AppCompatTextViewAutoSizeHelper.java */
    /* loaded from: classes.dex */
    public static final class a {
        public static StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i10, TextView textView, TextPaint textPaint) {
            return new StaticLayout(charSequence, textPaint, i10, alignment, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
        }

        public static int b(TextView textView) {
            return textView.getMaxLines();
        }
    }

    /* compiled from: AppCompatTextViewAutoSizeHelper.java */
    /* loaded from: classes.dex */
    public static final class b {
        public static boolean a(View view) {
            return view.isInLayout();
        }
    }

    /* compiled from: AppCompatTextViewAutoSizeHelper.java */
    /* loaded from: classes.dex */
    public static final class c {
        public static StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i10, int i11, TextView textView, TextPaint textPaint, f fVar) {
            StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i10);
            StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
            if (i11 == -1) {
                i11 = Integer.MAX_VALUE;
            }
            hyphenationFrequency.setMaxLines(i11);
            try {
                fVar.a(obtain, textView);
            } catch (ClassCastException unused) {
                Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
            }
            return obtain.build();
        }
    }

    /* compiled from: AppCompatTextViewAutoSizeHelper.java */
    /* loaded from: classes.dex */
    public static class d extends f {
        @Override // androidx.appcompat.widget.s.f
        public void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) s.e(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    /* compiled from: AppCompatTextViewAutoSizeHelper.java */
    /* loaded from: classes.dex */
    public static class e extends d {
        @Override // androidx.appcompat.widget.s.d, androidx.appcompat.widget.s.f
        public void a(StaticLayout.Builder builder, TextView textView) {
            TextDirectionHeuristic textDirectionHeuristic;
            textDirectionHeuristic = textView.getTextDirectionHeuristic();
            builder.setTextDirection(textDirectionHeuristic);
        }

        @Override // androidx.appcompat.widget.s.f
        public boolean b(TextView textView) {
            boolean isHorizontallyScrollable;
            isHorizontallyScrollable = textView.isHorizontallyScrollable();
            return isHorizontallyScrollable;
        }
    }

    /* compiled from: AppCompatTextViewAutoSizeHelper.java */
    /* loaded from: classes.dex */
    public static class f {
        public void a(StaticLayout.Builder builder, TextView textView) {
            throw null;
        }

        public boolean b(TextView textView) {
            return ((Boolean) s.e(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    static {
        new ConcurrentHashMap();
    }

    public s(TextView textView) {
        this.f1263i = textView;
        this.f1264j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f1265k = new e();
        } else {
            this.f1265k = new d();
        }
    }

    public static int[] b(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArr) {
            if (i10 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i10)) < 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i11 = 0; i11 < size; i11++) {
            iArr2[i11] = ((Integer) arrayList.get(i11)).intValue();
        }
        return iArr2;
    }

    public static Method d(String str) {
        try {
            ConcurrentHashMap<String, Method> concurrentHashMap = f1255m;
            Method method = concurrentHashMap.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                concurrentHashMap.put(str, method);
            }
            return method;
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e10);
            return null;
        }
    }

    public static <T> T e(Object obj, String str, T t10) {
        try {
            return (T) d(str).invoke(obj, new Object[0]);
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e10);
            return t10;
        }
    }

    public final void a() {
        boolean z10;
        int measuredWidth;
        if (i() && this.f1256a != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return;
        }
        if (this.f1257b) {
            if (this.f1263i.getMeasuredHeight() > 0 && this.f1263i.getMeasuredWidth() > 0) {
                if (this.f1265k.b(this.f1263i)) {
                    measuredWidth = com.anythink.expressad.exoplayer.h.o.f8460d;
                } else {
                    measuredWidth = (this.f1263i.getMeasuredWidth() - this.f1263i.getTotalPaddingLeft()) - this.f1263i.getTotalPaddingRight();
                }
                int height = (this.f1263i.getHeight() - this.f1263i.getCompoundPaddingBottom()) - this.f1263i.getCompoundPaddingTop();
                if (measuredWidth > 0 && height > 0) {
                    RectF rectF = f1254l;
                    synchronized (rectF) {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float c10 = c(rectF);
                        if (c10 != this.f1263i.getTextSize()) {
                            f(c10, 0);
                        }
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        this.f1257b = true;
    }

    public final int c(RectF rectF) {
        boolean z10;
        CharSequence transformation;
        int length = this.f.length;
        if (length != 0) {
            int i10 = length - 1;
            int i11 = 1;
            int i12 = 0;
            while (i11 <= i10) {
                int i13 = (i11 + i10) / 2;
                int i14 = this.f[i13];
                TextView textView = this.f1263i;
                CharSequence text = textView.getText();
                TransformationMethod transformationMethod = textView.getTransformationMethod();
                if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, textView)) != null) {
                    text = transformation;
                }
                int b10 = a.b(textView);
                TextPaint textPaint = this.f1262h;
                if (textPaint == null) {
                    this.f1262h = new TextPaint();
                } else {
                    textPaint.reset();
                }
                this.f1262h.set(textView.getPaint());
                this.f1262h.setTextSize(i14);
                StaticLayout a10 = c.a(text, (Layout.Alignment) e(textView, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), b10, this.f1263i, this.f1262h, this.f1265k);
                if ((b10 != -1 && (a10.getLineCount() > b10 || a10.getLineEnd(a10.getLineCount() - 1) != text.length())) || a10.getHeight() > rectF.bottom) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    int i15 = i13 + 1;
                    i12 = i11;
                    i11 = i15;
                } else {
                    i12 = i13 - 1;
                    i10 = i12;
                }
            }
            return this.f[i12];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    public final void f(float f10, int i10) {
        Resources resources;
        Context context = this.f1264j;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        float applyDimension = TypedValue.applyDimension(i10, f10, resources.getDisplayMetrics());
        TextView textView = this.f1263i;
        if (applyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(applyDimension);
            boolean a10 = b.a(textView);
            if (textView.getLayout() != null) {
                this.f1257b = false;
                try {
                    Method d10 = d("nullLayouts");
                    if (d10 != null) {
                        d10.invoke(textView, new Object[0]);
                    }
                } catch (Exception e10) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e10);
                }
                if (!a10) {
                    textView.requestLayout();
                } else {
                    textView.forceLayout();
                }
                textView.invalidate();
            }
        }
    }

    public final boolean g() {
        if (i() && this.f1256a == 1) {
            if (!this.f1261g || this.f.length == 0) {
                int floor = ((int) Math.floor((this.f1260e - this.f1259d) / this.f1258c)) + 1;
                int[] iArr = new int[floor];
                for (int i10 = 0; i10 < floor; i10++) {
                    iArr[i10] = Math.round((i10 * this.f1258c) + this.f1259d);
                }
                this.f = b(iArr);
            }
            this.f1257b = true;
        } else {
            this.f1257b = false;
        }
        return this.f1257b;
    }

    public final boolean h() {
        boolean z10;
        if (this.f.length > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f1261g = z10;
        if (z10) {
            this.f1256a = 1;
            this.f1259d = r0[0];
            this.f1260e = r0[r1 - 1];
            this.f1258c = -1.0f;
        }
        return z10;
    }

    public final boolean i() {
        return !(this.f1263i instanceof AppCompatEditText);
    }

    public final void j(float f10, float f11, float f12) throws IllegalArgumentException {
        if (f10 > gl.Code) {
            if (f11 > f10) {
                if (f12 > gl.Code) {
                    this.f1256a = 1;
                    this.f1259d = f10;
                    this.f1260e = f11;
                    this.f1258c = f12;
                    this.f1261g = false;
                    return;
                }
                throw new IllegalArgumentException("The auto-size step granularity (" + f12 + "px) is less or equal to (0px)");
            }
            throw new IllegalArgumentException("Maximum auto-size text size (" + f11 + "px) is less or equal to minimum auto-size text size (" + f10 + "px)");
        }
        throw new IllegalArgumentException("Minimum auto-size text size (" + f10 + "px) is less or equal to (0px)");
    }
}
