package com.applovin.impl.b.b;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.applovin.sdk.R;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public class c extends d {

    /* renamed from: a, reason: collision with root package name */
    private final Button f17317a;

    /* renamed from: b, reason: collision with root package name */
    private final Button f17318b;

    /* renamed from: c, reason: collision with root package name */
    private final ScrollView f17319c;

    /* renamed from: d, reason: collision with root package name */
    private final LinearLayout f17320d;

    public c(Context context, com.applovin.impl.b.a.h hVar) {
        super(context);
        View inflate = LayoutInflater.from(context).inflate(R.layout.applovin_consent_flow_gdpr_are_you_sure_screen, (ViewGroup) this, true);
        this.f17317a = (Button) inflate.findViewById(R.id.back_button);
        this.f17318b = (Button) inflate.findViewById(R.id.understand_and_confirm_button);
        this.f17319c = (ScrollView) inflate.findViewById(R.id.scroll_view);
        this.f17320d = (LinearLayout) inflate.findViewById(R.id.controls_view);
    }

    public Button getBackButton() {
        return this.f17317a;
    }

    @Override // com.applovin.impl.b.b.d
    public ViewGroup getControlsView() {
        return this.f17320d;
    }

    @Override // com.applovin.impl.b.b.d
    public ScrollView getScrollView() {
        return this.f17319c;
    }

    public Button getUnderstandAndConfirmButton() {
        return this.f17318b;
    }
}
