package com.huawei.openalliance.ad.ppskit.linked.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.activity.n;
import com.hamkho.livefoot.R;
import com.huawei.hms.ads.gl;
import com.huawei.openalliance.ad.constant.ah;
import com.huawei.openalliance.ad.ppskit.activity.PPSActivity;
import com.huawei.openalliance.ad.ppskit.beans.inner.AdContentData;
import com.huawei.openalliance.ad.ppskit.beans.metadata.MetaData;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.inter.data.ImageInfo;
import com.huawei.openalliance.ad.ppskit.inter.data.VideoInfo;
import com.huawei.openalliance.ad.ppskit.linked.view.LinkedLandView;
import com.huawei.openalliance.ad.ppskit.linked.view.d;
import com.huawei.openalliance.ad.ppskit.sourcefetch.SourceParam;
import com.huawei.openalliance.ad.ppskit.utils.d2;
import com.huawei.openalliance.ad.ppskit.utils.k1;
import com.huawei.openalliance.ad.ppskit.utils.p2;
import com.huawei.openalliance.ad.ppskit.utils.v0;
import com.huawei.openalliance.ad.ppskit.utils.x;
import com.huawei.openalliance.ad.ppskit.utils.y1;
import com.huawei.openalliance.ad.ppskit.views.VideoView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import ka.e9;
import ka.f7;
import ka.f9;
import ka.g7;
import ka.g9;
import ka.h7;
import ka.h9;
import ka.i7;
import ka.i9;
import ka.j7;
import ka.k7;
import ka.n7;
import ka.n9;
import ka.p9;
import ka.r8;
import ka.w7;
import ka.y4;

/* loaded from: classes2.dex */
public class LinkedLandVideoView extends LinkedMediaView implements wa.e {
    public static final /* synthetic */ int U = 0;
    public LinkedLandView.c A;
    public boolean B;
    public com.huawei.openalliance.ad.ppskit.linked.view.d C;
    public f7 D;
    public j7 E;
    public VideoInfo F;
    public ImageInfo G;
    public boolean H;
    public long I;
    public LinkedNativeViewControlPanel J;
    public VideoView K;
    public Context L;
    public View M;
    public n9 N;
    public final b O;
    public long P;
    public long Q;
    public final f R;
    public final androidx.appcompat.widget.g S;
    public LinkedAppDetailView T;

    /* loaded from: classes2.dex */
    public class b implements i9 {
        public b() {
        }

        @Override // ka.i9
        public final void a() {
            int i10 = LinkedLandVideoView.U;
            n7.e("LinkedLandVideoView", "onMute");
            LinkedLandVideoView linkedLandVideoView = LinkedLandVideoView.this;
            VideoInfo videoInfo = linkedLandVideoView.F;
            if (videoInfo != null) {
                videoInfo.C = "n";
                j7 j7Var = linkedLandVideoView.E;
                n.L(j7Var.f31322v, (ContentRecord) j7Var.f32660t, true);
            }
            linkedLandVideoView.C.v(true);
        }

        @Override // ka.i9
        public final void b() {
            int i10 = LinkedLandVideoView.U;
            n7.e("LinkedLandVideoView", "onUnmute");
            LinkedLandVideoView linkedLandVideoView = LinkedLandVideoView.this;
            VideoInfo videoInfo = linkedLandVideoView.F;
            if (videoInfo != null) {
                videoInfo.C = "y";
                j7 j7Var = linkedLandVideoView.E;
                n.L(j7Var.f31322v, (ContentRecord) j7Var.f32660t, false);
            }
            linkedLandVideoView.C.v(false);
        }
    }

    /* loaded from: classes2.dex */
    public class c implements d.h {
        public c() {
        }

