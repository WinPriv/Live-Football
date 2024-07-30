package com.applovin.impl.b.b;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Switch;
import android.widget.TextView;
import com.applovin.sdk.R;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public class g extends d {

    /* renamed from: a, reason: collision with root package name */
    private final TextView f17346a;

    /* renamed from: b, reason: collision with root package name */
    private final TextView f17347b;

    /* renamed from: c, reason: collision with root package name */
    private final TextView f17348c;

    /* renamed from: d, reason: collision with root package name */
    private final Switch f17349d;

    /* renamed from: e, reason: collision with root package name */
    private final Switch f17350e;
    private final Switch f;

    /* renamed from: g, reason: collision with root package name */
    private final Button f17351g;

    /* renamed from: h, reason: collision with root package name */
    private final Button f17352h;

    /* renamed from: i, reason: collision with root package name */
    private final ScrollView f17353i;

    /* renamed from: j, reason: collision with root package name */
    private final LinearLayout f17354j;

    public g(Context context, com.applovin.impl.b.a.h hVar) {
        super(context);
        View inflate = LayoutInflater.from(context).inflate(R.layout.applovin_consent_flow_gdpr_phase_main_screen, (ViewGroup) this, true);
        ((TextView) inflate.findViewById(R.id.title_textview)).setText(hVar.e());
        this.f17346a = (TextView) inflate.findViewById(R.id.personalized_advertising_switch_textview);
        this.f17347b = (TextView) inflate.findViewById(R.id.analytics_purposes_switch_textview);
        this.f17348c = (TextView) inflate.findViewById(R.id.privacy_policy_switch_textview);
        this.f17349d = (Switch) inflate.findViewById(R.id.personalized_advertising_switch);
        this.f17350e = (Switch) inflate.findViewById(R.id.analytics_purposes_switch);
        this.f = (Switch) inflate.findViewById(R.id.privacy_policy_switch);
        this.f17351g = (Button) inflate.findViewById(R.id.continue_button);
        this.f17352h = (Button) inflate.findViewById(R.id.learn_more_button);
        this.f17353i = (ScrollView) inflate.findViewById(R.id.scroll_view);
        this.f17354j = (LinearLayout) inflate.findViewById(R.id.controls_view);
    }

    public Switch getAnalyticsPurposesSwitch() {
        return this.f17350e;
    }

    public TextView getAnalyticsPurposesSwitchTextView() {
        return this.f17347b;
    }

    public Button getContinueButton() {
        return this.f17351g;
    }

    @Override // com.applovin.impl.b.b.d
    public ViewGroup getControlsView() {
        return this.f17354j;
    }

    public Button getLearnMoreButton() {
        return this.f17352h;
    }

    public Switch getPersonalizedAdvertisingSwitch() {
        return this.f17349d;
    }

    public TextView getPersonalizedAdvertisingSwitchTextView() {
        return this.f17346a;
    }

    public Switch getPrivacyPolicySwitch() {
        return this.f;
    }

    public TextView getPrivacyPolicySwitchTextView() {
        return this.f17348c;
    }

    @Override // com.applovin.impl.b.b.d
    public ScrollView getScrollView() {
        return this.f17353i;
    }
}
