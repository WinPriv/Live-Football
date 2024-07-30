package com.anythink.basead.ui;

import android.content.Context;
import android.widget.RelativeLayout;
import com.anythink.basead.ui.MraidContainerView;
import com.anythink.core.common.e.i;
import com.anythink.core.common.e.j;

/* loaded from: classes.dex */
public class MraidEndCardView extends BaseEndCardView {

    /* renamed from: g, reason: collision with root package name */
    private static String f4321g = "MraidEndCardView";

    /* renamed from: e, reason: collision with root package name */
    MraidContainerView f4322e;
    a f;

    /* loaded from: classes.dex */
    public interface a {
        void a();

        void a(String str);

        void b();
    }

    public MraidEndCardView(Context context, i iVar, j jVar) {
        super(context, iVar, jVar);
        setBackgroundColor(-1);
    }

    @Override // com.anythink.basead.ui.BaseEndCardView
    public final void a() {
        MraidContainerView mraidContainerView = this.f4322e;
        if (mraidContainerView != null) {
            mraidContainerView.release();
        }
    }

    public void init(boolean z10) {
        MraidContainerView mraidContainerView = new MraidContainerView(getContext(), this.f4145b, this.f4146c, new MraidContainerView.a() { // from class: com.anythink.basead.ui.MraidEndCardView.1
            @Override // com.anythink.basead.ui.MraidContainerView.a
            public final void a(String str) {
                a aVar = MraidEndCardView.this.f;
                if (aVar != null) {
                    aVar.a(str);
                }
            }

            @Override // com.anythink.basead.ui.MraidContainerView.a
            public final void b() {
                a aVar = MraidEndCardView.this.f;
                if (aVar != null) {
                    aVar.b();
                }
            }

            @Override // com.anythink.basead.ui.MraidContainerView.a
            public final void a() {
                a aVar = MraidEndCardView.this.f;
                if (aVar != null) {
                    aVar.a();
                }
            }
        });
        this.f4322e = mraidContainerView;
        addView(mraidContainerView, new RelativeLayout.LayoutParams(-1, -1));
        this.f4322e.setNeedRegisterVolumeChangeReceiver(true);
        this.f4322e.init();
        if (z10) {
            this.f4322e.loadMraidWebView();
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        MraidContainerView mraidContainerView = this.f4322e;
        if (mraidContainerView != null) {
            mraidContainerView.fireMraidIsViewable(z10);
        }
    }

    public void setEndCardListener(a aVar) {
        this.f = aVar;
    }
}
