package com.huawei.hms.ads.nativead;

import android.view.View;
import android.view.ViewGroup;
import androidx.transition.n;
import com.huawei.hms.ads.VideoOperator;
import com.huawei.hms.ads.annotation.GlobalApi;
import com.huawei.hms.ads.bw;
import com.huawei.hms.ads.by;
import com.huawei.hms.ads.bz;
import com.huawei.hms.ads.ex;
import com.huawei.hms.ads.ft;
import com.huawei.hms.ads.fu;
import com.huawei.hms.ads.jt;
import com.huawei.hms.ads.ju;
import com.huawei.openalliance.ad.constant.w;
import com.huawei.openalliance.ad.inter.data.e;
import com.huawei.openalliance.ad.inter.data.j;
import com.huawei.openalliance.ad.views.NativeVideoView;
import com.huawei.openalliance.ad.views.NativeWindowImageView;
import com.huawei.openalliance.ad.views.PPSNativeView;
import gb.y;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

@GlobalApi
/* loaded from: classes2.dex */
public final class NativeAdMonitor implements View.OnAttachStateChangeListener, ft {
    private static final String Code = "NativeAdMonitor";
    private static WeakHashMap<View, NativeAdMonitor> V = new WeakHashMap<>();
    private View B;
    private by C;
    private ju D;
    private jt F;
    private List<View> I;
    private j L;
    private fu S;
    private List<View> Z;
    private PPSNativeView.j f;

    /* renamed from: g, reason: collision with root package name */
    private PPSNativeView.m f21764g;

    /* renamed from: h, reason: collision with root package name */
    private DislikeAdListener f21765h;

    /* renamed from: a, reason: collision with root package name */
    private boolean f21759a = true;

    /* renamed from: b, reason: collision with root package name */
    private boolean f21760b = false;

    /* renamed from: c, reason: collision with root package name */
    private final String f21761c = w.ah + hashCode();

    /* renamed from: d, reason: collision with root package name */
    private final String f21762d = w.ai + hashCode();

    /* renamed from: e, reason: collision with root package name */
    private boolean f21763e = false;

