package com.facebook.ads.redexgen.X;

import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.Op, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1118Op extends RelativeLayout {
    public static String[] A03 = {"Z7YDROQZDOzGgLZ6JRzm0VB6SZj4zDor", "PEDxZ1hmcJv2HtokqPZuboN03zqPqfuu", "ZN3aiXgGzfL", "UoQOzdqMFdmvRVk6jZTbQbhJ01APWmUd", "BWydKlRDXGFiivyHlYlBLR13h8bygoZy", "calSGpe10AH6YV6oPZJsWkhcYoOFDSm8", "CqyCvSup05V", "6oqVw1T1HmkJfSZKyFG8rr7XXeYSScI0"};

    @Nullable
    public C6Z A00;
    public WeakReference<InterfaceC1117Oo> A01;
    public final InterfaceC1132Pd A02;

    public C1118Op(C1316Wj c1316Wj, InterfaceC1132Pd interfaceC1132Pd) {
        super(c1316Wj);
        this.A02 = interfaceC1132Pd;
        LE.A0J((View) this.A02);
        addView(this.A02.getView(), new RelativeLayout.LayoutParams(-1, -1));
    }

    public final void A00(M1 m12) {
        addView(m12, new RelativeLayout.LayoutParams(-1, -1));
        this.A00 = (C6Z) m12;
    }

    public final void A01(M1 m12) {
        LE.A0J(m12);
        this.A00 = null;
    }

    public final boolean A02() {
        return this.A02.A84();
    }

    public int getCurrentPosition() {
        return this.A02.getCurrentPosition();
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        ((View) this.A02).layout(0, 0, getWidth(), getHeight());
        C6Z c6z = this.A00;
        if (c6z != null) {
            c6z.layout(0, 0, getWidth(), getHeight());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00a4, code lost:
    
        if (r6 > r5) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a6, code lost:
    
        r4 = (r0 * r8) / r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00aa, code lost:
    
        if (r6 > r5) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e0, code lost:
    
        if (r5 == Integer.MIN_VALUE) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e2, code lost:
    
        if (r0 <= r6) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e4, code lost:
    
        r0 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e7, code lost:
    
        if (r5 == Integer.MIN_VALUE) goto L43;
     */
    @Override // android.widget.RelativeLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r12, int r13) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1118Op.onMeasure(int, int):void");
    }

    public void setViewImplInflationListener(InterfaceC1117Oo interfaceC1117Oo) {
        this.A01 = new WeakReference<>(interfaceC1117Oo);
    }
}
