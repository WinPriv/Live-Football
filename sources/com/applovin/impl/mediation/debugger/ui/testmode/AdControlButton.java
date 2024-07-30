package com.applovin.impl.mediation.debugger.ui.testmode;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.applovin.impl.sdk.utils.g;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.R;

/* loaded from: classes.dex */
public class AdControlButton extends RelativeLayout implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    private final Button f18185a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.adview.a f18186b;

    /* renamed from: c, reason: collision with root package name */
    private b f18187c;

    /* renamed from: d, reason: collision with root package name */
    private MaxAdFormat f18188d;

    /* renamed from: e, reason: collision with root package name */
    private a f18189e;

    /* loaded from: classes.dex */
    public interface a {
        void onClick(AdControlButton adControlButton);
    }

    /* loaded from: classes.dex */
    public enum b {
        LOAD,
        LOADING,
        SHOW
    }

    public AdControlButton(Context context) {
        this(context, null, 0);
    }

    private void a(b bVar) {
        if (b.LOADING == bVar) {
            setEnabled(false);
            this.f18186b.a();
        } else {
            setEnabled(true);
            this.f18186b.b();
        }
        this.f18185a.setText(b(bVar));
        this.f18185a.setBackgroundColor(c(bVar));
    }

    private String b(b bVar) {
        if (b.LOAD == bVar) {
            return "Load";
        }
        if (b.LOADING == bVar) {
            return "";
        }
        return "Show";
    }

    private int c(b bVar) {
        if (b.LOAD == bVar) {
            return g.a(R.color.applovin_sdk_brand_color, getContext());
        }
        if (b.LOADING == bVar) {
            return g.a(R.color.applovin_sdk_brand_color, getContext());
        }
        return g.a(R.color.applovin_sdk_adControlbutton_brightBlueColor, getContext());
    }

    public b getControlState() {
        return this.f18187c;
    }

    public MaxAdFormat getFormat() {
        return this.f18188d;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        a aVar = this.f18189e;
        if (aVar != null) {
            aVar.onClick(this);
        }
    }

    public void setControlState(b bVar) {
        if (this.f18187c != bVar) {
            a(bVar);
        }
        this.f18187c = bVar;
    }

    public void setFormat(MaxAdFormat maxAdFormat) {
        this.f18188d = maxAdFormat;
    }

    public void setOnClickListener(a aVar) {
        this.f18189e = aVar;
    }

    public AdControlButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AdControlButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Button button = new Button(getContext());
        this.f18185a = button;
        com.applovin.impl.adview.a aVar = new com.applovin.impl.adview.a(getContext(), 20, android.R.attr.progressBarStyleSmall);
        this.f18186b = aVar;
        b bVar = b.LOAD;
        this.f18187c = bVar;
        setBackgroundColor(0);
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1, 17));
        button.setTextColor(-1);
        button.setOnClickListener(this);
        frameLayout.addView(button, new FrameLayout.LayoutParams(-1, -1, 17));
        aVar.setColor(-1);
        addView(aVar, new FrameLayout.LayoutParams(-1, -1, 17));
        a(bVar);
    }
}
