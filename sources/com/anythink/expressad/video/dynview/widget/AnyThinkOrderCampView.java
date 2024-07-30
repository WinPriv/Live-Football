package com.anythink.expressad.video.dynview.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.anythink.core.common.b.n;
import com.anythink.core.common.k.l;
import com.anythink.expressad.foundation.d.c;
import com.anythink.expressad.foundation.h.o;
import com.anythink.expressad.video.dynview.f.b;
import com.anythink.expressad.video.dynview.f.h;
import com.anythink.expressad.video.module.AnythinkBaseView;
import com.anythink.expressad.widget.FeedBackButton;
import com.huawei.hms.ads.gl;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public class AnyThinkOrderCampView extends AnythinkBaseView {

    /* renamed from: n, reason: collision with root package name */
    private AnyThinkOrderCampView f11626n;
    private List<c> o;

    /* renamed from: p, reason: collision with root package name */
    private int f11627p;

    /* renamed from: q, reason: collision with root package name */
    private int f11628q;

    /* renamed from: r, reason: collision with root package name */
    private int f11629r;

    /* renamed from: s, reason: collision with root package name */
    private int f11630s;

    /* renamed from: t, reason: collision with root package name */
    private String f11631t;

    /* renamed from: u, reason: collision with root package name */
    private FeedBackButton f11632u;

    /* renamed from: v, reason: collision with root package name */
    private ImageView f11633v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f11634w;

    /* renamed from: x, reason: collision with root package name */
    private com.anythink.expressad.video.dynview.f.c f11635x;
    private b y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f11636z;

    /* renamed from: com.anythink.expressad.video.dynview.widget.AnyThinkOrderCampView$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass4 implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f11641a;

        public AnonymousClass4(String str) {
            this.f11641a = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            l.a(((AnythinkBaseView) AnyThinkOrderCampView.this).f11685a, this.f11641a);
        }
    }

    public AnyThinkOrderCampView(Context context) {
        super(context);
        this.f11634w = false;
        this.f11635x = new com.anythink.expressad.video.dynview.f.c() { // from class: com.anythink.expressad.video.dynview.widget.AnyThinkOrderCampView.1
            @Override // com.anythink.expressad.video.dynview.f.c
            public final void a(c cVar, int i10) {
                if (cVar != null) {
                    try {
                        AnyThinkOrderCampView.this.setCampaign(cVar);
                        AnyThinkOrderCampView.a(AnyThinkOrderCampView.this, cVar, i10);
                    } catch (Exception e10) {
                        o.d(AnythinkBaseView.TAG, e10.getMessage());
                    }
                }
            }

            @Override // com.anythink.expressad.video.dynview.f.c
            public final void a() {
                AnyThinkOrderCampView.a(AnyThinkOrderCampView.this);
            }
        };
        this.f11636z = false;
    }

    private void e() {
        FeedBackButton feedBackButton = this.f11632u;
        if (feedBackButton == null) {
            return;
        }
        List<c> list = this.o;
        if (list == null) {
            feedBackButton.setVisibility(8);
            return;
        }
        if (list.get(0) == null) {
            this.f11632u.setVisibility(8);
            return;
        }
        if (com.anythink.expressad.foundation.f.b.a().b()) {
            this.f11631t = this.o.get(0).K();
            this.f11686b = this.o.get(0);
            com.anythink.expressad.foundation.f.b.a().a(a3.l.p(new StringBuilder(), this.f11631t, "_2"), new AnonymousClass3());
            com.anythink.expressad.foundation.f.b.a().a(a3.l.p(new StringBuilder(), this.f11631t, "_2"), this.f11686b);
            com.anythink.expressad.foundation.f.b.a().a(a3.l.p(new StringBuilder(), this.f11631t, "_2"), this.f11632u);
            return;
        }
        this.f11632u.setVisibility(8);
    }

    private void f() {
        if (this.f11633v == null) {
            return;
        }
        com.anythink.expressad.foundation.b.a.b().e();
        com.anythink.expressad.d.b.a();
        com.anythink.expressad.d.a b10 = com.anythink.expressad.d.b.b();
        if (b10 != null) {
            String J = b10.J();
            if (TextUtils.isEmpty(J)) {
                this.f11633v.setVisibility(8);
            }
            this.f11633v.setOnClickListener(new AnonymousClass4(J));
            return;
        }
        this.f11633v.setVisibility(8);
    }

    public void createView(final ViewGroup viewGroup) {
        if (this.o == null) {
            b bVar = this.y;
            if (bVar != null) {
                bVar.b();
                return;
            }
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(com.anythink.expressad.video.dynview.a.a.E, this.f11635x);
        new com.anythink.expressad.video.dynview.j.c();
        com.anythink.expressad.video.dynview.c b10 = com.anythink.expressad.video.dynview.j.c.b(n.a().g(), this.o);
        com.anythink.expressad.video.dynview.b.a();
        com.anythink.expressad.video.dynview.b.a(b10, new h() { // from class: com.anythink.expressad.video.dynview.widget.AnyThinkOrderCampView.2
            @Override // com.anythink.expressad.video.dynview.f.h
            public final void a(com.anythink.expressad.video.dynview.a aVar) {
                try {
                    AnyThinkOrderCampView.this.f11626n.addView(aVar.a());
                    AnyThinkOrderCampView.this.f11634w = aVar.c();
                    viewGroup.removeAllViews();
                    viewGroup.addView(AnyThinkOrderCampView.this.f11626n);
                    AnyThinkOrderCampView.this.setViewStatus();
                    if (AnyThinkOrderCampView.this.y != null) {
                        AnyThinkOrderCampView.this.y.a();
                    }
                } catch (Exception e10) {
                    o.d(AnythinkBaseView.TAG, e10.getMessage());
                }
            }

            @Override // com.anythink.expressad.video.dynview.f.h
            public final void a(com.anythink.expressad.video.dynview.c.b bVar2) {
                try {
                    if (AnyThinkOrderCampView.this.y != null) {
                        AnyThinkOrderCampView.this.y.b();
                    }
                } catch (Exception e10) {
                    o.d(AnythinkBaseView.TAG, e10.getMessage());
                }
            }
        }, hashMap);
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public void init(Context context) {
        this.f11626n = this;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f A[SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            java.util.List<com.anythink.expressad.foundation.d.c> r0 = r5.o
            if (r0 != 0) goto L8
            return
        L8:
            r0 = 0
        L9:
            java.util.List<com.anythink.expressad.foundation.d.c> r1 = r5.o
            int r1 = r1.size()
            if (r0 >= r1) goto L32
            r1 = 0
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L1f
            r2.<init>()     // Catch: org.json.JSONException -> L1f
            java.lang.String r1 = "camp_position"
            r2.put(r1, r0)     // Catch: org.json.JSONException -> L1d
            goto L26
        L1d:
            r1 = move-exception
            goto L23
        L1f:
            r2 = move-exception
            r4 = r2
            r2 = r1
            r1 = r4
        L23:
            r1.printStackTrace()
        L26:
            com.anythink.expressad.video.module.a.a r1 = r5.f11689e
            if (r1 == 0) goto L2f
            r3 = 110(0x6e, float:1.54E-43)
            r1.a(r3, r2)
        L2f:
            int r0 = r0 + 1
            goto L9
        L32:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.video.dynview.widget.AnyThinkOrderCampView.onAttachedToWindow():void");
    }

    public void setCampOrderViewBuildCallback(b bVar) {
        this.y = bVar;
    }

    public void setCampaignExes(List<c> list) {
        this.o = list;
    }

    public void setNotchPadding(int i10, int i11, int i12, int i13) {
        this.f11627p = i10;
        this.f11628q = i11;
        this.f11629r = i12;
        this.f11630s = i13;
        setViewStatus();
    }

    public void setRewarded(boolean z10) {
        this.f11636z = z10;
    }

    public void setViewStatus() {
        AnyThinkOrderCampView anyThinkOrderCampView = this.f11626n;
        if (anyThinkOrderCampView != null && this.f11636z) {
            RelativeLayout relativeLayout = (RelativeLayout) anyThinkOrderCampView.findViewById(filterFindViewId(this.f11634w, "anythink_native_order_camp_controller"));
            this.f11632u = (FeedBackButton) this.f11626n.findViewById(filterFindViewId(this.f11634w, "anythink_native_order_camp_feed_btn"));
            this.f11633v = (ImageView) this.f11626n.findViewById(filterFindViewId(this.f11634w, "anythink_iv_link"));
            if (relativeLayout != null) {
                relativeLayout.setPadding(this.f11627p, this.f11629r, this.f11628q, this.f11630s);
            }
            FeedBackButton feedBackButton = this.f11632u;
            if (feedBackButton != null && feedBackButton != null) {
                try {
                    List<c> list = this.o;
                    if (list == null) {
                        feedBackButton.setVisibility(8);
                    } else if (list.get(0) == null) {
                        this.f11632u.setVisibility(8);
                    } else if (com.anythink.expressad.foundation.f.b.a().b()) {
                        this.f11631t = this.o.get(0).K();
                        this.f11686b = this.o.get(0);
                        com.anythink.expressad.foundation.f.b.a().a(this.f11631t + "_2", new AnonymousClass3());
                        com.anythink.expressad.foundation.f.b.a().a(this.f11631t + "_2", this.f11686b);
                        com.anythink.expressad.foundation.f.b.a().a(this.f11631t + "_2", this.f11632u);
                    } else {
                        this.f11632u.setVisibility(8);
                    }
                } catch (Exception e10) {
                    o.d(AnythinkBaseView.TAG, e10.getMessage());
                }
            }
            ImageView imageView = this.f11633v;
            if (imageView != null && imageView != null) {
                try {
                    com.anythink.expressad.foundation.b.a.b().e();
                    com.anythink.expressad.d.b.a();
                    com.anythink.expressad.d.a b10 = com.anythink.expressad.d.b.b();
                    if (b10 != null) {
                        String J = b10.J();
                        if (TextUtils.isEmpty(J)) {
                            this.f11633v.setVisibility(8);
                        }
                        this.f11633v.setOnClickListener(new AnonymousClass4(J));
                        return;
                    }
                    this.f11633v.setVisibility(8);
                } catch (Exception e11) {
                    o.d(AnythinkBaseView.TAG, e11.getMessage());
                }
            }
        }
    }

    public void startAlphaAnimation() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(gl.Code, 1.0f);
        alphaAnimation.setDuration(500L);
        this.f11626n.startAnimation(alphaAnimation);
    }

    public void startTranslateAnimation() {
        TranslateAnimation translateAnimation = new TranslateAnimation(2, 1.0f, 2, gl.Code, 2, gl.Code, 2, gl.Code);
        translateAnimation.setDuration(500L);
        this.f11626n.startAnimation(translateAnimation);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(com.anythink.expressad.foundation.d.c r2, int r3, int r4) {
        /*
            r1 = this;
            if (r2 == 0) goto L1c
            boolean r0 = r2.j()
            if (r0 == 0) goto L1c
            com.anythink.expressad.foundation.d.c$c r2 = r2.M()     // Catch: java.lang.Exception -> L12
            if (r2 == 0) goto L1c
            r2.b()     // Catch: java.lang.Exception -> L12
            goto L1c
        L12:
            r2 = move-exception
            java.lang.String r0 = "AnythinkBaseView"
            java.lang.String r2 = r2.getMessage()
            com.anythink.expressad.foundation.h.o.d(r0, r2)
        L1c:
            r2 = 0
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L33
            r0.<init>()     // Catch: org.json.JSONException -> L33
            java.lang.String r2 = com.anythink.expressad.foundation.g.a.ce     // Catch: org.json.JSONException -> L31
            org.json.JSONObject r3 = r1.a(r3)     // Catch: org.json.JSONException -> L31
            r0.put(r2, r3)     // Catch: org.json.JSONException -> L31
            java.lang.String r2 = "camp_position"
            r0.put(r2, r4)     // Catch: org.json.JSONException -> L31
            goto L39
        L31:
            r2 = move-exception
            goto L36
        L33:
            r3 = move-exception
            r0 = r2
            r2 = r3
        L36:
            r2.printStackTrace()
        L39:
            com.anythink.expressad.video.module.a.a r2 = r1.f11689e
            if (r2 == 0) goto L42
            r3 = 105(0x69, float:1.47E-43)
            r2.a(r3, r0)
        L42:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.video.dynview.widget.AnyThinkOrderCampView.a(com.anythink.expressad.foundation.d.c, int, int):void");
    }

    private void b() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(gl.Code, 1.0f, gl.Code, 1.0f, 2, 0.5f, 2, 0.5f);
        scaleAnimation.setDuration(500L);
        this.f11626n.startAnimation(scaleAnimation);
    }

    public AnyThinkOrderCampView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11634w = false;
        this.f11635x = new com.anythink.expressad.video.dynview.f.c() { // from class: com.anythink.expressad.video.dynview.widget.AnyThinkOrderCampView.1
            @Override // com.anythink.expressad.video.dynview.f.c
            public final void a(c cVar, int i10) {
                if (cVar != null) {
                    try {
                        AnyThinkOrderCampView.this.setCampaign(cVar);
                        AnyThinkOrderCampView.a(AnyThinkOrderCampView.this, cVar, i10);
                    } catch (Exception e10) {
                        o.d(AnythinkBaseView.TAG, e10.getMessage());
                    }
                }
            }

            @Override // com.anythink.expressad.video.dynview.f.c
            public final void a() {
                AnyThinkOrderCampView.a(AnyThinkOrderCampView.this);
            }
        };
        this.f11636z = false;
    }

    private void a() {
        com.anythink.expressad.video.module.a.a aVar = this.f11689e;
        if (aVar != null) {
            aVar.a(104, "");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(com.anythink.expressad.video.dynview.widget.AnyThinkOrderCampView r2, com.anythink.expressad.foundation.d.c r3, int r4) {
        /*
            if (r3 == 0) goto L1c
            boolean r0 = r3.j()
            if (r0 == 0) goto L1c
            com.anythink.expressad.foundation.d.c$c r3 = r3.M()     // Catch: java.lang.Exception -> L12
            if (r3 == 0) goto L1c
            r3.b()     // Catch: java.lang.Exception -> L12
            goto L1c
        L12:
            r3 = move-exception
            java.lang.String r0 = "AnythinkBaseView"
            java.lang.String r3 = r3.getMessage()
            com.anythink.expressad.foundation.h.o.d(r0, r3)
        L1c:
            r3 = 0
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L34
            r0.<init>()     // Catch: org.json.JSONException -> L34
            java.lang.String r3 = com.anythink.expressad.foundation.g.a.ce     // Catch: org.json.JSONException -> L32
            r1 = 0
            org.json.JSONObject r1 = r2.a(r1)     // Catch: org.json.JSONException -> L32
            r0.put(r3, r1)     // Catch: org.json.JSONException -> L32
            java.lang.String r3 = "camp_position"
            r0.put(r3, r4)     // Catch: org.json.JSONException -> L32
            goto L3a
        L32:
            r3 = move-exception
            goto L37
        L34:
            r4 = move-exception
            r0 = r3
            r3 = r4
        L37:
            r3.printStackTrace()
        L3a:
            com.anythink.expressad.video.module.a.a r2 = r2.f11689e
            if (r2 == 0) goto L43
            r3 = 105(0x69, float:1.47E-43)
            r2.a(r3, r0)
        L43:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.video.dynview.widget.AnyThinkOrderCampView.a(com.anythink.expressad.video.dynview.widget.AnyThinkOrderCampView, com.anythink.expressad.foundation.d.c, int):void");
    }

    /* renamed from: com.anythink.expressad.video.dynview.widget.AnyThinkOrderCampView$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass3 implements com.anythink.expressad.foundation.f.a {
        public AnonymousClass3() {
        }

        @Override // com.anythink.expressad.foundation.f.a
        public final void a() {
        }

        @Override // com.anythink.expressad.foundation.f.a
        public final void b() {
        }

        @Override // com.anythink.expressad.foundation.f.a
        public final void c() {
        }
    }

    public static /* synthetic */ void a(AnyThinkOrderCampView anyThinkOrderCampView) {
        com.anythink.expressad.video.module.a.a aVar = anyThinkOrderCampView.f11689e;
        if (aVar != null) {
            aVar.a(104, "");
        }
    }
}
