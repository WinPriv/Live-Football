package com.anythink.expressad.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.anythink.expressad.foundation.g.d.b;
import com.anythink.expressad.foundation.g.d.c;
import com.anythink.expressad.foundation.h.s;

/* loaded from: classes.dex */
public class ATAdChoice extends ATImageView {

    /* renamed from: a, reason: collision with root package name */
    private static String f12504a = "ATAdChoice";

    /* renamed from: b, reason: collision with root package name */
    private String f12505b;

    /* renamed from: c, reason: collision with root package name */
    private String f12506c;

    /* renamed from: d, reason: collision with root package name */
    private String f12507d;

    /* renamed from: e, reason: collision with root package name */
    private Context f12508e;

    /* renamed from: com.anythink.expressad.widget.ATAdChoice$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass1 implements c {
        public AnonymousClass1() {
        }

        @Override // com.anythink.expressad.foundation.g.d.c
        public final void a(String str, String str2) {
        }

        @Override // com.anythink.expressad.foundation.g.d.c
        public final void a(Bitmap bitmap, String str) {
            ATAdChoice.this.setImageBitmap(bitmap);
        }
    }

    public ATAdChoice(Context context) {
        super(context);
        this.f12505b = "";
        this.f12506c = "";
        this.f12507d = "";
        this.f12508e = context;
        a();
    }

    private void a() {
        setScaleType(ImageView.ScaleType.FIT_CENTER);
        setClickable(true);
    }

    private void b() {
        Context context = this.f12508e;
        if (context != null) {
            b.a(context).a(this.f12505b, new AnonymousClass1());
        }
    }

    private void c() {
        if (!TextUtils.isEmpty(this.f12507d)) {
            s.a(this.f12508e, this.f12507d, null);
        }
    }

    @Override // android.view.View
    public boolean performClick() {
        if (!TextUtils.isEmpty(this.f12507d)) {
            s.a(this.f12508e, this.f12507d, null);
            return true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0073, code lost:
    
        if (android.text.TextUtils.isEmpty(r4.I()) == false) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setCampaign(com.anythink.expressad.out.j r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof com.anythink.expressad.foundation.d.c
            if (r0 == 0) goto L91
            com.anythink.expressad.foundation.d.c r4 = (com.anythink.expressad.foundation.d.c) r4
            r0 = 1
            r1 = 0
            if (r4 == 0) goto L40
            com.anythink.expressad.foundation.d.c$a r2 = r4.v()
            if (r2 == 0) goto L40
            com.anythink.expressad.foundation.d.c$a r2 = r4.v()
            java.lang.String r2 = r2.c()
            r3.f12505b = r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L40
            com.anythink.expressad.foundation.d.c$a r2 = r4.v()
            java.lang.String r2 = r2.b()
            r3.f12507d = r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L40
            com.anythink.expressad.foundation.d.c$a r4 = r4.v()
            java.lang.String r4 = r4.d()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L40
            r4 = r0
            goto L41
        L40:
            r4 = r1
        L41:
            if (r4 != 0) goto L78
            com.anythink.expressad.d.b.a()
            com.anythink.expressad.foundation.b.a r4 = com.anythink.expressad.foundation.b.a.b()
            r4.e()
            com.anythink.expressad.d.a r4 = com.anythink.expressad.d.b.b()
            if (r4 == 0) goto L76
            java.lang.String r2 = r4.H()
            r3.f12505b = r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L76
            java.lang.String r2 = r4.J()
            r3.f12507d = r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L76
            java.lang.String r4 = r4.I()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L76
            goto L77
        L76:
            r0 = r1
        L77:
            r4 = r0
        L78:
            java.lang.String r0 = r3.f12505b
            r3.setImageUrl(r0)
            if (r4 == 0) goto L91
            android.content.Context r4 = r3.f12508e
            if (r4 == 0) goto L91
            com.anythink.expressad.foundation.g.d.b r4 = com.anythink.expressad.foundation.g.d.b.a(r4)
            java.lang.String r0 = r3.f12505b
            com.anythink.expressad.widget.ATAdChoice$1 r1 = new com.anythink.expressad.widget.ATAdChoice$1
            r1.<init>()
            r4.a(r0, r1)
        L91:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.widget.ATAdChoice.setCampaign(com.anythink.expressad.out.j):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006d, code lost:
    
        if (android.text.TextUtils.isEmpty(r4.I()) == false) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean a(com.anythink.expressad.foundation.d.c r4) {
        /*
            r3 = this;
            r0 = 1
            r1 = 0
            if (r4 == 0) goto L3a
            com.anythink.expressad.foundation.d.c$a r2 = r4.v()
            if (r2 == 0) goto L3a
            com.anythink.expressad.foundation.d.c$a r2 = r4.v()
            java.lang.String r2 = r2.c()
            r3.f12505b = r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L3a
            com.anythink.expressad.foundation.d.c$a r2 = r4.v()
            java.lang.String r2 = r2.b()
            r3.f12507d = r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L3a
            com.anythink.expressad.foundation.d.c$a r4 = r4.v()
            java.lang.String r4 = r4.d()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L3a
            r4 = r0
            goto L3b
        L3a:
            r4 = r1
        L3b:
            if (r4 != 0) goto L72
            com.anythink.expressad.d.b.a()
            com.anythink.expressad.foundation.b.a r4 = com.anythink.expressad.foundation.b.a.b()
            r4.e()
            com.anythink.expressad.d.a r4 = com.anythink.expressad.d.b.b()
            if (r4 == 0) goto L70
            java.lang.String r2 = r4.H()
            r3.f12505b = r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L70
            java.lang.String r2 = r4.J()
            r3.f12507d = r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L70
            java.lang.String r4 = r4.I()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L70
            goto L71
        L70:
            r0 = r1
        L71:
            r4 = r0
        L72:
            java.lang.String r0 = r3.f12505b
            r3.setImageUrl(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.widget.ATAdChoice.a(com.anythink.expressad.foundation.d.c):boolean");
    }

    public ATAdChoice(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12505b = "";
        this.f12506c = "";
        this.f12507d = "";
        this.f12508e = context;
        a();
    }

    public ATAdChoice(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f12505b = "";
        this.f12506c = "";
        this.f12507d = "";
        this.f12508e = context;
        a();
    }
}
