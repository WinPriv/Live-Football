package com.facebook.ads.redexgen.X;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.annotation.CallSuper;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import com.anythink.expressad.exoplayer.k.p;
import com.anythink.expressad.video.module.a.a;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.androidx.support.v4.view.ViewPager;
import com.facebook.ads.internal.androidx.support.v4.view.ViewPager$DecorView;
import com.facebook.ads.internal.androidx.support.v4.view.ViewPager$SavedState;
import com.facebook.ads.internal.util.parcelable.WrappedParcelable;
import com.huawei.hms.ads.gl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.3M, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C3M extends ViewGroup {
    public static byte[] A0u;
    public static String[] A0v = {"Pb5dMBpLoD8olSqqN3M1wt71s6WfJWWx", "mawes8eGWKEfT5kg0DwbKE", "yCX0UAcI", "nBGVAWTalDrx8Q3Q0HTp4hPpqgaJoZ5h", "", "", "gKpLqM1fc4CgqUT7jB7tIrf4xsKdVFyY", "wKHjR3FqXT8StRIGs0zAAfuJmbbhub4H"};
    public static final int[] A0w;
    public static final Interpolator A0x;
    public static final C3L A0y;
    public static final Comparator<C3E> A0z;
    public int A00;
    public AbstractC05872t A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public int A0H;
    public int A0I;
    public int A0J;
    public int A0K;
    public int A0L;
    public int A0M;
    public int A0N;
    public int A0O;
    public int A0P;
    public int A0Q;
    public int A0R;
    public Drawable A0S;
    public Parcelable A0T;
    public VelocityTracker A0U;
    public EdgeEffect A0V;
    public EdgeEffect A0W;
    public Scroller A0X;
    public C3H A0Y;
    public C3H A0Z;
    public C3I A0a;
    public C3J A0b;
    public ClassLoader A0c;
    public ArrayList<View> A0d;
    public List<ViewPager.OnAdapterChangeListener> A0e;
    public List<C3H> A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public boolean A0l;
    public boolean A0m;
    public boolean A0n;
    public boolean A0o;
    public boolean A0p;
    public final Rect A0q;
    public final C3E A0r;
    public final Runnable A0s;
    public final ArrayList<C3E> A0t;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 12 out of bounds for length 12
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private C3E A03() {
        int clientWidth = getClientWidth();
        float f = gl.Code;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : gl.Code;
        if (clientWidth > 0) {
            f = this.A0M / clientWidth;
        }
        int i10 = -1;
        float f10 = gl.Code;
        float f11 = gl.Code;
        boolean z10 = true;
        C3E c3e = null;
        int i11 = 0;
        while (i11 < this.A0t.size()) {
            C3E c3e2 = this.A0t.get(i11);
            if (!z10 && c3e2.A02 != i10 + 1) {
                c3e2 = this.A0r;
                c3e2.A00 = f10 + f11 + f;
                c3e2.A02 = i10 + 1;
                c3e2.A01 = this.A01.A04(c3e2.A02);
                i11--;
            }
            f10 = c3e2.A00;
            float f12 = c3e2.A01 + f10 + f;
            if (!z10) {
                String[] strArr = A0v;
                if (strArr[4].length() != strArr[5].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0v;
                strArr2[3] = "VrUwTTzuyHD2SkMMCenWDHvarMqbXCCI";
                strArr2[6] = "LX2NnyEsDXWEx3dFbPH8p7fzI1U1dTZ8";
                if (scrollX < f10) {
                    return c3e;
                }
            }
            if (scrollX >= f12) {
                int size = this.A0t.size() - 1;
                String[] strArr3 = A0v;
                if (strArr3[3].charAt(15) != strArr3[6].charAt(15)) {
                    A0v[2] = "sbP3P6ChvdnfvWI";
                    if (i11 != size) {
                        z10 = false;
                        i10 = c3e2.A02;
                        f11 = c3e2.A01;
                        c3e = c3e2;
                        i11++;
                    }
                } else {
                    A0v[1] = "kvGf4Zg53U8bz7GLeUNnCLzy4o";
                    if (i11 != size) {
                        z10 = false;
                        i10 = c3e2.A02;
                        f11 = c3e2.A01;
                        c3e = c3e2;
                        i11++;
                    }
                }
            }
            return c3e2;
        }
        return c3e;
    }

    public static String A08(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0u, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 104);
        }
        return new String(copyOfRange);
    }

    public static void A0C() {
        A0u = new byte[]{-99, -70, -69, -99, -62, -14, 3, 9, 7, Ascii.DC4, -62, 5, Ascii.SO, 3, Ascii.NAK, Ascii.NAK, -36, -62, -48, 0, 17, Ascii.ETB, Ascii.NAK, 34, -48, Ascii.EM, Ascii.DC4, -22, -48, -34, Ascii.SO, 48, 45, 32, 42, 35, 43, Ascii.US, 50, 39, 33, -34, Ascii.US, 34, Ascii.US, 46, 50, 35, 48, -8, -34, -30, 54, 49, 49, -30, 53, 47, 35, 46, 46, -3, -30, 38, 39, 40, 35, 55, 46, 54, 43, 48, 41, -30, 54, 49, -30, -66, -78, -8, 1, 7, 0, -10, -52, -78, -69, -39, -26, -26, -25, -20, -104, -39, -36, -36, -104, -24, -39, -33, -35, -22, -104, -36, -35, -37, -25, -22, -104, -18, -31, -35, -17, -104, -36, -19, -22, -31, -26, -33, -104, -28, -39, -15, -25, -19, -20, -10, 9, Ascii.NAK, Ascii.EM, 9, Ascii.ETB, Ascii.CAN, 9, 8, -60, 19, 10, 10, Ascii.ETB, 7, Ascii.SYN, 9, 9, Ascii.DC2, -60, Ascii.DC4, 5, Ascii.VT, 9, -60, Ascii.DLE, Ascii.CR, 17, Ascii.CR, Ascii.CAN, -60, -10, 10, 7, -62, 3, Ascii.DC2, Ascii.DC2, Ascii.SO, Ascii.VT, 5, 3, Ascii.SYN, Ascii.VT, 17, Ascii.DLE, -55, Ascii.NAK, -62, -14, 3, 9, 7, Ascii.DC4, -29, 6, 3, Ascii.DC2, Ascii.SYN, 7, Ascii.DC4, -62, 5, 10, 3, Ascii.DLE, 9, 7, 6, -62, Ascii.SYN, 10, 7, -62, 3, 6, 3, Ascii.DC2, Ascii.SYN, 7, Ascii.DC4, -55, Ascii.NAK, -62, 5, 17, Ascii.DLE, Ascii.SYN, 7, Ascii.DLE, Ascii.SYN, Ascii.NAK, -62, Ascii.EM, Ascii.VT, Ascii.SYN, 10, 17, Ascii.ETB, Ascii.SYN, -62, 5, 3, Ascii.SO, Ascii.SO, Ascii.VT, Ascii.DLE, 9, -62, -14, 3, 9, 7, Ascii.DC4, -29, 6, 3, Ascii.DC2, Ascii.SYN, 7, Ascii.DC4, -59, Ascii.DLE, 17, Ascii.SYN, Ascii.VT, 8, Ascii.ESC, -26, 3, Ascii.SYN, 3, -11, 7, Ascii.SYN, -27, 10, 3, Ascii.DLE, 9, 7, 6, -61, -62, -25, Ascii.SUB, Ascii.DC2, 7, 5, Ascii.SYN, 7, 6, -62, 3, 6, 3, Ascii.DC2, Ascii.SYN, 7, Ascii.DC4, -62, Ascii.VT, Ascii.SYN, 7, Ascii.SI, -62, 5, 17, Ascii.ETB, Ascii.DLE, Ascii.SYN, -36, -62, -19, 0, -4, Ascii.SO, -25, -8, -2, -4, 9, Ascii.EM, 42, 42, 39, 47, Ascii.VT, Ascii.ESC, 42, 39, 36, 36, -40, 44, 42, 33, Ascii.GS, Ascii.FS, -40, 44, 39, -40, Ascii.RS, 33, 38, Ascii.FS, -40, Ascii.RS, 39, Ascii.ESC, 45, 43, -40, Ascii.SUB, Ascii.EM, 43, Ascii.GS, Ascii.FS, -40, 39, 38, -40, 38, 39, 38, -27, Ascii.ESC, 32, 33, 36, Ascii.FS, -40, Ascii.ESC, 45, 42, 42, Ascii.GS, 38, 44, -40, Ascii.RS, 39, Ascii.ESC, 45, 43, Ascii.GS, Ascii.FS, -40, 46, 33, Ascii.GS, 47, -40, 76, 75, Ascii.RS, 65, 62, 77, 81, 66, 79, 32, 69, 62, 75, 68, 66, 65, 19, Ascii.DC2, -12, 5, Ascii.VT, 9, -9, 7, Ascii.SYN, 19, Ascii.DLE, Ascii.DLE, 9, 8, -60, 8, Ascii.CR, 8, -60, Ascii.DC2, 19, Ascii.CAN, -60, 7, 5, Ascii.DLE, Ascii.DLE, -60, Ascii.ETB, Ascii.EM, Ascii.DC4, 9, Ascii.SYN, 7, Ascii.DLE, 5, Ascii.ETB, Ascii.ETB, -60, Ascii.CR, 17, Ascii.DC4, Ascii.DLE, 9, 17, 9, Ascii.DC2, Ascii.CAN, 5, Ascii.CAN, Ascii.CR, 19, Ascii.DC2, 85, 83, 66, 79, 84, 71, 80, 83, 78, 49, 66, 72, 70};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 17 out of bounds for length 17
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private final void A0G(int i10) {
        String hexString;
        C3E c3e;
        float f;
        C3E c3e2 = null;
        int i11 = this.A00;
        if (i11 != i10) {
            c3e2 = A04(i11);
            this.A00 = i10;
        }
        if (this.A01 == null) {
            A0B();
            return;
        }
        if (this.A0o) {
            A0B();
            return;
        }
        if (getWindowToken() == null) {
            return;
        }
        int i12 = this.A0L;
        int max = Math.max(0, this.A00 - i12);
        int A05 = this.A01.A05();
        int min = Math.min(A05 - 1, this.A00 + i12);
        if (A05 != this.A0G) {
            try {
                hexString = getResources().getResourceName(getId());
            } catch (Resources.NotFoundException unused) {
                int id2 = getId();
                if (A0v[2].length() != 14) {
                    A0v[2] = "3cJ8G";
                    hexString = Integer.toHexString(id2);
                }
            }
            throw new IllegalStateException(A08(158, 142, 58) + this.A0G + A08(77, 9, 42) + A05 + A08(18, 11, 72) + hexString + A08(4, 14, 58) + getClass() + A08(29, 22, 86) + this.A01.getClass());
        }
        C3E c3e3 = null;
        if (A0v[2].length() != 14) {
            A0v[1] = "Tot0RAE";
            int i13 = 0;
            while (true) {
                if (i13 >= this.A0t.size()) {
                    break;
                }
                C3E c3e4 = this.A0t.get(i13);
                if (c3e4.A02 < this.A00) {
                    i13++;
                } else if (c3e4.A02 == this.A00) {
                    c3e3 = c3e4;
                }
            }
            if (c3e3 == null && A05 > 0) {
                int i14 = this.A00;
                if (A0v[1].length() != 12) {
                    A0v[2] = "0";
                    c3e3 = A05(i14, i13);
                } else {
                    String[] strArr = A0v;
                    strArr[4] = "";
                    strArr[5] = "";
                    c3e3 = A05(i14, i13);
                }
            }
            if (c3e3 != null) {
                float f10 = gl.Code;
                int i15 = i13 - 1;
                if (i15 >= 0) {
                    C3E c3e5 = this.A0t.get(i15);
                    String[] strArr2 = A0v;
                    if (strArr2[3].charAt(15) != strArr2[6].charAt(15)) {
                        A0v[1] = "VNMCyWdkMCax4jTa2KYBa9F64T8dlp";
                        c3e = c3e5;
                    }
                } else {
                    c3e = null;
                }
                int clientWidth = getClientWidth();
                float paddingLeft = clientWidth <= 0 ? gl.Code : (getPaddingLeft() / clientWidth) + (2.0f - c3e3.A01);
                for (int i16 = this.A00 - 1; i16 >= 0; i16--) {
                    if (f10 >= paddingLeft && i16 < max) {
                        if (c3e == null) {
                            break;
                        }
                        if (i16 == c3e.A02 && !c3e.A04) {
                            this.A0t.remove(i15);
                            this.A01.A0B(this, i16, c3e.A03);
                            i15--;
                            i13--;
                            c3e = i15 >= 0 ? this.A0t.get(i15) : null;
                        }
                    } else if (c3e == null || i16 != c3e.A02) {
                        f10 += A05(i16, i15 + 1).A01;
                        i13++;
                        c3e = i15 >= 0 ? this.A0t.get(i15) : null;
                    } else {
                        f10 += c3e.A01;
                        String[] strArr3 = A0v;
                        if (strArr3[7].charAt(10) == strArr3[0].charAt(10)) {
                            String[] strArr4 = A0v;
                            strArr4[4] = "";
                            strArr4[5] = "";
                            i15--;
                            c3e = i15 >= 0 ? this.A0t.get(i15) : null;
                        }
                    }
                }
                float f11 = c3e3.A01;
                int i17 = i13 + 1;
                if (f11 < 2.0f) {
                    C3E c3e6 = i17 < this.A0t.size() ? this.A0t.get(i17) : null;
                    if (clientWidth <= 0) {
                        f = gl.Code;
                    } else {
                        float paddingRight = getPaddingRight();
                        float f12 = clientWidth;
                        String[] strArr5 = A0v;
                        if (strArr5[4].length() != strArr5[5].length()) {
                            throw new RuntimeException();
                        }
                        String[] strArr6 = A0v;
                        strArr6[4] = "";
                        strArr6[5] = "";
                        f = (paddingRight / f12) + 2.0f;
                    }
                    for (int i18 = this.A00 + 1; i18 < A05; i18++) {
                        if (f11 >= f && i18 > min) {
                            if (c3e6 == null) {
                                break;
                            }
                            if (i18 == c3e6.A02 && !c3e6.A04) {
                                this.A0t.remove(i17);
                                this.A01.A0B(this, i18, c3e6.A03);
                                c3e6 = i17 < this.A0t.size() ? this.A0t.get(i17) : null;
                            }
                        } else if (c3e6 == null || i18 != c3e6.A02) {
                            C3E A052 = A05(i18, i17);
                            i17++;
                            f11 += A052.A01;
                            c3e6 = i17 < this.A0t.size() ? this.A0t.get(i17) : null;
                        } else {
                            f11 += c3e6.A01;
                            i17++;
                            c3e6 = i17 < this.A0t.size() ? this.A0t.get(i17) : null;
                        }
                    }
                }
                A0Q(c3e3, i13, c3e2);
            }
            int childCount = getChildCount();
            for (int i19 = 0; i19 < childCount; i19++) {
                View childAt = getChildAt(i19);
                C3F c3f = (C3F) childAt.getLayoutParams();
                c3f.A01 = i19;
                if (!c3f.A05 && c3f.A00 == gl.Code) {
                    C3E A07 = A07(childAt);
                    String[] strArr7 = A0v;
                    if (strArr7[7].charAt(10) != strArr7[0].charAt(10)) {
                        if (A07 == null) {
                        }
                        c3f.A00 = A07.A01;
                        c3f.A02 = A07.A02;
                    } else {
                        A0v[1] = "EEa7ILjnbFiKaMBJBW0FEjvS9loAIL";
                        if (A07 == null) {
                        }
                        c3f.A00 = A07.A01;
                        c3f.A02 = A07.A02;
                    }
                }
            }
            A0B();
            String[] strArr8 = A0v;
            if (strArr8[4].length() != strArr8[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr9 = A0v;
            strArr9[7] = "fAvJTe45YQ8jwRLJzle6w88GhXZAW5fe";
            strArr9[0] = "XHTmtVqtTM8ykl9XiQ4ZuPNQzfhQsr72";
            if (hasFocus()) {
                View findFocus = findFocus();
                String[] strArr10 = A0v;
                if (strArr10[3].charAt(15) == strArr10[6].charAt(15)) {
                    throw new RuntimeException();
                }
                String[] strArr11 = A0v;
                strArr11[3] = "98nQxxcA6vj5924MyChW7mkeiNJnWKv2";
                strArr11[6] = "ju5RZqhAYuaQhiOPGNIJcLOaoEeV3OP8";
                C3E A06 = findFocus != null ? A06(findFocus) : null;
                if (A06 == null || A06.A02 != this.A00) {
                    for (int i20 = 0; i20 < getChildCount(); i20++) {
                        View childAt2 = getChildAt(i20);
                        C3E A072 = A07(childAt2);
                        if (A072 != null && A072.A02 == this.A00 && childAt2.requestFocus(2)) {
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final void A0J(int i10, int i11, int i12) {
        int scrollX;
        int abs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.A0X;
        if ((scroller == null || scroller.isFinished()) ? false : true) {
            scrollX = this.A0l ? this.A0X.getCurrX() : this.A0X.getStartX();
            this.A0X.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            scrollX = getScrollX();
        }
        int scrollY = getScrollY();
        int i13 = i10 - scrollX;
        int i14 = i11 - scrollY;
        if (i13 == 0 && i14 == 0) {
            A0R(false);
            A0f();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i15 = clientWidth / 2;
        float A00 = i15 + (i15 * A00(Math.min(1.0f, (Math.abs(i13) * 1.0f) / clientWidth)));
        int abs2 = Math.abs(i12);
        if (abs2 > 0) {
            float f = abs2;
            if (A0v[1].length() == 12) {
                throw new RuntimeException();
            }
            String[] strArr = A0v;
            strArr[4] = "";
            strArr[5] = "";
            abs = Math.round(Math.abs(A00 / f) * 1000.0f) * 4;
        } else {
            abs = (int) ((1.0f + (Math.abs(i13) / (this.A0M + (clientWidth * this.A01.A04(this.A00))))) * 100.0f);
        }
        int min = Math.min(abs, 600);
        this.A0l = false;
        this.A0X.startScroll(scrollX, scrollY, i13, i14, min);
        AnonymousClass38.A07(this);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 6
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // android.view.ViewGroup, android.view.View
    public final void addTouchables(ArrayList<View> arrayList) {
        C3E A07;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (A07 = A07(childAt)) != null && A07.A02 == this.A00) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 18 out of bounds for length 18
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        C3F c3f;
        int i12;
        int i13;
        setMeasuredDimension(getDefaultSize(0, i10), getDefaultSize(0, i11));
        int measuredWidth = getMeasuredWidth();
        this.A0I = Math.min(measuredWidth / 10, this.A0E);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i14 = 0;
        while (true) {
            if (i14 >= childCount) {
                this.A0B = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
                this.A0A = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
                this.A0j = true;
                A0f();
                this.A0j = false;
                int childCount2 = getChildCount();
                for (int i15 = 0; i15 < childCount2; i15++) {
                    View childAt = getChildAt(i15);
                    if (childAt.getVisibility() != 8 && ((c3f = (C3F) childAt.getLayoutParams()) == null || !c3f.A05)) {
                        float f = paddingLeft;
                        String[] strArr = A0v;
                        if (strArr[4].length() == strArr[5].length()) {
                            A0v[1] = "11cm9STM7FlxGR3";
                            childAt.measure(View.MeasureSpec.makeMeasureSpec((int) (f * c3f.A00), 1073741824), this.A0A);
                        }
                    }
                }
                return;
            }
            View childAt2 = getChildAt(i14);
            if (childAt2.getVisibility() != 8) {
                C3F c3f2 = (C3F) childAt2.getLayoutParams();
                if (A0v[1].length() == 12) {
                    break;
                }
                String[] strArr2 = A0v;
                strArr2[4] = "";
                strArr2[5] = "";
                if (c3f2 != null && c3f2.A05) {
                    int i16 = c3f2.A04 & 7;
                    int i17 = c3f2.A04 & 112;
                    int i18 = Integer.MIN_VALUE;
                    int i19 = Integer.MIN_VALUE;
                    boolean z10 = i17 == 48 || i17 == 80;
                    boolean z11 = i16 == 3 || i16 == 5;
                    if (z10) {
                        i18 = 1073741824;
                    } else if (z11) {
                        i19 = 1073741824;
                    }
                    if (c3f2.width != -2) {
                        i18 = 1073741824;
                        i12 = c3f2.width != -1 ? c3f2.width : paddingLeft;
                    } else {
                        i12 = paddingLeft;
                    }
                    if (c3f2.height != -2) {
                        i19 = 1073741824;
                        if (c3f2.height != -1) {
                            i13 = c3f2.height;
                            if (A0v[1].length() != 12) {
                                A0v[1] = "VKsSzAx6pk9J5wmYrW5ACp";
                            }
                        } else {
                            i13 = measuredHeight;
                        }
                    } else {
                        i13 = measuredHeight;
                    }
                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(i12, i18), View.MeasureSpec.makeMeasureSpec(i13, i19));
                    if (z10) {
                        measuredHeight -= childAt2.getMeasuredHeight();
                    } else if (z11) {
                        paddingLeft -= childAt2.getMeasuredWidth();
                    }
                }
            }
            i14++;
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractC05872t abstractC05872t;
        if (this.A0h) {
            return true;
        }
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (abstractC05872t = this.A01) == null || abstractC05872t.A05() == 0) {
            return false;
        }
        if (this.A0U == null) {
            this.A0U = VelocityTracker.obtain();
        }
        this.A0U.addMovement(motionEvent);
        boolean z10 = false;
        int action = motionEvent.getAction() & p.f9095b;
        if (action == 0) {
            this.A0X.abortAnimation();
            this.A0o = false;
            A0f();
            float x10 = motionEvent.getX();
            this.A03 = x10;
            this.A05 = x10;
            float y = motionEvent.getY();
            this.A04 = y;
            this.A06 = y;
            this.A08 = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action == 2) {
                if (!this.A0k) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.A08);
                    if (findPointerIndex == -1) {
                        z10 = A0U();
                    } else {
                        float x11 = motionEvent.getX(findPointerIndex);
                        float abs = Math.abs(x11 - this.A05);
                        float y10 = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y10 - this.A06);
                        if (abs > this.A0R && abs > abs2) {
                            this.A0k = true;
                            A0T(true);
                            float f = this.A03;
                            this.A05 = x11 - f > gl.Code ? f + this.A0R : f - this.A0R;
                            this.A06 = y10;
                            setScrollState(1);
                            setScrollingCacheEnabled(true);
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                }
                if (this.A0k) {
                    z10 = false | A0X(motionEvent.getX(motionEvent.findPointerIndex(this.A08)));
                }
            } else if (action != 3) {
                if (action == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    this.A05 = motionEvent.getX(actionIndex);
                    this.A08 = motionEvent.getPointerId(actionIndex);
                } else if (action == 6) {
                    A0P(motionEvent);
                    this.A05 = motionEvent.getX(motionEvent.findPointerIndex(this.A08));
                }
            } else if (this.A0k) {
                A0M(this.A00, true, 0, false);
                z10 = A0U();
            }
        } else if (this.A0k) {
            VelocityTracker velocityTracker = this.A0U;
            velocityTracker.computeCurrentVelocity(1000, this.A0J);
            int xVelocity = (int) velocityTracker.getXVelocity(this.A08);
            this.A0o = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            C3E A03 = A03();
            A0O(A01(A03.A02, ((scrollX / clientWidth) - A03.A00) / (A03.A01 + (this.A0M / clientWidth)), xVelocity, (int) (motionEvent.getX(motionEvent.findPointerIndex(this.A08)) - this.A03)), true, true, xVelocity);
            z10 = A0U();
        }
        if (z10) {
            AnonymousClass38.A07(this);
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [com.facebook.ads.redexgen.X.3L] */
    static {
        A0C();
        A0w = new int[]{R.attr.layout_gravity};
        A0z = new Comparator<C3E>() { // from class: com.facebook.ads.redexgen.X.3A
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.Comparator
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final int compare(C3E c3e, C3E c3e2) {
                return c3e.A02 - c3e2.A02;
            }
        };
        A0x = new Interpolator() { // from class: com.facebook.ads.redexgen.X.3B
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                float f10 = f - 1.0f;
                return (f10 * f10 * f10 * f10 * f10) + 1.0f;
            }
        };
        A0y = new Comparator<View>() { // from class: com.facebook.ads.redexgen.X.3L
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.Comparator
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final int compare(View view, View view2) {
                C3F c3f = (C3F) view.getLayoutParams();
                C3F c3f2 = (C3F) view2.getLayoutParams();
                if (c3f.A05 != c3f2.A05) {
                    return c3f.A05 ? 1 : -1;
                }
                return c3f.A02 - c3f2.A02;
            }
        };
    }

    public C3M(Context context) {
        super(context);
        this.A0t = new ArrayList<>();
        this.A0r = new C3E();
        this.A0q = new Rect();
        this.A0O = -1;
        this.A0T = null;
        this.A0c = null;
        this.A02 = -3.4028235E38f;
        this.A07 = Float.MAX_VALUE;
        this.A0L = 1;
        this.A08 = -1;
        this.A0i = true;
        this.A0n = false;
        this.A0s = new Runnable() { // from class: com.facebook.ads.redexgen.X.3C
            @Override // java.lang.Runnable
            public final void run() {
                C3M.this.setScrollState(0);
                C3M.this.A0f();
            }
        };
        this.A0P = 0;
        A0D();
    }

    private final float A00(float f) {
        return (float) Math.sin((f - 0.5f) * 0.47123894f);
    }

    private int A01(int i10, float f, int i11, int i12) {
        if (Math.abs(i12) > this.A0H && Math.abs(i11) > this.A0K) {
            if (i11 <= 0) {
                i10++;
            }
        } else {
            int targetPage = this.A00;
            float truncator = i10 >= targetPage ? 0.4f : 0.6f;
            i10 += (int) (f + truncator);
        }
        int targetPage2 = this.A0t.size();
        if (targetPage2 > 0) {
            C3E lastItem = this.A0t.get(0);
            ArrayList<C3E> arrayList = this.A0t;
            int targetPage3 = arrayList.size();
            C3E c3e = arrayList.get(targetPage3 - 1);
            int i13 = lastItem.A02;
            int targetPage4 = c3e.A02;
            return Math.max(i13, Math.min(i10, targetPage4));
        }
        return i10;
    }

    private Rect A02(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0007 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.facebook.ads.redexgen.X.C3E A04(int r4) {
        /*
            r3 = this;
            r2 = 0
        L1:
            java.util.ArrayList<com.facebook.ads.redexgen.X.3E> r0 = r3.A0t
            int r0 = r0.size()
            if (r2 >= r0) goto L19
            java.util.ArrayList<com.facebook.ads.redexgen.X.3E> r0 = r3.A0t
            java.lang.Object r1 = r0.get(r2)
            com.facebook.ads.redexgen.X.3E r1 = (com.facebook.ads.redexgen.X.C3E) r1
            int r0 = r1.A02
            if (r0 != r4) goto L16
            return r1
        L16:
            int r2 = r2 + 1
            goto L1
        L19:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C3M.A04(int):com.facebook.ads.redexgen.X.3E");
    }

    private final C3E A05(int i10, int i11) {
        C3E c3e = new C3E();
        c3e.A02 = i10;
        c3e.A03 = this.A01.A08(this, i10);
        c3e.A01 = this.A01.A04(i10);
        if (i11 < 0 || i11 >= this.A0t.size()) {
            this.A0t.add(c3e);
        } else {
            this.A0t.add(i11, c3e);
        }
        return c3e;
    }

    private final C3E A06(View view) {
        while (true) {
            Object parent = view.getParent();
            if (parent != this) {
                if (parent == null || !(parent instanceof View)) {
                    return null;
                }
                view = (View) parent;
            } else {
                return A07(view);
            }
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0007 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.facebook.ads.redexgen.X.C3E A07(android.view.View r5) {
        /*
            r4 = this;
            r3 = 0
        L1:
            java.util.ArrayList<com.facebook.ads.redexgen.X.3E> r0 = r4.A0t
            int r0 = r0.size()
            if (r3 >= r0) goto L1f
            java.util.ArrayList<com.facebook.ads.redexgen.X.3E> r0 = r4.A0t
            java.lang.Object r2 = r0.get(r3)
            com.facebook.ads.redexgen.X.3E r2 = (com.facebook.ads.redexgen.X.C3E) r2
            com.facebook.ads.redexgen.X.2t r1 = r4.A01
            java.lang.Object r0 = r2.A03
            boolean r0 = r1.A0C(r5, r0)
            if (r0 == 0) goto L1c
            return r2
        L1c:
            int r3 = r3 + 1
            goto L1
        L1f:
            r3 = 0
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C3M.A0v
            r0 = 4
            r1 = r2[r0]
            r0 = 5
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L38
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L38:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C3M.A0v
            java.lang.String r1 = "T6ty"
            r0 = 1
            r2[r0] = r1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C3M.A07(android.view.View):com.facebook.ads.redexgen.X.3E");
    }

    private void A09() {
        this.A0k = false;
        this.A0m = false;
        VelocityTracker velocityTracker = this.A0U;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            String[] strArr = A0v;
            if (strArr[7].charAt(10) != strArr[0].charAt(10)) {
                throw new RuntimeException();
            }
            A0v[1] = "yoRarqzFlsm2scdQtgnfRphmjo";
            this.A0U = null;
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0005 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0A() {
        /*
            r2 = this;
            r1 = 0
        L1:
            int r0 = r2.getChildCount()
            if (r1 >= r0) goto L1d
            android.view.View r0 = r2.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            com.facebook.ads.redexgen.X.3F r0 = (com.facebook.ads.redexgen.X.C3F) r0
            boolean r0 = r0.A05
            if (r0 != 0) goto L1a
            r2.removeViewAt(r1)
            int r1 = r1 + (-1)
        L1a:
            int r1 = r1 + 1
            goto L1
        L1d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C3M.A0A():void");
    }

    private void A0B() {
        if (this.A0F != 0) {
            ArrayList<View> arrayList = this.A0d;
            if (arrayList == null) {
                this.A0d = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                this.A0d.add(getChildAt(i10));
            }
            Collections.sort(this.A0d, A0y);
        }
    }

    private final void A0D() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.A0X = new Scroller(context, A0x);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.A0R = viewConfiguration.getScaledPagingTouchSlop();
        this.A0K = (int) (400.0f * f);
        this.A0J = viewConfiguration.getScaledMaximumFlingVelocity();
        this.A0V = new EdgeEffect(context);
        this.A0W = new EdgeEffect(context);
        this.A0H = (int) (25.0f * f);
        this.A0C = (int) (2.0f * f);
        this.A0E = (int) (16.0f * f);
        AnonymousClass38.A0B(this, new C1353Xv(this));
        if (AnonymousClass38.A00(this) == 0) {
            AnonymousClass38.A09(this, 1);
        }
        AnonymousClass38.A0C(this, new C1354Xw(this));
    }

    private void A0E(int i10) {
        C3H c3h = this.A0Z;
        List<C3H> list = this.A0f;
        if (list != null) {
            int i11 = list.size();
            for (int i12 = 0; i12 < i11; i12++) {
                this.A0f.get(i12);
            }
        }
        C3H c3h2 = this.A0Y;
    }

    private void A0F(int i10) {
        C3H c3h = this.A0Z;
        List<C3H> list = this.A0f;
        if (list != null) {
            int i11 = list.size();
            for (int i12 = 0; i12 < i11; i12++) {
                this.A0f.get(i12);
            }
        }
        C3H c3h2 = this.A0Y;
    }

    private void A0H(int i10, float f, int i11) {
        C3H c3h = this.A0Z;
        List<C3H> list = this.A0f;
        if (list != null) {
            int i12 = list.size();
            for (int i13 = 0; i13 < i12; i13++) {
                this.A0f.get(i13);
            }
        }
        C3H c3h2 = this.A0Y;
    }

    @CallSuper
    private final void A0I(int childOffset, float f, int i10) {
        int i11;
        if (this.A0D > 0) {
            int hgrav = getScrollX();
            int childCount = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int scrollX = A0v[1].length();
            if (scrollX == 12) {
                throw new RuntimeException();
            }
            String[] strArr = A0v;
            strArr[3] = "hSwONVQ9BwzgmNPK4tziO3X6uj4eQvsQ";
            strArr[6] = "gKhZoL4mhYlFRC9fFMXnjqdiW6EOuKfZ";
            int width = getWidth();
            int paddingLeft = getChildCount();
            for (int i12 = 0; i12 < paddingLeft; i12++) {
                View childAt = getChildAt(i12);
                C3F c3f = (C3F) childAt.getLayoutParams();
                if (c3f.A05) {
                    int i13 = c3f.A04 & 7;
                    if (i13 == 1) {
                        i11 = Math.max((width - childAt.getMeasuredWidth()) / 2, childCount);
                    } else if (i13 == 3) {
                        i11 = childCount;
                        childCount += childAt.getWidth();
                    } else if (i13 != 5) {
                        i11 = childCount;
                    } else {
                        i11 = (width - paddingRight) - childAt.getMeasuredWidth();
                        paddingRight += childAt.getMeasuredWidth();
                    }
                    int i14 = (i11 + hgrav) - childAt.getLeft();
                    if (i14 != 0) {
                        childAt.offsetLeftAndRight(i14);
                    }
                }
            }
        }
        A0H(childOffset, f, i10);
        if (this.A0a != null) {
            getScrollX();
            int childCount2 = getChildCount();
            for (int i15 = 0; i15 < childCount2; i15++) {
                View childAt2 = getChildAt(i15);
                if (!((C3F) childAt2.getLayoutParams()).A05) {
                    childAt2.getLeft();
                    getClientWidth();
                    throw new NullPointerException(A08(450, 13, 121));
                }
            }
        }
        this.A0g = true;
    }

    private void A0K(int i10, int i11, int i12, int i13) {
        if (i11 > 0) {
            ArrayList<C3E> arrayList = this.A0t;
            String[] strArr = A0v;
            if (strArr[7].charAt(10) != strArr[0].charAt(10)) {
                throw new RuntimeException();
            }
            A0v[1] = "xS6wP2kv8Ukjp2mlI4OFB7EI";
            if (!arrayList.isEmpty()) {
                boolean isFinished = this.A0X.isFinished();
                if (A0v[1].length() == 12) {
                    throw new RuntimeException();
                }
                A0v[2] = "M3IvNYMGgF0qb538wmgDMK0nNkgqAt";
                if (!isFinished) {
                    this.A0X.setFinalX(getCurrentItem() * getClientWidth());
                    return;
                }
                int paddingLeft = ((i10 - getPaddingLeft()) - getPaddingRight()) + i12;
                int widthWithMargin = getPaddingLeft();
                int i14 = i11 - widthWithMargin;
                int widthWithMargin2 = getPaddingRight();
                int i15 = (i14 - widthWithMargin2) + i13;
                int widthWithMargin3 = getScrollX();
                int oldWidthWithMargin = (int) (paddingLeft * (widthWithMargin3 / i15));
                int widthWithMargin4 = getScrollY();
                scrollTo(oldWidthWithMargin, widthWithMargin4);
                return;
            }
        }
        C3E ii = A04(this.A00);
        float scrollOffset = ii != null ? Math.min(ii.A00, this.A07) : gl.Code;
        int paddingLeft2 = (int) (((i10 - getPaddingLeft()) - getPaddingRight()) * scrollOffset);
        if (paddingLeft2 != getScrollX()) {
            A0R(false);
            scrollTo(paddingLeft2, getScrollY());
        }
    }

    private final void A0L(int i10, boolean z10) {
        this.A0o = false;
        A0N(i10, z10, false);
    }

    private void A0M(int i10, boolean z10, int i11, boolean z11) {
        C3E A04 = A04(i10);
        int i12 = 0;
        if (A04 != null) {
            i12 = (int) (getClientWidth() * Math.max(this.A02, Math.min(A04.A00, this.A07)));
        }
        int destX = A0v[2].length();
        if (destX == 14) {
            throw new RuntimeException();
        }
        String[] strArr = A0v;
        strArr[3] = "qWyJthdIKprwmupmlWytZXkwKuTz6nwm";
        strArr[6] = "fDmSwMvEmt93O90vXMKXMmFP8biUMO95";
        if (z10) {
            A0J(i12, 0, i11);
            if (z11) {
                A0E(i10);
                return;
            }
            return;
        }
        if (z11) {
            A0E(i10);
        }
        A0R(false);
        scrollTo(i12, 0);
        A0Z(i12);
    }

    private final void A0N(int i10, boolean z10, boolean z11) {
        A0O(i10, z10, z11, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0065, code lost:
    
        if (r6 < r4) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A0O(int r6, boolean r7, boolean r8, int r9) {
        /*
            r5 = this;
            com.facebook.ads.redexgen.X.2t r0 = r5.A01
            r1 = 0
            if (r0 == 0) goto Lb
            int r0 = r0.A05()
            if (r0 > 0) goto Lf
        Lb:
            r5.setScrollingCacheEnabled(r1)
            return
        Lf:
            if (r8 != 0) goto L21
            int r0 = r5.A00
            if (r0 != r6) goto L21
            java.util.ArrayList<com.facebook.ads.redexgen.X.3E> r0 = r5.A0t
            int r0 = r0.size()
            if (r0 == 0) goto L21
            r5.setScrollingCacheEnabled(r1)
            return
        L21:
            r2 = 1
            if (r6 >= 0) goto L48
            r6 = 0
        L25:
            int r1 = r5.A0L
            int r4 = r5.A00
            int r0 = r4 + r1
            if (r6 > r0) goto L67
            int r4 = r4 - r1
            java.lang.String[] r3 = com.facebook.ads.redexgen.X.C3M.A0v
            r0 = 7
            r1 = r3[r0]
            r0 = 0
            r3 = r3[r0]
            r0 = 10
            char r1 = r1.charAt(r0)
            char r0 = r3.charAt(r0)
            if (r1 == r0) goto L59
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L48:
            com.facebook.ads.redexgen.X.2t r0 = r5.A01
            int r0 = r0.A05()
            if (r6 < r0) goto L25
            com.facebook.ads.redexgen.X.2t r0 = r5.A01
            int r0 = r0.A05()
            int r6 = r0 + (-1)
            goto L25
        L59:
            java.lang.String[] r3 = com.facebook.ads.redexgen.X.C3M.A0v
            java.lang.String r1 = "HdD8kb8A1NTv0LjA3C8pNf8B8Uhf5Rjf"
            r0 = 3
            r3[r0] = r1
            java.lang.String r1 = "hEPxY7plOgAB5ujpSYVhyDABeqG0KedF"
            r0 = 6
            r3[r0] = r1
            if (r6 >= r4) goto L7d
        L67:
            r1 = 0
        L68:
            java.util.ArrayList<com.facebook.ads.redexgen.X.3E> r0 = r5.A0t
            int r0 = r0.size()
            if (r1 >= r0) goto L7d
            java.util.ArrayList<com.facebook.ads.redexgen.X.3E> r0 = r5.A0t
            java.lang.Object r0 = r0.get(r1)
            com.facebook.ads.redexgen.X.3E r0 = (com.facebook.ads.redexgen.X.C3E) r0
            r0.A04 = r2
            int r1 = r1 + 1
            goto L68
        L7d:
            int r0 = r5.A00
            if (r0 == r6) goto L97
        L81:
            boolean r0 = r5.A0i
            if (r0 == 0) goto L90
            r5.A00 = r6
            if (r2 == 0) goto L8c
            r5.A0E(r6)
        L8c:
            r5.requestLayout()
        L8f:
            return
        L90:
            r5.A0G(r6)
            r5.A0M(r6, r7, r9, r2)
            goto L8f
        L97:
            r2 = 0
            goto L81
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C3M.A0O(int, boolean, boolean, int):void");
    }

    private void A0P(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        int pointerId = motionEvent.getPointerId(actionIndex);
        int pointerIndex = this.A08;
        if (pointerId == pointerIndex) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.A05 = motionEvent.getX(i10);
            String[] strArr = A0v;
            String str = strArr[4];
            String str2 = strArr[5];
            int pointerId2 = str.length();
            int pointerIndex2 = str2.length();
            if (pointerId2 != pointerIndex2) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0v;
            strArr2[4] = "";
            strArr2[5] = "";
            int pointerIndex3 = motionEvent.getPointerId(i10);
            this.A08 = pointerIndex3;
            VelocityTracker velocityTracker = this.A0U;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:21:0x0051 */
    /* JADX WARN: Incorrect condition in loop: B:38:0x0095 */
    /* JADX WARN: Incorrect condition in loop: B:72:0x011f */
    /* JADX WARN: Incorrect condition in loop: B:86:0x015e */
    /* JADX WARN: Incorrect condition in loop: B:9:0x0024 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0Q(com.facebook.ads.redexgen.X.C3E r13, int r14, com.facebook.ads.redexgen.X.C3E r15) {
        /*
            Method dump skipped, instructions count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C3M.A0Q(com.facebook.ads.redexgen.X.3E, int, com.facebook.ads.redexgen.X.3E):void");
    }

    private void A0R(boolean z10) {
        boolean z11 = this.A0P == 2;
        if (z11) {
            setScrollingCacheEnabled(false);
            boolean needPopulate = this.A0X.isFinished();
            boolean wasScrolling = true ^ needPopulate;
            if (wasScrolling) {
                this.A0X.abortAnimation();
                if (A0v[1].length() == 12) {
                    throw new RuntimeException();
                }
                A0v[1] = "La7";
                int oldX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.A0X.getCurrX();
                int currY = this.A0X.getCurrY();
                if (oldX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != oldX) {
                        A0Z(currX);
                    }
                }
            }
        }
        this.A0o = false;
        for (int i10 = 0; i10 < this.A0t.size(); i10++) {
            C3E c3e = this.A0t.get(i10);
            boolean needPopulate2 = c3e.A04;
            if (needPopulate2) {
                z11 = true;
                c3e.A04 = false;
            }
        }
        if (z11) {
            if (z10) {
                AnonymousClass38.A0D(this, this.A0s);
            } else {
                this.A0s.run();
            }
        }
    }

    private void A0S(boolean z10) {
        int layerType;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (z10) {
                layerType = this.A0N;
            } else {
                layerType = 0;
            }
            getChildAt(i10).setLayerType(layerType, null);
        }
    }

    private void A0T(boolean z10) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z10);
        }
    }

    private boolean A0U() {
        this.A08 = -1;
        A09();
        this.A0V.onRelease();
        this.A0W.onRelease();
        return this.A0V.isFinished() || this.A0W.isFinished();
    }

    private final boolean A0V() {
        int i10 = this.A00;
        if (i10 > 0) {
            A0L(i10 - 1, true);
            return true;
        }
        return false;
    }

    private final boolean A0W() {
        AbstractC05872t abstractC05872t = this.A01;
        if (abstractC05872t != null && this.A00 < abstractC05872t.A05() - 1) {
            A0L(this.A00 + 1, true);
            return true;
        }
        if (A0v[2].length() == 14) {
            throw new RuntimeException();
        }
        String[] strArr = A0v;
        strArr[7] = "AXA5EDUbYu85ntxkUdYhY3hIIlQIUQar";
        strArr[0] = "7HhQN1X94o8BEMOAnE9vO9t08zapWTmy";
        return false;
    }

    private boolean A0X(float f) {
        boolean z10 = false;
        float f10 = this.A05 - f;
        this.A05 = f;
        float scrollX = getScrollX() + f10;
        int clientWidth = getClientWidth();
        float oldScrollX = clientWidth;
        float oldScrollX2 = oldScrollX * this.A02;
        float leftBound = clientWidth;
        float leftBound2 = leftBound * this.A07;
        boolean rightAbsolute = true;
        boolean leftAbsolute = true;
        C3E c3e = this.A0t.get(0);
        C3E c3e2 = this.A0t.get(r1.size() - 1);
        if (c3e.A02 != 0) {
            rightAbsolute = false;
            float oldScrollX3 = c3e.A00;
            if (A0v[1].length() == 12) {
                throw new RuntimeException();
            }
            A0v[1] = "a";
            oldScrollX2 = oldScrollX3 * clientWidth;
        }
        if (c3e2.A02 != this.A01.A05() - 1) {
            leftAbsolute = false;
            float leftBound3 = c3e2.A00;
            leftBound2 = leftBound3 * clientWidth;
        }
        if (scrollX < oldScrollX2) {
            if (rightAbsolute) {
                this.A0V.onPull(Math.abs(oldScrollX2 - scrollX) / clientWidth);
                z10 = true;
            }
            scrollX = oldScrollX2;
        } else if (scrollX > leftBound2) {
            if (leftAbsolute) {
                EdgeEffect edgeEffect = this.A0W;
                float oldScrollX4 = Math.abs(scrollX - leftBound2);
                float deltaX = clientWidth;
                String[] strArr = A0v;
                if (strArr[4].length() != strArr[5].length()) {
                    edgeEffect.onPull(oldScrollX4 / deltaX);
                    z10 = true;
                } else {
                    A0v[1] = "TwKB2lBmR";
                    edgeEffect.onPull(oldScrollX4 / deltaX);
                    z10 = true;
                }
            }
            scrollX = leftBound2;
        }
        this.A05 += scrollX - ((int) scrollX);
        scrollTo((int) scrollX, getScrollY());
        A0Z((int) scrollX);
        return z10;
    }

    private final boolean A0Y(float f, float f10) {
        if (f >= this.A0I || f10 <= gl.Code) {
            if (f > getWidth() - this.A0I) {
                if (A0v[2].length() == 14) {
                    throw new RuntimeException();
                }
                String[] strArr = A0v;
                strArr[3] = "LoLbwLodEQ0RZhoADzk4YxqyeMxGbPNe";
                strArr[6] = "uXFtlpuRRgamX4n9Zkql1HjWorEkSQ7b";
                if (f10 < gl.Code) {
                }
            }
            return false;
        }
        return true;
    }

    private boolean A0Z(int i10) {
        int size = this.A0t.size();
        String A08 = A08(397, 53, 60);
        if (size == 0) {
            if (this.A0i) {
                return false;
            }
            this.A0g = false;
            A0I(0, gl.Code, 0);
            String[] strArr = A0v;
            if (strArr[4].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            A0v[2] = "c3ramapljB1reDSufYjA";
            if (this.A0g) {
                return false;
            }
            throw new IllegalStateException(A08);
        }
        C3E A03 = A03();
        int currentPage = getClientWidth();
        int i11 = this.A0M;
        int i12 = A03.A02;
        float f = ((i10 / currentPage) - A03.A00) / (A03.A01 + (i11 / currentPage));
        this.A0g = false;
        A0I(i12, f, (int) ((currentPage + i11) * f));
        if (this.A0g) {
            return true;
        }
        throw new IllegalStateException(A08);
    }

    private final boolean A0a(int i10) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        } else if (findFocus != null) {
            boolean z10 = false;
            ViewParent parent = findFocus.getParent();
            while (true) {
                if (!(parent instanceof ViewGroup)) {
                    break;
                }
                if (parent == this) {
                    z10 = true;
                    break;
                }
                parent = parent.getParent();
            }
            if (!z10) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(findFocus.getClass().getSimpleName());
                for (ViewParent parent2 = findFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                    sb2.append(A08(0, 4, 21));
                    sb2.append(parent2.getClass().getSimpleName());
                }
                Log.e(A08(300, 9, 47), A08(309, 72, 80) + sb2.toString());
                findFocus = null;
            }
        }
        boolean z11 = false;
        View nextFocused = FocusFinder.getInstance().findNextFocus(this, findFocus, i10);
        if (nextFocused != null && nextFocused != findFocus) {
            if (i10 == 17) {
                z11 = (findFocus == null || A02(this.A0q, nextFocused).left < A02(this.A0q, findFocus).left) ? nextFocused.requestFocus() : A0V();
            } else if (i10 == 66) {
                z11 = (findFocus == null || A02(this.A0q, nextFocused).left > A02(this.A0q, findFocus).left) ? nextFocused.requestFocus() : A0W();
            }
        } else if (i10 == 17 || i10 == 1) {
            z11 = A0V();
        } else if (i10 == 66 || i10 == 2) {
            z11 = A0W();
        }
        if (z11) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i10));
        }
        return z11;
    }

    private final boolean A0b(KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 21) {
            boolean handled = keyEvent.hasModifiers(2);
            if (handled) {
                return A0V();
            }
            return A0a(17);
        }
        if (keyCode == 22) {
            boolean handled2 = keyEvent.hasModifiers(2);
            if (handled2) {
                return A0W();
            }
            return A0a(66);
        }
        if (keyCode != 61) {
            return false;
        }
        boolean handled3 = keyEvent.hasNoModifiers();
        if (handled3) {
            return A0a(2);
        }
        boolean hasModifiers = keyEvent.hasModifiers(1);
        String[] strArr = A0v;
        if (strArr[4].length() != strArr[5].length()) {
            throw new RuntimeException();
        }
        A0v[1] = "lC1XoLB2bpdljamdt6Vm";
        if (!hasModifiers) {
            return false;
        }
        return A0a(1);
    }

    public static boolean A0c(@NonNull View view) {
        return view.getClass().getAnnotation(ViewPager$DecorView.class) != null;
    }

    private final boolean A0d(View view, boolean z10, int i10, int i11, int i12) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int i13 = view.getScrollX();
            int count = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (i11 + i13 >= childAt.getLeft() && i11 + i13 < childAt.getRight() && i12 + count >= childAt.getTop() && i12 + count < childAt.getBottom()) {
                    int left = (i11 + i13) - childAt.getLeft();
                    int i14 = i12 + count;
                    if (A0v[1].length() == 12) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A0v;
                    strArr[4] = "";
                    strArr[5] = "";
                    if (A0d(childAt, true, i10, left, i14 - childAt.getTop())) {
                        return true;
                    }
                }
            }
        }
        return z10 && view.canScrollHorizontally(-i10);
    }

    /* JADX WARN: Incorrect condition in loop: B:8:0x002a */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0e() {
        /*
            r11 = this;
            com.facebook.ads.redexgen.X.2t r0 = r11.A01
            int r3 = r0.A05()
            r11.A0G = r3
            java.util.ArrayList<com.facebook.ads.redexgen.X.3E> r0 = r11.A0t
            int r1 = r0.size()
            int r0 = r11.A0L
            int r0 = r0 * 2
            r5 = 1
            int r0 = r0 + r5
            r4 = 0
            if (r1 >= r0) goto L7b
            java.util.ArrayList<com.facebook.ads.redexgen.X.3E> r0 = r11.A0t
            int r0 = r0.size()
            if (r0 >= r3) goto L7b
            r10 = 1
        L20:
            int r6 = r11.A00
            r9 = 0
            r2 = 0
        L24:
            java.util.ArrayList<com.facebook.ads.redexgen.X.3E> r0 = r11.A0t
            int r0 = r0.size()
            if (r2 >= r0) goto L7d
            java.util.ArrayList<com.facebook.ads.redexgen.X.3E> r0 = r11.A0t
            java.lang.Object r8 = r0.get(r2)
            com.facebook.ads.redexgen.X.3E r8 = (com.facebook.ads.redexgen.X.C3E) r8
            com.facebook.ads.redexgen.X.2t r1 = r11.A01
            java.lang.Object r0 = r8.A03
            int r7 = r1.A06(r0)
            r0 = -1
            if (r7 != r0) goto L41
        L3f:
            int r2 = r2 + r5
            goto L24
        L41:
            r0 = -2
            if (r7 != r0) goto L6c
            java.util.ArrayList<com.facebook.ads.redexgen.X.3E> r0 = r11.A0t
            r0.remove(r2)
            int r2 = r2 + (-1)
            if (r9 != 0) goto L4e
            r9 = 1
        L4e:
            com.facebook.ads.redexgen.X.2t r7 = r11.A01
            int r1 = r8.A02
            java.lang.Object r0 = r8.A03
            r7.A0B(r11, r1, r0)
            r10 = 1
            int r1 = r11.A00
            int r0 = r8.A02
            if (r1 != r0) goto L3f
            int r1 = r11.A00
            int r0 = r3 + (-1)
            int r0 = java.lang.Math.min(r1, r0)
            int r6 = java.lang.Math.max(r4, r0)
            r10 = 1
            goto L3f
        L6c:
            int r0 = r8.A02
            if (r0 == r7) goto L3f
            int r1 = r8.A02
            int r0 = r11.A00
            if (r1 != r0) goto L77
            r6 = r7
        L77:
            r8.A02 = r7
            r10 = 1
            goto L3f
        L7b:
            r10 = 0
            goto L20
        L7d:
            java.util.ArrayList<com.facebook.ads.redexgen.X.3E> r1 = r11.A0t
            java.util.Comparator<com.facebook.ads.redexgen.X.3E> r0 = com.facebook.ads.redexgen.X.C3M.A0z
            java.util.Collections.sort(r1, r0)
            if (r10 == 0) goto Lbb
            int r3 = r11.getChildCount()
            r2 = 0
        L8b:
            if (r2 >= r3) goto La1
            android.view.View r0 = r11.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            com.facebook.ads.redexgen.X.3F r1 = (com.facebook.ads.redexgen.X.C3F) r1
            boolean r0 = r1.A05
            if (r0 != 0) goto L9e
            r0 = 0
            r1.A00 = r0
        L9e:
            int r2 = r2 + 1
            goto L8b
        La1:
            r11.A0N(r6, r4, r5)
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C3M.A0v
            r0 = 2
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 14
            if (r1 == r0) goto Lbc
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C3M.A0v
            java.lang.String r1 = "iBz2AIJ6C"
            r0 = 2
            r2[r0] = r1
            r11.requestLayout()
        Lbb:
            return
        Lbc:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C3M.A0e():void");
    }

    public final void A0f() {
        A0G(this.A00);
    }

    /* JADX WARN: Incorrect condition in loop: B:5:0x0011 */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void addFocusables(java.util.ArrayList<android.view.View> r7, int r8, int r9) {
        /*
            r6 = this;
            int r5 = r7.size()
            int r4 = r6.getDescendantFocusability()
            r0 = 393216(0x60000, float:5.51013E-40)
            if (r4 == r0) goto L2f
            r3 = 0
        Ld:
            int r0 = r6.getChildCount()
            if (r3 >= r0) goto L2f
            android.view.View r2 = r6.getChildAt(r3)
            int r0 = r2.getVisibility()
            if (r0 != 0) goto L2c
            com.facebook.ads.redexgen.X.3E r0 = r6.A07(r2)
            if (r0 == 0) goto L2c
            int r1 = r0.A02
            int r0 = r6.A00
            if (r1 != r0) goto L2c
            r2.addFocusables(r7, r8, r9)
        L2c:
            int r3 = r3 + 1
            goto Ld
        L2f:
            r0 = 262144(0x40000, float:3.67342E-40)
            if (r4 != r0) goto L39
            int r0 = r7.size()
            if (r5 != r0) goto L55
        L39:
            boolean r0 = r6.isFocusable()
            if (r0 != 0) goto L40
            return
        L40:
            r1 = r9 & 1
            r0 = 1
            if (r1 != r0) goto L52
            boolean r0 = r6.isInTouchMode()
            if (r0 == 0) goto L52
            boolean r0 = r6.isFocusableInTouchMode()
            if (r0 != 0) goto L52
            return
        L52:
            r7.add(r6)
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C3M.addFocusables(java.util.ArrayList, int, int):void");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        C3F c3f = (C3F) layoutParams;
        c3f.A05 |= A0c(view);
        if (this.A0j) {
            if (!c3f.A05) {
                c3f.A03 = true;
                addViewInLayout(view, i10, layoutParams);
                return;
            }
            throw new IllegalStateException(A08(86, 41, 16));
        }
        super.addView(view, i10, layoutParams);
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i10) {
        if (this.A01 == null) {
            return false;
        }
        int width = getClientWidth();
        int scrollX = getScrollX();
        return i10 < 0 ? scrollX > ((int) (((float) width) * this.A02)) : i10 > 0 && scrollX < ((int) (((float) width) * this.A07));
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C3F) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        this.A0l = true;
        if (!this.A0X.isFinished() && this.A0X.computeScrollOffset()) {
            int scrollX = getScrollX();
            int y = getScrollY();
            int x10 = this.A0X.getCurrX();
            int oldY = this.A0X.getCurrY();
            if (scrollX != x10 || y != oldY) {
                scrollTo(x10, oldY);
                if (!A0Z(x10)) {
                    this.A0X.abortAnimation();
                    scrollTo(0, oldY);
                }
            }
            AnonymousClass38.A07(this);
            return;
        }
        A0R(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || A0b(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        C3E A07;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int childCount2 = childAt.getVisibility();
            if (childCount2 == 0 && (A07 = A07(childAt)) != null) {
                int i11 = A07.A02;
                String[] strArr = A0v;
                String str = strArr[7];
                String str2 = strArr[0];
                int i12 = str.charAt(10);
                int childCount3 = str2.charAt(10);
                if (i12 != childCount3) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0v;
                strArr2[4] = "";
                strArr2[5] = "";
                int childCount4 = this.A00;
                if (i11 == childCount4 && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        if (r3.A05() > 1) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0052, code lost:
    
        if (r3 == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0054, code lost:
    
        r5 = r8.save();
        r4 = (getHeight() - getPaddingTop()) - getPaddingBottom();
        r3 = getWidth();
        r8.rotate(270.0f);
        r1 = -r4;
        r8.translate(r1 + getPaddingTop(), r7.A02 * r3);
        r7.A0V.setSize(r4, r3);
        r0 = r7.A0V.draw(r8);
        r6 = false | r0;
        r8.restoreToCount(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008c, code lost:
    
        r0 = r7.A0W.isFinished();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0092, code lost:
    
        if (r0 != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0094, code lost:
    
        r3 = r8.save();
        r5 = getWidth();
        r4 = (getHeight() - getPaddingTop()) - getPaddingBottom();
        r8.rotate(90.0f);
        r8.translate(-getPaddingTop(), (-(r7.A07 + 1.0f)) * r5);
        r7.A0W.setSize(r4, r5);
        r0 = r7.A0W.draw(r8);
        r6 = r6 | r0;
        r8.restoreToCount(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e1, code lost:
    
        if (r3 == false) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r8) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C3M.draw(android.graphics.Canvas):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.A0S;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C3F();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C3F(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public AbstractC05872t getAdapter() {
        return this.A01;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i10, int i11) {
        int result = this.A0F == 2 ? (i10 - 1) - i11 : i11;
        int index = ((C3F) this.A0d.get(result).getLayoutParams()).A01;
        return index;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    public int getCurrentItem() {
        return this.A00;
    }

    public int getOffscreenPageLimit() {
        return this.A0L;
    }

    public int getPageMargin() {
        return this.A0M;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A0i = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.A0s);
        Scroller scroller = this.A0X;
        if (scroller != null && !scroller.isFinished()) {
            this.A0X.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        super.onDraw(canvas);
        if (this.A0M > 0 && this.A0S != null && this.A0t.size() > 0 && this.A01 != null) {
            int pos = getScrollX();
            int lastPos = getWidth();
            float f10 = this.A0M / lastPos;
            int itemCount = 0;
            C3E c3e = this.A0t.get(0);
            float marginOffset = c3e.A00;
            int size = this.A0t.size();
            int i10 = this.A0t.get(size - 1).A02;
            loop0: for (int i11 = c3e.A02; i11 < i10; i11++) {
                while (i11 > c3e.A02 && itemCount < size) {
                    itemCount++;
                    C3E c3e2 = this.A0t.get(itemCount);
                    String[] strArr = A0v;
                    String str = strArr[7];
                    String str2 = strArr[0];
                    int scrollX = str.charAt(10);
                    if (scrollX != str2.charAt(10)) {
                        break loop0;
                    }
                    A0v[2] = "Qpfq";
                    c3e = c3e2;
                }
                if (i11 == c3e.A02) {
                    f = (c3e.A00 + c3e.A01) * lastPos;
                    float marginOffset2 = c3e.A00;
                    marginOffset = marginOffset2 + c3e.A01 + f10;
                } else {
                    float A04 = this.A01.A04(i11);
                    f = (marginOffset + A04) * lastPos;
                    marginOffset += A04 + f10;
                }
                if (this.A0M + f > pos) {
                    Drawable drawable = this.A0S;
                    int round = Math.round(f);
                    int i12 = this.A0Q;
                    int width = Math.round(this.A0M + f);
                    drawable.setBounds(round, i12, width, this.A09);
                    Drawable drawable2 = this.A0S;
                    String[] strArr2 = A0v;
                    String str3 = strArr2[7];
                    String str4 = strArr2[0];
                    int width2 = str3.charAt(10);
                    if (width2 != str4.charAt(10)) {
                        A0v[1] = "";
                        drawable2.draw(canvas);
                    } else {
                        String[] strArr3 = A0v;
                        strArr3[4] = "";
                        strArr3[5] = "";
                        drawable2.draw(canvas);
                    }
                }
                int i13 = pos + lastPos;
                int width3 = A0v[1].length();
                if (width3 == 12) {
                    throw new RuntimeException();
                }
                A0v[1] = "DrXdt";
                if (f > i13) {
                    return;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f;
        int action = motionEvent.getAction() & p.f9095b;
        if (action == 3 || action == 1) {
            A0U();
            String[] strArr = A0v;
            if (strArr[4].length() == strArr[5].length()) {
                A0v[2] = "iW5W";
                return false;
            }
        } else {
            if (action != 0) {
                if (this.A0k) {
                    return true;
                }
                if (this.A0m) {
                    return false;
                }
            }
            if (action != 0) {
                if (action == 2) {
                    int i10 = this.A08;
                    if (i10 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i10);
                        float y = motionEvent.getX(findPointerIndex);
                        float f10 = y - this.A05;
                        float abs = Math.abs(f10);
                        float y10 = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y10 - this.A04);
                        if (f10 != gl.Code && !A0Y(this.A05, f10) && A0d(this, false, (int) f10, (int) y, (int) y10)) {
                            this.A05 = y;
                            this.A06 = y10;
                            this.A0m = true;
                            return false;
                        }
                        float y11 = this.A0R;
                        if (A0v[1].length() != 12) {
                            String[] strArr2 = A0v;
                            strArr2[7] = "NnThZj9Wv9885vPNkfCF8DoAZte0LwUX";
                            strArr2[0] = "g2aolHvSBW8By3vUeqDyYWaFAgdqNGTo";
                            if (abs > y11 && 0.5f * abs > abs2) {
                                this.A0k = true;
                                A0T(true);
                                setScrollState(1);
                                if (f10 <= gl.Code) {
                                    f = this.A03 - this.A0R;
                                } else {
                                    float f11 = this.A03;
                                    int i11 = this.A0R;
                                    String[] strArr3 = A0v;
                                    if (strArr3[7].charAt(10) != strArr3[0].charAt(10)) {
                                        f = f11 + i11;
                                    } else {
                                        String[] strArr4 = A0v;
                                        strArr4[7] = "WpQimEPBWZ8vG05HKhTxshBMY3NNEur0";
                                        strArr4[0] = "BEtp4ufX6D8x3OZlDxdpMoFh1oKQqP0t";
                                        f = f11 + i11;
                                    }
                                }
                                this.A05 = f;
                                this.A06 = y10;
                                setScrollingCacheEnabled(true);
                            } else if (abs2 > this.A0R) {
                                this.A0m = true;
                            }
                            if (this.A0k && A0X(y)) {
                                AnonymousClass38.A07(this);
                            }
                        }
                    }
                } else if (action == 6) {
                    A0P(motionEvent);
                }
            } else {
                float x10 = motionEvent.getX();
                this.A03 = x10;
                this.A05 = x10;
                float y12 = motionEvent.getY();
                this.A04 = y12;
                this.A06 = y12;
                this.A08 = motionEvent.getPointerId(0);
                this.A0m = false;
                this.A0l = true;
                this.A0X.computeScrollOffset();
                if (this.A0P != 2 || Math.abs(this.A0X.getFinalX() - this.A0X.getCurrX()) <= this.A0C) {
                    A0R(false);
                    this.A0k = false;
                } else {
                    this.A0X.abortAnimation();
                    this.A0o = false;
                    A0f();
                    this.A0k = true;
                    A0T(true);
                    setScrollState(1);
                }
            }
            if (this.A0U == null) {
                this.A0U = VelocityTracker.obtain();
            }
            this.A0U.addMovement(motionEvent);
            return this.A0k;
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0085, code lost:
    
        if (r3 != 48) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0087, code lost:
    
        r14 = com.facebook.ads.redexgen.X.C3M.A0v;
        r2 = r14[7];
        r14 = r14[0];
        r2 = r2.charAt(10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009b, code lost:
    
        if (r2 == r14.charAt(10)) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009d, code lost:
    
        com.facebook.ads.redexgen.X.C3M.A0v[2] = "D8xV1TWmEwTp2AdSb5ATv3";
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a4, code lost:
    
        if (r3 == 80) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a6, code lost:
    
        r2 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ca, code lost:
    
        r2 = r8 - r16;
        r2 = r2 - r4.getMeasuredHeight();
        r16 = r16 + r4.getMeasuredHeight();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00bb, code lost:
    
        r14 = com.facebook.ads.redexgen.X.C3M.A0v;
        r14[3] = "1ewPUp1k8Pl5lyl6fUi6LymHiaJ9xmay";
        r14[6] = "wiWTa2PhZxJDNWnFVxR2jmvUAFeWjohE";
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c7, code lost:
    
        if (r3 == 80) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e7, code lost:
    
        r2 = r12;
        r12 = r12 + r4.getMeasuredHeight();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e4, code lost:
    
        if (r3 != 48) goto L25;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C3M.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i10, Rect rect) {
        int end;
        int i11;
        C3E A07;
        int i12 = getChildCount();
        int count = i10 & 2;
        if (count != 0) {
            end = 0;
            i11 = 1;
        } else {
            end = i12 - 1;
            i11 = -1;
            i12 = -1;
        }
        while (end != i12) {
            View child = getChildAt(end);
            int index = A0v[2].length();
            if (index == 14) {
                throw new RuntimeException();
            }
            String[] strArr = A0v;
            strArr[3] = "wvs0VrXDMEHK1ZrgMliCmQkmYIqFRPYZ";
            strArr[6] = "yeuyy9yC0QSIfk9tyj8D1No5khczL5F7";
            int count2 = child.getVisibility();
            if (count2 == 0 && (A07 = A07(child)) != null) {
                int index2 = A07.A02;
                int count3 = this.A00;
                if (index2 == count3 && child.requestFocus(i10, rect)) {
                    return true;
                }
            }
            end += i11;
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof WrappedParcelable)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ClassLoader classLoader = getClass().getClassLoader();
        if (classLoader == null) {
            Context context = getContext();
            String[] strArr = A0v;
            if (strArr[3].charAt(15) == strArr[6].charAt(15)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0v;
            strArr2[7] = "Ly8LvMv3iU8o2fiJAVqvd6K7Aqz3gZKY";
            strArr2[0] = "HcNmsPXina8Ul250FP3kUGj1pgK53N1r";
            classLoader = context.getClassLoader();
        }
        Parcelable state = ((WrappedParcelable) parcelable).unwrap(classLoader);
        if (!(state instanceof ViewPager$SavedState)) {
            super.onRestoreInstanceState(state);
            return;
        }
        ViewPager$SavedState viewPager$SavedState = (ViewPager$SavedState) state;
        super.onRestoreInstanceState(viewPager$SavedState.A02());
        if (this.A01 != null) {
            A0N(viewPager$SavedState.A00, false, true);
            return;
        }
        this.A0O = viewPager$SavedState.A00;
        this.A0T = viewPager$SavedState.A01;
        this.A0c = viewPager$SavedState.A02;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable superState = super.onSaveInstanceState();
        ViewPager$SavedState ss = new ViewPager$SavedState(superState);
        ss.A00 = this.A00;
        AbstractC05872t abstractC05872t = this.A01;
        if (abstractC05872t != null) {
            Parcelable superState2 = abstractC05872t.A07();
            ss.A01 = superState2;
        }
        Parcelable superState3 = new WrappedParcelable(ss);
        return superState3;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12) {
            int i14 = this.A0M;
            A0K(i10, i12, i14, i14);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.A0j) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:5:0x0010 */
    /* JADX WARN: Type inference failed for: r0v16, types: [com.facebook.ads.redexgen.X.3J] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setAdapter(com.facebook.ads.redexgen.X.AbstractC05872t r7) {
        /*
            r6 = this;
            com.facebook.ads.redexgen.X.2t r0 = r6.A01
            r3 = 0
            r4 = 0
            if (r0 == 0) goto L33
            r0.A0A(r3)
            r5 = 0
        La:
            java.util.ArrayList<com.facebook.ads.redexgen.X.3E> r0 = r6.A0t
            int r0 = r0.size()
            if (r5 >= r0) goto L26
            java.util.ArrayList<com.facebook.ads.redexgen.X.3E> r0 = r6.A0t
            java.lang.Object r0 = r0.get(r5)
            com.facebook.ads.redexgen.X.3E r0 = (com.facebook.ads.redexgen.X.C3E) r0
            com.facebook.ads.redexgen.X.2t r2 = r6.A01
            int r1 = r0.A02
            java.lang.Object r0 = r0.A03
            r2.A0B(r6, r1, r0)
            int r5 = r5 + 1
            goto La
        L26:
            java.util.ArrayList<com.facebook.ads.redexgen.X.3E> r0 = r6.A0t
            r0.clear()
            r6.A0A()
            r6.A00 = r4
            r6.scrollTo(r4, r4)
        L33:
            r6.A01 = r7
            r6.A0G = r4
            com.facebook.ads.redexgen.X.2t r0 = r6.A01
            if (r0 == 0) goto L6c
            com.facebook.ads.redexgen.X.3J r0 = r6.A0b
            if (r0 != 0) goto L46
            com.facebook.ads.redexgen.X.3J r0 = new com.facebook.ads.redexgen.X.3J
            r0.<init>()
            r6.A0b = r0
        L46:
            com.facebook.ads.redexgen.X.2t r1 = r6.A01
            com.facebook.ads.redexgen.X.3J r0 = r6.A0b
            r1.A0A(r0)
            r6.A0o = r4
            boolean r2 = r6.A0i
            r1 = 1
            r6.A0i = r1
            com.facebook.ads.redexgen.X.2t r0 = r6.A01
            int r0 = r0.A05()
            r6.A0G = r0
            int r0 = r6.A0O
            if (r0 < 0) goto L94
            int r0 = r6.A0O
            r6.A0N(r0, r4, r1)
            r0 = -1
            r6.A0O = r0
            r6.A0T = r3
            r6.A0c = r3
        L6c:
            java.util.List<com.facebook.ads.internal.androidx.support.v4.view.ViewPager$OnAdapterChangeListener> r0 = r6.A0e
            if (r0 == 0) goto L9e
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L9e
            r1 = 0
            java.util.List<com.facebook.ads.internal.androidx.support.v4.view.ViewPager$OnAdapterChangeListener> r0 = r6.A0e
            int r0 = r0.size()
            if (r1 >= r0) goto L9e
            java.util.List<com.facebook.ads.internal.androidx.support.v4.view.ViewPager$OnAdapterChangeListener> r0 = r6.A0e
            r0.get(r1)
            r2 = 381(0x17d, float:5.34E-43)
            r1 = 16
            r0 = 117(0x75, float:1.64E-43)
            java.lang.String r1 = A08(r2, r1, r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L94:
            if (r2 != 0) goto L9a
            r6.A0f()
            goto L6c
        L9a:
            r6.requestLayout()
            goto L6c
        L9e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C3M.setAdapter(com.facebook.ads.redexgen.X.2t):void");
    }

    public void setCurrentItem(int i10) {
        this.A0o = false;
        A0N(i10, !this.A0i, false);
    }

    public void setOffscreenPageLimit(int i10) {
        if (i10 < 1) {
            Log.w(A08(300, 9, 47), A08(a.R, 31, 60) + i10 + A08(51, 26, 90) + 1);
            i10 = 1;
        }
        if (i10 != this.A0L) {
            this.A0L = i10;
            A0f();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(C3H c3h) {
        this.A0Z = c3h;
    }

    public void setPageMargin(int i10) {
        int width = this.A0M;
        this.A0M = i10;
        int oldMargin = getWidth();
        A0K(oldMargin, oldMargin, i10, width);
        requestLayout();
    }

    public void setPageMarginDrawable(@DrawableRes int i10) {
        setPageMarginDrawable(C2P.A00(getContext(), i10));
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.A0S = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i10) {
        if (this.A0P == i10) {
            return;
        }
        this.A0P = i10;
        if (this.A0a != null) {
            A0S(i10 != 0);
        }
        A0F(i10);
    }

    private void setScrollingCacheEnabled(boolean z10) {
        if (this.A0p != z10) {
            this.A0p = z10;
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.A0S;
    }
}
