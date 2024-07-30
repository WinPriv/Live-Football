package com.huawei.openalliance.ad.views;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.hms.ads.ex;
import com.huawei.hms.ads.gl;
import gb.r0;
import java.util.Locale;

/* loaded from: classes2.dex */
public class ProgressButton extends View implements View.OnClickListener {
    public int A;
    public int B;
    public float C;
    public Float D;
    public String E;
    public int F;
    public int G;
    public int H;
    public int I;
    public Drawable J;
    public Drawable K;
    public long L;
    public final byte[] M;
    public Paint N;
    public boolean O;
    public b P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public boolean U;

    /* renamed from: s, reason: collision with root package name */
    public final Rect f24058s;

    /* renamed from: t, reason: collision with root package name */
    public Paint f24059t;

    /* renamed from: u, reason: collision with root package name */
    public int f24060u;

    /* renamed from: v, reason: collision with root package name */
    public CharSequence f24061v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f24062w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f24063x;
    public int y;

    /* renamed from: z, reason: collision with root package name */
    public int f24064z;

    /* loaded from: classes2.dex */
    public static final class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: t, reason: collision with root package name */
        public static SavedState f24065t;

        /* renamed from: s, reason: collision with root package name */
        public int f24066s;

        /* loaded from: classes2.dex */
        public static class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f24066s = parcel.readInt();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f24066s);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* loaded from: classes2.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (ex.Code()) {
                ex.Code("ProgressButton", "view post, resetButtonSize");
            }
            ProgressButton.this.j();
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        void Code(int i10, int i11);
    }

    public ProgressButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.progressBarStyle);
        this.f24058s = new Rect();
        this.f24062w = false;
        this.f24063x = true;
        this.B = -1;
        this.C = 12.0f;
        this.D = null;
        this.E = null;
        this.F = -1;
        this.G = -1;
        this.H = 0;
        this.I = 100;
        this.M = new byte[0];
        this.U = false;
        setOnClickListener(this);
        f(context, attributeSet);
        i();
        f(context, attributeSet);
        i();
        f(context, attributeSet);
        i();
    }

    private int getButtonSize() {
        if (this.f24062w) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            int width = getWidth();
            if (width <= 0) {
                return layoutParams.width;
            }
            return width;
        }
        return this.y;
    }

    private int getPaddingSize() {
        return b(getPaddingEnd(), getPaddingRight(), this.T) + b(getPaddingStart(), getPaddingLeft(), this.S);
    }

    private int getTextStart() {
        if (gb.u.b()) {
            return this.T;
        }
        int width = ((getWidth() - this.f24058s.width()) - this.R) / 2;
        int i10 = this.S;
        if (width < i10) {
            width = i10;
        }
        ex.Code("ProgressButton", "safeTextStart: %s", Integer.valueOf(width));
        return width;
    }

    private void setOriginTextSize(Float f) {
        if (f != null) {
            Float f10 = this.D;
            if (f10 == null || f10.floatValue() == gl.Code) {
                this.D = f;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0080 A[LOOP:0: B:2:0x0021->B:10:0x0080, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0083 A[EDGE_INSN: B:11:0x0083->B:12:0x0083 BREAK  A[LOOP:0: B:2:0x0021->B:10:0x0080], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float a(java.lang.CharSequence r10, float r11) {
        /*
            r9 = this;
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Float r2 = java.lang.Float.valueOf(r11)
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "ProgressButton"
            java.lang.String r4 = "startSize:%s"
            com.huawei.hms.ads.ex.Code(r2, r4, r1)
            int r1 = r9.getPaddingSize()
            int r4 = r9.getButtonSize()
            android.content.Context r5 = r9.getContext()
            int r11 = gb.r0.b(r5, r11)
        L21:
            r5 = 9
            if (r11 <= r5) goto L83
            android.content.Context r5 = r9.getContext()
            float r6 = (float) r11
            int r5 = gb.r0.m(r5, r6)
            float r5 = (float) r5
            java.lang.Object[] r6 = new java.lang.Object[r0]
            java.lang.Float r7 = java.lang.Float.valueOf(r5)
            r6[r3] = r7
            java.lang.String r7 = "currentSize:%s"
            com.huawei.hms.ads.ex.Code(r2, r7, r6)
            java.lang.Object[] r6 = new java.lang.Object[r0]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            r6[r3] = r7
            java.lang.String r7 = "buttonSize:%s"
            com.huawei.hms.ads.ex.Code(r2, r7, r6)
            if (r4 >= 0) goto L4c
            goto L7b
        L4c:
            android.graphics.Paint r6 = r9.N
            r6.setTextSize(r5)
            android.graphics.Paint r5 = r9.N
            java.lang.String r6 = r10.toString()
            int r7 = r10.length()
            android.graphics.Rect r8 = r9.f24058s
            r5.getTextBounds(r6, r3, r7, r8)
            int r5 = r8.width()
            int r5 = r5 + r1
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            r6[r3] = r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            r6[r0] = r7
            java.lang.String r7 = "textWidth:%s, btnWidth:%s"
            com.huawei.hms.ads.ex.Code(r2, r7, r6)
            if (r5 > r4) goto L7d
        L7b:
            r5 = r0
            goto L7e
        L7d:
            r5 = r3
        L7e:
            if (r5 != 0) goto L83
            int r11 = r11 + (-1)
            goto L21
        L83:
            android.content.Context r10 = r9.getContext()
            float r11 = (float) r11
            int r10 = gb.r0.m(r10, r11)
            float r10 = (float) r10
            java.lang.Object[] r11 = new java.lang.Object[r0]
            java.lang.Float r0 = java.lang.Float.valueOf(r10)
            r11[r3] = r0
            java.lang.String r0 = "resultSize:%s"
            com.huawei.hms.ads.ex.Code(r2, r0, r11)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.views.ProgressButton.a(java.lang.CharSequence, float):float");
    }

    public final int b(int i10, int i11, int i12) {
        if (i10 <= 0) {
            i10 = i11;
        }
        if (!this.U || i12 <= 0 || i10 >= i12) {
            return i10;
        }
        return i12;
    }

    public final CharSequence c(CharSequence charSequence, int i10, int i11) {
        int length = getText().length();
        int ceil = (int) Math.ceil(((i10 - i11) / getPromptRect().width()) * length);
        int ceil2 = (int) Math.ceil((this.f24060u * length) / getPromptRect().width());
        int i12 = length - ceil;
        if (i12 - ceil2 > 0) {
            return charSequence.toString().substring(0, length - (ceil + ceil2)) + "...";
        }
        if (i12 > 0) {
            return charSequence.toString().substring(0, i12);
        }
        return charSequence;
    }

    public final void d(int i10, int i11, String str) {
        Typeface typeface;
        Typeface create;
        int i12;
        ex.Code("ProgressButton", "setTypefaceFromAttrs");
        if (str != null) {
            typeface = Typeface.create(str, i11);
            if (typeface != null) {
                ex.Code("ProgressButton", "setTypeface");
                setPaintTypeface(typeface);
                this.f24059t.setTypeface(typeface);
                return;
            }
        } else {
            typeface = null;
        }
        boolean z10 = true;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    typeface = Typeface.MONOSPACE;
                }
            } else {
                typeface = Typeface.SERIF;
            }
        } else {
            typeface = Typeface.SANS_SERIF;
        }
        float f = gl.Code;
        if (i11 > 0) {
            if (typeface == null) {
                create = Typeface.defaultFromStyle(i11);
            } else {
                create = Typeface.create(typeface, i11);
            }
            setPaintTypeface(create);
            if (create != null) {
                i12 = create.getStyle();
            } else {
                i12 = 0;
            }
            int i13 = i11 & (~i12);
            Paint paint = this.f24059t;
            if ((i13 & 1) == 0) {
                z10 = false;
            }
            paint.setFakeBoldText(z10);
            Paint paint2 = this.f24059t;
            if ((i13 & 2) != 0) {
                f = -0.25f;
            }
            paint2.setTextSkewX(f);
            return;
        }
        this.f24059t.setFakeBoldText(false);
        this.f24059t.setTextSkewX(gl.Code);
        setPaintTypeface(typeface);
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        ex.Code("ProgressButton", "drawableStateChanged");
        super.drawableStateChanged();
        synchronized (this.M) {
            int[] drawableState = getDrawableState();
            Drawable drawable = this.J;
            if (drawable != null && drawable.isStateful()) {
                this.J.setState(drawableState);
            }
        }
    }

    public final void e(int i10, boolean z10) {
        float f;
        synchronized (this.M) {
            int i11 = this.I;
            if (i11 > 0) {
                f = i10 / i11;
            } else {
                f = gl.Code;
            }
            Drawable drawable = this.K;
            if (drawable != null) {
                drawable.setLevel((int) (f * 10000.0f));
            } else {
                invalidate();
            }
        }
    }

    public final void f(Context context, AttributeSet attributeSet) {
        synchronized (this.M) {
            if (attributeSet != null) {
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.huawei.hms.ads.nativead.R.styleable.hiad_progress_button);
                TypedArray typedArray = null;
                try {
                    typedArray = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.layout_height});
                    int dimensionPixelSize = typedArray.getDimensionPixelSize(0, -2);
                    this.A = dimensionPixelSize;
                    ex.Code("ProgressButton", "layoutHeight: %s", Integer.valueOf(dimensionPixelSize));
                } catch (Throwable th) {
                    try {
                        ex.I("ProgressButton", "get layout height ex: %s", th.getClass().getSimpleName());
                    } finally {
                        if (typedArray != null) {
                            typedArray.recycle();
                        }
                    }
                }
                try {
                    try {
                        this.f24062w = obtainStyledAttributes.getBoolean(com.huawei.hms.ads.nativead.R.styleable.hiad_progress_button_hiad_fixedWidth, false);
                        this.f24063x = obtainStyledAttributes.getBoolean(com.huawei.hms.ads.nativead.R.styleable.hiad_progress_button_hiad_resetWidth, true);
                        this.y = obtainStyledAttributes.getDimensionPixelSize(com.huawei.hms.ads.nativead.R.styleable.hiad_progress_button_hiad_maxWidth, 0);
                        this.f24064z = obtainStyledAttributes.getDimensionPixelSize(com.huawei.hms.ads.nativead.R.styleable.hiad_progress_button_hiad_minWidth, 0);
                        float dimension = obtainStyledAttributes.getDimension(com.huawei.hms.ads.nativead.R.styleable.hiad_progress_button_hiad_textSize, gl.Code);
                        this.C = dimension;
                        setOriginTextSize(Float.valueOf(dimension));
                        this.B = obtainStyledAttributes.getColor(com.huawei.hms.ads.nativead.R.styleable.hiad_progress_button_hiad_textColor, -1);
                        this.E = obtainStyledAttributes.getString(com.huawei.hms.ads.nativead.R.styleable.hiad_progress_button_hiad_fontFamily);
                        this.G = obtainStyledAttributes.getInt(com.huawei.hms.ads.nativead.R.styleable.hiad_progress_button_hiad_styleIndex, -1);
                        this.F = obtainStyledAttributes.getInt(com.huawei.hms.ads.nativead.R.styleable.hiad_progress_button_hiad_typefaceIndex, -1);
                    } catch (RuntimeException unused) {
                        ex.I("ProgressButton", "initButtonAttr RuntimeException");
                    } catch (Exception unused2) {
                        ex.I("ProgressButton", "initButtonAttr error");
                    }
                    if (this.A <= 0) {
                        this.A = ((int) this.C) + getPaddingTop() + getPaddingBottom();
                    }
                } finally {
                    obtainStyledAttributes.recycle();
                }
            }
        }
    }

    public final void g(Canvas canvas) {
        synchronized (this.M) {
            CharSequence charSequence = this.f24061v;
            if (charSequence != null && charSequence.length() > 0) {
                String intern = this.f24061v.toString().intern();
                int width = (getWidth() / 2) - this.f24058s.centerX();
                if (this.U && width < this.R) {
                    width = getTextStart();
                }
                canvas.drawText((CharSequence) intern, 0, intern.length(), width, (getHeight() / 2) - this.f24058s.centerY(), this.f24059t);
            }
        }
    }

    public int getProgress() {
        int i10;
        synchronized (this.M) {
            i10 = this.H;
        }
        return i10;
    }

    public Drawable getProgressDrawable() {
        Drawable drawable;
        synchronized (this.M) {
            drawable = this.J;
        }
        return drawable;
    }

    public Rect getPromptRect() {
        Rect rect;
        synchronized (this.M) {
            rect = this.f24058s;
        }
        return rect;
    }

    public da.n getStatus() {
        return null;
    }

    public CharSequence getText() {
        CharSequence charSequence;
        synchronized (this.M) {
            charSequence = this.f24061v;
        }
        return charSequence;
    }

    public final void h(Drawable drawable, int i10) {
        boolean z10;
        synchronized (this.M) {
            Drawable drawable2 = this.J;
            if (drawable2 != null && drawable != drawable2) {
                drawable2.setCallback(null);
                z10 = true;
            } else {
                z10 = false;
            }
            if (drawable != null) {
                drawable.setCallback(this);
            }
            this.J = drawable;
            this.K = drawable;
            if (z10) {
                int width = getWidth();
                int height = getHeight();
                synchronized (this.M) {
                    Drawable drawable3 = this.J;
                    if (drawable3 != null) {
                        drawable3.setBounds(0, 0, width, height);
                    }
                }
                if (i10 < 0) {
                    i10 = 0;
                }
                int i11 = this.I;
                if (i10 > i11) {
                    i10 = i11;
                }
                this.H = i10;
                e(i10, false);
            } else {
                setProgress(i10);
            }
        }
    }

    public final void i() {
        Paint paint = new Paint();
        this.f24059t = paint;
        paint.setAntiAlias(true);
        this.f24059t.setTextSize(this.C);
        this.f24059t.setColor(this.B);
        Paint paint2 = new Paint();
        this.N = paint2;
        paint2.setTextSize(this.C);
        int i10 = this.G;
        if (i10 != -1) {
            this.E = null;
        }
        d(this.F, i10, this.E);
        setClickable(true);
        Paint paint3 = new Paint();
        paint3.setTextSize(this.C);
        Rect rect = new Rect();
        paint3.getTextBounds("...", 0, 3, rect);
        this.f24060u = rect.width();
        this.O = gb.u.b();
        this.Q = r0.i(getContext(), 40.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00d4 A[Catch: all -> 0x00df, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:9:0x000f, B:11:0x004d, B:14:0x004f, B:16:0x0053, B:17:0x0055, B:19:0x0059, B:20:0x0068, B:22:0x006c, B:24:0x0072, B:26:0x0076, B:29:0x007c, B:30:0x009e, B:31:0x00d0, B:33:0x00d4, B:34:0x00db, B:37:0x0098, B:39:0x009c, B:40:0x00a2, B:42:0x00a6, B:45:0x00ac, B:46:0x00cd, B:47:0x00c8, B:50:0x00dd), top: B:3:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j() {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.views.ProgressButton.j():void");
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        synchronized (this.M) {
            super.jumpDrawablesToCurrentState();
            Drawable drawable = this.J;
            if (drawable != null) {
                drawable.jumpToCurrentState();
            }
        }
    }

    public final void k() {
        boolean z10;
        int i10;
        int i11;
        if (!this.U) {
            return;
        }
        int i12 = this.A;
        if (i12 <= 0) {
            i12 = getMeasuredHeight();
        }
        if (i12 <= 0) {
            return;
        }
        if (i12 < this.Q) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i10 = 24;
        } else {
            i10 = 36;
        }
        this.R = r0.i(getContext(), i10);
        int i13 = 8;
        if (z10) {
            i11 = 8;
        } else {
            i11 = 16;
        }
        this.S = r0.i(getContext(), i11);
        if (z10) {
            i13 = 4;
        }
        this.T = r0.i(getContext(), i13) + (r0.i(getContext(), 12) / 2) + (i12 / 2);
        ex.Code("ProgressButton", "update text safe padding, start: %s, end: %s", Integer.valueOf(this.S), Integer.valueOf(this.T));
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x002e, code lost:
    
        r6.scale(-1.0f, 1.0f, getWidth() / 2.0f, getHeight() / 2.0f);
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDraw(android.graphics.Canvas r6) {
        /*
            r5 = this;
            byte[] r0 = r5.M
            monitor-enter(r0)
            super.onDraw(r6)     // Catch: java.lang.Throwable -> L48
            android.graphics.drawable.Drawable r1 = r5.K     // Catch: java.lang.Throwable -> L48
            if (r1 == 0) goto Ld
            r1.draw(r6)     // Catch: java.lang.Throwable -> L48
        Ld:
            r2 = 0
            if (r1 == 0) goto L2c
            boolean r3 = r1 instanceof android.graphics.drawable.LayerDrawable     // Catch: java.lang.Throwable -> L48
            if (r3 != 0) goto L15
            goto L2c
        L15:
            android.graphics.drawable.LayerDrawable r1 = (android.graphics.drawable.LayerDrawable) r1     // Catch: java.lang.Throwable -> L48
            r3 = 16908301(0x102000d, float:2.3877265E-38)
            android.graphics.drawable.Drawable r1 = r1.findDrawableByLayerId(r3)     // Catch: java.lang.Throwable -> L48
            if (r1 != 0) goto L21
            goto L2c
        L21:
            boolean r3 = r1 instanceof com.huawei.openalliance.ad.views.w     // Catch: java.lang.Throwable -> L48
            if (r3 != 0) goto L2a
            boolean r1 = r1 instanceof com.huawei.openalliance.ad.views.x     // Catch: java.lang.Throwable -> L48
            if (r1 != 0) goto L2a
            goto L2c
        L2a:
            boolean r2 = r5.O     // Catch: java.lang.Throwable -> L48
        L2c:
            if (r2 == 0) goto L43
            int r1 = r5.getWidth()     // Catch: java.lang.Throwable -> L48
            float r1 = (float) r1     // Catch: java.lang.Throwable -> L48
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r2
            int r3 = r5.getHeight()     // Catch: java.lang.Throwable -> L48
            float r3 = (float) r3     // Catch: java.lang.Throwable -> L48
            float r3 = r3 / r2
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4 = 1065353216(0x3f800000, float:1.0)
            r6.scale(r2, r4, r1, r3)     // Catch: java.lang.Throwable -> L48
        L43:
            r5.g(r6)     // Catch: java.lang.Throwable -> L48
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L48
            return
        L48:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L48
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.views.ProgressButton.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setProgress(savedState.f24066s);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState;
        synchronized (this.M) {
            Parcelable onSaveInstanceState = super.onSaveInstanceState();
            if (SavedState.f24065t == null) {
                SavedState.f24065t = new SavedState(onSaveInstanceState);
            }
            savedState = SavedState.f24065t;
            savedState.f24066s = this.H;
        }
        return savedState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        synchronized (this.M) {
            Drawable drawable = this.J;
            if (drawable != null) {
                drawable.setBounds(0, 0, i10, i11);
            }
        }
    }

    public void setFixedWidth(boolean z10) {
        this.f24062w = z10;
    }

    public void setFontFamily(String str) {
        this.E = str;
        d(this.F, this.G, str);
    }

    public void setMax(int i10) {
        synchronized (this.M) {
            if (i10 < 0) {
                i10 = 0;
            }
            if (i10 != this.I) {
                this.I = i10;
                postInvalidate();
                if (this.H > i10) {
                    this.H = i10;
                }
                int i11 = this.H;
                synchronized (this.M) {
                    e(i11, true);
                }
            }
        }
    }

    public void setMaxWidth(int i10) {
        synchronized (this.M) {
            this.y = i10;
        }
    }

    public void setMinWidth(int i10) {
        synchronized (this.M) {
            this.f24064z = i10;
        }
    }

    public void setPaintTypeface(Typeface typeface) {
        synchronized (this.M) {
            this.f24059t.setTypeface(typeface);
        }
    }

    public void setProgress(int i10) {
        synchronized (this.M) {
            synchronized (this.M) {
                if (i10 < 0) {
                    i10 = 0;
                }
                try {
                    int i11 = this.I;
                    if (i10 > i11) {
                        i10 = i11;
                    }
                    if (i10 != this.H) {
                        this.H = i10;
                        synchronized (this.M) {
                            e(i10, true);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void setProgressDrawable(Drawable drawable) {
        h(drawable, 0);
    }

    public void setResetListener(b bVar) {
        this.P = bVar;
    }

    public void setResetWidth(boolean z10) {
        this.f24063x = z10;
    }

    public void setText(CharSequence charSequence) {
        float f;
        ex.Code("ProgressButton", "setText:%s, need safepadding: %s", charSequence, Boolean.valueOf(this.U));
        synchronized (this.M) {
            k();
            this.f24061v = String.valueOf(charSequence).toUpperCase(Locale.getDefault());
            Float f10 = this.D;
            if (f10 != null) {
                f = f10.floatValue();
            } else {
                f = this.C;
            }
            float a10 = a(this.f24061v, f);
            if (!TextUtils.isEmpty(charSequence) && Math.abs(a10 - this.C) >= 0.5f) {
                setTextSize(a10);
            }
            if (getWidth() <= 0 && !this.f24063x) {
                post(new a());
                invalidate();
            }
            j();
            invalidate();
        }
    }

    public void setTextColor(int i10) {
        this.B = i10;
        Paint paint = this.f24059t;
        if (paint != null) {
            paint.setColor(i10);
        }
    }

    public void setTextSize(float f) {
        this.C = f;
        setOriginTextSize(Float.valueOf(f));
        Paint paint = this.f24059t;
        if (paint != null) {
            paint.setAntiAlias(true);
            this.f24059t.setTextSize(this.C);
        }
        Paint paint2 = new Paint();
        paint2.setTextSize(this.C);
        Rect rect = new Rect();
        paint2.getTextBounds("...", 0, 3, rect);
        this.f24060u = rect.width();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        boolean z10;
        synchronized (this.M) {
            if (drawable != this.J && !super.verifyDrawable(drawable)) {
                z10 = false;
            }
            z10 = true;
        }
        return z10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
    }
}
