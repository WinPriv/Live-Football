package com.huawei.hms.ads;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.huawei.hms.ads.annotation.GlobalApi;
import gb.r0;

@GlobalApi
/* loaded from: classes2.dex */
public class AdSize {

    @GlobalApi
    public static final AdSize AD_SIZE_SMART = new AdSize(-1, -2);
    protected static final int B = -5;
    protected static final int Code = -1;
    private static final int D = -1;
    protected static final int I = -4;
    private static final float L = 10.0f;
    protected static final int V = -3;
    protected static final int Z = -2;
    protected final int C;
    protected int F = 0;
    protected final int S;

    /* loaded from: classes2.dex */
    public interface a {
        public static final int Code = 0;
        public static final int V = 1;
    }

    @GlobalApi
    public AdSize(int i10, int i11) {
        if (Code(i10) && V(i11)) {
            this.C = i10;
            this.S = i11;
        } else {
            this.C = 0;
            this.S = 0;
        }
    }

    private boolean I(Context context) {
        if (this.F == 1) {
            int widthPx = getWidthPx(context);
            int heightPx = getHeightPx(context);
            if (heightPx != 0 && widthPx / heightPx > L) {
                return true;
            }
        }
        return false;
    }

    public int Code(Context context) {
        if (!I(context)) {
            return getHeightPx(context);
        }
        int widthPx = getWidthPx(context);
        int i10 = gb.z.f28648a;
        int e10 = r0.e(context, widthPx);
        if (e10 == 0) {
            return 0;
        }
        return r0.i(context, e10 <= 432 ? 50 : e10 <= 632 ? 60 : 90);
    }

    public int V(Context context) {
        if (!I(context)) {
            return getWidthPx(context);
        }
        int widthPx = getWidthPx(context);
        int i10 = gb.z.f28648a;
        int e10 = r0.e(context, widthPx);
        if (e10 == 0) {
            return 0;
        }
        return r0.i(context, e10 <= 432 ? 320 : e10 <= 632 ? 468 : 728);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AdSize)) {
            return false;
        }
        AdSize adSize = (AdSize) obj;
        if (this.C != adSize.C || this.S != adSize.S || this.F != adSize.F) {
            return false;
        }
        return true;
    }

    @GlobalApi
    public int getHeight() {
        return this.S;
    }

    public int getHeightPx(Context context) {
        int i10;
        if (!V(this.S)) {
            return -1;
        }
        int i11 = this.S;
        int i12 = 0;
        if (i11 == -2) {
            int i13 = gb.z.f28648a;
            if (context == null) {
                return 0;
            }
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            float f = displayMetrics.heightPixels;
            float f10 = displayMetrics.density;
            int i14 = (int) (f / f10);
            if (i14 > 720) {
                i10 = 90;
            } else if (i14 > 400) {
                i10 = 50;
            } else {
                i10 = 32;
            }
            return (int) (i10 * f10);
        }
        if (i11 == -5) {
            int i15 = gb.z.f28648a;
            if (context == null) {
                return 0;
            }
            if (gb.z.b(context).density != gl.Code) {
                int e10 = r0.e(context, r0.widthPixels);
                int j10 = gb.z.j(0, context);
                if (e10 != 0 && j10 != 0) {
                    i12 = gb.z.c(e10, j10);
                }
            }
            return r0.i(context, i12);
        }
        return (int) TypedValue.applyDimension(1, i11, gb.z.b(context));
    }

    @GlobalApi
    public int getWidth() {
        return this.C;
    }

    public int getWidthPx(Context context) {
        if (!Code(this.C)) {
            return -1;
        }
        int i10 = this.C;
        if (i10 == -1) {
            return gb.z.h(context);
        }
        return (int) TypedValue.applyDimension(1, i10, gb.z.b(context));
    }

    public int hashCode() {
        int i10;
        int i11;
        int i12 = -1;
        if (Code(this.C)) {
            i10 = Integer.valueOf(this.C).hashCode();
        } else {
            i10 = -1;
        }
        if (V(this.S)) {
            i11 = Integer.valueOf(this.S).hashCode();
        } else {
            i11 = -1;
        }
        int i13 = this.F;
        if (i13 == 0 || i13 == 1) {
            i12 = Integer.valueOf(i13).hashCode();
        }
        return i10 & super.hashCode() & i11 & i12;
    }

    public static boolean Code(int i10) {
        return i10 > 0 || i10 == -1 || i10 == -3;
    }

    public static boolean V(int i10) {
        return i10 > 0 || i10 == -2 || i10 == -4 || i10 == -5;
    }
}
