package com.huawei.openalliance.ad.views;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.huawei.hms.ads.cl;
import com.huawei.hms.ads.ex;
import com.huawei.hms.ads.fs;
import com.huawei.hms.ads.gl;
import com.huawei.hms.ads.splash.R;
import gb.r0;
import java.util.IllegalFormatException;
import java.util.Locale;

/* loaded from: classes2.dex */
public class PPSSkipButton extends FrameLayout {
    public static int I = 16;
    public static int J = 16;
    public static int K = 4;
    public static int L = 16;
    public static int M = 16;
    public static int N = 24;
    public static int O = 24;
    public final boolean A;
    public final Resources B;
    public TextView C;
    public boolean D;
    public final int E;
    public final boolean F;
    public final boolean G;
    public boolean H;

    /* renamed from: s, reason: collision with root package name */
    public final Context f23935s;

    /* renamed from: t, reason: collision with root package name */
    public final String f23936t;

    /* renamed from: u, reason: collision with root package name */
    public final String f23937u;

    /* renamed from: v, reason: collision with root package name */
    public final int f23938v;

    /* renamed from: w, reason: collision with root package name */
    public final int f23939w;

    /* renamed from: x, reason: collision with root package name */
    public final int f23940x;
    public final String y;

    /* renamed from: z, reason: collision with root package name */
    public fs f23941z;

    public PPSSkipButton(Context context, String str, int i10, int i11, int i12, String str2, boolean z10, int i13, float f, int i14, boolean z11) {
        super(context);
        TextView textView;
        int i15;
        this.f23940x = 0;
        this.D = false;
        this.F = false;
        this.G = true;
        this.H = false;
        this.f23935s = context;
        Resources resources = context.getResources();
        this.B = resources;
        if (resources != null) {
            I = r0.e(context, resources.getDimension(R.dimen.hiad_splash_skip_phone_margin));
            J = r0.e(context, resources.getDimension(R.dimen.hiad_splash_skip_phone_margin_top));
            K = r0.e(context, resources.getDimension(R.dimen.hiad_splash_skip_third_margin));
            L = r0.e(context, resources.getDimension(R.dimen.hiad_splash_skip_tablet_margin));
            M = r0.e(context, resources.getDimension(R.dimen.hiad_splash_skip_tablet_margin_top));
            N = r0.e(context, resources.getDimension(R.dimen.hiad_splash_skip_phone_margin_bottom));
            O = r0.e(context, resources.getDimension(R.dimen.hiad_splash_skip_tablet_margin_bottom));
        }
        this.f23938v = i10;
        this.f23939w = i11;
        this.f23940x = i12;
        this.y = str2 == null ? "tr" : str2;
        String string = context.getString(R.string.hiad_default_skip_text);
        this.f23936t = string;
        String j10 = gb.p.j(str);
        this.f23937u = gb.p.f(j10) ? context.getString(R.string.hiad_default_skip_text_time) : j10;
        this.A = z10;
        this.E = i13;
        this.F = z11;
        this.G = cl.V(context);
        View.inflate(getContext(), R.layout.hiad_view_skip_button, this);
        TextView textView2 = (TextView) findViewById(R.id.hiad_skip_text);
        this.C = textView2;
        textView2.setText(string);
        if (f > gl.Code) {
            if (!r0.p(context)) {
                this.C.setTextSize(2, f);
                if (i14 > 0) {
                    textView = this.C;
                    i15 = r0.m(context, i14);
                    textView.setHeight(i15);
                }
            } else {
                this.C.setTextSize(1, 24.0f);
                if (i14 > 0) {
                    textView = this.C;
                    i15 = r0.i(context, 48.0f);
                    textView.setHeight(i15);
                }
            }
        }
        this.C.setPadding(getSkipAdPaddingPx(), 0, getSkipAdPaddingPx(), 0);
        setPaddingRelative(getSkipAdLeftPaddingPx(), getSkipAdTopPaddingPx(), getSkipAdRightPaddingPx(), getSkipAdBottomPaddingPx());
        setClickable(true);
        setLayoutParams(getSkipAdLayoutParams());
        this.H = false;
        setOnTouchListener(new i(this));
    }

    private int getHorizontalSideGapDpSize() {
        int i10 = I;
        if (5 == this.f23939w) {
            i10 = L;
        }
        if (!this.G) {
            return K;
        }
        return i10;
    }

    private int getHorizontalSideMarginDp() {
        int horizontalSideGapDpSize = getHorizontalSideGapDpSize();
        int i10 = this.f23940x;
        if (horizontalSideGapDpSize < i10) {
            return 0;
        }
        return horizontalSideGapDpSize - i10;
    }

