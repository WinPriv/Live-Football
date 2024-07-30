package com.huawei.openalliance.ad.ppskit.linked.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.hamkho.livefoot.R;
import com.huawei.openalliance.ad.ppskit.activity.PPSActivity;
import com.huawei.openalliance.ad.ppskit.beans.inner.AdContentData;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.utils.d0;
import com.huawei.openalliance.ad.ppskit.views.AppDownloadButton;
import com.huawei.openalliance.ad.ppskit.views.CustomEmuiActionBar;
import com.huawei.openalliance.ad.ppskit.views.linkscroll.LinkScrollView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import ka.f7;
import ka.g7;
import ka.j7;
import ka.l7;
import ka.n7;

/* loaded from: classes2.dex */
public class LinkedLandView extends RelativeLayout implements wa.d {
    public final b A;

    /* renamed from: s, reason: collision with root package name */
    public f7 f22668s;

    /* renamed from: t, reason: collision with root package name */
    public LinkedLandVideoView f22669t;

    /* renamed from: u, reason: collision with root package name */
    public ArrayList f22670u;

    /* renamed from: v, reason: collision with root package name */
    public LinkedAppDetailView f22671v;

    /* renamed from: w, reason: collision with root package name */
    public LinkScrollView f22672w;

    /* renamed from: x, reason: collision with root package name */
    public CustomEmuiActionBar f22673x;
    public int y;

    /* renamed from: z, reason: collision with root package name */
    public final a f22674z;

    /* loaded from: classes2.dex */
    public class b implements c {
        public b() {
        }
    }

    /* loaded from: classes2.dex */
    public interface c {
    }

    public LinkedLandView(Context context) {
        super(context);
        this.f22674z = new a();
        this.A = new b();
        LayoutInflater.from(context).inflate(R.layout.hiad_linked_land_view, this);
        this.f22672w = (LinkScrollView) findViewById(R.id.hiad_landpage_scroll_view);
    }

    private void setNativeVideoViewClickable(wa.e eVar) {
        if (eVar instanceof LinkedLandVideoView) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((LinkedLandVideoView) eVar);
            b(arrayList);
        }
    }

    public final void b(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                View view = (View) it.next();
                boolean z10 = view instanceof LinkedLandVideoView;
                a aVar = this.f22674z;
                if (z10) {
                    ((LinkedLandVideoView) view).setCoverClickListener(aVar);
                } else if (view != null) {
                    view.setOnClickListener(aVar);
                }
            }
        }
    }

    public final void d(g7 g7Var) {
        String valueOf;
        ContentRecord contentRecord;
        n7.b("LinkedLandView", "registerLinkedAd");
        if (g7Var instanceof f7) {
            this.f22668s = (f7) g7Var;
            l7 l7Var = ((f7) g7Var).f31167c;
            if (l7Var != null) {
                valueOf = l7Var.f31407b;
            } else {
                HashMap hashMap = d0.f22830a;
                valueOf = String.valueOf(System.currentTimeMillis());
            }
            LinkedLandVideoView linkedLandVideoView = this.f22669t;
            if (linkedLandVideoView != null) {
                j7 j7Var = linkedLandVideoView.E;
                AdContentData adContentData = j7Var.f31323w;
                if (adContentData != null) {
                    adContentData.v(valueOf);
                }
                ContentRecord contentRecord2 = (ContentRecord) j7Var.f32660t;
                if (contentRecord2 != null) {
                    contentRecord2.V1(valueOf);
                }
            }
            LinkedAppDetailView linkedAppDetailView = this.f22671v;
            if (linkedAppDetailView != null) {
                ContentRecord contentRecord3 = linkedAppDetailView.y;
                if (contentRecord3 != null) {
                    contentRecord3.V1(valueOf);
                }
                AppDownloadButton appDownloadButton = linkedAppDetailView.f22653t;
                if (appDownloadButton != null && (contentRecord = appDownloadButton.P) != null) {
                    contentRecord.V1(valueOf);
                }
            }
        }
        this.f22669t = new LinkedLandVideoView(getContext());
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.linked_native_view);
        LinkedLandVideoView linkedLandVideoView2 = this.f22669t;
        if (linkedLandVideoView2 instanceof LinkedLandVideoView) {
            viewGroup.addView(linkedLandVideoView2);
            this.f22669t.setVideoReleaseListener(this.A);
            this.f22669t.setLinkedLandView(this);
            this.f22669t.setLinkedNativeAd(this.f22668s);
            setNativeVideoViewClickable(this.f22669t);
            this.f22671v = this.f22669t.T;
        }
        ArrayList arrayList = new ArrayList();
        LinkedLandVideoView linkedLandVideoView3 = this.f22669t;
        if (linkedLandVideoView3 instanceof LinkedLandVideoView) {
            arrayList.add(linkedLandVideoView3);
        }
        this.f22670u = arrayList;
        b(arrayList);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        n7.e("LinkedLandView", "onDetechedFromWindow");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
    }

    public void setPlayModeChangeListener(PPSActivity.k kVar) {
        LinkedLandVideoView linkedLandVideoView = this.f22669t;
        if (linkedLandVideoView instanceof LinkedLandVideoView) {
            linkedLandVideoView.setPlayModeChangeListener(kVar);
        }
    }

    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
        }
    }
}
