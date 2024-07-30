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
import com.huawei.openalliance.ad.ppskit.utils.m;
import ka.n7;

@OuterVisible
/* loaded from: classes2.dex */
public class NetworkLoadStatusView extends RelativeLayout {

    /* renamed from: s, reason: collision with root package name */
    public int f23584s;

    /* renamed from: t, reason: collision with root package name */
    public String f23585t;

    /* renamed from: u, reason: collision with root package name */
    public b f23586u;

    /* renamed from: v, reason: collision with root package name */
    public ImageView f23587v;

    /* renamed from: w, reason: collision with root package name */
    public TextView f23588w;

    /* renamed from: x, reason: collision with root package name */
    public Button f23589x;
    public final a y;

    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            b bVar = NetworkLoadStatusView.this.f23586u;
            if (bVar == null) {
                return;
            }
            bVar.onClick(view);
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        void onClick(View view);
    }

    @OuterVisible
    public NetworkLoadStatusView(Context context) {
        super(context);
        this.f23584s = 1;
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
            View inflate = LayoutInflater.from(getContext()).inflate(R.layout.webview_status_view, this);
            this.f23587v = (ImageView) inflate.findViewById(R.id.nonwifi);
            if (m.y()) {
                imageView = this.f23587v;
                i10 = R.drawable.opendevice_ic_wlan_emui10;
            } else {
                imageView = this.f23587v;
                i10 = R.drawable.opendevice_ic_wlan;
            }
            imageView.setImageResource(i10);
            this.f23588w = (TextView) inflate.findViewById(R.id.network_tip);
            Button button = (Button) inflate.findViewById(R.id.privacy_set_network);
            this.f23589x = button;
            button.requestFocus();
            inflate.setOnClickListener(this.y);
            return;
        }
        throw new IllegalStateException("StatusView can host only one direct child");
    }

    public int getCurrentState() {
        return this.f23584s;
    }

    public void setErrorText(String str) {
        this.f23585t = str;
    }

    public void setOnEmptyClickListener(b bVar) {
        this.f23586u = bVar;
    }

    public void setState(int i10) {
        n7.c("NetworkLoadStatusView", "setState:%s", Integer.valueOf(i10));
        this.f23584s = i10;
        if (i10 != -2) {
            if (i10 != -1) {
                if (i10 == 0) {
                    setChildViewVisibility(0);
                    return;
                }
                return;
            } else {
                n7.b("NetworkLoadStatusView", "displayError");
                this.f23584s = -1;
                this.f23587v.setVisibility(0);
                this.f23588w.setVisibility(0);
                this.f23588w.setText(this.f23585t);
                this.f23589x.setVisibility(8);
            }
        } else {
            n7.b("NetworkLoadStatusView", "displayNotNetwork");
            this.f23584s = -2;
            this.f23587v.setVisibility(0);
            this.f23588w.setVisibility(0);
            this.f23589x.setVisibility(0);
            this.f23589x.setOnClickListener(this.y);
        }
        setChildViewVisibility(8);
    }

    @OuterVisible
    public NetworkLoadStatusView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23584s = 1;
        this.y = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a0.a.f15l0);
        try {
            this.f23585t = obtainStyledAttributes.getString(0);
            obtainStyledAttributes.recycle();
            a();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
