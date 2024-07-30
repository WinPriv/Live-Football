package com.huawei.openalliance.ad.ppskit.views.web;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.hamkho.livefoot.R;
import com.huawei.openalliance.ad.ppskit.annotations.OuterVisible;
import com.huawei.openalliance.ad.ppskit.utils.d2;
import com.huawei.openalliance.ad.ppskit.utils.m;
import ka.n7;

/* loaded from: classes2.dex */
public class PureNetworkLoadStatusView extends RelativeLayout {

    /* renamed from: s, reason: collision with root package name */
    public int f23591s;

    /* renamed from: t, reason: collision with root package name */
    public String f23592t;

    /* renamed from: u, reason: collision with root package name */
    public b f23593u;

    /* renamed from: v, reason: collision with root package name */
    public ImageView f23594v;

    /* renamed from: w, reason: collision with root package name */
    public TextView f23595w;

    /* renamed from: x, reason: collision with root package name */
    public Button f23596x;
    public final a y;

    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            b bVar = PureNetworkLoadStatusView.this.f23593u;
            if (bVar == null) {
                return;
            }
            PureWebView pureWebView = (PureWebView) bVar;
            pureWebView.getClass();
            d2.a(new db.a(pureWebView, view));
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
    }

    @OuterVisible
    public PureNetworkLoadStatusView(Context context) {
        super(context);
        this.f23591s = 1;
        this.y = new a();
        a();
    }

    private void setChildViewVisibility(int i10) {
        int i11;
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getId() == R.id.status_layout_main) {
                if (i10 == 0) {
                    i11 = 8;
                } else {
                    i11 = 0;
                }
                childAt.setVisibility(i11);
            } else {
                childAt.setVisibility(i10);
            }
        }
    }

    public final void a() {
        ImageView imageView;
        int i10;
        if (getChildCount() <= 1) {
            View inflate = LayoutInflater.from(getContext()).inflate(R.layout.pure_webview_status_view, this);
            this.f23594v = (ImageView) inflate.findViewById(R.id.nonwifi);
            if (m.y()) {
                imageView = this.f23594v;
                i10 = R.drawable.opendevice_ic_wlan_emui10;
            } else {
                imageView = this.f23594v;
                i10 = R.drawable.opendevice_ic_wlan;
            }
            imageView.setImageResource(i10);
            this.f23595w = (TextView) inflate.findViewById(R.id.network_tip);
            this.f23596x = (Button) inflate.findViewById(R.id.privacy_set_network);
            inflate.setOnClickListener(this.y);
            return;
        }
        throw new IllegalStateException("StatusView can host only one direct child");
    }

    public int getCurrentState() {
        return this.f23591s;
    }

    public void setErrorText(String str) {
        this.f23592t = str;
    }

    public void setOnEmptyClickListener(b bVar) {
        this.f23593u = bVar;
    }

    public void setState(int i10) {
        n7.c("PureNetworkLoadStatusView", "setState:%s", Integer.valueOf(i10));
        this.f23591s = i10;
        if (i10 != -2) {
            if (i10 != -1) {
                if (i10 == 0) {
                    setChildViewVisibility(0);
                    return;
                }
                return;
            } else {
                n7.b("PureNetworkLoadStatusView", "displayError");
                this.f23591s = -1;
                this.f23594v.setVisibility(0);
                this.f23595w.setVisibility(0);
                this.f23595w.setText(this.f23592t);
                this.f23596x.setVisibility(8);
            }
        } else {
            n7.b("PureNetworkLoadStatusView", "displayNotNetwork");
            this.f23591s = -2;
            this.f23594v.setVisibility(0);
            this.f23595w.setVisibility(0);
            this.f23596x.setVisibility(0);
            this.f23596x.setOnClickListener(this.y);
        }
        setChildViewVisibility(8);
    }

    @OuterVisible
    public PureNetworkLoadStatusView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23591s = 1;
        this.y = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a0.a.f15l0);
        try {
            this.f23592t = obtainStyledAttributes.getString(0);
            obtainStyledAttributes.recycle();
            a();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
