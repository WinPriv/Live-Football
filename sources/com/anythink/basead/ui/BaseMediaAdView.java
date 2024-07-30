package com.anythink.basead.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.anythink.core.common.e.i;
import com.anythink.core.common.e.j;
import com.anythink.core.common.e.k;
import com.anythink.core.common.k.h;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class BaseMediaAdView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    protected i f4149a;

    /* renamed from: b, reason: collision with root package name */
    protected k f4150b;

    /* renamed from: c, reason: collision with root package name */
    protected j f4151c;

    /* renamed from: d, reason: collision with root package name */
    protected a f4152d;

    /* renamed from: e, reason: collision with root package name */
    protected boolean f4153e;
    protected FrameLayout f;

    /* renamed from: g, reason: collision with root package name */
    private int f4154g;

    /* renamed from: h, reason: collision with root package name */
    private int f4155h;

    /* renamed from: i, reason: collision with root package name */
    private CloseImageView f4156i;

    /* renamed from: com.anythink.basead.ui.BaseMediaAdView$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass1 implements View.OnClickListener {
        public AnonymousClass1() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            a aVar = BaseMediaAdView.this.f4152d;
            if (aVar != null) {
                aVar.onClickCloseView();
            }
        }
    }

    /* loaded from: classes.dex */
    public interface a {
        void onClickCloseView();
    }

    public BaseMediaAdView(Context context) {
        super(context);
        this.f4154g = 0;
        this.f4155h = 0;
    }

    private void a() {
        CloseImageView closeImageView = this.f4156i;
        if (closeImageView == null) {
            return;
        }
        if (this.f4153e) {
            closeImageView.setVisibility(0);
        } else {
            closeImageView.setVisibility(8);
        }
        a(this.f4156i, this.f4150b.h());
        this.f4156i.setOnClickListener(new AnonymousClass1());
    }

    public List<View> getClickViews() {
        return new ArrayList();
    }

    public int getMediaViewHeight() {
        return this.f4155h;
    }

    public int getMediaViewWidth() {
        return this.f4154g;
    }

    public View getMonitorClickView() {
        return null;
    }

    public void init(int i10, int i11) {
        this.f4154g = i10;
        this.f4155h = i11;
        CloseImageView closeImageView = this.f4156i;
        if (closeImageView != null) {
            if (this.f4153e) {
                closeImageView.setVisibility(0);
            } else {
                closeImageView.setVisibility(8);
            }
            a(this.f4156i, this.f4150b.h());
            this.f4156i.setOnClickListener(new AnonymousClass1());
        }
    }

    public void notifyClick() {
        k kVar;
        CloseImageView closeImageView = this.f4156i;
        if (closeImageView != null && (kVar = this.f4150b) != null) {
            a(closeImageView, kVar.g());
        }
    }

    public BaseMediaAdView(Context context, i iVar, j jVar, boolean z10, a aVar) {
        super(context);
        this.f4154g = 0;
        this.f4155h = 0;
        this.f4149a = iVar;
        this.f4150b = jVar.f5664m;
        this.f4153e = z10;
        this.f4152d = aVar;
        this.f4151c = jVar;
        LayoutInflater.from(getContext()).inflate(h.a(getContext(), "base_myoffer_media_ad_view", "layout"), this);
        this.f = (FrameLayout) findViewById(h.a(getContext(), "base_media_view_content", "id"));
        this.f4156i = (CloseImageView) findViewById(h.a(getContext(), "base_media_ad_close", "id"));
    }

    private static void a(com.anythink.basead.ui.a aVar, int i10) {
        if (aVar != null) {
            aVar.setClickAreaScaleFactor(i10 != 2 ? i10 != 3 ? i10 != 4 ? 1.0f : 0.5f : 0.75f : 1.5f);
        }
    }

    public void destroy() {
    }
}
