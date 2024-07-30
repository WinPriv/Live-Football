package com.applovin.impl.b.b;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.Switch;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class e extends Dialog {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f17321a;

    /* renamed from: b, reason: collision with root package name */
    private final g f17322b;

    /* renamed from: c, reason: collision with root package name */
    private final c f17323c;

    /* renamed from: d, reason: collision with root package name */
    private final com.applovin.impl.b.b.a f17324d;

    /* renamed from: e, reason: collision with root package name */
    private final b f17325e;
    private final f f;

    /* renamed from: g, reason: collision with root package name */
    private int f17326g;

    /* loaded from: classes.dex */
    public interface a {
        void a(boolean z10, boolean z11);
    }

    public e(final Activity activity, Bundle bundle, com.applovin.impl.b.a.h hVar, final p pVar, final a aVar) {
        super(activity, R.style.Theme.Black.NoTitleBar.Fullscreen);
        getWindow().setLayout(-1, -1);
        getWindow().setBackgroundDrawable(new ColorDrawable(getContext().getResources().getColor(R.color.transparent)));
        requestWindowFeature(1);
        setCancelable(false);
        g gVar = new g(getContext(), hVar);
        this.f17322b = gVar;
        gVar.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        gVar.getPrivacyPolicySwitch().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.applovin.impl.b.b.e.1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                e.this.f17322b.getContinueButton().setEnabled(z10);
            }
        });
        gVar.getContinueButton().setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.b.b.e.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                boolean isChecked = e.this.f17322b.getPersonalizedAdvertisingSwitch().isChecked();
                boolean isChecked2 = e.this.f17322b.getAnalyticsPurposesSwitch().isChecked();
                if (isChecked && isChecked2) {
                    e.this.dismiss();
                    aVar.a(isChecked, isChecked2);
                } else {
                    e eVar = e.this;
                    eVar.a(eVar.f17323c, 4);
                }
            }
        });
        gVar.getLearnMoreButton().setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.b.b.e.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                e eVar = e.this;
                eVar.a(eVar.f, 1);
            }
        });
        String string = getContext().getString(com.applovin.sdk.R.string.applovin_gdpr_main_screen_personalized_advertising_purposes_switch_text);
        SpannableString spannableString = new SpannableString(string);
        StringUtils.addLinks(spannableString, Pattern.compile(string), new ClickableSpan() { // from class: com.applovin.impl.b.b.e.7
            @Override // android.text.style.ClickableSpan
            public void onClick(View view) {
                e eVar = e.this;
                eVar.a(eVar.f17324d, 2);
            }
        }, true);
        gVar.getPersonalizedAdvertisingSwitchTextView().setText(spannableString);
        gVar.getPersonalizedAdvertisingSwitchTextView().setMovementMethod(LinkMovementMethod.getInstance());
        String string2 = getContext().getString(com.applovin.sdk.R.string.applovin_gdpr_main_screen_analytics_purposes_switch_text);
        SpannableString spannableString2 = new SpannableString(string2);
        StringUtils.addLinks(spannableString2, Pattern.compile(string2), new ClickableSpan() { // from class: com.applovin.impl.b.b.e.8
            @Override // android.text.style.ClickableSpan
            public void onClick(View view) {
                e eVar = e.this;
                eVar.a(eVar.f17325e, 3);
            }
        }, true);
        gVar.getAnalyticsPurposesSwitchTextView().setText(spannableString2);
        gVar.getAnalyticsPurposesSwitchTextView().setMovementMethod(LinkMovementMethod.getInstance());
        SpannableString spannableString3 = new SpannableString(getContext().getString(com.applovin.sdk.R.string.applovin_gdpr_main_screen_privacy_policy_switch_text));
        StringUtils.addLinks(spannableString3, Pattern.compile(getContext().getString(com.applovin.sdk.R.string.applovin_privacy_policy_text)), new ClickableSpan() { // from class: com.applovin.impl.b.b.e.9
            @Override // android.text.style.ClickableSpan
            public void onClick(View view) {
                Utils.showWebViewActivity(pVar.ae().c(), activity, pVar);
            }
        }, true);
        gVar.getPrivacyPolicySwitchTextView().setText(spannableString3);
        gVar.getPrivacyPolicySwitchTextView().setMovementMethod(LinkMovementMethod.getInstance());
        Switch personalizedAdvertisingSwitch = gVar.getPersonalizedAdvertisingSwitch();
        com.applovin.impl.sdk.c.d<Boolean> dVar = com.applovin.impl.sdk.c.d.f18753v;
        Boolean bool = Boolean.TRUE;
        personalizedAdvertisingSwitch.setChecked(((Boolean) pVar.b((com.applovin.impl.sdk.c.d<com.applovin.impl.sdk.c.d<Boolean>>) dVar, (com.applovin.impl.sdk.c.d<Boolean>) bool)).booleanValue());
        gVar.getAnalyticsPurposesSwitch().setChecked(((Boolean) pVar.b((com.applovin.impl.sdk.c.d<com.applovin.impl.sdk.c.d<Boolean>>) com.applovin.impl.sdk.c.d.f18754w, (com.applovin.impl.sdk.c.d<Boolean>) bool)).booleanValue());
        gVar.getPrivacyPolicySwitch().setChecked(((Boolean) pVar.b((com.applovin.impl.sdk.c.d<com.applovin.impl.sdk.c.d<Boolean>>) com.applovin.impl.sdk.c.d.f18755x, (com.applovin.impl.sdk.c.d<Boolean>) bool)).booleanValue());
        c cVar = new c(getContext(), hVar);
        this.f17323c = cVar;
        cVar.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        cVar.getBackButton().setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.b.b.e.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                e eVar = e.this;
                eVar.a(eVar.f17323c);
            }
        });
        cVar.getUnderstandAndConfirmButton().setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.b.b.e.11
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                boolean isChecked = e.this.f17322b.getPersonalizedAdvertisingSwitch().isChecked();
                boolean isChecked2 = e.this.f17322b.getAnalyticsPurposesSwitch().isChecked();
                e.this.dismiss();
                aVar.a(isChecked, isChecked2);
            }
        });
        com.applovin.impl.b.b.a aVar2 = new com.applovin.impl.b.b.a(activity, hVar, pVar);
        this.f17324d = aVar2;
        aVar2.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        aVar2.getBackButton().setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.b.b.e.12
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                e eVar = e.this;
                eVar.a(eVar.f17324d);
            }
        });
        b bVar = new b(activity, hVar, pVar);
        this.f17325e = bVar;
        bVar.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        bVar.getBackButton().setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.b.b.e.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                e eVar = e.this;
                eVar.a(eVar.f17325e);
            }
        });
        f fVar = new f(getContext(), hVar);
        this.f = fVar;
        fVar.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        fVar.getBackButton().setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.b.b.e.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                e eVar = e.this;
                eVar.a(eVar.f);
            }
        });
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        gVar.setLayoutParams(layoutParams);
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        this.f17321a = relativeLayout;
        relativeLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        relativeLayout.setBackgroundColor(getContext().getResources().getColor(R.color.transparent));
        relativeLayout.addView(gVar);
        this.f17326g = 0;
        a(bundle);
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().getDecorView().getRootView().addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.applovin.impl.b.b.e.4
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                boolean z10;
                if (i10 == i14 && i12 == i16 && i13 == i17 && i11 == i15) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    e.this.b();
                }
            }
        });
        b();
        setContentView(this.f17321a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        double d10;
        Point a10 = com.applovin.impl.sdk.utils.h.a(getContext());
        boolean z10 = AppLovinSdkUtils.getOrientation(getContext()) == 1;
        double d11 = 0.2d;
        if (true ^ AppLovinSdkUtils.isTablet(getContext())) {
            d10 = 0.05d;
            if (z10) {
                d11 = 0.05d;
            }
        } else if (z10) {
            d11 = 0.1d;
            d10 = 0.1d;
        } else {
            d10 = 0.075d;
        }
        int i10 = (int) (a10.x * d11);
        int i11 = (int) (a10.y * d10);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f17321a.getLayoutParams();
        layoutParams.setMargins(i10, i11, i10, i11);
        this.f17321a.setLayoutParams(layoutParams);
        this.f17322b.a();
        this.f17323c.a();
        this.f.a();
        this.f17324d.a();
        this.f17325e.a();
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt("current_showing_view_id", this.f17326g);
        bundle.putBoolean("advertising_partners_switch_state", this.f17322b.getPersonalizedAdvertisingSwitch().isChecked());
        bundle.putBoolean("analytics_partners_switch_state", this.f17322b.getAnalyticsPurposesSwitch().isChecked());
        bundle.putBoolean("privacy_policy_switch_state", this.f17322b.getPrivacyPolicySwitch().isChecked());
        return bundle;
    }

    private void a(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int i10 = bundle.getInt("current_showing_view_id");
        if (i10 != 0) {
            a(a(i10), i10);
        }
        this.f17322b.getPersonalizedAdvertisingSwitch().setChecked(bundle.getBoolean("advertising_partners_switch_state"));
        this.f17322b.getAnalyticsPurposesSwitch().setChecked(bundle.getBoolean("analytics_partners_switch_state"));
        this.f17322b.getPrivacyPolicySwitch().setChecked(bundle.getBoolean("privacy_policy_switch_state"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(View view) {
        this.f17321a.removeView(view);
        this.f17326g = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(View view, int i10) {
        if (view.getParent() != null) {
            view.bringToFront();
        } else {
            this.f17321a.addView(view);
            this.f17326g = i10;
        }
    }

    private View a(int i10) {
        if (i10 == 0) {
            return this.f17322b;
        }
        if (i10 == 1) {
            return this.f;
        }
        if (i10 == 2) {
            return this.f17324d;
        }
        if (i10 == 3) {
            return this.f17325e;
        }
        return this.f17323c;
    }
}
