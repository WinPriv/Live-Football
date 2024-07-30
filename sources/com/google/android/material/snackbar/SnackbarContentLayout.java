package com.google.android.material.snackbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.hamkho.livefoot.R;
import java.util.WeakHashMap;
import n0.c0;
import n0.l0;
import w6.a;

/* loaded from: classes2.dex */
public class SnackbarContentLayout extends LinearLayout {

    /* renamed from: s, reason: collision with root package name */
    public TextView f21011s;

    /* renamed from: t, reason: collision with root package name */
    public Button f21012t;

    /* renamed from: u, reason: collision with root package name */
    public int f21013u;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a.d(context, R.attr.motionEasingEmphasizedInterpolator, h6.a.f28769b);
    }

    public final boolean a(int i10, int i11, int i12) {
        boolean z10;
        if (i10 != getOrientation()) {
            setOrientation(i10);
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f21011s.getPaddingTop() == i11 && this.f21011s.getPaddingBottom() == i12) {
            return z10;
        }
        TextView textView = this.f21011s;
        WeakHashMap<View, l0> weakHashMap = c0.f33054a;
        if (c0.e.g(textView)) {
            c0.e.k(textView, c0.e.f(textView), i11, c0.e.e(textView), i12);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i11, textView.getPaddingRight(), i12);
        return true;
    }

    public Button getActionView() {
        return this.f21012t;
    }

    public TextView getMessageView() {
        return this.f21011s;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f21011s = (TextView) findViewById(R.id.snackbar_text);
        this.f21012t = (Button) findViewById(R.id.snackbar_action);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
    
        if (a(1, r0, r0 - r2) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
    
        if (r1 == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
    
        super.onMeasure(r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0054, code lost:
    
        if (a(0, r0, r0) != false) goto L26;
     */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            super.onMeasure(r8, r9)
            int r0 = r7.getOrientation()
            r1 = 1
            if (r0 != r1) goto Lb
            return
        Lb:
            android.content.res.Resources r0 = r7.getResources()
            r2 = 2131165400(0x7f0700d8, float:1.7945016E38)
            int r0 = r0.getDimensionPixelSize(r2)
            android.content.res.Resources r2 = r7.getResources()
            r3 = 2131165399(0x7f0700d7, float:1.7945014E38)
            int r2 = r2.getDimensionPixelSize(r3)
            android.widget.TextView r3 = r7.f21011s
            android.text.Layout r3 = r3.getLayout()
            r4 = 0
            if (r3 == 0) goto L32
            int r3 = r3.getLineCount()
            if (r3 <= r1) goto L32
            r3 = r1
            goto L33
        L32:
            r3 = r4
        L33:
            if (r3 == 0) goto L4c
            int r5 = r7.f21013u
            if (r5 <= 0) goto L4c
            android.widget.Button r5 = r7.f21012t
            int r5 = r5.getMeasuredWidth()
            int r6 = r7.f21013u
            if (r5 <= r6) goto L4c
            int r2 = r0 - r2
            boolean r0 = r7.a(r1, r0, r2)
            if (r0 == 0) goto L57
            goto L58
        L4c:
            if (r3 == 0) goto L4f
            goto L50
        L4f:
            r0 = r2
        L50:
            boolean r0 = r7.a(r4, r0, r0)
            if (r0 == 0) goto L57
            goto L58
        L57:
            r1 = r4
        L58:
            if (r1 == 0) goto L5d
            super.onMeasure(r8, r9)
        L5d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.SnackbarContentLayout.onMeasure(int, int):void");
    }

    public void setMaxInlineActionWidth(int i10) {
        this.f21013u = i10;
    }
}
