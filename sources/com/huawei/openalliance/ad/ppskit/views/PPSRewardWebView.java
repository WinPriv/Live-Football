package com.huawei.openalliance.ad.ppskit.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.hamkho.livefoot.R;
import com.huawei.openalliance.ad.ppskit.activity.ComplianceActivity;
import java.util.Timer;
import java.util.TimerTask;
import ka.cj;
import ka.jj;
import ka.m9;
import ka.n7;
import ka.q7;

/* loaded from: classes2.dex */
public class PPSRewardWebView extends PPSWebView implements m9.a, cj {
    public m9 V;
    public Timer W;

    /* renamed from: c0, reason: collision with root package name */
    public ProgressBar f23286c0;

    /* renamed from: d0, reason: collision with root package name */
    public TextView f23287d0;

    /* loaded from: classes2.dex */
    public static class a implements q7 {
    }

    /* loaded from: classes2.dex */
    public class b extends WebChromeClient {
        public b() {
        }

        @Override // android.webkit.WebChromeClient
        public final void onProgressChanged(WebView webView, int i10) {
            PPSRewardWebView pPSRewardWebView = PPSRewardWebView.this;
            ProgressBar progressBar = pPSRewardWebView.f23286c0;
            if (progressBar != null && pPSRewardWebView.f23287d0 != null) {
                if (i10 == 100) {
                    progressBar.setVisibility(8);
                    pPSRewardWebView.f23287d0.setVisibility(8);
                } else {
                    if (progressBar.getVisibility() == 8) {
                        pPSRewardWebView.f23286c0.setVisibility(0);
                    }
                    if (pPSRewardWebView.f23287d0.getVisibility() == 8) {
                        pPSRewardWebView.f23287d0.setVisibility(0);
                    }
                }
            }
            super.onProgressChanged(webView, i10);
        }
    }

    /* loaded from: classes2.dex */
    public static class c extends TimerTask {
        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            jj.a().b();
            if (n7.d()) {
                n7.c("PPSRewardWebView", "one mississippi, %d sec left", Integer.valueOf(jj.a().f31352c));
            }
        }
    }

    public PPSRewardWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void a() {
        Context context = getContext();
        TextView textView = new TextView(context);
        this.f23287d0 = textView;
        textView.setId(R.id.trial_play_loading_text);
        this.f23287d0.setText(R.string.hiad_loading_tips);
        this.f23287d0.setTextSize(1, 14.0f);
        this.f23287d0.setTextColor(context.getResources().getColor(R.color.hiad_50_percent_white));
        this.f23286c0 = new ProgressBar(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        addView(this.f23287d0, layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(com.huawei.openalliance.ad.ppskit.utils.d0.b(context, 72.0f), com.huawei.openalliance.ad.ppskit.utils.d0.b(context, 72.0f));
        layoutParams2.setMargins(0, 0, 0, com.huawei.openalliance.ad.ppskit.utils.d0.b(context, 16.0f));
        layoutParams2.addRule(2, R.id.trial_play_loading_text);
        layoutParams2.addRule(13);
        addView(this.f23286c0, layoutParams2);
        WebView webView = getWebView();
        if (webView != null) {
            webView.setWebChromeClient(new b());
        }
    }

    @Override // ka.m9.a
    public final void b(long j10, int i10) {
        n7.b("PPSRewardWebView", "onViewPhysicalShowEnd");
        Timer timer = this.W;
        if (timer != null) {
            timer.cancel();
        }
    }

    @Override // ka.m9.a
    public final void c() {
        n7.b("PPSRewardWebView", "onViewShowStartRecord");
    }

    @Override // ka.m9.a
    public final void d() {
        n7.b("PPSRewardWebView", "onViewPhysicalShowStart");
        if (jj.a().f31352c > 0) {
            n7.b("PPSRewardWebView", "start timer for reward gain");
            Timer timer = new Timer();
            this.W = timer;
            timer.schedule(new c(), 0L, 1000L);
        }
    }

    @Override // ka.cj
    public final void g() {
        if (n7.d()) {
            n7.b("PPSRewardWebView", "onRewardTimeGained");
        }
        Timer timer = this.W;
        if (timer != null) {
            timer.cancel();
        }
    }

    @Override // com.huawei.openalliance.ad.ppskit.views.PPSWebView
    public final void i() {
        jj.a().f31354e.add(this);
        this.V = new m9(this, this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        n7.b("PPSRewardWebView", "onAttachedToWindow");
        ComplianceActivity.N = new a();
        m9 m9Var = this.V;
        if (m9Var != null) {
            m9Var.d();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        n7.e("PPSRewardWebView", "onDetachedFromWindow");
        ComplianceActivity.N = null;
        m9 m9Var = this.V;
        if (m9Var != null) {
            m9Var.e();
        }
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        m9 m9Var = this.V;
        if (m9Var != null) {
            n7.e(m9Var.f31599s, "onViewVisibilityChanged");
            m9Var.f();
        }
    }

    public void setWebViewBackgroundColor(int i10) {
        WebView webView = getWebView();
        if (webView != null) {
            webView.setBackgroundColor(i10);
        }
    }

    @Override // ka.m9.a
    public final void a(long j10, int i10) {
        n7.b("PPSRewardWebView", "onViewShowEndRecord");
    }

    @Override // ka.cj
    public final void f() {
    }

    @Override // ka.cj
    public final void h() {
    }
}
