package com.anythink.expressad.video.module;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.anythink.core.common.b.n;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.atsignalcommon.windvane.j;
import com.anythink.expressad.foundation.d.c;
import com.anythink.expressad.foundation.h.o;
import com.anythink.expressad.foundation.h.t;
import com.anythink.expressad.video.signal.factory.b;
import com.anythink.expressad.videocommon.b.i;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AnythinkClickMiniCardView extends AnythinkH5EndCardView {
    private static final float A = 0.7f;
    private boolean B;

    public AnythinkClickMiniCardView(Context context) {
        super(context);
        this.B = false;
    }

    @Override // com.anythink.expressad.video.module.AnythinkH5EndCardView
    public final String a() {
        c cVar = this.f11686b;
        if (cVar == null) {
            return null;
        }
        c.C0119c M = cVar.M();
        String d10 = M != null ? M.d() : null;
        if (TextUtils.isEmpty(d10) || !d10.contains(".zip")) {
            return d10;
        }
        String c10 = i.a().c(d10);
        return !TextUtils.isEmpty(c10) ? c10 : d10;
    }

    @Override // com.anythink.expressad.video.module.AnythinkH5EndCardView
    public final RelativeLayout.LayoutParams b() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13, -1);
        return layoutParams;
    }

    @Override // com.anythink.expressad.video.module.AnythinkH5EndCardView
    public final void e() {
        super.e();
        if (this.f) {
            setBackgroundResource(findColor("anythink_reward_minicard_bg"));
            a(this.f11736p);
            setClickable(true);
        }
    }

    @Override // com.anythink.expressad.video.module.AnythinkH5EndCardView, com.anythink.expressad.video.module.AnythinkBaseView
    public void onSelfConfigurationChanged(Configuration configuration) {
        if (this.f) {
            a(this.f11736p);
        }
        super.onSelfConfigurationChanged(configuration);
    }

    @Override // com.anythink.expressad.video.module.AnythinkH5EndCardView, com.anythink.expressad.video.signal.f
    public void preLoadData(b bVar) {
        super.preLoadData(bVar);
        setCloseVisible(0);
    }

    public void resizeMiniCard(int i10, int i11) {
        View findViewById = ((Activity) this.f11685a).getWindow().findViewById(R.id.content);
        int width = findViewById.getWidth();
        int height = findViewById.getHeight();
        if (i10 > 0 && i11 > 0 && i10 <= width && i11 <= height) {
            ViewGroup.LayoutParams layoutParams = this.f11736p.getLayoutParams();
            layoutParams.width = i10;
            layoutParams.height = i11;
            this.f11736p.setLayoutParams(layoutParams);
        }
    }

    public void setAnythinkClickMiniCardViewClickable(boolean z10) {
        setClickable(z10);
    }

    public void setAnythinkClickMiniCardViewTransparent() {
        setBackgroundColor(0);
    }

    public void setMiniCardLocation(int i10, int i11, int i12, int i13) {
        this.B = true;
        resizeMiniCard(i12, i13);
    }

    public void setRadius(int i10) {
        if (i10 > 0) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(t.b(getContext(), i10));
            gradientDrawable.setColor(-1);
            this.f11739s.setBackground(gradientDrawable);
            this.f11739s.setClipToOutline(true);
        }
    }

    @Override // com.anythink.expressad.video.module.AnythinkH5EndCardView, com.anythink.expressad.video.signal.h
    public void webviewshow() {
        WindVaneWebView windVaneWebView = this.f11739s;
        if (windVaneWebView != null) {
            windVaneWebView.post(new Runnable() { // from class: com.anythink.expressad.video.module.AnythinkClickMiniCardView.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        o.a(AnythinkBaseView.TAG, "webviewshow");
                        String str = "";
                        try {
                            int[] iArr = new int[2];
                            AnythinkClickMiniCardView.this.f11739s.getLocationOnScreen(iArr);
                            o.d(AnythinkBaseView.TAG, "coordinate:" + iArr[0] + "--" + iArr[1]);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("startX", t.a(n.a().g(), (float) iArr[0]));
                            jSONObject.put("startY", t.a(n.a().g(), (float) iArr[1]));
                            str = jSONObject.toString();
                        } catch (Throwable th) {
                            o.b(AnythinkBaseView.TAG, th.getMessage(), th);
                        }
                        String encodeToString = Base64.encodeToString(str.toString().getBytes(), 2);
                        j.a();
                        j.a((WebView) AnythinkClickMiniCardView.this.f11739s, "webviewshow", encodeToString);
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                }
            });
        }
    }

    public AnythinkClickMiniCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.B = false;
    }

    private void a(View view) {
        int f = t.f(this.f11685a);
        int e10 = t.e(this.f11685a);
        int i10 = (int) ((f * A) + 0.5f);
        int i11 = (int) ((e10 * A) + 0.5f);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = i10;
        layoutParams.height = i11;
        view.setLayoutParams(layoutParams);
    }
}
