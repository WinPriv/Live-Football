package com.anythink.expressad.video.module;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.anythink.expressad.video.signal.f;
import com.anythink.expressad.video.signal.factory.b;
import com.anythink.expressad.widget.a;

/* loaded from: classes.dex */
public class AnythinkVastEndCardView extends AnythinkBaseView implements f {

    /* renamed from: n, reason: collision with root package name */
    private static final String f11796n = "anythink_reward_endcard_vast";
    private ViewGroup o;

    /* renamed from: p, reason: collision with root package name */
    private View f11797p;

    /* renamed from: q, reason: collision with root package name */
    private View f11798q;

    public AnythinkVastEndCardView(Context context) {
        super(context);
    }

    private void a() {
        if (this.f) {
            setMatchParent();
            setBackgroundResource(findColor("anythink_reward_endcard_vast_bg"));
            setClickable(true);
            ((RelativeLayout.LayoutParams) this.o.getLayoutParams()).addRule(13, -1);
        }
    }

    private boolean b() {
        this.o = (ViewGroup) findViewById(findID("anythink_rl_content"));
        this.f11797p = findViewById(findID("anythink_iv_vastclose"));
        View findViewById = findViewById(findID("anythink_iv_vastok"));
        this.f11798q = findViewById;
        return isNotNULL(this.o, this.f11797p, findViewById);
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public final void c() {
        super.c();
        if (this.f) {
            this.f11797p.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.module.AnythinkVastEndCardView.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AnythinkVastEndCardView.this.f11689e.a(104, "");
                }
            });
            this.f11798q.setOnClickListener(new a() { // from class: com.anythink.expressad.video.module.AnythinkVastEndCardView.2
                @Override // com.anythink.expressad.widget.a
                public final void a(View view) {
                    AnythinkVastEndCardView anythinkVastEndCardView = AnythinkVastEndCardView.this;
                    anythinkVastEndCardView.f11689e.a(108, anythinkVastEndCardView.d());
                }
            });
        }
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public void init(Context context) {
        int findLayout = findLayout(f11796n);
        if (findLayout >= 0) {
            this.f11687c.inflate(findLayout, this);
            this.o = (ViewGroup) findViewById(findID("anythink_rl_content"));
            this.f11797p = findViewById(findID("anythink_iv_vastclose"));
            View findViewById = findViewById(findID("anythink_iv_vastok"));
            this.f11798q = findViewById;
            this.f = isNotNULL(this.o, this.f11797p, findViewById);
            c();
            if (this.f) {
                setMatchParent();
                setBackgroundResource(findColor("anythink_reward_endcard_vast_bg"));
                setClickable(true);
                ((RelativeLayout.LayoutParams) this.o.getLayoutParams()).addRule(13, -1);
            }
        }
    }

    public void notifyShowListener() {
        this.f11689e.a(111, "");
    }

    public AnythinkVastEndCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.anythink.expressad.video.signal.f
    public void preLoadData(b bVar) {
    }
}