    /* renamed from: i, reason: collision with root package name */
    private View.OnClickListener f21766i = new View.OnClickListener() { // from class: com.huawei.hms.ads.nativead.NativeAdMonitor.2
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!NativeAdMonitor.this.f21759a) {
                return;
            }
            NativeAdMonitor.this.f21759a = false;
            ex.V(NativeAdMonitor.Code, "onClick");
            NativeAdMonitor.this.f21763e = true;
            if (NativeAdMonitor.this.f != null) {
                NativeAdMonitor.this.f.Code(view);
            }
            NativeAdMonitor.this.C.V();
            NativeAdMonitor.this.Code((Integer) 1, true);
            gb.w.a(500L, new Runnable() { // from class: com.huawei.hms.ads.nativead.NativeAdMonitor.2.1
                @Override // java.lang.Runnable
                public void run() {
                    NativeAdMonitor.this.f21759a = true;
                }
            });
        }
    };

    /* renamed from: j, reason: collision with root package name */
    private View.OnClickListener f21767j = new View.OnClickListener() { // from class: com.huawei.hms.ads.nativead.NativeAdMonitor.3
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    };

    @GlobalApi
    public NativeAdMonitor(View view, Map<String, View> map, Map<String, View> map2) {
        String str;
        String str2;
        this.I = new ArrayList();
        this.Z = new ArrayList();
        if (view instanceof NativeView) {
            str = Code;
            str2 = "containerView can't be an instance of NativeView class or NativeView subclass";
        } else if (view == null) {
            str = Code;
            str2 = "containerView can't be null";
        } else {
            if (V.get(view) == null) {
                V.put(view, this);
                this.B = view;
                this.C = new bz(view.getContext(), this.B);
                this.S = new fu(view, this);
                this.B.addOnAttachStateChangeListener(this);
                if (map != null) {
                    this.I = new ArrayList(map.values());
                }
                if (map2 != null) {
                    this.Z = new ArrayList(map2.values());
                    return;
                }
                return;
            }
            str = Code;
            str2 = "containerView has been existed in other NativeAdMonitor object.";
        }
        ex.I(str, str2);
    }

    private MediaView Code(View view) {
        LinkedList linkedList = new LinkedList();
        if (view instanceof ViewGroup) {
            linkedList.add(view);
        }
        while (linkedList.size() > 0) {
            View view2 = (View) linkedList.poll();
            if (view2 instanceof MediaView) {
                return (MediaView) view2;
            }
            if (view2 instanceof ViewGroup) {
                int i10 = 0;
                while (true) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    if (i10 < viewGroup.getChildCount()) {
                        linkedList.offer(viewGroup.getChildAt(i10));
                        i10++;
                    }
                }
            }
        }
        return null;
    }

    private void D() {
        if (n.h(this.Z)) {
            return;
        }
        for (View view : this.Z) {
            if (view != null) {
                view.setClickable(true);
            }
        }
    }

    private void F() {
        if (n.h(this.I)) {
            return;
        }
        for (View view : this.I) {
            if (view != null) {
                view.setOnClickListener(null);
            }
        }
    }

    private void S() {
        j jVar;
        if (Code() && (jVar = this.L) != null && !jVar.E) {
            ex.V(Code, " maybe report show start.");
            I();
        }
    }

    public void Z() {
        ex.V(Code, "onClose");
        Code((List<String>) null);
    }

    @Override // com.huawei.hms.ads.ft
    public void a_() {
        j jVar = this.L;
        if (jVar != null) {
            gb.w.c(new Runnable() { // from class: com.huawei.hms.ads.nativead.NativeAdMonitor.4
                @Override // java.lang.Runnable
                public void run() {
                    j jVar2 = NativeAdMonitor.this.L;
                    if (jVar2 != null) {
                        NativeAdMonitor.this.Code(Long.valueOf(jVar2.s()), Integer.valueOf(NativeAdMonitor.this.S.I()), null, false);
                    }
                }
            }, this.f21761c, jVar.s());
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        fu fuVar = this.S;
        if (fuVar != null) {
            fuVar.D();
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        ex.V(Code, "onDetachedFromWindow");
        fu fuVar = this.S;
        if (fuVar != null) {
            fuVar.L();
        }
    }

    @GlobalApi
    public void setNativeAd(NativeAd nativeAd) {
        gb.w.d(this.f21762d);
        gb.w.d(this.f21761c);
        if (nativeAd == null) {
            ex.V(Code, "nativeAd is null, can't set the nativeAd now.");
            return;
        }
        if (nativeAd instanceof bw) {
            ((bw) nativeAd).Code(this);
        }
        Code(nativeAd);
    }

    @GlobalApi
    public void unregister() {
        gb.w.d(this.f21762d);
        gb.w.d(this.f21761c);
        j jVar = this.L;
        if (jVar != null) {
            jVar.E = false;
        }
        View view = this.B;
        if (view != null) {
            view.setOnClickListener(null);
        }
        this.L = null;
        this.S.V();
        this.C.Code((j) null);
        this.f21765h = null;
        F();
        D();
        jt jtVar = this.F;
        if (jtVar != null) {
            jtVar.setNativeAd(null);
        }
        this.F = null;
    }

    private void C() {
        j jVar = this.L;
        if (this.B == null || jVar == null) {
            return;
        }
        gb.w.c(new Runnable() { // from class: com.huawei.hms.ads.nativead.NativeAdMonitor.1
            @Override // java.lang.Runnable
            public void run() {
                j jVar2 = NativeAdMonitor.this.L;
                if (NativeAdMonitor.this.B != null && jVar2 != null) {
                    NativeAdMonitor.this.S.a();
                }
            }
        }, this.f21762d, jVar.s() / 2);
    }

    @Override // com.huawei.hms.ads.ft
    public void I() {
        PPSNativeView.m mVar;
        this.f21760b = false;
        String valueOf = String.valueOf(System.currentTimeMillis());
        j jVar = this.L;
        if (jVar == null) {
            ex.V(Code, "nativeAd is null, please register first");
            return;
        }
        jVar.A = false;
        jVar.Z(false);
        this.L.E = true;
        if (this.f21763e && (mVar = this.f21764g) != null) {
            this.f21763e = false;
            mVar.Z();
        }
        j jVar2 = this.L;
        if (!jVar2.f22278z) {
            jVar2.f22278z = true;
        }
        this.C.Code(valueOf);
        jt jtVar = this.F;
        if (jtVar != null) {
            jtVar.Code(valueOf);
        }
        this.C.Code();
    }

    @Override // com.huawei.hms.ads.ft
    public void V(long j10, int i10) {
        gb.w.d(this.f21761c);
        j jVar = this.L;
        if (jVar != null) {
            jVar.E = false;
        }
        this.C.Code(j10, i10);
    }

    @Override // com.huawei.hms.ads.ft
    public void Code(long j10, int i10) {
        gb.w.d(this.f21761c);
        if (!this.S.Code(j10) || this.f21760b) {
            return;
        }
        this.f21760b = true;
        Code(Long.valueOf(j10), Integer.valueOf(i10), null, false);
    }

    private void V(List<View> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (View view : list) {
            if (view instanceof MediaView) {
                NativeVideoView videoView = ((MediaView) view).getVideoView();
                if (videoView != null) {
                    videoView.setCoverClickListener(this.f21766i);
                    view = videoView.getPreviewImageView();
                    view.setOnClickListener(this.f21766i);
                }
            } else if (view != null) {
                view.setOnClickListener(this.f21766i);
            }
        }
    }

    public void Code(DislikeAdListener dislikeAdListener) {
        this.f21765h = dislikeAdListener;
    }

    private void Code(NativeAd nativeAd) {
        View view = this.B;
        if (view == null || V.get(view) == null) {
            ex.V(Code, "container view is null, please add a container view first.");
            return;
        }
        if (nativeAd instanceof bw) {
            e Code2 = ((bw) nativeAd).Code();
            if (Code2 instanceof j) {
                j jVar = (j) Code2;
                this.L = jVar;
                this.S.V(jVar.s(), this.L.t());
                this.C.Code(this.L);
                this.B.setOnClickListener(this.f21766i);
                MediaView Code3 = Code(this.B);
                if (Code3 != null) {
                    b mediaViewAdapter = Code3.getMediaViewAdapter();
                    mediaViewAdapter.Code(nativeAd);
                    VideoOperator videoOperator = nativeAd.getVideoOperator();
                    if (videoOperator instanceof c) {
                        ((c) videoOperator).Code(Code3);
                    }
                    View B = mediaViewAdapter.B();
                    if (B instanceof NativeVideoView) {
                        NativeVideoView nativeVideoView = (NativeVideoView) B;
                        this.F = nativeVideoView;
                        nativeVideoView.setCoverClickListener(this.f21767j);
                        this.F.setNativeAd(Code2);
                    }
                    if (B instanceof NativeWindowImageView) {
                        NativeWindowImageView nativeWindowImageView = (NativeWindowImageView) B;
                        this.D = nativeWindowImageView;
                        nativeWindowImageView.setNativeAd(Code2);
                        this.D.setDisplayView(this.B);
                    }
                }
                V(this.I);
                I(this.Z);
            }
        }
        S();
        C();
    }

    public void Code(PPSNativeView.j jVar) {
        this.f = jVar;
    }

    public void Code(PPSNativeView.m mVar) {
        this.f21764g = mVar;
        this.C.Code(mVar);
    }

    public void Code(Integer num, boolean z10) {
        Code(Long.valueOf(System.currentTimeMillis() - this.S.Z()), Integer.valueOf(this.S.I()), num, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Code(Long l10, Integer num, Integer num2, boolean z10) {
        j jVar = this.L;
        if (jVar == null) {
            return;
        }
        boolean b10 = y.b(jVar.b_(), num2);
        j jVar2 = this.L;
        if (!jVar2.A || (b10 && !jVar2.U())) {
            this.C.Code(l10, num, num2, z10);
            if (b10) {
                this.L.Z(true);
            }
            j jVar3 = this.L;
            if (jVar3.A) {
                return;
            }
            jVar3.A = true;
            PPSNativeView.m mVar = this.f21764g;
            if (mVar != null) {
                mVar.B();
            }
        }
    }

    private void I(List<View> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (View view : list) {
            if (view instanceof MediaView) {
                NativeVideoView videoView = ((MediaView) view).getVideoView();
                if (videoView != null) {
                    videoView.setCoverClickListener(this.f21767j);
                    view = videoView.getPreviewImageView();
                    view.setOnClickListener(null);
                }
            } else if (view != null) {
                view.setClickable(false);
                view.setOnClickListener(null);
            }
        }
    }

    public void Code(List<String> list) {
        ex.V(Code, "onClose keyWords");
        this.C.Code(list);
        Code((Integer) 3, false);
        jt jtVar = this.F;
        if (jtVar != null) {
            jtVar.S();
        }
        DislikeAdListener dislikeAdListener = this.f21765h;
        if (dislikeAdListener != null) {
            dislikeAdListener.onAdDisliked();
        }
        unregister();
    }

    public boolean Code() {
        fu fuVar = this.S;
        if (fuVar != null) {
            return fuVar.d();
        }
        return false;
    }
}
