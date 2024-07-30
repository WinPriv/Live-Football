package com.huawei.hms.ads.instreamad;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.huawei.hms.ads.MediaMuteListener;
import com.huawei.hms.ads.annotation.GlobalApi;
import com.huawei.hms.ads.fl;
import com.huawei.hms.ads.ke;
import com.huawei.hms.ads.kf;
import com.huawei.hms.ads.x;
import com.huawei.openalliance.ad.inter.data.f;
import com.huawei.openalliance.ad.views.PPSPlacementView;
import java.util.ArrayList;
import java.util.List;

@GlobalApi
/* loaded from: classes2.dex */
public class InstreamView extends PPSPlacementView implements IInstreamView {
    private View B;
    private OnInstreamAdClickListener C;
    private InstreamMediaStateListener D;
    private InstreamMediaChangeListener F;
    private MediaMuteListener L;
    private fl S;

    @GlobalApi
    /* loaded from: classes2.dex */
    public interface OnInstreamAdClickListener {
        void onClick();
    }

    /* loaded from: classes2.dex */
    public class a implements fl {
        private a() {
        }

        @Override // com.huawei.hms.ads.fl
        public void Code() {
            if (InstreamView.this.L != null) {
                InstreamView.this.L.onMute();
            }
        }

        @Override // com.huawei.hms.ads.fl
        public void V() {
            if (InstreamView.this.L != null) {
                InstreamView.this.L.onUnmute();
            }
        }
    }

    @GlobalApi
    public InstreamView(Context context) {
        super(context);
        this.F = null;
        this.D = null;
        this.L = null;
        Code(context);
    }

    @Override // com.huawei.hms.ads.instreamad.IInstreamView
    public void destroy() {
        super.destroyView();
    }

    @Override // com.huawei.hms.ads.instreamad.IInstreamView
    public View getCallToActionView() {
        return this.B;
    }

    @Override // com.huawei.openalliance.ad.views.PPSPlacementView
    @GlobalApi
    public void hideAdvertiserInfoDialog() {
        super.hideAdvertiserInfoDialog();
    }

    @Override // com.huawei.openalliance.ad.views.PPSPlacementView, com.huawei.hms.ads.instreamad.IInstreamView
    public boolean isPlaying() {
        return super.isPlaying();
    }

    @Override // com.huawei.hms.ads.instreamad.IInstreamView
    public void mute() {
        super.C();
    }

    @Override // com.huawei.openalliance.ad.views.PPSPlacementView, com.huawei.hms.ads.instreamad.IInstreamView
    public void onClose() {
        super.Code((Integer) 3);
        super.onClose();
    }

    @Override // com.huawei.openalliance.ad.views.PPSPlacementView, com.huawei.hms.ads.instreamad.IInstreamView
    public void pause() {
        super.pauseView();
    }

    @Override // com.huawei.hms.ads.instreamad.IInstreamView
    public void play() {
        super.resumeView();
    }

    @Override // com.huawei.hms.ads.instreamad.IInstreamView
    public void registerOverlays(List<View> list) {
        setOverlays(list);
    }

    @Override // com.huawei.hms.ads.instreamad.IInstreamView
    public void removeInstreamMediaChangeListener() {
        this.F = null;
    }

    @Override // com.huawei.hms.ads.instreamad.IInstreamView
    public void removeInstreamMediaStateListener() {
        this.D = null;
    }

    @Override // com.huawei.hms.ads.instreamad.IInstreamView
    public void removeMediaMuteListener() {
        V(this.S);
        this.S = null;
        this.L = null;
    }

    @Override // com.huawei.hms.ads.instreamad.IInstreamView
    public void setCallToActionView(View view) {
        this.B = view;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        V(arrayList);
    }

    @Override // com.huawei.hms.ads.instreamad.IInstreamView
    public void setInstreamAds(List<InstreamAd> list) {
        if (list != null && list.size() != 0) {
            ArrayList arrayList = new ArrayList();
            for (InstreamAd instreamAd : list) {
                if (instreamAd instanceof x) {
                    arrayList.add(((x) instreamAd).Code());
                }
            }
            Code(arrayList);
        }
    }

