package com.applovin.impl.b.b;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.applovin.impl.sdk.p;
import com.applovin.sdk.R;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public class b extends d {

    /* renamed from: a, reason: collision with root package name */
    private final Button f17314a;

    /* renamed from: b, reason: collision with root package name */
    private final LinearLayout f17315b;

    /* renamed from: c, reason: collision with root package name */
    private final FrameLayout f17316c;

    public b(Activity activity, com.applovin.impl.b.a.h hVar, p pVar) {
        super(activity);
        View inflate = LayoutInflater.from(activity).inflate(R.layout.applovin_consent_flow_gdpr_phase_partners_screen, (ViewGroup) this, true);
        ((TextView) inflate.findViewById(R.id.title_textview)).setText(activity.getString(R.string.applovin_gdpr_analytics_partners_screen_title));
        ((TextView) inflate.findViewById(R.id.message_textview)).setText(activity.getString(R.string.applovin_gdpr_analytics_partners_screen_message));
        TextView textView = (TextView) inflate.findViewById(R.id.partner_links_textview);
        textView.setText(hVar.h());
        SpannableString spannableString = (SpannableString) textView.getText();
        for (URLSpan uRLSpan : (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class)) {
            int spanStart = spannableString.getSpanStart(uRLSpan);
            int spanEnd = spannableString.getSpanEnd(uRLSpan);
            spannableString.removeSpan(uRLSpan);
            spannableString.setSpan(new h(uRLSpan.getURL(), activity, pVar), spanStart, spanEnd, 0);
        }
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        this.f17314a = (Button) inflate.findViewById(R.id.back_button);
        this.f17315b = (LinearLayout) inflate.findViewById(R.id.partners_content_view);
        this.f17316c = (FrameLayout) inflate.findViewById(R.id.controls_view);
    }

    @Override // com.applovin.impl.b.b.d
    public void a() {
        super.a();
        ((FrameLayout.LayoutParams) this.f17315b.getLayoutParams()).bottomMargin = getResources().getDimensionPixelSize(R.dimen.applovin_sdk_consentFlowGdprControlsViewHeight);
    }

    public Button getBackButton() {
        return this.f17314a;
    }

    @Override // com.applovin.impl.b.b.d
    public ViewGroup getControlsView() {
        return this.f17316c;
    }

    @Override // com.applovin.impl.b.b.d
    public ScrollView getScrollView() {
        return null;
    }
}
