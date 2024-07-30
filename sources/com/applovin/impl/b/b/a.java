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
public class a extends d {

    /* renamed from: a, reason: collision with root package name */
    private final Button f17311a;

    /* renamed from: b, reason: collision with root package name */
    private final LinearLayout f17312b;

    /* renamed from: c, reason: collision with root package name */
    private final FrameLayout f17313c;

    public a(Activity activity, com.applovin.impl.b.a.h hVar, p pVar) {
        super(activity);
        View inflate = LayoutInflater.from(activity).inflate(R.layout.applovin_consent_flow_gdpr_phase_partners_screen, (ViewGroup) this, true);
        ((TextView) inflate.findViewById(R.id.title_textview)).setText(activity.getString(R.string.applovin_gdpr_advertising_partners_screen_title));
        ((TextView) inflate.findViewById(R.id.message_textview)).setText(activity.getString(R.string.applovin_gdpr_advertising_partners_screen_message));
        TextView textView = (TextView) inflate.findViewById(R.id.partner_links_textview);
        textView.setText(hVar.g());
        SpannableString spannableString = (SpannableString) textView.getText();
        for (URLSpan uRLSpan : (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class)) {
            int spanStart = spannableString.getSpanStart(uRLSpan);
            int spanEnd = spannableString.getSpanEnd(uRLSpan);
            spannableString.removeSpan(uRLSpan);
            spannableString.setSpan(new h(uRLSpan.getURL(), activity, pVar), spanStart, spanEnd, 33);
        }
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        this.f17311a = (Button) inflate.findViewById(R.id.back_button);
        this.f17312b = (LinearLayout) inflate.findViewById(R.id.partners_content_view);
        this.f17313c = (FrameLayout) inflate.findViewById(R.id.controls_view);
    }

    @Override // com.applovin.impl.b.b.d
    public void a() {
        super.a();
        ((FrameLayout.LayoutParams) this.f17312b.getLayoutParams()).bottomMargin = getResources().getDimensionPixelSize(R.dimen.applovin_sdk_consentFlowGdprControlsViewHeight);
    }

    public Button getBackButton() {
        return this.f17311a;
    }

    public LinearLayout getContentView() {
        return this.f17312b;
    }

    @Override // com.applovin.impl.b.b.d
    public ScrollView getScrollView() {
        return null;
    }

    @Override // com.applovin.impl.b.b.d
    public FrameLayout getControlsView() {
        return this.f17313c;
    }
}
