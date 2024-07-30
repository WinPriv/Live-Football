package com.applovin.impl.b.b;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.applovin.sdk.R;

/* loaded from: classes.dex */
public class f extends d {

    /* renamed from: a, reason: collision with root package name */
    private final Button f17343a;

    /* renamed from: b, reason: collision with root package name */
    private final ScrollView f17344b;

    /* renamed from: c, reason: collision with root package name */
    private final FrameLayout f17345c;

    public f(Context context, com.applovin.impl.b.a.h hVar) {
        super(context);
        View inflate = LayoutInflater.from(context).inflate(R.layout.applovin_consent_flow_gdpr_phase_learn_more_screen, (ViewGroup) this, true);
        ((TextView) inflate.findViewById(R.id.title_textview)).setText(hVar.f());
        this.f17343a = (Button) inflate.findViewById(R.id.back_button);
        this.f17344b = (ScrollView) inflate.findViewById(R.id.scroll_view);
        this.f17345c = (FrameLayout) inflate.findViewById(R.id.controls_view);
    }

    public Button getBackButton() {
        return this.f17343a;
    }

    @Override // com.applovin.impl.b.b.d
    public ViewGroup getControlsView() {
        return this.f17345c;
    }

    @Override // com.applovin.impl.b.b.d
    public ScrollView getScrollView() {
        return this.f17344b;
    }
}