    @Override // com.huawei.hms.ads.instreamad.IInstreamView
    public void setInstreamMediaChangeListener(InstreamMediaChangeListener instreamMediaChangeListener) {
        this.F = instreamMediaChangeListener;
    }

    @Override // com.huawei.hms.ads.instreamad.IInstreamView
    public void setInstreamMediaStateListener(InstreamMediaStateListener instreamMediaStateListener) {
        this.D = instreamMediaStateListener;
    }

    @Override // com.huawei.hms.ads.instreamad.IInstreamView
    public void setMediaMuteListener(MediaMuteListener mediaMuteListener) {
        this.L = mediaMuteListener;
        fl flVar = this.S;
        if (flVar == null) {
            flVar = new a();
            this.S = flVar;
        }
        Code(flVar);
    }

    @Override // com.huawei.hms.ads.instreamad.IInstreamView
    public void setOnInstreamAdClickListener(OnInstreamAdClickListener onInstreamAdClickListener) {
        this.C = onInstreamAdClickListener;
    }

    @Override // com.huawei.openalliance.ad.views.PPSPlacementView
    @GlobalApi
    public void showAdvertiserInfoDialog(View view, boolean z10) {
        super.showAdvertiserInfoDialog(view, z10);
    }

    @Override // com.huawei.openalliance.ad.views.PPSPlacementView, com.huawei.hms.ads.instreamad.IInstreamView
    public void stop() {
        super.stop();
    }

    @Override // com.huawei.hms.ads.instreamad.IInstreamView
    public void unmute() {
        super.S();
    }

    @GlobalApi
    public InstreamView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.F = null;
        this.D = null;
        this.L = null;
        Code(context);
    }

    private void Code(final Context context) {
        setGravity(17);
        Code(new kf() { // from class: com.huawei.hms.ads.instreamad.InstreamView.1
            @Override // com.huawei.hms.ads.kf
            public void Code(int i10) {
                if (InstreamView.this.D != null) {
                    InstreamView.this.D.onMediaStart(i10);
                }
            }

            @Override // com.huawei.hms.ads.kf
            public void I(int i10) {
                if (InstreamView.this.D != null) {
                    InstreamView.this.D.onMediaStop(i10);
                }
            }

            @Override // com.huawei.hms.ads.kf
            public void V(int i10) {
                if (InstreamView.this.D != null) {
                    InstreamView.this.D.onMediaPause(i10);
                }
            }

            @Override // com.huawei.hms.ads.kf
            public void Z(int i10) {
                if (InstreamView.this.D != null) {
                    InstreamView.this.D.onMediaCompletion(i10);
                }
            }

            @Override // com.huawei.hms.ads.kf
            public void Code(int i10, int i11) {
                if (InstreamView.this.D != null) {
                    InstreamView.this.D.onMediaProgress(i10, i11);
                }
            }

            @Override // com.huawei.hms.ads.kf
            public void Code(int i10, int i11, int i12) {
                if (InstreamView.this.D != null) {
                    InstreamView.this.D.onMediaError(i10, i11, i12);
                }
            }
        });
        Code(new ke() { // from class: com.huawei.hms.ads.instreamad.InstreamView.2
            @Override // com.huawei.hms.ads.ke
            public void Code(f fVar) {
                if (InstreamView.this.F != null) {
                    InstreamView.this.F.onSegmentMediaChange(new x(context, fVar));
                }
            }
        });
        setOnPlacementAdClickListener(new PPSPlacementView.s() { // from class: com.huawei.hms.ads.instreamad.InstreamView.3
            @Override // com.huawei.openalliance.ad.views.PPSPlacementView.s
            public void Code() {
                if (InstreamView.this.C != null) {
                    InstreamView.this.C.onClick();
                }
            }
        });
        a aVar = new a();
        this.S = aVar;
        Code(aVar);
    }

    @GlobalApi
    public InstreamView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.F = null;
        this.D = null;
        this.L = null;
        Code(context);
    }
}