        public final void a() {
            j7 j7Var = LinkedLandVideoView.this.E;
            if (j7Var != null) {
                n.J(j7Var.f31322v, (ContentRecord) j7Var.f32660t, "playBtnStart", -111111L, -111111L, -111111, -111111);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class d implements h9 {
        public d() {
        }

        @Override // ka.h9
        public final void a(int i10, int i11) {
            long videoDuration;
            LinkedLandVideoView linkedLandVideoView = LinkedLandVideoView.this;
            if (linkedLandVideoView.E != null) {
                VideoInfo videoInfo = linkedLandVideoView.F;
                if (videoInfo == null) {
                    videoDuration = 0;
                } else {
                    videoDuration = videoInfo.getVideoDuration();
                }
                linkedLandVideoView.E.j(linkedLandVideoView.L, i11, videoDuration);
            }
        }

        @Override // ka.h9
        public final void h(w7 w7Var, int i10) {
            LinkedLandVideoView linkedLandVideoView = LinkedLandVideoView.this;
            LinkedLandVideoView.s(linkedLandVideoView, i10, false);
            linkedLandVideoView.getClass();
        }

        @Override // ka.h9
        public final void j(w7 w7Var, int i10) {
            if (n7.d()) {
                int i11 = LinkedLandVideoView.U;
                n7.c("LinkedLandVideoView", "onMediaStart: %s", Integer.valueOf(i10));
            }
            int i12 = LinkedLandVideoView.U;
            LinkedLandVideoView linkedLandVideoView = LinkedLandVideoView.this;
            linkedLandVideoView.getClass();
            if (linkedLandVideoView.B) {
                return;
            }
            linkedLandVideoView.B = true;
            linkedLandVideoView.Q = i10;
            linkedLandVideoView.P = System.currentTimeMillis();
            if (i10 > 0) {
                j7 j7Var = linkedLandVideoView.E;
                n.x0(j7Var.f31322v, (ContentRecord) j7Var.f32660t);
                return;
            }
            j7 j7Var2 = linkedLandVideoView.E;
            n.q0(j7Var2.f31322v, (ContentRecord) j7Var2.f32660t);
            j7 j7Var3 = linkedLandVideoView.E;
            n9 n9Var = linkedLandVideoView.N;
            long j10 = n9Var.f31500d;
            long j11 = n9Var.f31499c;
            long j12 = linkedLandVideoView.P;
            j7Var3.getClass();
            long j13 = 0;
            if (j10 != 0 && j10 < j12) {
                long j14 = j12 - j10;
                if (j11 != 0 && j11 < j12) {
                    j13 = j12 - j11;
                }
                a0.a.P(j7Var3.f31322v, (ContentRecord) j7Var3.f32660t, j14, j13);
            }
        }

        @Override // ka.h9
        public final void m(w7 w7Var, int i10) {
            LinkedLandVideoView linkedLandVideoView;
            LinkedLandVideoView linkedLandVideoView2 = LinkedLandVideoView.this;
            LinkedLandVideoView.s(linkedLandVideoView2, i10, true);
            LinkedLandView.c cVar = linkedLandVideoView2.A;
            if (cVar != null) {
                n7.b("LinkedLandView", "onVideoComplete");
                LinkedLandView linkedLandView = LinkedLandView.this;
                f7 f7Var = linkedLandView.f22668s;
                if (f7Var != null && f7Var.f == 1 && (linkedLandVideoView = linkedLandView.f22669t) != null) {
                    linkedLandVideoView.t();
                }
            }
            j7 j7Var = linkedLandVideoView2.E;
            if (j7Var != null) {
                long j10 = i10;
                j7Var.j(linkedLandVideoView2.L, j10, j10);
            }
        }

        @Override // ka.h9
        public final void o(w7 w7Var, int i10) {
            LinkedLandVideoView linkedLandVideoView = LinkedLandVideoView.this;
            LinkedLandVideoView.s(linkedLandVideoView, i10, false);
            linkedLandVideoView.getClass();
        }
    }

    /* loaded from: classes2.dex */
    public class f implements f9 {
        public f() {
        }

        @Override // ka.f9
        public final void g(w7 w7Var, int i10, int i11, int i12) {
            LinkedLandVideoView linkedLandVideoView = LinkedLandVideoView.this;
            LinkedLandVideoView.s(linkedLandVideoView, i10, false);
            LinkedLandView.c cVar = linkedLandVideoView.A;
            if (cVar != null) {
                n7.g("LinkedLandView", "onError");
                LinkedLandVideoView linkedLandVideoView2 = LinkedLandView.this.f22669t;
                if (linkedLandVideoView2 != null) {
                    linkedLandVideoView2.t();
                }
            }
            if (!linkedLandVideoView.y && !k1.g(linkedLandVideoView.getContext())) {
                linkedLandVideoView.C.A();
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface g {
    }

    public LinkedLandVideoView(Context context) {
        super(context);
        String str;
        this.B = false;
        this.H = false;
        a aVar = new a();
        b bVar = new b();
        this.O = bVar;
        c cVar = new c();
        d dVar = new d();
        e eVar = new e();
        f fVar = new f();
        this.R = fVar;
        androidx.appcompat.widget.g gVar = new androidx.appcompat.widget.g(5);
        this.S = gVar;
        try {
            this.L = context;
            if (n7.d()) {
                n7.b("LinkedLandVideoView", "init LinkedLandVideoView");
            }
            this.N = new n9("LinkedLandVideoView");
            this.E = new j7(context, this);
            this.M = LayoutInflater.from(context).inflate(R.layout.hiad_linked_native_video_view, this);
            this.K = (VideoView) findViewById(R.id.hiad_id_video_view);
            this.J = (LinkedNativeViewControlPanel) findViewById(R.id.hiad_link_native_video_ctrl_panel);
            this.T = (LinkedAppDetailView) findViewById(R.id.hiad_link_app_detail);
            this.K.setStandalone(true);
            this.K.setScreenOnWhilePlaying(true);
            this.K.setAutoScaleResizeLayoutOnVideoSizeChange(false);
            com.huawei.openalliance.ad.ppskit.linked.view.d dVar2 = new com.huawei.openalliance.ad.ppskit.linked.view.d(context, this.K, this.J);
            this.C = dVar2;
            dVar2.Z = gVar;
            dVar2.Y = cVar;
            this.K.E.add(dVar);
            this.K.F.add(eVar);
            this.K.v(fVar);
            this.K.w(bVar);
            this.K.J.add(aVar);
        } catch (RuntimeException unused) {
            str = "init RuntimeException";
            n7.g("LinkedLandVideoView", str);
        } catch (Exception unused2) {
            str = "init error";
            n7.g("LinkedLandVideoView", str);
        }
    }

    public static void s(LinkedLandVideoView linkedLandVideoView, int i10, boolean z10) {
        int i11;
        VideoInfo videoInfo = linkedLandVideoView.F;
        if (videoInfo != null) {
            if (z10) {
                i11 = 0;
            } else {
                i11 = i10;
            }
            videoInfo.B = i11;
        }
        linkedLandVideoView.N.c();
        if (linkedLandVideoView.B) {
            linkedLandVideoView.B = false;
            if (z10) {
                j7 j7Var = linkedLandVideoView.E;
                n.J(j7Var.f31322v, (ContentRecord) j7Var.f32660t, ah.Z, linkedLandVideoView.P, System.currentTimeMillis(), (int) linkedLandVideoView.Q, i10);
                return;
            }
            j7 j7Var2 = linkedLandVideoView.E;
            n.J(j7Var2.f31322v, (ContentRecord) j7Var2.f32660t, ah.C, linkedLandVideoView.P, System.currentTimeMillis(), (int) linkedLandVideoView.Q, i10);
        }
    }

    public final void a() {
        com.huawei.openalliance.ad.ppskit.linked.view.d dVar = this.C;
        VideoView videoView = dVar.f22692v;
        if (videoView != null) {
            videoView.b();
        }
        dVar.n(dVar.H);
        dVar.H();
        dVar.e();
    }

    @Override // wa.e
    public final void c(ImageInfo imageInfo, Drawable drawable) {
        ImageView imageView;
        ImageInfo imageInfo2 = this.G;
        if (imageInfo2 != null && imageInfo != null && TextUtils.equals(imageInfo2.getUrl(), imageInfo.getUrl()) && (imageView = this.C.G) != null) {
            imageView.setImageDrawable(drawable);
        }
    }

    @Override // com.huawei.openalliance.ad.ppskit.linked.view.LinkedMediaView
    public final void f() {
        boolean z10;
        if (this.S.c()) {
            this.C.c();
            return;
        }
        this.I = System.currentTimeMillis();
        this.C.w(true);
        u();
        n7.f("LinkedLandVideoView", "onViewFullShown hashCheckSuccess: %s", Boolean.valueOf(this.H));
        if (this.H) {
            VideoInfo videoInfo = this.F;
            if (videoInfo != null && TextUtils.equals(videoInfo.getVideoAutoPlay(), "y")) {
                z10 = true;
            } else {
                z10 = false;
            }
            n7.f("LinkedLandVideoView", "onViewFullShown autoplay: %s", Boolean.valueOf(z10));
            this.C.t(z10);
            this.C.r(getContinuePlayTime());
            this.C.l(this.F.getTimeBeforeVideoAutoPlay());
        }
    }

    @Override // com.huawei.openalliance.ad.ppskit.linked.view.LinkedMediaView
    public final void g() {
        n7.e("LinkedLandVideoView", "onViewPartialHidden");
        if (this.F != null) {
            this.C.w(false);
            this.C.t(false);
            d2.d(this.C.f22691u);
            VideoView videoView = this.C.f22692v;
            if (videoView != null) {
                videoView.c();
            }
            this.C.r(getContinuePlayTime());
        }
    }

    public float getAspectRatio() {
        Float videoRatio;
        VideoInfo videoInfo = this.F;
        if (videoInfo == null || (videoRatio = videoInfo.getVideoRatio()) == null) {
            return gl.Code;
        }
        return videoRatio.floatValue();
    }

    @Override // com.huawei.openalliance.ad.ppskit.linked.view.LinkedMediaView
    public int getAutoPlayAreaPercentageThresshold() {
        VideoInfo videoInfo = this.F;
        if (videoInfo != null) {
            return videoInfo.getAutoPlayAreaRatio();
        }
        return super.getAutoPlayAreaPercentageThresshold();
    }

    public int getContinuePlayTime() {
        VideoInfo videoInfo = this.F;
        if (videoInfo == null) {
            return 0;
        }
        int i10 = videoInfo.B;
        n7.c("LinkedLandVideoView", "getContinuePlayTime %s", Integer.valueOf(i10));
        return i10;
    }

    @Override // com.huawei.openalliance.ad.ppskit.linked.view.LinkedMediaView
    public int getHiddenAreaPercentageThreshhold() {
        VideoInfo videoInfo = this.F;
        if (videoInfo != null) {
            return Math.max(100 - videoInfo.getAutoStopPlayAreaRatio(), 0);
        }
        return super.getHiddenAreaPercentageThreshhold();
    }

    public g7 getLinkedNativeAd() {
        return this.D;
    }

    public ImageView getPreviewImageView() {
        return this.J.F;
    }

    public String getSoundSwtich() {
        VideoInfo videoInfo = this.F;
        if (videoInfo != null) {
            return videoInfo.getSoundSwitch();
        }
        return "n";
    }

    @Override // com.huawei.openalliance.ad.ppskit.linked.view.LinkedMediaView
    public final void h() {
        if (this.S.c()) {
            this.C.w(false);
            return;
        }
        n7.e("LinkedLandVideoView", "onViewShownBetweenFullAndPartial");
        this.C.r(getContinuePlayTime());
        this.C.w(true);
        u();
    }

    @Override // com.huawei.openalliance.ad.ppskit.linked.view.LinkedMediaView
    public final void r() {
        this.K.setNeedPauseOnSurfaceDestory(true);
    }

    public void setAudioFocusType(int i10) {
        this.K.setAudioFocusType(i10);
    }

    public void setCoverClickListener(View.OnClickListener onClickListener) {
        this.C.X = onClickListener;
        this.T.setVideoCoverClickListener(onClickListener);
    }

    @Override // wa.e
    public void setLinkedLandView(wa.d dVar) {
        this.S.f1174b = this.T;
    }

    @Override // com.huawei.openalliance.ad.ppskit.linked.view.LinkedMediaView, wa.e
    public void setLinkedNativeAd(f7 f7Var) {
        boolean z10;
        String string;
        String string2;
        String str;
        String str2;
        MetaData metaData;
        VideoView videoView;
        this.D = f7Var;
        this.S.f1175c = f7Var;
        r8 currentState = this.K.getCurrentState();
        if (this.D == f7Var && currentState.c(r8.b.IDLE) && currentState.c(r8.b.ERROR)) {
            n7.b("LinkedLandVideoView", "setLinkedNativeAd - has the same ad");
            return;
        }
        this.C.T = f7Var;
        super.setLinkedNativeAd(f7Var);
        this.H = false;
        com.huawei.openalliance.ad.ppskit.linked.view.d dVar = this.C;
        if (dVar.f22694x != null && (videoView = dVar.f22692v) != null) {
            videoView.setVideoFileUrl(null);
        }
        dVar.r(0);
        dVar.P = 0;
        VideoView videoView2 = dVar.f22692v;
        if (videoView2 != null) {
            videoView2.setDefaultDuration(0);
            com.huawei.openalliance.ad.ppskit.linked.view.d.p(dVar.C, 0);
        }
        dVar.Q = 0;
        ImageView imageView = dVar.G;
        if (imageView != null) {
            imageView.setImageBitmap(null);
        }
        dVar.e();
        dVar.H();
        j7 j7Var = this.E;
        if (f7Var != null) {
            j7Var.getClass();
            j7Var.f31323w = f7Var.f31165a;
            j7Var.f32660t = f7Var.f31166b;
        } else {
            j7Var.f31323w = null;
        }
        f7 f7Var2 = this.D;
        if (f7Var2 != null) {
            if (f7Var2.f31169e == null) {
                AdContentData adContentData = f7Var2.f31165a;
                if (adContentData != null) {
                    metaData = adContentData.x();
                } else {
                    metaData = null;
                }
                if (metaData != null) {
                    List<com.huawei.openalliance.ad.ppskit.beans.metadata.ImageInfo> h02 = metaData.h0();
                    ArrayList arrayList = new ArrayList();
                    if (h02 != null && !h02.isEmpty()) {
                        Iterator<com.huawei.openalliance.ad.ppskit.beans.metadata.ImageInfo> it = h02.iterator();
                        while (it.hasNext()) {
                            arrayList.add(new ImageInfo(it.next()));
                        }
                    }
                    f7Var2.f31169e = arrayList;
                }
            }
            ArrayList arrayList2 = f7Var2.f31169e;
            if (arrayList2 != null && arrayList2.size() > 0) {
                ImageInfo imageInfo = (ImageInfo) arrayList2.get(0);
                this.G = imageInfo;
                if (imageInfo != null) {
                    if (imageInfo.getHeight() > 0) {
                        setRatio(Float.valueOf((imageInfo.getWidth() * 1.0f) / imageInfo.getHeight()));
                    }
                    j7 j7Var2 = this.E;
                    j7Var2.getClass();
                    n7.g("NativeVideoP", "checkPreviewImageHashAndLoad " + imageInfo);
                    SourceParam sourceParam = new SourceParam();
                    sourceParam.n(imageInfo.getUrl());
                    sourceParam.c(52428800L);
                    sourceParam.k(imageInfo.getSha256());
                    sourceParam.l(imageInfo.isCheckSha256());
                    sourceParam.o(true);
                    AdContentData adContentData2 = j7Var2.f31323w;
                    if (adContentData2 != null) {
                        str = adContentData2.B();
                        str2 = j7Var2.f31323w.A();
                    } else {
                        str = null;
                        str2 = null;
                    }
                    v0.g(j7Var2.f31322v, sourceParam, new i7(j7Var2, imageInfo), str, str2);
                }
            }
            f7 f7Var3 = this.D;
            if (f7Var3 != null) {
                VideoInfo a10 = f7Var3.a();
                this.F = a10;
                if (a10 != null) {
                    String soundSwitch = a10.getSoundSwitch();
                    n7.c("LinkedLandVideoView", "customToggleVideoMute %s", soundSwitch);
                    VideoInfo videoInfo = this.F;
                    if (videoInfo != null) {
                        videoInfo.C = soundSwitch;
                    }
                    Float videoRatio = videoInfo.getVideoRatio();
                    if (videoRatio == null) {
                        videoRatio = Float.valueOf(1.7777778f);
                    }
                    setRatio(videoRatio);
                    this.C.J = new k7(this.L, this.K, this.F, this.D);
                    com.huawei.openalliance.ad.ppskit.linked.view.d dVar2 = this.C;
                    this.F.getVideoPlayMode();
                    dVar2.getClass();
                    com.huawei.openalliance.ad.ppskit.linked.view.d dVar3 = this.C;
                    VideoInfo videoInfo2 = this.F;
                    if (videoInfo2 != null && TextUtils.equals(videoInfo2.getSoundSwitch(), "y")) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    dVar3.u(!z10);
                    this.C.r(getContinuePlayTime());
                    this.C.Q = this.F.getVideoDuration();
                    com.huawei.openalliance.ad.ppskit.linked.view.d dVar4 = this.C;
                    this.F.getAutoPlayNetwork();
                    dVar4.getClass();
                    this.C.y(true);
                    if (TextUtils.isEmpty(y4.a(this.L, "normal").h(this.L, this.D.f31170g))) {
                        int videoFileSize = this.F.getVideoFileSize();
                        this.C.R = videoFileSize;
                        if (videoFileSize > 0) {
                            Resources resources = getResources();
                            Object[] objArr = new Object[1];
                            Context context = getContext();
                            long videoFileSize2 = this.F.getVideoFileSize();
                            Pattern pattern = y1.f23070a;
                            if (context == null) {
                                string2 = "";
                            } else {
                                string2 = context.getString(R.string.hiad_data_size_prompt, x.b(videoFileSize2));
                            }
                            objArr[0] = string2;
                            string = resources.getString(R.string.hiad_consume_data_to_play_video, objArr);
                        } else {
                            string = getResources().getString(R.string.hiad_consume_data_to_play_video_no_data_size);
                        }
                        this.J.setNonWifiAlertMsg(string);
                    } else {
                        this.F.f22645s = this.D.f31170g;
                    }
                    j7 j7Var3 = this.E;
                    VideoInfo videoInfo3 = this.F;
                    if (videoInfo3 == null) {
                        j7Var3.getClass();
                    } else {
                        boolean a11 = videoInfo3.a(j7Var3.f31322v);
                        String videoDownloadUrl = videoInfo3.getVideoDownloadUrl();
                        n7.b("NativeVideoP", videoDownloadUrl);
                        Object[] objArr2 = new Object[1];
                        if (!videoDownloadUrl.startsWith("diskcache://")) {
                            objArr2[0] = videoDownloadUrl;
                            n7.c("NativeVideoP", "videoUrl: %s, check if video cached.", objArr2);
                            p2.a(new h7(j7Var3, videoDownloadUrl, videoInfo3, a11), 2);
                        } else {
                            objArr2[0] = videoDownloadUrl;
                            n7.c("NativeVideoP", "video has cached: %s", objArr2);
                            ((wa.e) ((p9) j7Var3.f32659s)).a(videoInfo3, a11);
                        }
                    }
                } else {
                    com.huawei.openalliance.ad.ppskit.linked.view.d dVar5 = this.C;
                    dVar5.getClass();
                    n7.b("d", "setForImageOnly");
                    dVar5.f22692v = null;
                    dVar5.y(false);
                    dVar5.c();
                    dVar5.L = true;
                }
            }
            this.C.w(false);
            return;
        }
        this.C.u(true);
        this.F = null;
    }

    public void setNotShowDataUsageAlert(boolean z10) {
        this.C.O = z10;
    }

    public void setPlayModeChangeListener(PPSActivity.k kVar) {
        com.huawei.openalliance.ad.ppskit.linked.view.d dVar = this.C;
        if (dVar != null) {
            dVar.getClass();
        }
    }

    public void setVideoReleaseListener(LinkedLandView.c cVar) {
        this.A = cVar;
    }

    public final void t() {
        View view = this.M;
        if (view == null) {
            return;
        }
        if (view.getParent() != null) {
            n7.b("LinkedLandVideoView", "removeSelf removeView");
            ((ViewGroup) this.M.getParent()).removeView(this.M);
        } else {
            n7.b("LinkedLandVideoView", "removeSelf GONE");
            this.M.setVisibility(8);
        }
    }

    public final void u() {
        boolean z10;
        n7.e("LinkedLandVideoView", "setInnerListener");
        this.K.v(this.R);
        this.K.w(this.O);
        com.huawei.openalliance.ad.ppskit.linked.view.d dVar = this.C;
        VideoInfo videoInfo = this.F;
        if (videoInfo != null && TextUtils.equals(videoInfo.getSoundSwitch(), "y")) {
            z10 = true;
        } else {
            z10 = false;
        }
        dVar.u(!z10);
    }

    /* loaded from: classes2.dex */
    public class e implements e9 {
        public e() {
        }

        @Override // ka.e9
        public final void a() {
            if (n7.d()) {
                int i10 = LinkedLandVideoView.U;
                n7.b("LinkedLandVideoView", "onBufferingStart");
            }
            LinkedLandVideoView.this.N.b();
        }

        @Override // ka.e9
        public final void a(int i10) {
        }

        @Override // ka.e9
        public final void b() {
        }
    }

    @Override // wa.e
    public final void a(VideoInfo videoInfo, boolean z10) {
        VideoView videoView;
        f7 f7Var;
        AdContentData adContentData;
        n7.f("LinkedLandVideoView", "onCheckVideoResult: %s", Boolean.valueOf(z10));
        if (!z10 && (f7Var = this.D) != null && (adContentData = f7Var.f31165a) != null && adContentData.n() != null && videoInfo != null && y1.t(videoInfo.getVideoDownloadUrl()) && (this.D.f31165a.n().intValue() == 3 || this.D.f31165a.n().intValue() == 5)) {
            n7.b("LinkedLandVideoView", "jssdk request type allow play http link video url when video mode is CACHE_MODE");
            z10 = true;
        }
        if (z10) {
            if ((this.F == null || videoInfo == null || videoInfo.getVideoDownloadUrl() == null || (!videoInfo.getVideoDownloadUrl().startsWith("diskcache://") && !TextUtils.equals(this.F.getVideoDownloadUrl(), videoInfo.getVideoDownloadUrl()))) ? false : true) {
                this.H = true;
                com.huawei.openalliance.ad.ppskit.linked.view.d dVar = this.C;
                String videoDownloadUrl = videoInfo.getVideoDownloadUrl();
                if (dVar.f22694x != null && (videoView = dVar.f22692v) != null) {
                    videoView.setVideoFileUrl(videoDownloadUrl);
                }
                if (this.f22676x) {
                    this.C.r(getContinuePlayTime());
                    VideoInfo videoInfo2 = this.F;
                    boolean z11 = videoInfo2 != null && TextUtils.equals(videoInfo2.getVideoAutoPlay(), "y");
                    n7.f("LinkedLandVideoView", "onCheckVideoResult - full shown, autoPlay: %s", Boolean.valueOf(z11));
                    this.C.t(z11);
                    long timeBeforeVideoAutoPlay = videoInfo.getTimeBeforeVideoAutoPlay() - (System.currentTimeMillis() - this.I);
                    if (timeBeforeVideoAutoPlay < 0) {
                        timeBeforeVideoAutoPlay = 0;
                    }
                    this.C.l(timeBeforeVideoAutoPlay);
                    return;
                }
                return;
            }
        }
        LinkedLandView.c cVar = this.A;
        if (cVar != null) {
            n7.g("LinkedLandView", "onError");
            LinkedLandVideoView linkedLandVideoView = LinkedLandView.this.f22669t;
            if (linkedLandVideoView != null) {
                linkedLandVideoView.t();
            }
        }
    }

    /* loaded from: classes2.dex */
    public class a implements g9 {
        public a() {
        }

        @Override // ka.g9
        public final void a(int i10) {
            com.huawei.openalliance.ad.ppskit.linked.view.d dVar = LinkedLandVideoView.this.C;
            dVar.P = i10;
            VideoView videoView = dVar.f22692v;
            if (videoView != null) {
                videoView.setDefaultDuration(i10);
                com.huawei.openalliance.ad.ppskit.linked.view.d.p(dVar.C, i10);
            }
        }

        @Override // ka.g9
        public final void b(int i10) {
        }
    }

    public void setVideoEventListener(g gVar) {
    }
}
