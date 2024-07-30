package com.huawei.openalliance.ad.ppskit.augreality.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.huawei.openalliance.ad.ppskit.utils.e2;
import java.util.HashMap;
import ka.n7;
import na.d;

/* loaded from: classes2.dex */
public class PPSArHorizontalScrollView extends HorizontalScrollView implements View.OnClickListener {

    /* renamed from: s, reason: collision with root package name */
    public LinearLayout f22434s;

    /* renamed from: t, reason: collision with root package name */
    public int f22435t;

    /* renamed from: u, reason: collision with root package name */
    public int f22436u;

    /* renamed from: v, reason: collision with root package name */
    public d f22437v;

    /* renamed from: w, reason: collision with root package name */
    public final int f22438w;

    /* renamed from: x, reason: collision with root package name */
    public a f22439x;
    public final HashMap y;

    /* loaded from: classes2.dex */
    public interface a {
    }

    public PPSArHorizontalScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.y = new HashMap();
        int i10 = e2.b(getContext()).widthPixels;
        this.f22438w = i10;
        n7.e("MyHorizontalScrollView", "outMetrics.widthPixels" + i10);
    }

    public int getmChildViewWidth() {
        return this.f22435t;
    }

    public int getmScreenWitdh() {
        return this.f22438w;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f22434s = (LinearLayout) getChildAt(0);
    }

    public void setClickItemKListener(a aVar) {
        this.f22439x = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
    }
}
