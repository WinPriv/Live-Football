package com.anythink.expressad.foundation.f.a;

import a3.l;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import com.anythink.core.common.b.n;
import com.anythink.expressad.d.a;
import com.anythink.expressad.foundation.d.c;
import com.anythink.expressad.foundation.h.o;
import com.anythink.expressad.widget.FeedBackButton;
import com.anythink.expressad.widget.FeedbackRadioGroup;
import com.anythink.expressad.widget.a.b;
import com.huawei.hms.ads.gl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: n, reason: collision with root package name */
    private static int f9732n = -1;

    /* renamed from: s, reason: collision with root package name */
    private static String f9733s;

    /* renamed from: a, reason: collision with root package name */
    private String f9734a;

    /* renamed from: b, reason: collision with root package name */
    private c f9735b;

    /* renamed from: c, reason: collision with root package name */
    private FeedBackButton f9736c;

    /* renamed from: d, reason: collision with root package name */
    private int f9737d;

    /* renamed from: e, reason: collision with root package name */
    private int f9738e;

    /* renamed from: j, reason: collision with root package name */
    private String f9742j;

    /* renamed from: k, reason: collision with root package name */
    private String f9743k;

    /* renamed from: p, reason: collision with root package name */
    private com.anythink.expressad.widget.a.c f9746p;

    /* renamed from: q, reason: collision with root package name */
    private List<C0120a> f9747q;
    private int f = -1;

    /* renamed from: g, reason: collision with root package name */
    private int f9739g = -1;

    /* renamed from: h, reason: collision with root package name */
    private int f9740h = -1;

    /* renamed from: i, reason: collision with root package name */
    private int f9741i = -1;

    /* renamed from: l, reason: collision with root package name */
    private float f9744l = 1.0f;

    /* renamed from: m, reason: collision with root package name */
    private int f9745m = l.f(20.0f);
    private int o = f9732n;

    /* renamed from: r, reason: collision with root package name */
    private b f9748r = new b() { // from class: com.anythink.expressad.foundation.f.a.a.1
        @Override // com.anythink.expressad.widget.a.b
        public final void a() {
            a.a(a.this);
        }

        @Override // com.anythink.expressad.widget.a.b
        public final void b() {
            a.b(a.this);
        }

        @Override // com.anythink.expressad.widget.a.b
        public final void c() {
            a.c(a.this);
        }
    };

    public a(String str) {
        this.f9747q = new ArrayList();
        this.f9734a = str;
        if (this.f9747q == null) {
            this.f9747q = new ArrayList();
        }
        g();
        n();
        h();
    }

    private void g() {
        if (this.f9748r == null) {
            this.f9748r = new b() { // from class: com.anythink.expressad.foundation.f.a.a.2
                @Override // com.anythink.expressad.widget.a.b
                public final void a() {
                    a.a(a.this);
                }

                @Override // com.anythink.expressad.widget.a.b
                public final void b() {
                    a.b(a.this);
                }

                @Override // com.anythink.expressad.widget.a.b
                public final void c() {
                    a.c(a.this);
                }
            };
        }
    }

    private void h() {
        boolean z10;
        try {
            com.anythink.expressad.foundation.f.b.a();
            if (com.anythink.expressad.foundation.f.b.a(n.a().g()) != null) {
                com.anythink.expressad.d.b.a();
                com.anythink.expressad.foundation.b.a.b().e();
                com.anythink.expressad.d.a b10 = com.anythink.expressad.d.b.b();
                if (b10 == null) {
                    com.anythink.expressad.d.b.a();
                    b10 = com.anythink.expressad.d.b.c();
                }
                a.b L = b10.L();
                if (L == null) {
                    o.b("", "feedback fbk is null");
                    return;
                }
                g();
                com.anythink.expressad.foundation.f.b.a();
                this.f9746p = new com.anythink.expressad.widget.a.c(com.anythink.expressad.foundation.f.b.a(n.a().g()), this.f9748r);
                FeedbackRadioGroup a10 = a(L);
                this.f9746p.c(L.c());
                this.f9746p.b(L.b());
                this.f9746p.a(L.a());
                this.f9746p.a(a10);
                com.anythink.expressad.widget.a.c cVar = this.f9746p;
                if (!TextUtils.isEmpty(f9733s)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                cVar.a(z10);
                a(a10, L);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void i() {
        List<C0120a> list = this.f9747q;
        if (list != null) {
            for (C0120a c0120a : list) {
                if (c0120a != null) {
                    c0120a.b();
                }
            }
        }
        f9733s = "";
    }

    private void j() {
        List<C0120a> list = this.f9747q;
        if (list != null) {
            for (C0120a c0120a : list) {
                if (c0120a != null) {
                    c0120a.a();
                }
            }
        }
        f9733s = "";
    }

    private void k() {
        List<C0120a> list = this.f9747q;
        if (list != null) {
            Iterator<C0120a> it = list.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    private String l() {
        return this.f9734a;
    }

    private void m() {
        boolean z10;
        FeedBackButton feedBackButton = this.f9736c;
        if (feedBackButton != null) {
            int i10 = this.f;
            if (i10 >= 0) {
                feedBackButton.setX(i10);
            }
            int i11 = this.f9739g;
            if (i11 >= 0) {
                this.f9736c.setY(i11);
            }
            float f = this.f9744l;
            if (f >= gl.Code) {
                this.f9736c.setAlpha(f);
                FeedBackButton feedBackButton2 = this.f9736c;
                if (this.f9744l != gl.Code) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                feedBackButton2.setEnabled(z10);
            }
            ViewGroup.LayoutParams layoutParams = this.f9736c.getLayoutParams();
            int i12 = this.f9740h;
            if (i12 > 0) {
                this.f9736c.setWidth(i12);
                if (layoutParams != null) {
                    layoutParams.width = this.f9740h;
                }
            }
            int i13 = this.f9741i;
            if (i13 > 0) {
                this.f9736c.setHeight(i13);
                if (layoutParams != null) {
                    layoutParams.height = this.f9741i;
                }
            }
            if (layoutParams != null) {
                this.f9736c.setLayoutParams(layoutParams);
            }
            try {
                if (!TextUtils.isEmpty(this.f9742j)) {
                    this.f9736c.setTextColor(Color.parseColor(this.f9742j));
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            int i14 = this.f9745m;
            if (i14 > 0) {
                gradientDrawable.setCornerRadius(i14);
            }
            if (!TextUtils.isEmpty(this.f9743k)) {
                gradientDrawable.setColor(Color.parseColor(this.f9743k));
            } else {
                gradientDrawable.setColor(Color.parseColor(FeedBackButton.FEEDBACK_BTN_BACKGROUND_COLOR_STR));
            }
            try {
                this.f9736c.setBackgroundDrawable(gradientDrawable);
            } catch (Throwable unused) {
            }
        }
    }

    private void n() {
        Context g6 = n.a().g();
        if (g6 != null) {
            try {
                FeedBackButton feedBackButton = new FeedBackButton(g6);
                this.f9736c = feedBackButton;
                int i10 = 8;
                if (this.o != 8) {
                    i10 = 0;
                }
                feedBackButton.setVisibility(i10);
                this.f9736c.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.foundation.f.a.a.4
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        a.this.a();
                    }
                });
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    private int o() {
        return this.f9737d;
    }

    private int p() {
        return this.f9738e;
    }

    public final void b() {
        com.anythink.expressad.widget.a.c cVar = this.f9746p;
        if (cVar == null || !cVar.isShowing()) {
            return;
        }
        this.f9746p.cancel();
    }

    public final FeedBackButton c() {
        if (this.f9736c == null) {
            n();
        }
        return this.f9736c;
    }

    public final c e() {
        return this.f9735b;
    }

    public final void a() {
        com.anythink.expressad.foundation.f.b.a();
        Activity a10 = com.anythink.expressad.foundation.f.b.a(n.a().g());
        com.anythink.expressad.widget.a.c cVar = this.f9746p;
        if (cVar == null || cVar.getContext() != a10) {
            h();
        }
        Context g6 = n.a().g();
        FeedBackButton feedBackButton = this.f9736c;
        if (feedBackButton != null) {
            g6 = feedBackButton.getContext();
        }
        com.anythink.expressad.foundation.f.b.a();
        boolean a11 = com.anythink.expressad.foundation.f.b.a(g6, this.f9746p);
        List<C0120a> list = this.f9747q;
        if (list != null) {
            for (C0120a c0120a : list) {
                if (c0120a != null) {
                    c0120a.a(a11);
                }
            }
        }
    }

    public final void d() {
        FeedBackButton feedBackButton = this.f9736c;
        if (feedBackButton != null) {
            feedBackButton.setOnClickListener(null);
            this.f9736c.setVisibility(8);
            ViewGroup viewGroup = (ViewGroup) this.f9736c.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.f9736c);
            }
        }
        com.anythink.expressad.widget.a.c cVar = this.f9746p;
        if (cVar != null) {
            cVar.a((b) null);
        }
        this.f9746p = null;
        this.f9747q = null;
        this.f9736c = null;
        this.f9748r = null;
    }

    /* renamed from: com.anythink.expressad.foundation.f.a.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0120a implements b {

        /* renamed from: a, reason: collision with root package name */
        private com.anythink.expressad.foundation.f.a f9754a;

        /* renamed from: b, reason: collision with root package name */
        private String f9755b;

        public C0120a(String str, com.anythink.expressad.foundation.f.a aVar) {
            this.f9754a = aVar;
            this.f9755b = str;
        }

        @Override // com.anythink.expressad.widget.a.b
        public final void a() {
            com.anythink.expressad.foundation.f.b.f9758c = false;
            com.anythink.expressad.foundation.f.a aVar = this.f9754a;
            if (aVar != null) {
                String unused = a.f9733s;
                aVar.c();
            }
        }

        @Override // com.anythink.expressad.widget.a.b
        public final void b() {
            com.anythink.expressad.foundation.f.b.f9758c = false;
            com.anythink.expressad.foundation.f.a aVar = this.f9754a;
            if (aVar != null) {
                aVar.b();
            }
        }

        public final void a(boolean z10) {
            com.anythink.expressad.foundation.f.b.f9758c = true;
            com.anythink.expressad.foundation.f.a aVar = this.f9754a;
            if (aVar == null || !z10) {
                return;
            }
            aVar.a();
        }

        @Override // com.anythink.expressad.widget.a.b
        public final void c() {
        }
    }

    private void b(C0120a c0120a) {
        List<C0120a> list = this.f9747q;
        if (list != null) {
            list.remove(c0120a);
        }
    }

    public final void c(int i10) {
        this.f9738e = i10;
    }

    public static /* synthetic */ void c(a aVar) {
        List<C0120a> list = aVar.f9747q;
        if (list != null) {
            Iterator<C0120a> it = list.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    public final void b(int i10) {
        this.f9737d = i10;
    }

    public static /* synthetic */ void b(a aVar) {
        List<C0120a> list = aVar.f9747q;
        if (list != null) {
            for (C0120a c0120a : list) {
                if (c0120a != null) {
                    c0120a.b();
                }
            }
        }
        f9733s = "";
    }

    public final void a(int i10) {
        this.o = i10;
        FeedBackButton feedBackButton = this.f9736c;
        if (feedBackButton != null) {
            feedBackButton.setVisibility(i10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(com.anythink.expressad.widget.FeedbackRadioGroup r12, com.anythink.expressad.d.a.b r13) {
        /*
            r11 = this;
            org.json.JSONArray r13 = r13.d()
            com.anythink.core.common.b.n r0 = com.anythink.core.common.b.n.a()
            android.content.Context r0 = r0.g()
            if (r13 == 0) goto L7e
            int r1 = r13.length()
            if (r1 <= 0) goto L7e
            if (r0 == 0) goto L7e
            java.lang.String r1 = "anythink_cm_feedback_choice_btn_bg"
            java.lang.String r2 = "drawable"
            int r1 = com.anythink.expressad.foundation.h.i.a(r0, r1, r2)
            android.content.res.Resources r2 = com.anythink.expressad.foundation.h.i.a(r0)
            java.lang.String r3 = "anythink_cm_feedback_rb_text_color_color_list"
            java.lang.String r4 = "color"
            int r3 = com.anythink.expressad.foundation.h.i.a(r0, r3, r4)
            r4 = 0
            if (r2 == 0) goto L36
            android.content.res.ColorStateList r2 = r2.getColorStateList(r3)     // Catch: java.lang.Exception -> L32
            goto L37
        L32:
            r2 = move-exception
            r2.printStackTrace()
        L36:
            r2 = r4
        L37:
            r3 = 1096810496(0x41600000, float:14.0)
            int r3 = com.anythink.expressad.foundation.h.t.b(r0, r3)
            r5 = 1088421888(0x40e00000, float:7.0)
            int r5 = com.anythink.expressad.foundation.h.t.b(r0, r5)
            r6 = 1086324736(0x40c00000, float:6.0)
            int r6 = com.anythink.expressad.foundation.h.t.b(r0, r6)
            r7 = 0
        L4a:
            int r8 = r13.length()
            if (r7 >= r8) goto L7e
            java.lang.String r8 = r13.optString(r7)
            android.widget.RadioButton r9 = new android.widget.RadioButton
            r9.<init>(r0)
            r9.setButtonDrawable(r4)
            r9.setBackgroundResource(r1)
            r9.setText(r8)
            if (r2 == 0) goto L67
            r9.setTextColor(r2)
        L67:
            r9.setPadding(r3, r5, r3, r5)
            android.widget.RadioGroup$LayoutParams r8 = new android.widget.RadioGroup$LayoutParams
            r10 = -2
            r8.<init>(r10, r10)
            int r10 = r6 / 4
            r8.setMargins(r6, r10, r6, r10)
            r11.a(r9)
            r12.addView(r9, r8)
            int r7 = r7 + 1
            goto L4a
        L7e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.foundation.f.a.a.a(com.anythink.expressad.widget.FeedbackRadioGroup, com.anythink.expressad.d.a$b):void");
    }

    private static FeedbackRadioGroup a(a.b bVar) {
        JSONArray d10 = bVar.d();
        Context g6 = n.a().g();
        if (d10 == null || d10.length() <= 0 || g6 == null) {
            return null;
        }
        FeedbackRadioGroup feedbackRadioGroup = new FeedbackRadioGroup(g6);
        feedbackRadioGroup.setOrientation(0);
        return feedbackRadioGroup;
    }

    private void a(RadioButton radioButton) {
        radioButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.anythink.expressad.foundation.f.a.a.3
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                if (z10) {
                    String unused = a.f9733s = (String) compoundButton.getText();
                }
                if (a.this.f9746p != null) {
                    a.this.f9746p.a(!TextUtils.isEmpty(a.f9733s));
                }
            }
        });
    }

    public final void a(C0120a c0120a) {
        if (this.f9747q == null) {
            this.f9747q = new ArrayList();
        }
        this.f9747q.add(c0120a);
    }

    private void a(boolean z10) {
        List<C0120a> list = this.f9747q;
        if (list != null) {
            for (C0120a c0120a : list) {
                if (c0120a != null) {
                    c0120a.a(z10);
                }
            }
        }
    }

    public final void a(int i10, int i11, int i12, int i13, int i14, float f, String str, String str2) {
        this.f = i10;
        this.f9739g = i11;
        this.f9740h = i12;
        this.f9741i = i13;
        this.f9742j = str;
        this.f9743k = str2;
        this.f9744l = f;
        this.f9745m = i14;
        m();
    }

    public final void a(c cVar) {
        this.f9735b = cVar;
    }

    public final void a(FeedBackButton feedBackButton) {
        FeedBackButton feedBackButton2 = this.f9736c;
        if (feedBackButton2 != null) {
            feedBackButton2.setVisibility(8);
        }
        if (feedBackButton != null) {
            feedBackButton.setAlpha(this.f9744l);
            feedBackButton.setEnabled(this.f9744l != gl.Code);
            feedBackButton.setVisibility(this.o != 8 ? 0 : 8);
            this.f9736c = feedBackButton;
            c cVar = this.f9735b;
            if (cVar != null && !cVar.j()) {
                m();
            }
            feedBackButton.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.foundation.f.a.a.5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    a.this.a();
                }
            });
        }
    }

    public static /* synthetic */ void a(a aVar) {
        List<C0120a> list = aVar.f9747q;
        if (list != null) {
            for (C0120a c0120a : list) {
                if (c0120a != null) {
                    c0120a.a();
                }
            }
        }
        f9733s = "";
    }
}
