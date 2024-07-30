package com.google.android.material.chip;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.a;
import com.google.android.material.internal.e;
import com.google.android.material.internal.h;
import com.google.android.material.internal.k;
import com.huawei.hms.ads.gl;
import d7.j;
import d7.n;
import g0.a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.WeakHashMap;
import l0.f;
import n0.c0;
import n0.l0;
import o0.g;
import z6.c;
import z6.d;

/* loaded from: classes2.dex */
public class Chip extends AppCompatCheckBox implements a.InterfaceC0236a, n, Checkable {
    public static final Rect O = new Rect();
    public static final int[] P = {R.attr.state_selected};
    public static final int[] Q = {R.attr.state_checkable};
    public CompoundButton.OnCheckedChangeListener A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public int G;
    public int H;
    public CharSequence I;
    public final b J;
    public boolean K;
    public final Rect L;
    public final RectF M;
    public final a N;

    /* renamed from: w, reason: collision with root package name */
    public com.google.android.material.chip.a f20605w;

    /* renamed from: x, reason: collision with root package name */
    public InsetDrawable f20606x;
    public RippleDrawable y;

    /* renamed from: z, reason: collision with root package name */
    public View.OnClickListener f20607z;

    /* loaded from: classes2.dex */
    public class b extends t0.a {
        public b(Chip chip) {
            super(chip);
        }

        @Override // t0.a
        public final void l(ArrayList arrayList) {
            boolean z10 = false;
            arrayList.add(0);
            Rect rect = Chip.O;
            Chip chip = Chip.this;
            if (chip.e()) {
                com.google.android.material.chip.a aVar = chip.f20605w;
                if (aVar != null && aVar.f20616e0) {
                    z10 = true;
                }
                if (z10 && chip.f20607z != null) {
                    arrayList.add(1);
                }
            }
        }

