package com.anythink.expressad.video.module;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.anythink.expressad.foundation.d.c;
import com.anythink.expressad.foundation.g.a;
import com.anythink.expressad.foundation.h.o;
import com.anythink.expressad.video.dynview.f.h;
import com.anythink.expressad.video.module.a.a.e;
import com.anythink.expressad.video.signal.f;
import com.anythink.expressad.video.signal.factory.b;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AnythinkClickCTAView extends AnythinkBaseView implements f {

    /* renamed from: n, reason: collision with root package name */
    private static final String f11697n = "anythink_reward_clickable_cta";
    private ViewGroup o;

    /* renamed from: p, reason: collision with root package name */
    private ImageView f11698p;

    /* renamed from: q, reason: collision with root package name */
    private TextView f11699q;

    /* renamed from: r, reason: collision with root package name */
    private TextView f11700r;

    /* renamed from: s, reason: collision with root package name */
    private TextView f11701s;

    /* renamed from: t, reason: collision with root package name */
    private String f11702t;

    /* renamed from: u, reason: collision with root package name */
    private float f11703u;

    /* renamed from: v, reason: collision with root package name */
    private float f11704v;

    /* renamed from: w, reason: collision with root package name */
    private int f11705w;

    /* renamed from: x, reason: collision with root package name */
    private ObjectAnimator f11706x;

    public AnythinkClickCTAView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        ImageView imageView = this.f11698p;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    private void e() {
        setWrapContent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean f() {
        this.o = (ViewGroup) findViewById(findID("anythink_viewgroup_ctaroot"));
        this.f11698p = (ImageView) findViewById(findID("anythink_iv_appicon"));
        this.f11699q = (TextView) findViewById(findID("anythink_tv_title"));
        TextView textView = (TextView) findViewById(findID("anythink_tv_install"));
        this.f11701s = textView;
        return isNotNULL(this.o, this.f11698p, this.f11699q, textView);
    }

    private void g() {
        JSONObject jSONObject;
        JSONException e10;
        c cVar = this.f11686b;
        if (cVar != null) {
            cVar.j();
        }
        try {
            jSONObject = new JSONObject();
            try {
                jSONObject.put(a.ce, a(0));
            } catch (JSONException e11) {
                e10 = e11;
                e10.printStackTrace();
                this.f11689e.a(105, jSONObject);
            }
        } catch (JSONException e12) {
            jSONObject = null;
            e10 = e12;
        }
        this.f11689e.a(105, jSONObject);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ObjectAnimator objectAnimator = this.f11706x;
        if (objectAnimator != null) {
            try {
                objectAnimator.start();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ObjectAnimator objectAnimator = this.f11706x;
        if (objectAnimator != null) {
            try {
                objectAnimator.cancel();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f11703u = motionEvent.getRawX();
        this.f11704v = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public void onSelfConfigurationChanged(Configuration configuration) {
        super.onSelfConfigurationChanged(configuration);
        this.f11705w = configuration.orientation;
    }

    @Override // com.anythink.expressad.video.signal.f
    public void preLoadData(b bVar) {
        c cVar = this.f11686b;
        if (cVar != null) {
            if (cVar.j()) {
                c cVar2 = this.f11686b;
                new com.anythink.expressad.video.dynview.j.c();
                com.anythink.expressad.video.dynview.c b10 = com.anythink.expressad.video.dynview.j.c.b(this, cVar2);
                com.anythink.expressad.video.dynview.b.a();
                com.anythink.expressad.video.dynview.b.a(b10, new AnonymousClass1(this));
            } else {
                int findLayout = findLayout(f11697n);
                if (findLayout >= 0) {
                    this.f11687c.inflate(findLayout, this);
                    this.f = f();
                    c();
                    setWrapContent();
                }
            }
            if (this.f) {
                this.f11701s.setText(this.f11686b.cU);
                if (!TextUtils.isEmpty(this.f11686b.bd())) {
                    com.anythink.expressad.foundation.g.d.b.a(this.f11685a.getApplicationContext()).a(this.f11686b.bd(), new e(this.f11698p, this.f11686b, this.f11702t) { // from class: com.anythink.expressad.video.module.AnythinkClickCTAView.5
                        @Override // com.anythink.expressad.video.module.a.a.e, com.anythink.expressad.foundation.g.d.c
                        public final void a(String str, String str2) {
                            super.a(str, str2);
                            AnythinkClickCTAView.this.b();
                        }
                    });
                } else {
                    b();
                }
                if (this.f11699q != null && !TextUtils.isEmpty(this.f11686b.bb())) {
                    this.f11699q.setText(this.f11686b.bb());
                }
                if (this.f11700r != null && !TextUtils.isEmpty(this.f11686b.bc())) {
                    this.f11700r.setText(this.f11686b.bc());
                }
            }
        }
    }

    public void setObjectAnimator(ObjectAnimator objectAnimator) {
        this.f11706x = objectAnimator;
    }

    public void setUnitId(String str) {
        this.f11702t = str;
    }

    public AnythinkClickCTAView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public final void c() {
        super.c();
        if (this.f) {
            c cVar = this.f11686b;
            if (cVar != null && cVar.j()) {
                setOnClickListener(new com.anythink.expressad.widget.a() { // from class: com.anythink.expressad.video.module.AnythinkClickCTAView.2
                    @Override // com.anythink.expressad.widget.a
                    public final void a(View view) {
                        AnythinkClickCTAView.b(AnythinkClickCTAView.this);
                    }
                });
            }
            this.f11701s.setOnClickListener(new com.anythink.expressad.widget.a() { // from class: com.anythink.expressad.video.module.AnythinkClickCTAView.3
                @Override // com.anythink.expressad.widget.a
                public final void a(View view) {
                    AnythinkClickCTAView.b(AnythinkClickCTAView.this);
                }
            });
            ImageView imageView = this.f11698p;
            if (imageView != null) {
                imageView.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.module.AnythinkClickCTAView.4
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                    }
                });
            }
        }
    }

    private void a(ViewGroup viewGroup, c cVar) {
        new com.anythink.expressad.video.dynview.j.c();
        com.anythink.expressad.video.dynview.c b10 = com.anythink.expressad.video.dynview.j.c.b(viewGroup, cVar);
        com.anythink.expressad.video.dynview.b.a();
        com.anythink.expressad.video.dynview.b.a(b10, new AnonymousClass1(viewGroup));
    }

    public static /* synthetic */ void b(AnythinkClickCTAView anythinkClickCTAView) {
        JSONObject jSONObject;
        JSONException e10;
        c cVar = anythinkClickCTAView.f11686b;
        if (cVar != null) {
            cVar.j();
        }
        try {
            jSONObject = new JSONObject();
            try {
                jSONObject.put(a.ce, anythinkClickCTAView.a(0));
            } catch (JSONException e11) {
                e10 = e11;
                e10.printStackTrace();
                anythinkClickCTAView.f11689e.a(105, jSONObject);
            }
        } catch (JSONException e12) {
            jSONObject = null;
            e10 = e12;
        }
        anythinkClickCTAView.f11689e.a(105, jSONObject);
    }

    /* renamed from: com.anythink.expressad.video.module.AnythinkClickCTAView$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass1 implements h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f11707a;

        public AnonymousClass1(ViewGroup viewGroup) {
            this.f11707a = viewGroup;
        }

        @Override // com.anythink.expressad.video.dynview.f.h
        public final void a(com.anythink.expressad.video.dynview.a aVar) {
            this.f11707a.addView(aVar.a());
            AnythinkClickCTAView anythinkClickCTAView = AnythinkClickCTAView.this;
            anythinkClickCTAView.f = anythinkClickCTAView.f();
            AnythinkClickCTAView anythinkClickCTAView2 = AnythinkClickCTAView.this;
            anythinkClickCTAView2.f11700r = (TextView) anythinkClickCTAView2.findViewById(anythinkClickCTAView2.findID("anythink_tv_desc"));
            AnythinkClickCTAView.this.c();
        }

        @Override // com.anythink.expressad.video.dynview.f.h
        public final void a(com.anythink.expressad.video.dynview.c.b bVar) {
            o.d(AnythinkBaseView.TAG, "errorMsg:" + bVar.b());
        }
    }

    private void a() {
        int findLayout = findLayout(f11697n);
        if (findLayout >= 0) {
            this.f11687c.inflate(findLayout, this);
            this.f = f();
            c();
            setWrapContent();
        }
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public void init(Context context) {
    }
}
