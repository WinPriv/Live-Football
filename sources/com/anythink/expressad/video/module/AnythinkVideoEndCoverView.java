package com.anythink.expressad.video.module;

import a3.l;
import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.anythink.core.common.b.n;
import com.anythink.expressad.foundation.d.c;
import com.anythink.expressad.foundation.g.a;
import com.anythink.expressad.foundation.h.o;
import com.anythink.expressad.foundation.h.t;
import com.anythink.expressad.video.module.a.a.j;
import com.anythink.expressad.video.signal.f;
import com.anythink.expressad.video.signal.factory.b;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AnythinkVideoEndCoverView extends AnythinkBaseView implements f {

    /* renamed from: n, reason: collision with root package name */
    private final String f11801n;
    private View o;

    /* renamed from: p, reason: collision with root package name */
    private ImageView f11802p;

    /* renamed from: q, reason: collision with root package name */
    private ImageView f11803q;

    /* renamed from: r, reason: collision with root package name */
    private TextView f11804r;

    /* renamed from: s, reason: collision with root package name */
    private TextView f11805s;

    /* renamed from: t, reason: collision with root package name */
    private TextView f11806t;

    /* renamed from: u, reason: collision with root package name */
    private b f11807u;

    public AnythinkVideoEndCoverView(Context context) {
        super(context);
        this.f11801n = "AnythinkVideoEndCoverView";
    }

    private boolean a(View view) {
        if (view == null) {
            return true;
        }
        try {
            this.f11802p = (ImageView) view.findViewById(findID("anythink_vec_iv_icon"));
            this.f11803q = (ImageView) view.findViewById(findID("anythink_vec_iv_close"));
            this.f11804r = (TextView) view.findViewById(findID("anythink_vec_tv_title"));
            this.f11805s = (TextView) view.findViewById(findID("anythink_vec_tv_desc"));
            this.f11806t = (TextView) view.findViewById(findID("anythink_vec_btn"));
            return true;
        } catch (Throwable th) {
            o.d("AnythinkVideoEndCoverView", th.getMessage());
            return false;
        }
    }

    private void b() {
        View view = this.o;
        if (view == null) {
            init(this.f11685a);
            preLoadData(this.f11807u);
            return;
        }
        if (view.getParent() != null) {
            ((ViewGroup) this.o.getParent()).removeView(this.o);
        }
        addView(this.o);
        a(this.o);
        c();
    }

    private void e() {
        ImageView imageView;
        c cVar = this.f11686b;
        if (cVar != null) {
            if (!TextUtils.isEmpty(cVar.bd()) && (imageView = this.f11802p) != null) {
                com.anythink.expressad.foundation.g.d.b.a(this.f11685a.getApplicationContext()).a(this.f11686b.bd(), new j(imageView, l.f(8.0f)));
            }
            TextView textView = this.f11804r;
            if (textView != null) {
                textView.setText(this.f11686b.bb());
            }
            TextView textView2 = this.f11806t;
            if (textView2 != null) {
                textView2.setText(this.f11686b.cU);
            }
            TextView textView3 = this.f11805s;
            if (textView3 != null) {
                textView3.setText(this.f11686b.bc());
            }
        }
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public final void c() {
        super.c();
        this.f11803q.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.module.AnythinkVideoEndCoverView.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AnythinkVideoEndCoverView.this.f11689e.a(104, "");
            }
        });
        this.f11802p.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.module.AnythinkVideoEndCoverView.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AnythinkVideoEndCoverView.this.a();
            }
        });
        this.f11806t.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.module.AnythinkVideoEndCoverView.3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AnythinkVideoEndCoverView.this.a();
            }
        });
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public void init(Context context) {
        int findLayout = findLayout("anythink_reward_videoend_cover");
        if (findLayout >= 0) {
            View inflate = this.f11687c.inflate(findLayout, (ViewGroup) null);
            this.o = inflate;
            if (inflate != null) {
                this.f = a(inflate);
                addView(this.o, -1, -1);
                c();
            }
        }
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f11690g = motionEvent.getRawX();
        this.f11691h = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public void onSelfConfigurationChanged(Configuration configuration) {
        super.onSelfConfigurationChanged(configuration);
        this.f11688d = configuration.orientation;
        removeView(this.o);
        View view = this.o;
        if (view == null) {
            init(this.f11685a);
            preLoadData(this.f11807u);
            return;
        }
        if (view.getParent() != null) {
            ((ViewGroup) this.o.getParent()).removeView(this.o);
        }
        addView(this.o);
        a(this.o);
        c();
    }

    @Override // com.anythink.expressad.video.signal.f
    public void preLoadData(b bVar) {
        ImageView imageView;
        this.f11807u = bVar;
        try {
            c cVar = this.f11686b;
            if (cVar != null && this.f && cVar != null) {
                if (!TextUtils.isEmpty(cVar.bd()) && (imageView = this.f11802p) != null) {
                    com.anythink.expressad.foundation.g.d.b.a(this.f11685a.getApplicationContext()).a(this.f11686b.bd(), new j(imageView, t.b(n.a().g(), 8.0f)));
                }
                TextView textView = this.f11804r;
                if (textView != null) {
                    textView.setText(this.f11686b.bb());
                }
                TextView textView2 = this.f11806t;
                if (textView2 != null) {
                    textView2.setText(this.f11686b.cU);
                }
                TextView textView3 = this.f11805s;
                if (textView3 != null) {
                    textView3.setText(this.f11686b.bc());
                }
            }
        } catch (Throwable th) {
            o.a("AnythinkVideoEndCoverView", th.getMessage());
        }
    }

    public AnythinkVideoEndCoverView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11801n = "AnythinkVideoEndCoverView";
    }

    public final void a() {
        JSONObject jSONObject;
        JSONException e10;
        JSONObject jSONObject2;
        JSONException e11;
        try {
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put(a.f9775cc, t.a(n.a().g(), this.f11690g));
                    jSONObject2.put(a.f9776cd, t.a(n.a().g(), this.f11691h));
                    jSONObject2.put(a.cf, 0);
                    try {
                        this.f11688d = getContext().getResources().getConfiguration().orientation;
                    } catch (Exception e12) {
                        e12.printStackTrace();
                    }
                    jSONObject2.put(a.cg, this.f11688d);
                    jSONObject2.put(a.ch, t.c(getContext()));
                } catch (JSONException e13) {
                    e11 = e13;
                    o.d("AnythinkVideoEndCoverView", e11.getMessage());
                    jSONObject = new JSONObject();
                    jSONObject.put(a.ce, jSONObject2);
                    this.f11689e.a(105, jSONObject);
                }
            } catch (JSONException e14) {
                jSONObject2 = jSONObject3;
                e11 = e14;
            }
            jSONObject = new JSONObject();
            try {
                jSONObject.put(a.ce, jSONObject2);
            } catch (JSONException e15) {
                e10 = e15;
                e10.printStackTrace();
                this.f11689e.a(105, jSONObject);
            }
        } catch (JSONException e16) {
            jSONObject = null;
            e10 = e16;
        }
        this.f11689e.a(105, jSONObject);
    }
}