        @Override // t0.a
        public final void o(int i10, g gVar) {
            AccessibilityNodeInfo accessibilityNodeInfo = gVar.f33521a;
            CharSequence charSequence = "";
            if (i10 == 1) {
                Chip chip = Chip.this;
                CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
                if (closeIconContentDescription != null) {
                    accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
                } else {
                    CharSequence text = chip.getText();
                    Context context = chip.getContext();
                    Object[] objArr = new Object[1];
                    if (!TextUtils.isEmpty(text)) {
                        charSequence = text;
                    }
                    objArr[0] = charSequence;
                    accessibilityNodeInfo.setContentDescription(context.getString(com.hamkho.livefoot.R.string.mtrl_chip_close_icon_content_description, objArr).trim());
                }
                accessibilityNodeInfo.setBoundsInParent(chip.getCloseIconTouchBoundsInt());
                gVar.b(g.a.f33524e);
                accessibilityNodeInfo.setEnabled(chip.isEnabled());
                return;
            }
            accessibilityNodeInfo.setContentDescription("");
            accessibilityNodeInfo.setBoundsInParent(Chip.O);
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        super(g7.a.a(context, attributeSet, com.hamkho.livefoot.R.attr.chipStyle, com.hamkho.livefoot.R.style.Widget_MaterialComponents_Chip_Action), attributeSet, com.hamkho.livefoot.R.attr.chipStyle);
        d dVar;
        h6.g gVar;
        int resourceId;
        int resourceId2;
        int resourceId3;
        this.L = new Rect();
        this.M = new RectF();
        this.N = new a();
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") == null) {
                if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") == null) {
                    if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") == null) {
                        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") == null) {
                            if (attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) == 1) {
                                if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                                    Log.w("Chip", "Chip text must be vertically center and start aligned");
                                }
                            } else {
                                throw new UnsupportedOperationException("Chip does not support multi-line text");
                            }
                        } else {
                            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
                        }
                    } else {
                        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
                    }
                } else {
                    throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
                }
            } else {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            }
        }
        com.google.android.material.chip.a aVar = new com.google.android.material.chip.a(context2, attributeSet);
        Context context3 = aVar.y0;
        int[] iArr = androidx.activity.n.P;
        TypedArray d10 = k.d(context3, attributeSet, iArr, com.hamkho.livefoot.R.attr.chipStyle, com.hamkho.livefoot.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        aVar.Z0 = d10.hasValue(37);
        Context context4 = aVar.y0;
        ColorStateList a10 = c.a(context4, d10, 24);
        if (aVar.P != a10) {
            aVar.P = a10;
            aVar.onStateChange(aVar.getState());
        }
        ColorStateList a11 = c.a(context4, d10, 11);
        if (aVar.Q != a11) {
            aVar.Q = a11;
            aVar.onStateChange(aVar.getState());
        }
        float dimension = d10.getDimension(19, gl.Code);
        if (aVar.R != dimension) {
            aVar.R = dimension;
            aVar.invalidateSelf();
            aVar.v();
        }
        if (d10.hasValue(12)) {
            aVar.B(d10.getDimension(12, gl.Code));
        }
        aVar.G(c.a(context4, d10, 22));
        aVar.H(d10.getDimension(23, gl.Code));
        aVar.Q(c.a(context4, d10, 36));
        String text = d10.getText(5);
        text = text == null ? "" : text;
        boolean equals = TextUtils.equals(aVar.W, text);
        h hVar = aVar.E0;
        if (!equals) {
            aVar.W = text;
            hVar.f20877d = true;
            aVar.invalidateSelf();
            aVar.v();
        }
        h6.g gVar2 = null;
        if (d10.hasValue(0) && (resourceId3 = d10.getResourceId(0, 0)) != 0) {
            dVar = new d(context4, resourceId3);
        } else {
            dVar = null;
        }
        dVar.f37319k = d10.getDimension(1, dVar.f37319k);
        hVar.b(dVar, context4);
        int i10 = d10.getInt(3, 0);
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    aVar.W0 = TextUtils.TruncateAt.END;
                }
            } else {
                aVar.W0 = TextUtils.TruncateAt.MIDDLE;
            }
        } else {
            aVar.W0 = TextUtils.TruncateAt.START;
        }
        aVar.F(d10.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            aVar.F(d10.getBoolean(15, false));
        }
        aVar.C(c.d(context4, d10, 14));
        if (d10.hasValue(17)) {
            aVar.E(c.a(context4, d10, 17));
        }
        aVar.D(d10.getDimension(16, -1.0f));
        aVar.N(d10.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            aVar.N(d10.getBoolean(26, false));
        }
        aVar.I(c.d(context4, d10, 25));
        aVar.M(c.a(context4, d10, 30));
        aVar.K(d10.getDimension(28, gl.Code));
        aVar.x(d10.getBoolean(6, false));
        aVar.A(d10.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            aVar.A(d10.getBoolean(8, false));
        }
        aVar.y(c.d(context4, d10, 7));
        if (d10.hasValue(9)) {
            aVar.z(c.a(context4, d10, 9));
        }
        if (d10.hasValue(39) && (resourceId2 = d10.getResourceId(39, 0)) != 0) {
            gVar = h6.g.a(resourceId2, context4);
        } else {
            gVar = null;
        }
        aVar.f20626o0 = gVar;
        if (d10.hasValue(33) && (resourceId = d10.getResourceId(33, 0)) != 0) {
            gVar2 = h6.g.a(resourceId, context4);
        }
        aVar.f20627p0 = gVar2;
        float dimension2 = d10.getDimension(21, gl.Code);
        if (aVar.f20628q0 != dimension2) {
            aVar.f20628q0 = dimension2;
            aVar.invalidateSelf();
            aVar.v();
        }
        aVar.P(d10.getDimension(35, gl.Code));
        aVar.O(d10.getDimension(34, gl.Code));
        float dimension3 = d10.getDimension(41, gl.Code);
        if (aVar.f20631t0 != dimension3) {
            aVar.f20631t0 = dimension3;
            aVar.invalidateSelf();
            aVar.v();
        }
        float dimension4 = d10.getDimension(40, gl.Code);
        if (aVar.f20632u0 != dimension4) {
            aVar.f20632u0 = dimension4;
            aVar.invalidateSelf();
            aVar.v();
        }
        aVar.L(d10.getDimension(29, gl.Code));
        aVar.J(d10.getDimension(27, gl.Code));
        float dimension5 = d10.getDimension(13, gl.Code);
        if (aVar.f20635x0 != dimension5) {
            aVar.f20635x0 = dimension5;
            aVar.invalidateSelf();
            aVar.v();
        }
        aVar.Y0 = d10.getDimensionPixelSize(4, Integer.MAX_VALUE);
        d10.recycle();
        TypedArray d11 = k.d(context2, attributeSet, iArr, com.hamkho.livefoot.R.attr.chipStyle, com.hamkho.livefoot.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        this.F = d11.getBoolean(32, false);
        this.H = (int) Math.ceil(d11.getDimension(20, (float) Math.ceil(com.google.android.material.internal.n.b(48, getContext()))));
        d11.recycle();
        setChipDrawable(aVar);
        aVar.j(c0.i.i(this));
        TypedArray d12 = k.d(context2, attributeSet, iArr, com.hamkho.livefoot.R.attr.chipStyle, com.hamkho.livefoot.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        boolean hasValue = d12.hasValue(37);
        d12.recycle();
        this.J = new b(this);
        f();
        if (!hasValue) {
            setOutlineProvider(new p6.b(this));
        }
        setChecked(this.B);
        setText(aVar.W);
        setEllipsize(aVar.W0);
        i();
        if (!this.f20605w.X0) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        h();
        if (this.F) {
            setMinHeight(this.H);
        }
        this.G = c0.e.d(this);
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: p6.a
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = Chip.this.A;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z10);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        RectF rectF = this.M;
        rectF.setEmpty();
        if (e() && this.f20607z != null) {
            com.google.android.material.chip.a aVar = this.f20605w;
            Rect bounds = aVar.getBounds();
            rectF.setEmpty();
            if (aVar.T()) {
                float f = aVar.f20635x0 + aVar.f20634w0 + aVar.f20620i0 + aVar.f20633v0 + aVar.f20632u0;
                if (a.c.a(aVar) == 0) {
                    float f10 = bounds.right;
                    rectF.right = f10;
                    rectF.left = f10 - f;
                } else {
                    float f11 = bounds.left;
                    rectF.left = f11;
                    rectF.right = f11 + f;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int i10 = (int) closeIconTouchBounds.left;
        int i11 = (int) closeIconTouchBounds.top;
        int i12 = (int) closeIconTouchBounds.right;
        int i13 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.L;
        rect.set(i10, i11, i12, i13);
        return rect;
    }

    private d getTextAppearance() {
        com.google.android.material.chip.a aVar = this.f20605w;
        if (aVar != null) {
            return aVar.E0.f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z10) {
        if (this.D != z10) {
            this.D = z10;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z10) {
        if (this.C != z10) {
            this.C = z10;
            refreshDrawableState();
        }
    }

    @Override // com.google.android.material.chip.a.InterfaceC0236a
    public final void a() {
        d(this.H);
        requestLayout();
        invalidateOutline();
    }

    public final void d(int i10) {
        int i11;
        this.H = i10;
        int i12 = 0;
        if (!this.F) {
            InsetDrawable insetDrawable = this.f20606x;
            if (insetDrawable != null) {
                if (insetDrawable != null) {
                    this.f20606x = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr = a7.a.f352a;
                    g();
                    return;
                }
                return;
            }
            int[] iArr2 = a7.a.f352a;
            g();
            return;
        }
        int max = Math.max(0, i10 - ((int) this.f20605w.R));
        int max2 = Math.max(0, i10 - this.f20605w.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            InsetDrawable insetDrawable2 = this.f20606x;
            if (insetDrawable2 != null) {
                if (insetDrawable2 != null) {
                    this.f20606x = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr3 = a7.a.f352a;
                    g();
                    return;
                }
                return;
            }
            int[] iArr4 = a7.a.f352a;
            g();
            return;
        }
        if (max2 > 0) {
            i11 = max2 / 2;
        } else {
            i11 = 0;
        }
        if (max > 0) {
            i12 = max / 2;
        }
        int i13 = i12;
        if (this.f20606x != null) {
            Rect rect = new Rect();
            this.f20606x.getPadding(rect);
            if (rect.top == i13 && rect.bottom == i13 && rect.left == i11 && rect.right == i11) {
                int[] iArr5 = a7.a.f352a;
                g();
                return;
            }
        }
        if (getMinHeight() != i10) {
            setMinHeight(i10);
        }
        if (getMinWidth() != i10) {
            setMinWidth(i10);
        }
        this.f20606x = new InsetDrawable((Drawable) this.f20605w, i11, i13, i11, i13);
        int[] iArr6 = a7.a.f352a;
        g();
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x006c, code lost:
    
        if (r1 != Integer.MIN_VALUE) goto L34;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchHoverEvent(android.view.MotionEvent r11) {
        /*
            r10 = this;
            boolean r0 = r10.K
            if (r0 != 0) goto L9
            boolean r11 = super.dispatchHoverEvent(r11)
            return r11
        L9:
            com.google.android.material.chip.Chip$b r0 = r10.J
            android.view.accessibility.AccessibilityManager r1 = r0.f35333h
            boolean r2 = r1.isEnabled()
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L70
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 != 0) goto L1c
            goto L70
        L1c:
            int r1 = r11.getAction()
            r2 = 256(0x100, float:3.59E-43)
            r5 = 128(0x80, float:1.8E-43)
            r6 = 7
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r6) goto L42
            r6 = 9
            if (r1 == r6) goto L42
            r6 = 10
            if (r1 == r6) goto L32
            goto L70
        L32:
            int r1 = r0.f35338m
            if (r1 == r7) goto L70
            if (r1 != r7) goto L39
            goto L6e
        L39:
            r0.f35338m = r7
            r0.q(r7, r5)
            r0.q(r1, r2)
            goto L6e
        L42:
            float r1 = r11.getX()
            float r6 = r11.getY()
            com.google.android.material.chip.Chip r8 = com.google.android.material.chip.Chip.this
            boolean r9 = r8.e()
            if (r9 == 0) goto L5e
            android.graphics.RectF r8 = b(r8)
            boolean r1 = r8.contains(r1, r6)
            if (r1 == 0) goto L5e
            r1 = r3
            goto L5f
        L5e:
            r1 = r4
        L5f:
            int r6 = r0.f35338m
            if (r6 != r1) goto L64
            goto L6c
        L64:
            r0.f35338m = r1
            r0.q(r1, r5)
            r0.q(r6, r2)
        L6c:
            if (r1 == r7) goto L70
        L6e:
            r0 = r3
            goto L71
        L70:
            r0 = r4
        L71:
            if (r0 != 0) goto L7b
            boolean r11 = super.dispatchHoverEvent(r11)
            if (r11 == 0) goto L7a
            goto L7b
        L7a:
            r3 = r4
        L7b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.K) {
            return super.dispatchKeyEvent(keyEvent);
        }
        b bVar = this.J;
        bVar.getClass();
        boolean z10 = false;
        int i10 = 0;
        z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i11 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode != 19) {
                                    if (keyCode != 21) {
                                        if (keyCode != 22) {
                                            i11 = 130;
                                        }
                                    } else {
                                        i11 = 17;
                                    }
                                } else {
                                    i11 = 33;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z11 = false;
                                while (i10 < repeatCount && bVar.m(i11, null)) {
                                    i10++;
                                    z11 = true;
                                }
                                z10 = z11;
                                break;
                            }
                            break;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    int i12 = bVar.f35337l;
                    if (i12 != Integer.MIN_VALUE) {
                        Chip chip = Chip.this;
                        if (i12 == 0) {
                            chip.performClick();
                        } else if (i12 == 1) {
                            chip.playSoundEffect(0);
                            View.OnClickListener onClickListener = chip.f20607z;
                            if (onClickListener != null) {
                                onClickListener.onClick(chip);
                            }
                            if (chip.K) {
                                chip.J.q(1, 1);
                            }
                        }
                    }
                    z10 = true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                z10 = bVar.m(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                z10 = bVar.m(1, null);
            }
        }
        if (z10 && bVar.f35337l != Integer.MIN_VALUE) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [int, boolean] */
    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        int i10;
        super.drawableStateChanged();
        com.google.android.material.chip.a aVar = this.f20605w;
        boolean z10 = false;
        if (aVar != null && com.google.android.material.chip.a.u(aVar.f20617f0)) {
            com.google.android.material.chip.a aVar2 = this.f20605w;
            ?? isEnabled = isEnabled();
            int i11 = isEnabled;
            if (this.E) {
                i11 = isEnabled + 1;
            }
            int i12 = i11;
            if (this.D) {
                i12 = i11 + 1;
            }
            int i13 = i12;
            if (this.C) {
                i13 = i12 + 1;
            }
            int i14 = i13;
            if (isChecked()) {
                i14 = i13 + 1;
            }
            int[] iArr = new int[i14];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i10 = 1;
            } else {
                i10 = 0;
            }
            if (this.E) {
                iArr[i10] = 16842908;
                i10++;
            }
            if (this.D) {
                iArr[i10] = 16843623;
                i10++;
            }
            if (this.C) {
                iArr[i10] = 16842919;
                i10++;
            }
            if (isChecked()) {
                iArr[i10] = 16842913;
            }
            if (!Arrays.equals(aVar2.S0, iArr)) {
                aVar2.S0 = iArr;
                if (aVar2.T()) {
                    z10 = aVar2.w(aVar2.getState(), iArr);
                }
            }
        }
        if (z10) {
            invalidate();
        }
    }

    public final boolean e() {
        com.google.android.material.chip.a aVar = this.f20605w;
        if (aVar != null) {
            Object obj = aVar.f20617f0;
            if (obj != null) {
                if (obj instanceof g0.b) {
                    obj = ((g0.b) obj).b();
                }
            } else {
                obj = null;
            }
            if (obj != null) {
                return true;
            }
        }
        return false;
    }

    public final void f() {
        boolean z10;
        if (e()) {
            com.google.android.material.chip.a aVar = this.f20605w;
            if (aVar != null && aVar.f20616e0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && this.f20607z != null) {
                c0.l(this, this.J);
                this.K = true;
                return;
            }
        }
        c0.l(this, null);
        this.K = false;
    }

    public final void g() {
        this.y = new RippleDrawable(a7.a.c(this.f20605w.V), getBackgroundDrawable(), null);
        com.google.android.material.chip.a aVar = this.f20605w;
        if (aVar.T0) {
            aVar.T0 = false;
            aVar.U0 = null;
            aVar.onStateChange(aVar.getState());
        }
        RippleDrawable rippleDrawable = this.y;
        WeakHashMap<View, l0> weakHashMap = c0.f33054a;
        c0.d.q(this, rippleDrawable);
        h();
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        boolean z10;
        if (!TextUtils.isEmpty(this.I)) {
            return this.I;
        }
        com.google.android.material.chip.a aVar = this.f20605w;
        if (aVar != null && aVar.f20622k0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            ViewParent parent = getParent();
            if (!(parent instanceof ChipGroup)) {
                return "android.widget.Button";
            }
            ((ChipGroup) parent).getClass();
            throw null;
        }
        if (isClickable()) {
            return "android.widget.Button";
        }
        return "android.view.View";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f20606x;
        if (insetDrawable == null) {
            return this.f20605w;
        }
        return insetDrawable;
    }

    public Drawable getCheckedIcon() {
        com.google.android.material.chip.a aVar = this.f20605w;
        if (aVar != null) {
            return aVar.f20624m0;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        com.google.android.material.chip.a aVar = this.f20605w;
        if (aVar != null) {
            return aVar.f20625n0;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        com.google.android.material.chip.a aVar = this.f20605w;
        if (aVar != null) {
            return aVar.Q;
        }
        return null;
    }

    public float getChipCornerRadius() {
        com.google.android.material.chip.a aVar = this.f20605w;
        if (aVar == null) {
            return gl.Code;
        }
        return Math.max(gl.Code, aVar.s());
    }

    public Drawable getChipDrawable() {
        return this.f20605w;
    }

    public float getChipEndPadding() {
        com.google.android.material.chip.a aVar = this.f20605w;
        if (aVar != null) {
            return aVar.f20635x0;
        }
        return gl.Code;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getChipIcon() {
        Drawable drawable;
        com.google.android.material.chip.a aVar = this.f20605w;
        if (aVar == null || (drawable = aVar.Y) == 0) {
            return null;
        }
        boolean z10 = drawable instanceof g0.b;
        Drawable drawable2 = drawable;
        if (z10) {
            drawable2 = ((g0.b) drawable).b();
        }
        return drawable2;
    }

    public float getChipIconSize() {
        com.google.android.material.chip.a aVar = this.f20605w;
        if (aVar != null) {
            return aVar.f20614c0;
        }
        return gl.Code;
    }

    public ColorStateList getChipIconTint() {
        com.google.android.material.chip.a aVar = this.f20605w;
        if (aVar != null) {
            return aVar.Z;
        }
        return null;
    }

    public float getChipMinHeight() {
        com.google.android.material.chip.a aVar = this.f20605w;
        if (aVar != null) {
            return aVar.R;
        }
        return gl.Code;
    }

    public float getChipStartPadding() {
        com.google.android.material.chip.a aVar = this.f20605w;
        if (aVar != null) {
            return aVar.f20628q0;
        }
        return gl.Code;
    }

    public ColorStateList getChipStrokeColor() {
        com.google.android.material.chip.a aVar = this.f20605w;
        if (aVar != null) {
            return aVar.T;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        com.google.android.material.chip.a aVar = this.f20605w;
        if (aVar != null) {
            return aVar.U;
        }
        return gl.Code;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getCloseIcon() {
        Drawable drawable;
        com.google.android.material.chip.a aVar = this.f20605w;
        if (aVar == null || (drawable = aVar.f20617f0) == 0) {
            return null;
        }
        boolean z10 = drawable instanceof g0.b;
        Drawable drawable2 = drawable;
        if (z10) {
            drawable2 = ((g0.b) drawable).b();
        }
        return drawable2;
    }

    public CharSequence getCloseIconContentDescription() {
        com.google.android.material.chip.a aVar = this.f20605w;
        if (aVar != null) {
            return aVar.f20621j0;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        com.google.android.material.chip.a aVar = this.f20605w;
        if (aVar != null) {
            return aVar.f20634w0;
        }
        return gl.Code;
    }

    public float getCloseIconSize() {
        com.google.android.material.chip.a aVar = this.f20605w;
        if (aVar != null) {
            return aVar.f20620i0;
        }
        return gl.Code;
    }

    public float getCloseIconStartPadding() {
        com.google.android.material.chip.a aVar = this.f20605w;
        if (aVar != null) {
            return aVar.f20633v0;
        }
        return gl.Code;
    }

    public ColorStateList getCloseIconTint() {
        com.google.android.material.chip.a aVar = this.f20605w;
        if (aVar != null) {
            return aVar.f20619h0;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        com.google.android.material.chip.a aVar = this.f20605w;
        if (aVar != null) {
            return aVar.W0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.K) {
            b bVar = this.J;
            if (bVar.f35337l == 1 || bVar.f35336k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public h6.g getHideMotionSpec() {
        com.google.android.material.chip.a aVar = this.f20605w;
        if (aVar != null) {
            return aVar.f20627p0;
        }
        return null;
    }

    public float getIconEndPadding() {
        com.google.android.material.chip.a aVar = this.f20605w;
        if (aVar != null) {
            return aVar.f20630s0;
        }
        return gl.Code;
    }

    public float getIconStartPadding() {
        com.google.android.material.chip.a aVar = this.f20605w;
        if (aVar != null) {
            return aVar.f20629r0;
        }
        return gl.Code;
    }

    public ColorStateList getRippleColor() {
        com.google.android.material.chip.a aVar = this.f20605w;
        if (aVar != null) {
            return aVar.V;
        }
        return null;
    }

    public j getShapeAppearanceModel() {
        return this.f20605w.f27403s.f27411a;
    }

    public h6.g getShowMotionSpec() {
        com.google.android.material.chip.a aVar = this.f20605w;
        if (aVar != null) {
            return aVar.f20626o0;
        }
        return null;
    }

    public float getTextEndPadding() {
        com.google.android.material.chip.a aVar = this.f20605w;
        if (aVar != null) {
            return aVar.f20632u0;
        }
        return gl.Code;
    }

    public float getTextStartPadding() {
        com.google.android.material.chip.a aVar = this.f20605w;
        if (aVar != null) {
            return aVar.f20631t0;
        }
        return gl.Code;
    }

    public final void h() {
        com.google.android.material.chip.a aVar;
        if (!TextUtils.isEmpty(getText()) && (aVar = this.f20605w) != null) {
            int r10 = (int) (aVar.r() + aVar.f20635x0 + aVar.f20632u0);
            com.google.android.material.chip.a aVar2 = this.f20605w;
            int q10 = (int) (aVar2.q() + aVar2.f20628q0 + aVar2.f20631t0);
            if (this.f20606x != null) {
                Rect rect = new Rect();
                this.f20606x.getPadding(rect);
                q10 += rect.left;
                r10 += rect.right;
            }
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            WeakHashMap<View, l0> weakHashMap = c0.f33054a;
            c0.e.k(this, q10, paddingTop, r10, paddingBottom);
        }
    }

    public final void i() {
        TextPaint paint = getPaint();
        com.google.android.material.chip.a aVar = this.f20605w;
        if (aVar != null) {
            paint.drawableState = aVar.getState();
        }
        d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.e(getContext(), paint, this.N);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        androidx.activity.n.L0(this, this.f20605w);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        boolean z10;
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, P);
        }
        com.google.android.material.chip.a aVar = this.f20605w;
        if (aVar != null && aVar.f20622k0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            View.mergeDrawableStates(onCreateDrawableState, Q);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (this.K) {
            b bVar = this.J;
            int i11 = bVar.f35337l;
            if (i11 != Integer.MIN_VALUE) {
                bVar.j(i11);
            }
            if (z10) {
                bVar.m(i10, rect);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10) {
                setCloseIconHovered(false);
            }
        } else {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        int i10;
        boolean z11;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        com.google.android.material.chip.a aVar = this.f20605w;
        if (aVar != null && aVar.f20622k0) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setCheckable(z10);
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            int i11 = -1;
            if (chipGroup.f20818u) {
                i10 = 0;
                for (int i12 = 0; i12 < chipGroup.getChildCount(); i12++) {
                    View childAt = chipGroup.getChildAt(i12);
                    if (childAt instanceof Chip) {
                        if (chipGroup.getChildAt(i12).getVisibility() == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (!z11) {
                            continue;
                        } else if (((Chip) childAt) == this) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
            }
            i10 = -1;
            Object tag = getTag(com.hamkho.livefoot.R.id.row_index_key);
            if (tag instanceof Integer) {
                i11 = ((Integer) tag).intValue();
            }
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) g.c.a(i11, 1, i10, 1, isChecked()).f33536a);
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    @TargetApi(24)
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i10) {
        if (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            return PointerIcon.getSystemIcon(getContext(), 1002);
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    @TargetApi(17)
    public final void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        if (this.G != i10) {
            this.G = i10;
            h();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        if (r0 != 3) goto L28;
     */
    @Override // android.widget.TextView, android.view.View
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L49
            if (r0 == r2) goto L2b
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L44
            goto L50
        L21:
            boolean r0 = r5.C
            if (r0 == 0) goto L50
            if (r1 != 0) goto L4e
            r5.setCloseIconPressed(r3)
            goto L4e
        L2b:
            boolean r0 = r5.C
            if (r0 == 0) goto L44
            r5.playSoundEffect(r3)
            android.view.View$OnClickListener r0 = r5.f20607z
            if (r0 == 0) goto L39
            r0.onClick(r5)
        L39:
            boolean r0 = r5.K
            if (r0 == 0) goto L42
            com.google.android.material.chip.Chip$b r0 = r5.J
            r0.q(r2, r2)
        L42:
            r0 = r2
            goto L45
        L44:
            r0 = r3
        L45:
            r5.setCloseIconPressed(r3)
            goto L51
        L49:
            if (r1 == 0) goto L50
            r5.setCloseIconPressed(r2)
        L4e:
            r0 = r2
            goto L51
        L50:
            r0 = r3
        L51:
            if (r0 != 0) goto L5b
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L5a
            goto L5b
        L5a:
            r2 = r3
        L5b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.I = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable != getBackgroundDrawable() && drawable != this.y) {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        } else {
            super.setBackground(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != getBackgroundDrawable() && drawable != this.y) {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        } else {
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundResource(int i10) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z10) {
        com.google.android.material.chip.a aVar = this.f20605w;
        if (aVar != null) {
            aVar.x(z10);
        }
    }

    public void setCheckableResource(int i10) {
        com.google.android.material.chip.a aVar = this.f20605w;
        if (aVar != null) {
            aVar.x(aVar.y0.getResources().getBoolean(i10));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        com.google.android.material.chip.a aVar = this.f20605w;
        if (aVar == null) {
            this.B = z10;
        } else if (aVar.f20622k0) {
            super.setChecked(z10);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f20605w;
        if (aVar != null) {
            aVar.y(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z10) {
        setCheckedIconVisible(z10);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i10) {
        setCheckedIconVisible(i10);
    }

    public void setCheckedIconResource(int i10) {
        com.google.android.material.chip.a aVar = this.f20605w;
        if (aVar != null) {
            aVar.y(g.a.a(aVar.y0, i10));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f20605w;
        if (aVar != null) {
            aVar.z(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i10) {
        com.google.android.material.chip.a aVar = this.f20605w;
        if (aVar != null) {
            aVar.z(d0.a.b(i10, aVar.y0));
        }
    }

    public void setCheckedIconVisible(int i10) {
        com.google.android.material.chip.a aVar = this.f20605w;
        if (aVar != null) {
            aVar.A(aVar.y0.getResources().getBoolean(i10));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f20605w;
        if (aVar != null && aVar.Q != colorStateList) {
            aVar.Q = colorStateList;
            aVar.onStateChange(aVar.getState());
        }
    }

    public void setChipBackgroundColorResource(int i10) {
        ColorStateList b10;
        com.google.android.material.chip.a aVar = this.f20605w;
        if (aVar != null && aVar.Q != (b10 = d0.a.b(i10, aVar.y0))) {
            aVar.Q = b10;
            aVar.onStateChange(aVar.getState());
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        com.google.android.material.chip.a aVar = this.f20605w;
        if (aVar != null) {
            aVar.B(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i10) {
        com.google.android.material.chip.a aVar = this.f20605w;
        if (aVar != null) {
            aVar.B(aVar.y0.getResources().getDimension(i10));
        }
    }

    public void setChipDrawable(com.google.android.material.chip.a aVar) {
        com.google.android.material.chip.a aVar2 = this.f20605w;
        if (aVar2 != aVar) {
            if (aVar2 != null) {
                aVar2.V0 = new WeakReference<>(null);
            }
            this.f20605w = aVar;
            aVar.X0 = false;
            aVar.V0 = new WeakReference<>(this);
            d(this.H);
        }
    }

    public void setChipEndPadding(float f) {
        com.google.android.material.chip.a aVar = this.f20605w;
        if (aVar != null && aVar.f20635x0 != f) {
            aVar.f20635x0 = f;
            aVar.invalidateSelf();
            aVar.v();
        }
    }

    public void setChipEndPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f20605w;
        if (aVar != null) {
            float dimension = aVar.y0.getResources().getDimension(i10);
            if (aVar.f20635x0 != dimension) {
                aVar.f20635x0 = dimension;
                aVar.invalidateSelf();
                aVar.v();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f20605w;
        if (aVar != null) {
            aVar.C(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z10) {
        setChipIconVisible(z10);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i10) {
        setChipIconVisible(i10);
    }

    public void setChipIconResource(int i10) {
        com.google.android.material.chip.a aVar = this.f20605w;
        if (aVar != null) {
            aVar.C(g.a.a(aVar.y0, i10));
        }
    }

    public void setChipIconSize(float f) {
        com.google.android.material.chip.a aVar = this.f20605w;
        if (aVar != null) {
            aVar.D(f);
        }
    }

    public void setChipIconSizeResource(int i10) {
        com.google.android.material.chip.a aVar = this.f20605w;
        if (aVar != null) {
            aVar.D(aVar.y0.getResources().getDimension(i10));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f20605w;
        if (aVar != null) {
            aVar.E(colorStateList);
        }
    }

    public void setChipIconTintResource(int i10) {
        com.google.android.material.chip.a aVar = this.f20605w;
        if (aVar != null) {
            aVar.E(d0.a.b(i10, aVar.y0));
        }
    }

    public void setChipIconVisible(int i10) {
        com.google.android.material.chip.a aVar = this.f20605w;
        if (aVar != null) {
            aVar.F(aVar.y0.getResources().getBoolean(i10));
        }
    }

    public void setChipMinHeight(float f) {
        com.google.android.material.chip.a aVar = this.f20605w;
        if (aVar != null && aVar.R != f) {
            aVar.R = f;
            aVar.invalidateSelf();
            aVar.v();
        }
    }

    public void setChipMinHeightResource(int i10) {
        com.google.android.material.chip.a aVar = this.f20605w;
        if (aVar != null) {
            float dimension = aVar.y0.getResources().getDimension(i10);
            if (aVar.R != dimension) {
                aVar.R = dimension;
                aVar.invalidateSelf();
                aVar.v();
            }
        }
    }

    public void setChipStartPadding(float f) {
        com.google.android.material.chip.a aVar = this.f20605w;
        if (aVar != null && aVar.f20628q0 != f) {
            aVar.f20628q0 = f;
            aVar.invalidateSelf();
            aVar.v();
        }
    }

    public void setChipStartPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f20605w;
        if (aVar != null) {
            float dimension = aVar.y0.getResources().getDimension(i10);
            if (aVar.f20628q0 != dimension) {
                aVar.f20628q0 = dimension;
                aVar.invalidateSelf();
                aVar.v();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f20605w;
        if (aVar != null) {
            aVar.G(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i10) {
        com.google.android.material.chip.a aVar = this.f20605w;
        if (aVar != null) {
            aVar.G(d0.a.b(i10, aVar.y0));
        }
    }

    public void setChipStrokeWidth(float f) {
        com.google.android.material.chip.a aVar = this.f20605w;
        if (aVar != null) {
            aVar.H(f);
        }
    }

    public void setChipStrokeWidthResource(int i10) {
        com.google.android.material.chip.a aVar = this.f20605w;
        if (aVar != null) {
            aVar.H(aVar.y0.getResources().getDimension(i10));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i10) {
        setText(getResources().getString(i10));
    }

    public void setCloseIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f20605w;
        if (aVar != null) {
            aVar.I(drawable);
        }
        f();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        l0.a aVar;
        com.google.android.material.chip.a aVar2 = this.f20605w;
        if (aVar2 != null && aVar2.f20621j0 != charSequence) {
            String str = l0.a.f32289d;
            Locale locale = Locale.getDefault();
            int i10 = f.f32311a;
            boolean z10 = true;
            if (f.a.a(locale) != 1) {
                z10 = false;
            }
            if (z10) {
                aVar = l0.a.f32291g;
            } else {
                aVar = l0.a.f;
            }
            aVar2.f20621j0 = aVar.c(charSequence, aVar.f32294c);
            aVar2.invalidateSelf();
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z10) {
        setCloseIconVisible(z10);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i10) {
        setCloseIconVisible(i10);
    }

    public void setCloseIconEndPadding(float f) {
        com.google.android.material.chip.a aVar = this.f20605w;
        if (aVar != null) {
            aVar.J(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f20605w;
        if (aVar != null) {
            aVar.J(aVar.y0.getResources().getDimension(i10));
        }
    }

    public void setCloseIconResource(int i10) {
        com.google.android.material.chip.a aVar = this.f20605w;
        if (aVar != null) {
            aVar.I(g.a.a(aVar.y0, i10));
        }
        f();
    }

    public void setCloseIconSize(float f) {
        com.google.android.material.chip.a aVar = this.f20605w;
        if (aVar != null) {
            aVar.K(f);
        }
    }

    public void setCloseIconSizeResource(int i10) {
        com.google.android.material.chip.a aVar = this.f20605w;
        if (aVar != null) {
            aVar.K(aVar.y0.getResources().getDimension(i10));
        }
    }

    public void setCloseIconStartPadding(float f) {
        com.google.android.material.chip.a aVar = this.f20605w;
        if (aVar != null) {
            aVar.L(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f20605w;
        if (aVar != null) {
            aVar.L(aVar.y0.getResources().getDimension(i10));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f20605w;
        if (aVar != null) {
            aVar.M(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i10) {
        com.google.android.material.chip.a aVar = this.f20605w;
        if (aVar != null) {
            aVar.M(d0.a.b(i10, aVar.y0));
        }
    }

    public void setCloseIconVisible(int i10) {
        setCloseIconVisible(getResources().getBoolean(i10));
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable == null) {
            if (drawable3 == null) {
                super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
                return;
            }
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable == null) {
            if (drawable3 == null) {
                super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
                return;
            }
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i12 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i10, i11, i12, i13);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i12 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i10, i11, i12, i13);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        com.google.android.material.chip.a aVar = this.f20605w;
        if (aVar != null) {
            aVar.j(f);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f20605w == null) {
            return;
        }
        if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
            super.setEllipsize(truncateAt);
            com.google.android.material.chip.a aVar = this.f20605w;
            if (aVar != null) {
                aVar.W0 = truncateAt;
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
    }

    public void setEnsureMinTouchTargetSize(boolean z10) {
        this.F = z10;
        d(this.H);
    }

    @Override // android.widget.TextView
    public void setGravity(int i10) {
        if (i10 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i10);
        }
    }

    public void setHideMotionSpec(h6.g gVar) {
        com.google.android.material.chip.a aVar = this.f20605w;
        if (aVar != null) {
            aVar.f20627p0 = gVar;
        }
    }

    public void setHideMotionSpecResource(int i10) {
        com.google.android.material.chip.a aVar = this.f20605w;
        if (aVar != null) {
            aVar.f20627p0 = h6.g.a(i10, aVar.y0);
        }
    }

    public void setIconEndPadding(float f) {
        com.google.android.material.chip.a aVar = this.f20605w;
        if (aVar != null) {
            aVar.O(f);
        }
    }

    public void setIconEndPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f20605w;
        if (aVar != null) {
            aVar.O(aVar.y0.getResources().getDimension(i10));
        }
    }

    public void setIconStartPadding(float f) {
        com.google.android.material.chip.a aVar = this.f20605w;
        if (aVar != null) {
            aVar.P(f);
        }
    }

    public void setIconStartPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f20605w;
        if (aVar != null) {
            aVar.P(aVar.y0.getResources().getDimension(i10));
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i10) {
        if (this.f20605w == null) {
            return;
        }
        super.setLayoutDirection(i10);
    }

    @Override // android.widget.TextView
    public void setLines(int i10) {
        if (i10 <= 1) {
            super.setLines(i10);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i10) {
        if (i10 <= 1) {
            super.setMaxLines(i10);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i10) {
        super.setMaxWidth(i10);
        com.google.android.material.chip.a aVar = this.f20605w;
        if (aVar != null) {
            aVar.Y0 = i10;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i10) {
        if (i10 <= 1) {
            super.setMinLines(i10);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.A = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f20607z = onClickListener;
        f();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f20605w;
        if (aVar != null) {
            aVar.Q(colorStateList);
        }
        if (!this.f20605w.T0) {
            g();
        }
    }

    public void setRippleColorResource(int i10) {
        com.google.android.material.chip.a aVar = this.f20605w;
        if (aVar != null) {
            aVar.Q(d0.a.b(i10, aVar.y0));
            if (!this.f20605w.T0) {
                g();
            }
        }
    }

    @Override // d7.n
    public void setShapeAppearanceModel(j jVar) {
        this.f20605w.setShapeAppearanceModel(jVar);
    }

    public void setShowMotionSpec(h6.g gVar) {
        com.google.android.material.chip.a aVar = this.f20605w;
        if (aVar != null) {
            aVar.f20626o0 = gVar;
        }
    }

    public void setShowMotionSpecResource(int i10) {
        com.google.android.material.chip.a aVar = this.f20605w;
        if (aVar != null) {
            aVar.f20626o0 = h6.g.a(i10, aVar.y0);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z10) {
        if (z10) {
            super.setSingleLine(z10);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        CharSequence charSequence2;
        com.google.android.material.chip.a aVar = this.f20605w;
        if (aVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        if (aVar.X0) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        super.setText(charSequence2, bufferType);
        com.google.android.material.chip.a aVar2 = this.f20605w;
        if (aVar2 != null && !TextUtils.equals(aVar2.W, charSequence)) {
            aVar2.W = charSequence;
            aVar2.E0.f20877d = true;
            aVar2.invalidateSelf();
            aVar2.v();
        }
    }

    public void setTextAppearance(d dVar) {
        com.google.android.material.chip.a aVar = this.f20605w;
        if (aVar != null) {
            aVar.E0.b(dVar, aVar.y0);
        }
        i();
    }

    public void setTextAppearanceResource(int i10) {
        setTextAppearance(getContext(), i10);
    }

    public void setTextEndPadding(float f) {
        com.google.android.material.chip.a aVar = this.f20605w;
        if (aVar != null && aVar.f20632u0 != f) {
            aVar.f20632u0 = f;
            aVar.invalidateSelf();
            aVar.v();
        }
    }

    public void setTextEndPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f20605w;
        if (aVar != null) {
            float dimension = aVar.y0.getResources().getDimension(i10);
            if (aVar.f20632u0 != dimension) {
                aVar.f20632u0 = dimension;
                aVar.invalidateSelf();
                aVar.v();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i10, float f) {
        super.setTextSize(i10, f);
        com.google.android.material.chip.a aVar = this.f20605w;
        if (aVar != null) {
            float applyDimension = TypedValue.applyDimension(i10, f, getResources().getDisplayMetrics());
            h hVar = aVar.E0;
            d dVar = hVar.f;
            if (dVar != null) {
                dVar.f37319k = applyDimension;
                hVar.f20874a.setTextSize(applyDimension);
                aVar.a();
            }
        }
        i();
    }

    public void setTextStartPadding(float f) {
        com.google.android.material.chip.a aVar = this.f20605w;
        if (aVar != null && aVar.f20631t0 != f) {
            aVar.f20631t0 = f;
            aVar.invalidateSelf();
            aVar.v();
        }
    }

    public void setTextStartPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f20605w;
        if (aVar != null) {
            float dimension = aVar.y0.getResources().getDimension(i10);
            if (aVar.f20631t0 != dimension) {
                aVar.f20631t0 = dimension;
                aVar.invalidateSelf();
                aVar.v();
            }
        }
    }

    public void setCloseIconVisible(boolean z10) {
        com.google.android.material.chip.a aVar = this.f20605w;
        if (aVar != null) {
            aVar.N(z10);
        }
        f();
    }

    public void setCheckedIconVisible(boolean z10) {
        com.google.android.material.chip.a aVar = this.f20605w;
        if (aVar != null) {
            aVar.A(z10);
        }
    }

    public void setChipIconVisible(boolean z10) {
        com.google.android.material.chip.a aVar = this.f20605w;
        if (aVar != null) {
            aVar.F(z10);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        com.google.android.material.chip.a aVar = this.f20605w;
        if (aVar != null) {
            Context context2 = aVar.y0;
            aVar.E0.b(new d(context2, i10), context2);
        }
        i();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i10) {
        super.setTextAppearance(i10);
        com.google.android.material.chip.a aVar = this.f20605w;
        if (aVar != null) {
            Context context = aVar.y0;
            aVar.E0.b(new d(context, i10), context);
        }
        i();
    }

    /* loaded from: classes2.dex */
    public class a extends z6.f {
        public a() {
            super(0);
        }

        @Override // z6.f
        public final void r(Typeface typeface, boolean z10) {
            CharSequence text;
            Chip chip = Chip.this;
            com.google.android.material.chip.a aVar = chip.f20605w;
            if (aVar.X0) {
                text = aVar.W;
            } else {
                text = chip.getText();
            }
            chip.setText(text);
            chip.requestLayout();
            chip.invalidate();
        }

        @Override // z6.f
        public final void q(int i10) {
        }
    }

    public void setInternalOnCheckedChangeListener(e<Chip> eVar) {
    }
}
