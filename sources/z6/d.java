package z6;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import androidx.activity.n;
import com.huawei.hms.ads.gl;
import e0.f;

/* compiled from: TextAppearance.java */
/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f37310a;

    /* renamed from: b, reason: collision with root package name */
    public final String f37311b;

    /* renamed from: c, reason: collision with root package name */
    public final int f37312c;

    /* renamed from: d, reason: collision with root package name */
    public final int f37313d;

    /* renamed from: e, reason: collision with root package name */
    public final float f37314e;
    public final float f;

    /* renamed from: g, reason: collision with root package name */
    public final float f37315g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f37316h;

    /* renamed from: i, reason: collision with root package name */
    public final float f37317i;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f37318j;

    /* renamed from: k, reason: collision with root package name */
    public float f37319k;

    /* renamed from: l, reason: collision with root package name */
    public final int f37320l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f37321m = false;

    /* renamed from: n, reason: collision with root package name */
    public Typeface f37322n;

    /* compiled from: TextAppearance.java */
    /* loaded from: classes2.dex */
    public class a extends f.e {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f f37323a;

        public a(f fVar) {
            this.f37323a = fVar;
        }

        @Override // e0.f.e
        public final void c(int i10) {
            d.this.f37321m = true;
            this.f37323a.q(i10);
        }

        @Override // e0.f.e
        public final void d(Typeface typeface) {
            d dVar = d.this;
            dVar.f37322n = Typeface.create(typeface, dVar.f37312c);
            dVar.f37321m = true;
            this.f37323a.r(dVar.f37322n, false);
        }
    }

    public d(Context context, int i10) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i10, n.f514v0);
        this.f37319k = obtainStyledAttributes.getDimension(0, gl.Code);
        this.f37318j = c.a(context, obtainStyledAttributes, 3);
        c.a(context, obtainStyledAttributes, 4);
        c.a(context, obtainStyledAttributes, 5);
        this.f37312c = obtainStyledAttributes.getInt(2, 0);
        this.f37313d = obtainStyledAttributes.getInt(1, 1);
        int i11 = obtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f37320l = obtainStyledAttributes.getResourceId(i11, 0);
        this.f37311b = obtainStyledAttributes.getString(i11);
        obtainStyledAttributes.getBoolean(14, false);
        this.f37310a = c.a(context, obtainStyledAttributes, 6);
        this.f37314e = obtainStyledAttributes.getFloat(7, gl.Code);
        this.f = obtainStyledAttributes.getFloat(8, gl.Code);
        this.f37315g = obtainStyledAttributes.getFloat(9, gl.Code);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i10, n.f498j0);
        this.f37316h = obtainStyledAttributes2.hasValue(0);
        this.f37317i = obtainStyledAttributes2.getFloat(0, gl.Code);
        obtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.f37322n;
        int i10 = this.f37312c;
        if (typeface == null && (str = this.f37311b) != null) {
            this.f37322n = Typeface.create(str, i10);
        }
        if (this.f37322n == null) {
            int i11 = this.f37313d;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        this.f37322n = Typeface.DEFAULT;
                    } else {
                        this.f37322n = Typeface.MONOSPACE;
                    }
                } else {
                    this.f37322n = Typeface.SERIF;
                }
            } else {
                this.f37322n = Typeface.SANS_SERIF;
            }
            this.f37322n = Typeface.create(this.f37322n, i10);
        }
    }

    public final Typeface b(Context context) {
        if (this.f37321m) {
            return this.f37322n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface a10 = e0.f.a(this.f37320l, context);
                this.f37322n = a10;
                if (a10 != null) {
                    this.f37322n = Typeface.create(a10, this.f37312c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e10) {
                Log.d("TextAppearance", "Error loading font " + this.f37311b, e10);
            }
        }
        a();
        this.f37321m = true;
        return this.f37322n;
    }

    public final void c(Context context, f fVar) {
        if (d(context)) {
            b(context);
        } else {
            a();
        }
        int i10 = this.f37320l;
        if (i10 == 0) {
            this.f37321m = true;
        }
        if (this.f37321m) {
            fVar.r(this.f37322n, true);
            return;
        }
        try {
            a aVar = new a(fVar);
            ThreadLocal<TypedValue> threadLocal = e0.f.f27633a;
            if (context.isRestricted()) {
                aVar.a(-4);
            } else {
                e0.f.b(context, i10, new TypedValue(), 0, aVar, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f37321m = true;
            fVar.q(1);
        } catch (Exception e10) {
            Log.d("TextAppearance", "Error loading font " + this.f37311b, e10);
            this.f37321m = true;
            fVar.q(-3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001f A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(android.content.Context r8) {
        /*
            r7 = this;
            int r1 = r7.f37320l
            if (r1 == 0) goto L1c
            java.lang.ThreadLocal<android.util.TypedValue> r0 = e0.f.f27633a
            boolean r0 = r8.isRestricted()
            if (r0 == 0) goto Ld
            goto L1c
        Ld:
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 1
            r0 = r8
            android.graphics.Typeface r8 = e0.f.b(r0, r1, r2, r3, r4, r5, r6)
            goto L1d
        L1c:
            r8 = 0
        L1d:
            if (r8 == 0) goto L21
            r8 = 1
            goto L22
        L21:
            r8 = 0
        L22:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: z6.d.d(android.content.Context):boolean");
    }

    public final void e(Context context, TextPaint textPaint, f fVar) {
        int i10;
        int i11;
        f(context, textPaint, fVar);
        ColorStateList colorStateList = this.f37318j;
        if (colorStateList != null) {
            i10 = colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor());
        } else {
            i10 = -16777216;
        }
        textPaint.setColor(i10);
        ColorStateList colorStateList2 = this.f37310a;
        if (colorStateList2 != null) {
            i11 = colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor());
        } else {
            i11 = 0;
        }
        textPaint.setShadowLayer(this.f37315g, this.f37314e, this.f, i11);
    }

    public final void f(Context context, TextPaint textPaint, f fVar) {
        if (d(context)) {
            g(context, textPaint, b(context));
            return;
        }
        a();
        g(context, textPaint, this.f37322n);
        c(context, new e(this, context, textPaint, fVar));
    }

    public final void g(Context context, TextPaint textPaint, Typeface typeface) {
        boolean z10;
        float f;
        Typeface a10 = g.a(context.getResources().getConfiguration(), typeface);
        if (a10 != null) {
            typeface = a10;
        }
        textPaint.setTypeface(typeface);
        int i10 = (~typeface.getStyle()) & this.f37312c;
        if ((i10 & 1) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        textPaint.setFakeBoldText(z10);
        if ((i10 & 2) != 0) {
            f = -0.25f;
        } else {
            f = gl.Code;
        }
        textPaint.setTextSkewX(f);
        textPaint.setTextSize(this.f37319k);
        if (this.f37316h) {
            textPaint.setLetterSpacing(this.f37317i);
        }
    }
}