    private int getHorizontalSidePaddingDp() {
        return Math.min(getHorizontalSideGapDpSize(), this.f23940x);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0041, code lost:
    
        if (r6 == 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ba, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b8, code lost:
    
        if ("0".equals(r6) != false) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int getSkipAdBottomMarginPx() {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.views.PPSSkipButton.getSkipAdBottomMarginPx():int");
    }

    private int getSkipAdBottomPaddingPx() {
        int i10;
        boolean equals = "lr".equals(this.y);
        Context context = this.f23935s;
        if (equals) {
            i10 = getVerticalSidePaddingDp();
        } else {
            i10 = this.f23940x;
        }
        return gb.r.a(context, i10);
    }

    private RelativeLayout.LayoutParams getSkipAdLayoutParams() {
        int i10;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        String str = this.y;
        if ("lr".equals(str)) {
            i10 = 12;
        } else {
            i10 = 10;
        }
        layoutParams.addRule(i10);
        layoutParams.addRule(21);
        int skipAdLeftMarginPx = getSkipAdLeftMarginPx();
        int skipAdTopMarginPx = getSkipAdTopMarginPx();
        int skipAdRightMarginPx = getSkipAdRightMarginPx();
        int skipAdBottomMarginPx = getSkipAdBottomMarginPx();
        int i11 = this.f23938v;
        int i12 = this.E;
        if (1 == i11) {
            if ("tr".equals(str)) {
                skipAdTopMarginPx += i12;
            }
        } else {
            if (!this.F) {
                skipAdRightMarginPx += i12;
            }
            boolean z10 = this.G;
            Context context = this.f23935s;
            if (z10) {
                skipAdRightMarginPx = gb.u.j(context) + skipAdRightMarginPx;
            } else {
                skipAdRightMarginPx = gb.u.j(context);
            }
            if ("tr".equals(str)) {
                skipAdTopMarginPx += r0.i(context, 12.0f);
            }
        }
        layoutParams.setMargins(skipAdLeftMarginPx, skipAdTopMarginPx, skipAdRightMarginPx, skipAdBottomMarginPx);
        layoutParams.setMarginEnd(skipAdRightMarginPx);
        return layoutParams;
    }

    private int getSkipAdLeftMarginPx() {
        return 0;
    }

    private int getSkipAdLeftPaddingPx() {
        return this.B.getDimensionPixelOffset(R.dimen.hiad_margin_m);
    }

    private int getSkipAdPaddingPx() {
        return this.B.getDimensionPixelOffset(R.dimen.hiad_margin_l);
    }

    private int getSkipAdRightMarginPx() {
        return gb.r.a(this.f23935s, getHorizontalSideMarginDp());
    }

    private int getSkipAdRightPaddingPx() {
        return gb.r.a(this.f23935s, getHorizontalSidePaddingDp());
    }

    private int getSkipAdTopMarginPx() {
        if ("lr".equals(this.y)) {
            return 0;
        }
        return gb.r.a(this.f23935s, getVerticalSideMarginDp());
    }

    private int getSkipAdTopPaddingPx() {
        int topPaddingDp;
        boolean equals = "lr".equals(this.y);
        Context context = this.f23935s;
        if (equals) {
            topPaddingDp = this.f23940x;
        } else {
            topPaddingDp = getTopPaddingDp();
        }
        return gb.r.a(context, topPaddingDp);
    }

    private int getTopPaddingDp() {
        int i10;
        if (5 == this.f23939w) {
            i10 = M;
        } else {
            i10 = J;
        }
        return Math.min(i10, this.f23940x);
    }

    private int getVerticalSideBottomMarginDp() {
        int a10 = a(true);
        int i10 = this.f23940x;
        if (a10 < i10) {
            return 0;
        }
        return a10 - i10;
    }

    private int getVerticalSideMarginDp() {
        int a10 = a(false);
        int i10 = this.f23940x;
        if (a10 < i10) {
            return 0;
        }
        return a10 - i10;
    }

    private int getVerticalSidePaddingDp() {
        return Math.min(a(false), this.f23940x);
    }

    public final int a(boolean z10) {
        int i10;
        int i11;
        if (z10) {
            i10 = N;
        } else {
            i10 = J;
        }
        if (5 == this.f23939w) {
            if (z10) {
                i11 = O;
            } else {
                i11 = M;
            }
            return i11;
        }
        return i10;
    }

    public final void b(int i10) {
        boolean z10 = this.D;
        String str = this.f23936t;
        if (z10) {
            String str2 = this.f23937u;
            if (!TextUtils.isEmpty(str2)) {
                try {
                    String format = String.format(Locale.getDefault(), str2, Integer.valueOf(i10));
                    ex.Code("PPSSkipButton", "updateLeftTime : %s", format);
                    this.C.setText(format);
                    return;
                } catch (IllegalFormatException unused) {
                    ex.Z("PPSSkipButton", "updateLeftTime IllegalFormatException");
                }
            }
        }
        this.C.setText(str);
    }

    public void setAdMediator(fs fsVar) {
        this.f23941z = fsVar;
    }

    public void setLinkedOnTouchListener(View.OnTouchListener onTouchListener) {
        setOnTouchListener(onTouchListener);
    }

    public void setShowLeftTime(boolean z10) {
        this.D = z10;
    }
}
