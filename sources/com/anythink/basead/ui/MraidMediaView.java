package com.anythink.basead.ui;

import android.content.Context;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.anythink.basead.ui.BaseMediaAdView;
import com.anythink.basead.ui.MraidContainerView;
import com.anythink.core.common.e.i;
import com.anythink.core.common.e.j;

/* loaded from: classes.dex */
public class MraidMediaView extends BaseMediaAdView {

    /* renamed from: g, reason: collision with root package name */
    private MraidContainerView f4324g;

    /* renamed from: h, reason: collision with root package name */
    private a f4325h;

    /* loaded from: classes.dex */
    public interface a {
        void a();

        void a(String str);
    }

    public MraidMediaView(Context context) {
        this(context, null, null, false, null);
    }

    @Override // com.anythink.basead.ui.BaseMediaAdView
    public void destroy() {
        super.destroy();
        MraidContainerView mraidContainerView = this.f4324g;
        if (mraidContainerView != null) {
            mraidContainerView.release();
        }
    }

    public void fireAudioVolumeChange(boolean z10) {
        MraidContainerView mraidContainerView = this.f4324g;
        if (mraidContainerView != null) {
            mraidContainerView.fireAudioVolumeChange(z10);
        }
    }

    @Override // com.anythink.basead.ui.BaseMediaAdView
    public void init(int i10, int i11) {
        super.init(i10, i11);
        MraidContainerView mraidContainerView = new MraidContainerView(getContext(), this.f4149a, this.f4151c, new AnonymousClass1());
        this.f4324g = mraidContainerView;
        mraidContainerView.init();
        FrameLayout frameLayout = this.f;
        if (frameLayout != null && this.f4324g != null) {
            frameLayout.removeAllViews();
            this.f.addView(this.f4324g, new ViewGroup.LayoutParams(-1, -1));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        MraidContainerView mraidContainerView = this.f4324g;
        if (mraidContainerView != null) {
            mraidContainerView.fireMraidIsViewable(z10);
        }
    }

    public void setMraidWebViewListener(a aVar) {
        this.f4325h = aVar;
    }

    /* renamed from: com.anythink.basead.ui.MraidMediaView$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass1 implements MraidContainerView.a {
        public AnonymousClass1() {
        }

        @Override // com.anythink.basead.ui.MraidContainerView.a
        public final void a(String str) {
            if (MraidMediaView.this.f4325h != null) {
                MraidMediaView.this.f4325h.a(str);
            }
        }

        @Override // com.anythink.basead.ui.MraidContainerView.a
        public final void a() {
            if (MraidMediaView.this.f4325h != null) {
                MraidMediaView.this.f4325h.a();
            }
        }

        @Override // com.anythink.basead.ui.MraidContainerView.a
        public final void b() {
        }
    }

    public MraidMediaView(Context context, i iVar, j jVar, boolean z10, BaseMediaAdView.a aVar) {
        super(context, iVar, jVar, z10, aVar);
    }

    private void a() {
        MraidContainerView mraidContainerView = new MraidContainerView(getContext(), this.f4149a, this.f4151c, new AnonymousClass1());
        this.f4324g = mraidContainerView;
        mraidContainerView.init();
        FrameLayout frameLayout = this.f;
        if (frameLayout == null || this.f4324g == null) {
            return;
        }
        frameLayout.removeAllViews();
        this.f.addView(this.f4324g, new ViewGroup.LayoutParams(-1, -1));
    }

    private static void a(String str) {
        Log.d("MraidMediaView", str);
    }
}
