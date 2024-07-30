package com.anythink.expressad.video.bt.module;

import a3.l;
import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.anythink.core.common.b.n;
import com.anythink.expressad.atsignalcommon.windvane.j;
import com.anythink.expressad.foundation.f.b;
import com.anythink.expressad.foundation.h.i;
import com.anythink.expressad.foundation.h.o;
import com.anythink.expressad.foundation.h.t;
import com.anythink.expressad.foundation.h.w;
import com.anythink.expressad.playercommon.DefaultVideoPlayerStatusListener;
import com.anythink.expressad.playercommon.PlayerErrorConstant;
import com.anythink.expressad.playercommon.PlayerView;
import com.anythink.expressad.video.widget.SoundImageView;
import com.anythink.expressad.videocommon.b.c;
import com.anythink.expressad.videocommon.b.e;
import com.anythink.expressad.widget.FeedBackButton;
import java.io.File;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AnythinkBTVideoView extends BTBaseView {
    private static boolean H = false;
    private static final String N = "2";

    /* renamed from: p, reason: collision with root package name */
    private static final String f11304p = "anythink_reward_videoview_item";
    private a A;
    private int B;
    private int C;
    private boolean D;
    private int E;
    private int F;
    private String G;
    private boolean I;
    private boolean J;
    private boolean K;
    private RelativeLayout L;
    private ProgressBar M;

    /* renamed from: q, reason: collision with root package name */
    private PlayerView f11305q;

    /* renamed from: r, reason: collision with root package name */
    private SoundImageView f11306r;

    /* renamed from: s, reason: collision with root package name */
    private TextView f11307s;

    /* renamed from: t, reason: collision with root package name */
    private View f11308t;

    /* renamed from: u, reason: collision with root package name */
    private FeedBackButton f11309u;

    /* renamed from: v, reason: collision with root package name */
    private WebView f11310v;

    /* renamed from: w, reason: collision with root package name */
    private c f11311w;

    /* renamed from: x, reason: collision with root package name */
    private int f11312x;
    private int y;

    /* renamed from: z, reason: collision with root package name */
    private int f11313z;

    /* loaded from: classes.dex */
    public static final class a extends DefaultVideoPlayerStatusListener {

        /* renamed from: a, reason: collision with root package name */
        private AnythinkBTVideoView f11317a;

        /* renamed from: b, reason: collision with root package name */
        private WebView f11318b;

        /* renamed from: c, reason: collision with root package name */
        private String f11319c;

        /* renamed from: d, reason: collision with root package name */
        private String f11320d;

        /* renamed from: e, reason: collision with root package name */
        private int f11321e;
        private int f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f11322g;

        /* renamed from: k, reason: collision with root package name */
        private int f11326k;

        /* renamed from: l, reason: collision with root package name */
        private int f11327l;

        /* renamed from: h, reason: collision with root package name */
        private boolean f11323h = false;

        /* renamed from: i, reason: collision with root package name */
        private boolean f11324i = false;

        /* renamed from: j, reason: collision with root package name */
        private boolean f11325j = false;

        /* renamed from: m, reason: collision with root package name */
        private boolean f11328m = false;

        public a(AnythinkBTVideoView anythinkBTVideoView, WebView webView) {
            this.f11317a = anythinkBTVideoView;
            this.f11318b = webView;
            this.f11319c = anythinkBTVideoView.f11348d;
            this.f11320d = anythinkBTVideoView.f11347c;
        }

        private int a() {
            return this.f11321e;
        }

        private void b() {
            this.f11317a = null;
            this.f11318b = null;
            boolean unused = AnythinkBTVideoView.H = false;
        }

        @Override // com.anythink.expressad.playercommon.DefaultVideoPlayerStatusListener, com.anythink.expressad.playercommon.VideoPlayerStatusListener
        public final void onBufferingEnd() {
            try {
                super.onBufferingEnd();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        @Override // com.anythink.expressad.playercommon.DefaultVideoPlayerStatusListener, com.anythink.expressad.playercommon.VideoPlayerStatusListener
        public final void onBufferingStart(String str) {
            try {
                super.onBufferingStart(str);
                if ((str.equals(PlayerErrorConstant.PREPARE_TIMEOUT) || str.equals("play buffering tiemout")) && this.f11318b != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("code", BTBaseView.f11343n);
                        jSONObject.put("id", this.f11319c);
                        jSONObject.put("data", new JSONObject());
                        j.a();
                        j.a(this.f11318b, "onPlayerTimeout", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    } catch (Exception e10) {
                        com.anythink.expressad.video.bt.a.c.a();
                        com.anythink.expressad.video.bt.a.c.a(this.f11318b, e10.getMessage());
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // com.anythink.expressad.playercommon.DefaultVideoPlayerStatusListener, com.anythink.expressad.playercommon.VideoPlayerStatusListener
        public final void onPlayCompleted() {
            super.onPlayCompleted();
            AnythinkBTVideoView anythinkBTVideoView = this.f11317a;
            com.anythink.expressad.foundation.d.c cVar = anythinkBTVideoView.f11346b;
            if (cVar != null) {
                if (cVar.i() > 0) {
                    this.f11317a.f11307s.setText(i.a(n.a().g(), "anythink_reward_video_view_reward_time_complete", i.f10128g));
                } else {
                    this.f11317a.f11307s.setText("0");
                }
            } else {
                anythinkBTVideoView.f11307s.setText("0");
            }
            this.f11317a.f11305q.setClickable(false);
            WebView webView = this.f11318b;
            if (webView != null) {
                BTBaseView.a(webView, "onPlayerFinish", this.f11319c);
            }
            this.f11321e = this.f;
            boolean unused = AnythinkBTVideoView.H = true;
            this.f11317a.stop();
        }

        @Override // com.anythink.expressad.playercommon.DefaultVideoPlayerStatusListener, com.anythink.expressad.playercommon.VideoPlayerStatusListener
        public final void onPlayError(String str) {
            super.onPlayError(str);
            if (this.f11318b != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("code", BTBaseView.o);
                    jSONObject.put("id", this.f11319c);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("error", str);
                    jSONObject2.put("id", this.f11319c);
                    jSONObject.put("data", jSONObject2);
                    j.a();
                    j.a(this.f11318b, "onPlayerFailed", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e10) {
                    com.anythink.expressad.video.bt.a.c.a();
                    com.anythink.expressad.video.bt.a.c.a(this.f11318b, e10.getMessage());
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:43:0x01b3 A[Catch: Exception -> 0x01d0, TRY_LEAVE, TryCatch #0 {Exception -> 0x01d0, blocks: (B:24:0x0124, B:26:0x012a, B:31:0x0131, B:33:0x0135, B:35:0x0139, B:37:0x0145, B:40:0x0152, B:41:0x01a7, B:43:0x01b3, B:47:0x017d), top: B:23:0x0124 }] */
        /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
        @Override // com.anythink.expressad.playercommon.DefaultVideoPlayerStatusListener, com.anythink.expressad.playercommon.VideoPlayerStatusListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void onPlayProgress(int r8, int r9) {
            /*
                Method dump skipped, instructions count: 473
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.video.bt.module.AnythinkBTVideoView.a.onPlayProgress(int, int):void");
        }

        @Override // com.anythink.expressad.playercommon.DefaultVideoPlayerStatusListener, com.anythink.expressad.playercommon.VideoPlayerStatusListener
        public final void onPlaySetDataSourceError(String str) {
            super.onPlaySetDataSourceError(str);
        }

        @Override // com.anythink.expressad.playercommon.DefaultVideoPlayerStatusListener, com.anythink.expressad.playercommon.VideoPlayerStatusListener
        public final void onPlayStarted(int i10) {
            super.onPlayStarted(i10);
            if (!this.f11322g) {
                this.f11317a.M.setMax(i10);
                WebView webView = this.f11318b;
                if (webView != null) {
                    BTBaseView.a(webView, "onPlayerPlay", this.f11319c);
                }
                this.f11322g = true;
            }
            boolean unused = AnythinkBTVideoView.H = false;
        }

        @Override // com.anythink.expressad.playercommon.DefaultVideoPlayerStatusListener, com.anythink.expressad.playercommon.VideoPlayerStatusListener
        public final void onVideoDownloadResume() {
            String str;
            if (this.f11317a.f11346b.w() != 94 && this.f11317a.f11346b.w() != 287) {
                str = this.f11317a.f11346b.aZ() + this.f11317a.f11346b.S() + this.f11317a.f11346b.B();
            } else {
                str = this.f11317a.f11346b.Z() + this.f11317a.f11346b.aZ() + this.f11317a.f11346b.S();
            }
            c a10 = e.a().a(this.f11320d, str);
            if (a10 != null) {
                a10.i();
                this.f11328m = true;
                o.d("DefaultVideoPlayerStatusListener", "onVideoDownloadResume :  and start download !");
            }
        }

        public final void a(int i10, int i11) {
            this.f11326k = i10;
            this.f11327l = i11;
        }
    }

    public AnythinkBTVideoView(Context context) {
        super(context);
        this.f11312x = 0;
        this.y = 0;
        this.f11313z = 0;
        this.B = 2;
        this.D = false;
        this.E = 2;
        this.F = 1;
        this.I = false;
        this.J = false;
        this.K = false;
    }

    private int f() {
        return com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.b().e(), this.f11347c, false).x();
    }

    public int getMute() {
        return this.B;
    }

    @Override // com.anythink.expressad.video.bt.module.BTBaseView
    public void init(Context context) {
        int findLayout = findLayout(f11304p);
        if (findLayout > 0) {
            this.f.inflate(findLayout, this);
            boolean b10 = b();
            this.f11351h = b10;
            if (!b10) {
                o.d(BTBaseView.TAG, "AnythinkVideoView init fail");
            }
            a();
        }
        H = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int i10;
        int i11;
        super.onAttachedToWindow();
        if (!this.K) {
            com.anythink.expressad.video.bt.a.c.a();
            this.E = com.anythink.expressad.video.bt.a.c.e(this.f11347c);
        }
        View view = this.f11308t;
        int i12 = 8;
        if (view != null) {
            if (this.y == 0) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            view.setVisibility(i11);
        }
        SoundImageView soundImageView = this.f11306r;
        if (soundImageView != null) {
            if (this.f11313z == 0) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            soundImageView.setVisibility(i10);
        }
        TextView textView = this.f11307s;
        if (textView != null) {
            if (this.f11312x != 0) {
                i12 = 0;
            }
            textView.setVisibility(i12);
            if (this.f11307s.getVisibility() == 0 && b.a().b()) {
                this.f11346b.l(this.f11347c);
                b.a().a(l.p(new StringBuilder(), this.f11347c, "_1"), this.f11346b);
                b.a().a(l.p(new StringBuilder(), this.f11347c, "_1"), this.f11309u);
            }
        }
    }

    @Override // com.anythink.expressad.video.bt.module.BTBaseView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // com.anythink.expressad.video.bt.module.BTBaseView
    public void onDestory() {
        try {
            PlayerView playerView = this.f11305q;
            if (playerView != null) {
                playerView.setOnClickListener(null);
                this.f11305q.release();
                this.f11305q = null;
            }
            SoundImageView soundImageView = this.f11306r;
            if (soundImageView != null) {
                soundImageView.setOnClickListener(null);
            }
            View view = this.f11308t;
            if (view != null) {
                view.setOnClickListener(null);
            }
            if (this.f11310v != null) {
                this.f11310v = null;
            }
            setOnClickListener(null);
        } catch (Throwable th) {
            o.a(BTBaseView.TAG, th.getMessage());
        }
    }

    public void onPause() {
        PlayerView playerView = this.f11305q;
        if (playerView != null) {
            boolean isPlayIng = playerView.isPlayIng();
            this.J = isPlayIng;
            this.f11305q.setIsBTVideoPlaying(isPlayIng);
            this.f11305q.onPause();
        }
    }

    public void onResume() {
        PlayerView playerView = this.f11305q;
        if (playerView != null) {
            playerView.setDesk(true);
            this.f11305q.setIsCovered(false);
            if (this.J) {
                this.f11305q.onResume();
            }
        }
    }

    public void onStop() {
        PlayerView playerView = this.f11305q;
        if (playerView != null) {
            playerView.setIsCovered(true);
        }
    }

    public void pause() {
        try {
            PlayerView playerView = this.f11305q;
            if (playerView != null) {
                playerView.pause();
                WebView webView = this.f11310v;
                if (webView != null) {
                    BTBaseView.a(webView, "onPlayerPause", this.f11348d);
                }
            }
        } catch (Exception e10) {
            o.b(BTBaseView.TAG, e10.getMessage(), e10);
        }
    }

    public void play() {
        try {
            if (!this.K) {
                if (this.E == 1) {
                    playMute();
                } else {
                    playUnMute();
                }
                if (!this.f11305q.playVideo()) {
                    o.d("MediaPlayer", "播放失败");
                    a aVar = this.A;
                    if (aVar != null) {
                        aVar.onPlayError("play video failed");
                    }
                }
                this.K = true;
                WebView webView = this.f11310v;
                if (webView != null) {
                    BTBaseView.a(webView, "onPlayerPlay", this.f11348d);
                    return;
                }
                return;
            }
            if (this.D) {
                this.f11305q.playVideo(0);
                this.D = false;
            } else {
                this.f11305q.start(false);
            }
            WebView webView2 = this.f11310v;
            if (webView2 != null) {
                BTBaseView.a(webView2, "onPlayerPlay", this.f11348d);
            }
        } catch (Exception e10) {
            o.b(BTBaseView.TAG, e10.getMessage(), e10);
        }
    }

    public boolean playMute() {
        try {
            PlayerView playerView = this.f11305q;
            if (playerView != null && this.f11310v != null) {
                playerView.closeSound();
                this.f11306r.setSoundStatus(false);
                this.B = 1;
                BTBaseView.a(this.f11310v, "onPlayerMute", this.f11348d);
                return true;
            }
        } catch (Exception e10) {
            o.d(BTBaseView.TAG, e10.getMessage());
        }
        return false;
    }

    public boolean playUnMute() {
        try {
            PlayerView playerView = this.f11305q;
            if (playerView != null && this.f11310v != null) {
                playerView.openSound();
                this.f11306r.setSoundStatus(true);
                this.B = 2;
                BTBaseView.a(this.f11310v, "onUnmute", this.f11348d);
                return true;
            }
            return false;
        } catch (Exception e10) {
            o.d(BTBaseView.TAG, e10.getMessage());
            return false;
        }
    }

    public void preLoadData() {
        String str;
        int v3;
        if (this.f11346b.w() != 94 && this.f11346b.w() != 287) {
            str = this.f11346b.aZ() + this.f11346b.S() + this.f11346b.B();
        } else {
            str = this.f11346b.Z() + this.f11346b.aZ() + this.f11346b.S();
        }
        c a10 = e.a().a(this.f11347c, str);
        if (a10 != null) {
            this.f11311w = a10;
        }
        this.C = e();
        String d10 = d();
        this.G = d10;
        if (this.f11351h && !TextUtils.isEmpty(d10) && this.f11346b != null) {
            a aVar = new a(this, this.f11310v);
            this.A = aVar;
            com.anythink.expressad.foundation.d.c cVar = this.f11346b;
            if (cVar != null) {
                if (cVar.ao() != -1) {
                    v3 = cVar.ao();
                } else {
                    v3 = com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.b().e(), this.f11347c, false).v();
                }
            } else {
                v3 = com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.b().e(), this.f11347c, false).v();
            }
            aVar.a(v3, com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.b().e(), this.f11347c, false).x());
            this.f11305q.setDesk(false);
            this.f11305q.initBufferIngParam(this.C);
            this.f11305q.initVFPData(this.G, this.f11346b.S(), this.f11346b.ao(), this.A);
            soundOperate(this.B, -1, null);
        }
        H = false;
    }

    public void resume() {
        try {
            PlayerView playerView = this.f11305q;
            if (playerView != null) {
                if (this.D) {
                    playerView.playVideo(0);
                    this.D = false;
                } else {
                    playerView.onResume();
                }
                WebView webView = this.f11310v;
                if (webView != null) {
                    BTBaseView.a(webView, "onPlayerResume", this.f11348d);
                }
            }
        } catch (Exception e10) {
            o.d(BTBaseView.TAG, e10.getMessage());
        }
    }

    @Override // com.anythink.expressad.video.bt.module.BTBaseView
    public void setCampaign(com.anythink.expressad.foundation.d.c cVar) {
        super.setCampaign(cVar);
        if (cVar != null && cVar.i() > 0) {
            this.f11307s.setBackgroundResource(i.a(n.a().g(), "anythink_reward_video_time_count_num_bg", i.f10125c));
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, l.f(30.0f));
            int b10 = t.b(n.a().g(), 5.0f);
            layoutParams.setMargins(b10, 0, 0, 0);
            this.f11307s.setPadding(b10, 0, b10, 0);
            this.f11307s.setLayoutParams(layoutParams);
            return;
        }
        this.f11307s.setBackgroundResource(i.a(n.a().g(), "anythink_reward_shape_progress", i.f10125c));
        this.f11307s.setWidth(t.b(n.a().g(), 30.0f));
    }

    public void setCloseViewVisable(int i10) {
        int i11;
        View view = this.f11308t;
        if (i10 == 0) {
            i11 = 4;
        } else {
            i11 = 0;
        }
        view.setVisibility(i11);
    }

    public void setCountDownTextViewVisable(int i10) {
        int i11;
        TextView textView = this.f11307s;
        if (i10 == 0) {
            i11 = 4;
        } else {
            i11 = 0;
        }
        textView.setVisibility(i11);
    }

    public void setCreateWebView(WebView webView) {
        this.f11310v = webView;
    }

    public void setNotchPadding(int i10, int i11, int i12, int i13) {
        if (i10 <= 0) {
            i10 = this.L.getPaddingLeft();
        }
        if (i11 <= 0) {
            i11 = this.L.getPaddingRight();
        }
        if (i12 <= 0) {
            i12 = this.L.getPaddingTop();
        }
        if (i13 <= 0) {
            i13 = this.L.getPaddingBottom();
        }
        o.d(BTBaseView.TAG, "NOTCH BTVideoView " + String.format("%1s-%2s-%3s-%4s", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)));
        this.L.setPadding(i10, i12, i11, i13);
    }

    public void setOrientation(int i10) {
        this.F = i10;
    }

    public void setPlaybackParams(float f) {
        PlayerView playerView = this.f11305q;
        if (playerView != null) {
            playerView.setPlaybackParams(f);
        }
    }

    public void setProgressBarState(int i10) {
        int i11;
        ProgressBar progressBar = this.M;
        if (progressBar != null) {
            if (i10 == 0) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            progressBar.setVisibility(i11);
        }
    }

    public void setShowClose(int i10) {
        this.y = i10;
    }

    public void setShowMute(int i10) {
        this.f11313z = i10;
    }

    public void setShowTime(int i10) {
        this.f11312x = i10;
    }

    public void setSoundImageViewVisble(int i10) {
        int i11;
        SoundImageView soundImageView = this.f11306r;
        if (i10 == 0) {
            i11 = 4;
        } else {
            i11 = 0;
        }
        soundImageView.setVisibility(i11);
    }

    public void setVolume(float f, float f10) {
        PlayerView playerView = this.f11305q;
        if (playerView != null) {
            playerView.setVolume(f, f10);
        }
    }

    public void soundOperate(int i10, int i11, String str) {
        if (this.f11351h) {
            this.B = i10;
            if (i10 == 1) {
                this.f11306r.setSoundStatus(false);
                this.f11305q.closeSound();
            } else if (i10 == 2) {
                this.f11306r.setSoundStatus(true);
                this.f11305q.openSound();
            }
            if (i11 == 1) {
                this.f11306r.setVisibility(8);
            } else if (i11 == 2) {
                this.f11306r.setVisibility(0);
            }
        }
    }

    public void stop() {
        try {
            PlayerView playerView = this.f11305q;
            if (playerView != null) {
                playerView.pause();
                this.f11305q.stop();
                try {
                    this.f11305q.prepare();
                    this.f11305q.justSeekTo(0);
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                WebView webView = this.f11310v;
                if (webView != null) {
                    BTBaseView.a(webView, "onPlayerStop", this.f11348d);
                }
            }
        } catch (Exception e11) {
            o.b(BTBaseView.TAG, e11.getMessage(), e11);
        }
    }

    private boolean b() {
        try {
            this.f11305q = (PlayerView) findViewById(findID("anythink_vfpv"));
            this.f11306r = (SoundImageView) findViewById(findID("anythink_sound_switch"));
            this.f11307s = (TextView) findViewById(findID("anythink_tv_count"));
            this.f11308t = findViewById(findID("anythink_rl_playing_close"));
            this.L = (RelativeLayout) findViewById(findID("anythink_top_control"));
            this.M = (ProgressBar) findViewById(findID("anythink_video_progress_bar"));
            this.f11305q.setIsBTVideo(true);
            this.f11309u = (FeedBackButton) findViewById(findID("anythink_native_endcard_feed_btn"));
            return isNotNULL(this.f11305q, this.f11306r, this.f11307s, this.f11308t);
        } catch (Throwable th) {
            o.b(BTBaseView.TAG, th.getMessage(), th);
            return false;
        }
    }

    private void c() {
        String str;
        if (this.f11346b.w() != 94 && this.f11346b.w() != 287) {
            str = this.f11346b.aZ() + this.f11346b.S() + this.f11346b.B();
        } else {
            str = this.f11346b.Z() + this.f11346b.aZ() + this.f11346b.S();
        }
        c a10 = e.a().a(this.f11347c, str);
        if (a10 != null) {
            this.f11311w = a10;
        }
    }

    private String d() {
        String str = "";
        try {
            str = this.f11346b.S();
            c cVar = this.f11311w;
            if (cVar == null || cVar.k() != 5) {
                return str;
            }
            String e10 = this.f11311w.e();
            return !w.a(e10) ? new File(e10).exists() ? e10 : str : str;
        } catch (Throwable th) {
            o.b(BTBaseView.TAG, th.getMessage(), th);
            return str;
        }
    }

    private static int e() {
        try {
            com.anythink.expressad.videocommon.e.a b10 = com.anythink.expressad.videocommon.e.c.a().b();
            if (b10 == null) {
                com.anythink.expressad.videocommon.e.c.a();
                com.anythink.expressad.videocommon.e.c.c();
            }
            r0 = b10 != null ? (int) b10.g() : 5;
            o.b(BTBaseView.TAG, "AnythinkBaseView buffetTimeout:".concat(String.valueOf(r0)));
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return r0;
    }

    @Override // com.anythink.expressad.video.bt.module.BTBaseView
    public final void a() {
        super.a();
        if (this.f11351h) {
            this.f11306r.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.bt.module.AnythinkBTVideoView.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    boolean isSilent = AnythinkBTVideoView.this.f11305q.isSilent();
                    if (AnythinkBTVideoView.this.f11310v != null) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("code", BTBaseView.f11343n);
                            jSONObject.put("id", AnythinkBTVideoView.this.f11348d);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("mute", AnythinkBTVideoView.this.B);
                            jSONObject.put("data", jSONObject2);
                            j.a();
                            j.a(AnythinkBTVideoView.this.f11310v, "onPlayerMuteBtnClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                            o.a("OperateViews", "onPlayerMuteBtnClicked isMute = " + isSilent + " mute = " + AnythinkBTVideoView.this.B);
                        } catch (Exception e10) {
                            com.anythink.expressad.video.bt.a.c.a();
                            com.anythink.expressad.video.bt.a.c.a(AnythinkBTVideoView.this.f11310v, e10.getMessage());
                        }
                    }
                }
            });
            this.f11308t.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.bt.module.AnythinkBTVideoView.2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (AnythinkBTVideoView.this.f11310v != null) {
                        BTBaseView.a(AnythinkBTVideoView.this.f11310v, "onPlayerCloseBtnClicked", AnythinkBTVideoView.this.f11348d);
                    }
                }
            });
            setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.bt.module.AnythinkBTVideoView.3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (AnythinkBTVideoView.this.f11310v != null) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("code", BTBaseView.f11343n);
                            jSONObject.put("id", AnythinkBTVideoView.this.f11348d);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("x", String.valueOf(view.getX()));
                            jSONObject2.put("y", String.valueOf(view.getY()));
                            jSONObject.put("data", jSONObject2);
                            j.a();
                            j.a(AnythinkBTVideoView.this.f11310v, "onClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                        } catch (Exception unused) {
                            com.anythink.expressad.video.bt.a.c.a();
                            com.anythink.expressad.video.bt.a.c.a(AnythinkBTVideoView.this.f11310v, "onClicked", AnythinkBTVideoView.this.f11348d);
                        }
                    }
                }
            });
        }
    }

    private int a(com.anythink.expressad.foundation.d.c cVar) {
        if (cVar != null) {
            if (cVar.ao() != -1) {
                return cVar.ao();
            }
            return com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.b().e(), this.f11347c, false).v();
        }
        return com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.b().e(), this.f11347c, false).v();
    }

    public AnythinkBTVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11312x = 0;
        this.y = 0;
        this.f11313z = 0;
        this.B = 2;
        this.D = false;
        this.E = 2;
        this.F = 1;
        this.I = false;
        this.J = false;
        this.K = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(int i10, int i11) {
        if (i11 != 0) {
            double d10 = i10 / i11;
            try {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(t.a(Double.valueOf(d10)));
                return sb2.toString();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return String.valueOf(i11);
    }
}
