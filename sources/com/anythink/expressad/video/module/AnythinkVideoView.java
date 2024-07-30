package com.anythink.expressad.video.module;

import a3.k;
import a3.l;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.anythink.core.common.b.n;
import com.anythink.expressad.foundation.d.c;
import com.anythink.expressad.foundation.h.i;
import com.anythink.expressad.foundation.h.o;
import com.anythink.expressad.foundation.h.t;
import com.anythink.expressad.foundation.h.w;
import com.anythink.expressad.foundation.h.x;
import com.anythink.expressad.playercommon.DefaultVideoPlayerStatusListener;
import com.anythink.expressad.playercommon.PlayerView;
import com.anythink.expressad.video.dynview.f.h;
import com.anythink.expressad.video.dynview.widget.AnyThinkSegmentsProgressBar;
import com.anythink.expressad.video.dynview.widget.AnythinkBaitClickView;
import com.anythink.expressad.video.module.a.a.m;
import com.anythink.expressad.video.signal.f;
import com.anythink.expressad.video.signal.j;
import com.anythink.expressad.video.widget.SoundImageView;
import com.anythink.expressad.videocommon.b.e;
import com.anythink.expressad.videocommon.e.d;
import com.anythink.expressad.widget.FeedBackButton;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.huawei.hms.ads.gl;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AnythinkVideoView extends AnythinkBaseView implements f, j {
    private static int A = 0;
    private static int B = 0;
    private static final String C = "2";
    public static final String TAG = "AnythinkVideoView";
    private static boolean av = false;

    /* renamed from: s, reason: collision with root package name */
    private static final String f11811s = "anythink_reward_videoview_item";

    /* renamed from: t, reason: collision with root package name */
    private static final int f11812t = 1;

    /* renamed from: u, reason: collision with root package name */
    private static final float f11813u = 1280.0f;

    /* renamed from: v, reason: collision with root package name */
    private static final float f11814v = 720.0f;

    /* renamed from: w, reason: collision with root package name */
    private static final float f11815w = 0.1f;

    /* renamed from: x, reason: collision with root package name */
    private static int f11816x;
    private static int y;

    /* renamed from: z, reason: collision with root package name */
    private static int f11817z;
    private PlayerView D;
    private SoundImageView E;
    private TextView F;
    private View G;
    private RelativeLayout H;
    private ImageView I;
    private ProgressBar J;
    private FeedBackButton K;
    private boolean L;
    private AnyThinkSegmentsProgressBar M;
    private com.anythink.expressad.video.dynview.f.a N;
    private int O;
    private FrameLayout P;
    private AnythinkClickCTAView Q;
    private com.anythink.expressad.video.signal.factory.b R;
    private int S;
    private RelativeLayout T;
    private com.anythink.expressad.video.module.a.a U;
    private boolean V;
    private boolean W;
    private int aA;
    private boolean aB;
    private boolean aC;
    private boolean aD;
    private boolean aE;
    private boolean aF;
    private boolean aG;
    private boolean aH;
    private boolean aI;
    private AlphaAnimation aJ;
    private AnythinkBaitClickView aK;
    private b aL;
    private boolean aM;
    private Runnable aN;

    /* renamed from: aa, reason: collision with root package name */
    private String f11818aa;

    /* renamed from: ab, reason: collision with root package name */
    private int f11819ab;

    /* renamed from: ac, reason: collision with root package name */
    private int f11820ac;

    /* renamed from: ad, reason: collision with root package name */
    private int f11821ad;
    private int ae;
    private com.anythink.expressad.widget.a.a af;
    private com.anythink.expressad.widget.a.b ag;
    private String ah;
    private double ai;
    private double aj;
    private boolean ak;
    private boolean al;
    private boolean am;
    private boolean an;
    private boolean ao;
    private boolean ap;
    private boolean aq;
    private boolean ar;
    private boolean as;
    private int at;
    private boolean au;
    private int aw;
    private String ax;
    private int ay;
    private int az;
    public List<c> mCampOrderViewData;
    public int mCampaignSize;
    public int mCurrPlayNum;
    public int mCurrentPlayProgressTime;
    public int mMuteSwitch;

    /* renamed from: com.anythink.expressad.video.module.AnythinkVideoView$11, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass11 implements Runnable {
        public AnonymousClass11() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            AnythinkVideoView.p(AnythinkVideoView.this);
        }
    }

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f11841a;

        /* renamed from: b, reason: collision with root package name */
        public int f11842b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f11843c;

        public final String toString() {
            return "ProgressData{curPlayPosition=" + this.f11841a + ", allDuration=" + this.f11842b + '}';
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends DefaultVideoPlayerStatusListener {

        /* renamed from: a, reason: collision with root package name */
        private AnythinkVideoView f11844a;

        /* renamed from: b, reason: collision with root package name */
        private int f11845b;

        /* renamed from: c, reason: collision with root package name */
        private int f11846c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f11847d;

        /* renamed from: i, reason: collision with root package name */
        private boolean f11851i;

        /* renamed from: j, reason: collision with root package name */
        private String f11852j;

        /* renamed from: k, reason: collision with root package name */
        private c f11853k;

        /* renamed from: l, reason: collision with root package name */
        private int f11854l;

        /* renamed from: m, reason: collision with root package name */
        private int f11855m;

        /* renamed from: e, reason: collision with root package name */
        private a f11848e = new a();
        private boolean f = false;

        /* renamed from: g, reason: collision with root package name */
        private boolean f11849g = false;

        /* renamed from: h, reason: collision with root package name */
        private boolean f11850h = false;

        /* renamed from: n, reason: collision with root package name */
        private boolean f11856n = false;

        public b(AnythinkVideoView anythinkVideoView) {
            this.f11844a = anythinkVideoView;
        }

        private void b(int i10) {
            AnythinkVideoView anythinkVideoView = this.f11844a;
            if (anythinkVideoView == null || anythinkVideoView.F == null) {
                return;
            }
            String str = "anythink_reward_video_time_count_num_bg";
            if (this.f11853k.k() == 5) {
                AnythinkVideoView anythinkVideoView2 = this.f11844a;
                if (anythinkVideoView2.mCurrPlayNum > 1 && i10 <= 0) {
                    anythinkVideoView2.F.setBackgroundResource(i.a(n.a().g(), "anythink_reward_video_time_count_num_bg", i.f10125c));
                    d();
                    return;
                }
            }
            if (i10 > 0) {
                d();
            } else {
                str = "anythink_reward_shape_progress";
            }
            this.f11844a.F.setBackgroundResource(i.a(n.a().g(), str, i.f10125c));
        }

        private c c() {
            return this.f11853k;
        }

        private void d() {
            AnythinkVideoView anythinkVideoView = this.f11844a;
            if (anythinkVideoView == null) {
                return;
            }
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) anythinkVideoView.F.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = -2;
                layoutParams.height = l.f(25.0f);
                this.f11844a.F.setLayoutParams(layoutParams);
            }
            int f = l.f(5.0f);
            this.f11844a.F.setPadding(f, 0, f, 0);
        }

        public final void a(c cVar) {
            this.f11853k = cVar;
        }

        @Override // com.anythink.expressad.playercommon.DefaultVideoPlayerStatusListener, com.anythink.expressad.playercommon.VideoPlayerStatusListener
        public final void onBufferingEnd() {
            try {
                super.onBufferingEnd();
                this.f11844a.f11689e.a(14, "");
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        @Override // com.anythink.expressad.playercommon.DefaultVideoPlayerStatusListener, com.anythink.expressad.playercommon.VideoPlayerStatusListener
        public final void onBufferingStart(String str) {
            try {
                super.onBufferingStart(str);
                this.f11844a.f11689e.a(13, "");
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        @Override // com.anythink.expressad.playercommon.DefaultVideoPlayerStatusListener, com.anythink.expressad.playercommon.VideoPlayerStatusListener
        public final void onPlayCompleted() {
            AnythinkVideoView anythinkVideoView;
            super.onPlayCompleted();
            AnythinkVideoView.w(this.f11844a);
            c cVar = this.f11853k;
            if (cVar != null) {
                if (cVar.i() > 0) {
                    this.f11844a.F.setText(i.a(n.a().g(), "anythink_reward_video_view_reward_time_complete", i.f10128g));
                } else {
                    this.f11844a.F.setText("0");
                }
                this.f11853k.n(100);
                if (this.f11853k.f() == 2) {
                    this.f11844a.G.setVisibility(4);
                    if (this.f11844a.K != null) {
                        this.f11844a.K.setClickable(false);
                    }
                    if (this.f11844a.E != null) {
                        this.f11844a.E.setClickable(false);
                    }
                }
            } else {
                this.f11844a.F.setText("0");
            }
            this.f11844a.D.setClickable(false);
            String b10 = this.f11844a.b(true);
            c cVar2 = this.f11853k;
            if (cVar2 != null && cVar2.k() == 5 && (anythinkVideoView = this.f11844a) != null && anythinkVideoView.N != null) {
                AnythinkVideoView anythinkVideoView2 = this.f11844a;
                if (anythinkVideoView2.mCampaignSize > anythinkVideoView2.mCurrPlayNum) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("position", Integer.valueOf(this.f11844a.mCurrPlayNum));
                    int i10 = this.f11844a.mMuteSwitch;
                    if (i10 != 0) {
                        hashMap.put("mute", Integer.valueOf(i10));
                    }
                    this.f11844a.N.a(hashMap);
                    return;
                }
            }
            this.f11844a.f11689e.a(121, "");
            this.f11844a.f11689e.a(11, b10);
            int i11 = this.f11846c;
            this.f11845b = i11;
            this.f11844a.mCurrentPlayProgressTime = i11;
            boolean unused = AnythinkVideoView.av = true;
        }

        @Override // com.anythink.expressad.playercommon.DefaultVideoPlayerStatusListener, com.anythink.expressad.playercommon.VideoPlayerStatusListener
        public final void onPlayError(String str) {
            l.B(str, "errorStr", "DefaultVideoPlayerStatusListener");
            super.onPlayError(str);
            AnythinkVideoView anythinkVideoView = this.f11844a;
            if (anythinkVideoView != null) {
                anythinkVideoView.f11689e.a(12, str);
            }
        }

        @Override // com.anythink.expressad.playercommon.DefaultVideoPlayerStatusListener, com.anythink.expressad.playercommon.VideoPlayerStatusListener
        public final void onPlayProgress(int i10, int i11) {
            int i12;
            String str;
            c cVar;
            int i13;
            int i14;
            String str2;
            super.onPlayProgress(i10, i11);
            if (this.f11844a.f) {
                c cVar2 = this.f11853k;
                if (cVar2 != null) {
                    i13 = cVar2.i();
                    com.anythink.expressad.foundation.f.b.a().a(this.f11853k.K() + "_1", i10);
                } else {
                    i13 = 0;
                }
                String str3 = "0";
                if (this.f11853k.j() && this.f11853k.k() == 5) {
                    try {
                        int i15 = this.f11844a.O;
                        AnythinkVideoView anythinkVideoView = this.f11844a;
                        if (anythinkVideoView != null) {
                            String str4 = (String) anythinkVideoView.getContext().getResources().getText(i.a(n.a().g(), "anythink_reward_video_view_reward_time_complete", i.f10128g));
                            String str5 = (String) this.f11844a.getContext().getResources().getText(i.a(n.a().g(), "anythink_reward_video_view_reward_time_left", i.f10128g));
                            if (i13 >= 0) {
                                int i16 = i13 - i10;
                                if (i16 > 0) {
                                    str4 = i16 + str5;
                                }
                            } else {
                                int i17 = i15 - i10;
                                if (i17 <= 0) {
                                    if (i13 <= 0) {
                                        this.f11848e.f11841a = i10;
                                        this.f11844a.F.setText(str3);
                                        if (this.f11844a.J != null && this.f11844a.J.getVisibility() == 0) {
                                            this.f11844a.J.setProgress(i10);
                                        }
                                    }
                                } else if (i13 <= 0) {
                                    str4 = String.valueOf(i17);
                                } else {
                                    str4 = i17 + str5;
                                }
                            }
                            str3 = str4;
                            this.f11848e.f11841a = i10;
                            this.f11844a.F.setText(str3);
                            if (this.f11844a.J != null) {
                                this.f11844a.J.setProgress(i10);
                            }
                        }
                    } catch (Exception e10) {
                        o.d("DefaultVideoPlayerStatusListener", e10.getMessage());
                    }
                } else {
                    AnythinkVideoView anythinkVideoView2 = this.f11844a;
                    if (anythinkVideoView2 != null) {
                        if (i13 > i11) {
                            i13 = i11;
                        }
                        if (i13 <= 0) {
                            i14 = i11 - i10;
                        } else {
                            i14 = i13 - i10;
                        }
                        if (i14 <= 0) {
                            if (i13 > 0) {
                                str3 = (String) anythinkVideoView2.getContext().getResources().getText(i.a(n.a().g(), "anythink_reward_video_view_reward_time_complete", i.f10128g));
                            }
                        } else {
                            if (i13 <= 0) {
                                str2 = String.valueOf(i14);
                            } else {
                                str2 = i14 + ((String) this.f11844a.getContext().getResources().getText(i.a(n.a().g(), "anythink_reward_video_view_reward_time_left", i.f10128g)));
                            }
                            str3 = str2;
                        }
                        this.f11844a.F.setText(str3);
                        if (this.f11844a.J != null && this.f11844a.J.getVisibility() == 0) {
                            this.f11844a.J.setProgress(i10);
                        }
                    }
                    this.f11848e.f11841a = i10;
                }
            }
            this.f11846c = i11;
            AnythinkVideoView anythinkVideoView3 = this.f11844a;
            anythinkVideoView3.mCurrentPlayProgressTime = i10;
            a aVar = this.f11848e;
            aVar.f11841a = i10;
            aVar.f11842b = i11;
            aVar.f11843c = anythinkVideoView3.aG;
            this.f11845b = i10;
            this.f11844a.f11689e.a(15, this.f11848e);
            if (this.f11844a.au && !this.f11844a.aB && this.f11844a.ay == com.anythink.expressad.foundation.g.a.cs) {
                this.f11844a.e();
            }
            try {
                AnythinkVideoView anythinkVideoView4 = this.f11844a;
                if (anythinkVideoView4 != null && anythinkVideoView4.M != null) {
                    int i18 = (i10 * 100) / i11;
                    this.f11844a.M.setProgress(i18, this.f11844a.mCurrPlayNum - 1);
                    this.f11853k.n(i18);
                }
                AnythinkVideoView anythinkVideoView5 = this.f11844a;
                if (anythinkVideoView5 != null && anythinkVideoView5.S != -1 && i10 == this.f11844a.S && (cVar = this.f11844a.f11686b) != null && cVar.j()) {
                    this.f11844a.setCTALayoutVisibleOrGone();
                }
            } catch (Throwable th) {
                o.d("DefaultVideoPlayerStatusListener", th.getMessage());
            }
            int i19 = this.f11854l;
            if (i19 == 100 || this.f11856n || i19 == 0) {
                return;
            }
            if (this.f11855m > i19) {
                this.f11855m = i19 / 2;
            }
            int i20 = this.f11855m;
            if (i20 >= 0 && i10 >= (i12 = (i11 * i20) / 100)) {
                if (this.f11853k.w() != 94 && this.f11853k.w() != 287) {
                    str = this.f11853k.aZ() + this.f11853k.S() + this.f11853k.B();
                } else {
                    str = this.f11853k.Z() + this.f11853k.aZ() + this.f11853k.S();
                }
                com.anythink.expressad.videocommon.b.c a10 = e.a().a(this.f11852j, str);
                if (a10 != null) {
                    a10.i();
                    this.f11856n = true;
                    o.d("DefaultVideoPlayerStatusListener", "CDRate is : " + i12 + " and start download !");
                }
            }
        }

        @Override // com.anythink.expressad.playercommon.DefaultVideoPlayerStatusListener, com.anythink.expressad.playercommon.VideoPlayerStatusListener
        public final void onPlaySetDataSourceError(String str) {
            super.onPlaySetDataSourceError(str);
        }

        @Override // com.anythink.expressad.playercommon.DefaultVideoPlayerStatusListener, com.anythink.expressad.playercommon.VideoPlayerStatusListener
        public final void onPlayStarted(int i10) {
            super.onPlayStarted(i10);
            if (!this.f11847d) {
                AnythinkVideoView anythinkVideoView = this.f11844a;
                if (anythinkVideoView != null) {
                    AnythinkVideoView.q(anythinkVideoView);
                }
                this.f11844a.f11689e.a(10, this.f11848e);
                this.f11847d = true;
            }
            c cVar = this.f11853k;
            if (cVar != null) {
                int i11 = cVar.i();
                String str = "anythink_reward_shape_progress";
                if (this.f11853k.j()) {
                    AnythinkVideoView anythinkVideoView2 = this.f11844a;
                    if (anythinkVideoView2 != null && anythinkVideoView2.F != null) {
                        if (this.f11853k.k() == 5) {
                            AnythinkVideoView anythinkVideoView3 = this.f11844a;
                            if (anythinkVideoView3.mCurrPlayNum > 1 && i11 <= 0) {
                                anythinkVideoView3.F.setBackgroundResource(i.a(n.a().g(), "anythink_reward_video_time_count_num_bg", i.f10125c));
                                d();
                            }
                        }
                        if (i11 > 0) {
                            d();
                            str = "anythink_reward_video_time_count_num_bg";
                        }
                        this.f11844a.F.setBackgroundResource(i.a(n.a().g(), str, i.f10125c));
                    }
                } else if (i11 > 0) {
                    this.f11844a.F.setBackgroundResource(i.a(n.a().g(), "anythink_reward_video_time_count_num_bg", i.f10125c));
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, l.f(30.0f));
                    int f = l.f(5.0f);
                    layoutParams.addRule(1, i.a(n.a().g(), "anythink_native_endcard_feed_btn", "id"));
                    layoutParams.setMargins(f, 0, 0, 0);
                    this.f11844a.F.setPadding(f, 0, f, 0);
                    this.f11844a.F.setLayoutParams(layoutParams);
                } else {
                    this.f11844a.F.setBackgroundResource(i.a(n.a().g(), "anythink_reward_shape_progress", i.f10125c));
                }
            }
            if (this.f11844a.J != null) {
                this.f11844a.J.setMax(i10);
            }
            c cVar2 = this.f11853k;
            if (cVar2 != null && cVar2.f() == 2) {
                this.f11844a.H.setVisibility(0);
            }
            if (this.f11844a.F.getVisibility() == 0) {
                this.f11844a.n();
            }
            boolean unused = AnythinkVideoView.av = false;
            if (this.f11844a.S == 0) {
                this.f11844a.setCTALayoutVisibleOrGone();
            }
            this.f11844a.showMoreOfferInPlayTemplate();
            this.f11844a.showBaitClickView();
        }

        @Override // com.anythink.expressad.playercommon.DefaultVideoPlayerStatusListener, com.anythink.expressad.playercommon.VideoPlayerStatusListener
        public final void onVideoDownloadResume() {
            String str;
            if (this.f11853k.w() != 94 && this.f11853k.w() != 287) {
                str = this.f11853k.aZ() + this.f11853k.S() + this.f11853k.B();
            } else {
                str = this.f11853k.Z() + this.f11853k.aZ() + this.f11853k.S();
            }
            com.anythink.expressad.videocommon.b.c a10 = e.a().a(this.f11852j, str);
            if (a10 != null) {
                a10.i();
                this.f11856n = true;
                o.d("DefaultVideoPlayerStatusListener", "onVideoDownloadResume is : and start download !");
            }
        }

        public final void a(boolean z10) {
            this.f11851i = z10;
        }

        public final void a(String str) {
            this.f11852j = str;
        }

        public final int a() {
            return this.f11845b;
        }

        public final void a(int i10, int i11) {
            this.f11854l = i10;
            this.f11855m = i11;
        }

        private void a(int i10) {
            if (i10 > 0) {
                this.f11844a.F.setBackgroundResource(i.a(n.a().g(), "anythink_reward_video_time_count_num_bg", i.f10125c));
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, l.f(30.0f));
                int f = l.f(5.0f);
                layoutParams.addRule(1, i.a(n.a().g(), "anythink_native_endcard_feed_btn", "id"));
                layoutParams.setMargins(f, 0, 0, 0);
                this.f11844a.F.setPadding(f, 0, f, 0);
                this.f11844a.F.setLayoutParams(layoutParams);
                return;
            }
            this.f11844a.F.setBackgroundResource(i.a(n.a().g(), "anythink_reward_shape_progress", i.f10125c));
        }

        private void b(int i10, int i11, int i12) {
            String str;
            AnythinkVideoView anythinkVideoView = this.f11844a;
            if (anythinkVideoView == null) {
                return;
            }
            if (i10 > i11) {
                i10 = i11;
            }
            int i13 = i10 <= 0 ? i11 - i12 : i10 - i12;
            if (i13 <= 0) {
                str = i10 <= 0 ? "0" : (String) anythinkVideoView.getContext().getResources().getText(i.a(n.a().g(), "anythink_reward_video_view_reward_time_complete", i.f10128g));
            } else if (i10 <= 0) {
                str = String.valueOf(i13);
            } else {
                str = i13 + ((String) this.f11844a.getContext().getResources().getText(i.a(n.a().g(), "anythink_reward_video_view_reward_time_left", i.f10128g)));
            }
            this.f11844a.F.setText(str);
            if (this.f11844a.J == null || this.f11844a.J.getVisibility() != 0) {
                return;
            }
            this.f11844a.J.setProgress(i12);
        }

        public final void b() {
            this.f11844a = null;
            boolean unused = AnythinkVideoView.av = false;
        }

        private void a(int i10, int i11, int i12) {
            AnythinkVideoView anythinkVideoView = this.f11844a;
            if (anythinkVideoView == null) {
                return;
            }
            String str = (String) anythinkVideoView.getContext().getResources().getText(i.a(n.a().g(), "anythink_reward_video_view_reward_time_complete", i.f10128g));
            String str2 = (String) this.f11844a.getContext().getResources().getText(i.a(n.a().g(), "anythink_reward_video_view_reward_time_left", i.f10128g));
            if (i10 >= 0) {
                int i13 = i10 - i12;
                if (i13 > 0) {
                    str = i13 + str2;
                }
            } else {
                int i14 = i11 - i12;
                if (i14 <= 0) {
                    if (i10 <= 0) {
                        str = "0";
                    }
                } else if (i10 <= 0) {
                    str = String.valueOf(i14);
                } else {
                    str = i14 + str2;
                }
            }
            this.f11848e.f11841a = i12;
            this.f11844a.F.setText(str);
            if (this.f11844a.J == null || this.f11844a.J.getVisibility() != 0) {
                return;
            }
            this.f11844a.J.setProgress(i12);
        }
    }

    public AnythinkVideoView(Context context) {
        super(context);
        this.mMuteSwitch = 0;
        this.O = 0;
        this.mCampaignSize = 1;
        this.mCurrPlayNum = 1;
        this.mCurrentPlayProgressTime = 0;
        this.V = false;
        this.W = false;
        this.ah = "";
        this.ak = false;
        this.al = false;
        this.am = false;
        this.an = false;
        this.ao = false;
        this.ap = false;
        this.aq = false;
        this.ar = false;
        this.as = false;
        this.au = false;
        this.aw = 2;
        this.aB = false;
        this.aC = false;
        this.aD = false;
        this.aE = true;
        this.aF = false;
        this.aG = false;
        this.aH = false;
        this.aI = false;
        this.aL = new b(this);
        this.aM = false;
        this.aN = new Runnable() { // from class: com.anythink.expressad.video.module.AnythinkVideoView.3
            @Override // java.lang.Runnable
            public final void run() {
                if (AnythinkVideoView.this.P != null) {
                    AnythinkVideoView.this.P.setVisibility(8);
                }
            }
        };
    }

    private void a(String str) {
        k.f().a(str, new com.anythink.expressad.foundation.g.d.c() { // from class: com.anythink.expressad.video.module.AnythinkVideoView.2
            @Override // com.anythink.expressad.foundation.g.d.c
            public final void a(Bitmap bitmap, String str2) {
                if (bitmap != null) {
                    try {
                        if (bitmap.isRecycled() || AnythinkVideoView.this.I == null) {
                            return;
                        }
                        AnythinkVideoView.this.I.setVisibility(0);
                        ImageView imageView = AnythinkVideoView.this.I;
                        com.anythink.expressad.video.dynview.i.b.a();
                        imageView.setImageBitmap(com.anythink.expressad.video.dynview.i.b.a(bitmap, 20));
                    } catch (Throwable th) {
                        o.d(AnythinkVideoView.TAG, th.getMessage());
                    }
                }
            }

            @Override // com.anythink.expressad.foundation.g.d.c
            public final void a(String str2, String str3) {
                o.d(AnythinkVideoView.TAG, str2);
            }
        });
    }

    public static /* synthetic */ boolean e(AnythinkVideoView anythinkVideoView) {
        anythinkVideoView.aH = true;
        return true;
    }

    public static /* synthetic */ boolean h(AnythinkVideoView anythinkVideoView) {
        anythinkVideoView.V = false;
        return false;
    }

    public static /* synthetic */ boolean k(AnythinkVideoView anythinkVideoView) {
        anythinkVideoView.aC = true;
        return true;
    }

    public static /* synthetic */ boolean l(AnythinkVideoView anythinkVideoView) {
        anythinkVideoView.aG = true;
        return true;
    }

    public static /* synthetic */ boolean n(AnythinkVideoView anythinkVideoView) {
        anythinkVideoView.aD = true;
        return true;
    }

    public static /* synthetic */ boolean p(AnythinkVideoView anythinkVideoView) {
        anythinkVideoView.ar = true;
        return true;
    }

    public static /* synthetic */ boolean q(AnythinkVideoView anythinkVideoView) {
        anythinkVideoView.L = true;
        return true;
    }

    public static /* synthetic */ boolean w(AnythinkVideoView anythinkVideoView) {
        anythinkVideoView.aF = true;
        return true;
    }

    @Override // com.anythink.expressad.video.signal.j
    public void alertWebViewShowed() {
        this.V = true;
        setShowingAlertViewCover(true);
    }

    @Override // com.anythink.expressad.video.signal.j
    public void closeVideoOperate(int i10, int i11) {
        if (i10 == 1) {
            this.aH = true;
            if (getVisibility() == 0) {
                e();
            }
        }
        if (i11 == 1) {
            gonePlayingCloseView();
            return;
        }
        if (i11 == 2) {
            if ((!this.aG || getVisibility() != 0) && this.f && this.G.getVisibility() != 0) {
                if (!this.f11692i || this.L) {
                    this.G.setVisibility(0);
                }
                this.ao = true;
            }
        }
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public void defaultShow() {
        super.defaultShow();
        this.ak = true;
        showVideoLocation(0, 0, t.f(this.f11685a), t.e(this.f11685a), 0, 0, 0, 0, 0);
        videoOperate(1);
        if (this.f11819ab == 0) {
            closeVideoOperate(-1, 2);
        }
    }

    @Override // com.anythink.expressad.video.signal.j
    public void dismissAllAlert() {
        com.anythink.expressad.widget.a.a aVar = this.af;
        if (aVar != null) {
            aVar.dismiss();
        }
        com.anythink.expressad.video.module.a.a aVar2 = this.f11689e;
        if (aVar2 != null) {
            aVar2.a(125, "");
        }
    }

    @Override // com.anythink.expressad.video.signal.j
    public int getBorderViewHeight() {
        return B;
    }

    @Override // com.anythink.expressad.video.signal.j
    public int getBorderViewLeft() {
        return f11817z;
    }

    @Override // com.anythink.expressad.video.signal.j
    public int getBorderViewRadius() {
        return f11816x;
    }

    @Override // com.anythink.expressad.video.signal.j
    public int getBorderViewTop() {
        return y;
    }

    @Override // com.anythink.expressad.video.signal.j
    public int getBorderViewWidth() {
        return A;
    }

    public int getCloseAlert() {
        return this.f11821ad;
    }

    @Override // com.anythink.expressad.video.signal.j
    public String getCurrentProgress() {
        int i10;
        try {
            int a10 = this.aL.a();
            c cVar = this.f11686b;
            if (cVar != null) {
                i10 = cVar.bi();
            } else {
                i10 = 0;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("progress", a(a10, i10));
            jSONObject.put("time", a10);
            jSONObject.put("duration", String.valueOf(i10));
            return jSONObject.toString();
        } catch (Throwable th) {
            o.b(TAG, th.getMessage(), th);
            return JsonUtils.EMPTY_JSON;
        }
    }

    public int getMute() {
        return this.aw;
    }

    public String getUnitId() {
        return this.ah;
    }

    public int getVideoSkipTime() {
        return this.f11819ab;
    }

    public void gonePlayingCloseView() {
        if (this.f && this.G.getVisibility() != 8) {
            this.G.setVisibility(8);
            this.ao = false;
        }
        if (!this.aM && !this.ar && !this.ap) {
            this.aM = true;
            int i10 = this.f11819ab;
            if (i10 >= 0) {
                if (i10 == 0) {
                    this.ar = true;
                } else {
                    new Handler().postDelayed(new AnonymousClass11(), this.f11819ab * 1000);
                }
            }
        }
    }

    @Override // com.anythink.expressad.video.signal.j
    public void hideAlertView(int i10) {
        if (this.V) {
            this.V = false;
            this.aB = true;
            setShowingAlertViewCover(false);
            com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.b().e(), this.ah, false);
            if (i10 == 0) {
                i();
                if (this.au) {
                    int i11 = this.ay;
                    if (i11 == com.anythink.expressad.foundation.g.a.cs || i11 == com.anythink.expressad.foundation.g.a.cr) {
                        this.aC = true;
                        com.anythink.expressad.video.module.a.a aVar = this.f11689e;
                        if (aVar != null) {
                            aVar.a(124, "");
                        }
                        this.aG = true;
                        gonePlayingCloseView();
                        return;
                    }
                    return;
                }
                return;
            }
            this.aD = true;
            boolean z10 = this.au;
            if (z10 && this.ay == com.anythink.expressad.foundation.g.a.cs) {
                i();
                return;
            }
            if (z10 && this.ay == com.anythink.expressad.foundation.g.a.cr) {
                com.anythink.expressad.video.module.a.a aVar2 = this.f11689e;
                if (aVar2 != null) {
                    aVar2.a(2, b(this.aF));
                    return;
                }
                return;
            }
            com.anythink.expressad.video.module.a.a aVar3 = this.f11689e;
            if (aVar3 != null) {
                aVar3.a(2, "");
            }
        }
    }

    @Override // com.anythink.expressad.video.signal.j
    public boolean isH5Canvas() {
        if (getLayoutParams().height >= t.e(this.f11685a.getApplicationContext())) {
            return false;
        }
        return true;
    }

    public boolean isInstallDialogShowing() {
        return this.W;
    }

    public boolean isMiniCardShowing() {
        return this.an;
    }

    public boolean isShowingAlertView() {
        return this.V;
    }

    public boolean isShowingTransparent() {
        return this.as;
    }

    public boolean isfront() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return false;
        }
        int indexOfChild = viewGroup.indexOfChild(this);
        int childCount = viewGroup.getChildCount();
        int i10 = indexOfChild + 1;
        boolean z10 = false;
        while (i10 <= childCount - 1) {
            if (viewGroup.getChildAt(i10).getVisibility() == 0 && this.an) {
                return false;
            }
            i10++;
            z10 = true;
        }
        return z10;
    }

    @Override // com.anythink.expressad.video.signal.j
    public void notifyCloseBtn(int i10) {
        if (i10 == 0) {
            this.ap = true;
            this.ar = false;
        } else if (i10 == 1) {
            this.aq = true;
        }
    }

    public void notifyVideoClose() {
        this.f11689e.a(2, "");
    }

    public void onBackPress() {
        if (this.an || this.V || this.aC) {
            return;
        }
        if (this.ao) {
            e();
            return;
        }
        boolean z10 = this.ap;
        if (z10 && this.aq) {
            e();
        } else if (!z10 && this.ar) {
            e();
        }
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        c cVar = this.f11686b;
        if ((cVar == null || !cVar.j()) && this.f && this.ak) {
            l();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            if (this.aN != null) {
                getHandler().removeCallbacks(this.aN);
            }
        } catch (Throwable th) {
            o.d(TAG, th.getMessage());
        }
    }

    @Override // com.anythink.expressad.video.signal.f
    public void preLoadData(com.anythink.expressad.video.signal.factory.b bVar) {
        c cVar;
        this.R = bVar;
        if (this.f) {
            if (!TextUtils.isEmpty(this.f11818aa) && (cVar = this.f11686b) != null) {
                if (cVar != null && w.b(cVar.U())) {
                    String U = this.f11686b.U();
                    o.b(TAG, "AnythinkBaseView videoResolution:".concat(String.valueOf(U)));
                    String[] split = U.split("x");
                    if (split.length == 2) {
                        if (t.b(split[0]) > 0.0d) {
                            this.ai = t.b(split[0]);
                        }
                        if (t.b(split[1]) > 0.0d) {
                            this.aj = t.b(split[1]);
                        }
                        o.b(TAG, "AnythinkBaseView mVideoW:" + this.ai + "  mVideoH:" + this.aj);
                    }
                    if (this.ai <= 0.0d) {
                        this.ai = 1280.0d;
                    }
                    if (this.aj <= 0.0d) {
                        this.aj = 720.0d;
                    }
                }
                this.D.initBufferIngParam(this.f11820ac);
                this.D.initVFPData(this.f11818aa, this.f11686b.S(), this.f11686b.ao(), this.aL);
                soundOperate(this.aw, -1, null);
            }
        } else {
            com.anythink.expressad.video.module.a.a aVar = this.f11689e;
            if (aVar != null) {
                aVar.a(12, "AnyThinkVideoView initSuccess false");
            }
        }
        av = false;
    }

    @Override // com.anythink.expressad.video.signal.j
    public void progressBarOperate(int i10) {
        ProgressBar progressBar;
        if (this.f) {
            if (i10 == 1) {
                ProgressBar progressBar2 = this.J;
                if (progressBar2 != null) {
                    progressBar2.setVisibility(8);
                    return;
                }
                return;
            }
            if (i10 == 2 && (progressBar = this.J) != null) {
                progressBar.setVisibility(0);
            }
        }
    }

    @Override // com.anythink.expressad.video.signal.j
    public void progressOperate(int i10, int i11) {
        int i12;
        if (this.f) {
            o.b(TAG, "progressOperate progress:".concat(String.valueOf(i10)));
            c cVar = this.f11686b;
            if (cVar != null) {
                i12 = cVar.bi();
            } else {
                i12 = 0;
            }
            if (i10 > 0 && i10 <= i12 && this.D != null) {
                o.b(TAG, "progressOperate progress:".concat(String.valueOf(i10)));
                this.D.seekTo(i10 * 1000);
            }
            if (i11 == 1) {
                this.F.setVisibility(8);
            } else if (i11 == 2) {
                this.F.setVisibility(0);
            }
            if (this.F.getVisibility() == 0) {
                n();
            }
        }
    }

    public void releasePlayer() {
        try {
            PlayerView playerView = this.D;
            if (playerView != null && !this.am) {
                playerView.release();
            }
            b bVar = this.aL;
            if (bVar != null) {
                bVar.b();
            }
            if (this.U != null) {
                this.U = null;
            }
        } catch (Exception e10) {
            o.d(TAG, e10.getMessage());
        }
    }

    public void setBufferTimeout(int i10) {
        this.f11820ac = i10;
    }

    public void setCTALayoutVisibleOrGone() {
        FrameLayout frameLayout;
        c cVar = this.f11686b;
        if (cVar == null || !cVar.j() || (frameLayout = this.P) == null || this.S < -1) {
            return;
        }
        AnythinkClickCTAView anythinkClickCTAView = this.Q;
        if (anythinkClickCTAView == null && frameLayout != null) {
            if (anythinkClickCTAView == null) {
                AnythinkClickCTAView anythinkClickCTAView2 = new AnythinkClickCTAView(getContext());
                this.Q = anythinkClickCTAView2;
                anythinkClickCTAView2.setCampaign(this.f11686b);
                this.Q.setUnitId(this.ah);
                com.anythink.expressad.video.module.a.a aVar = this.U;
                if (aVar != null) {
                    this.Q.setNotifyListener(new com.anythink.expressad.video.module.a.a.i(aVar));
                }
                this.Q.preLoadData(this.R);
            }
            this.P.addView(this.Q);
        }
        int i10 = this.S;
        if (i10 >= 0) {
            this.P.setVisibility(0);
            return;
        }
        if (i10 == -1) {
            if (this.P.getVisibility() != 0) {
                this.P.setVisibility(0);
                postDelayed(this.aN, m.ag);
            } else {
                this.P.setVisibility(8);
                getHandler().removeCallbacks(this.aN);
            }
        }
    }

    public void setCamPlayOrderCallback(com.anythink.expressad.video.dynview.f.a aVar, List<c> list, int i10, int i11) {
        AnyThinkSegmentsProgressBar anyThinkSegmentsProgressBar;
        this.N = aVar;
        this.mCampaignSize = list.size();
        this.mCurrPlayNum = i10;
        this.O = i11;
        this.mCampOrderViewData = list;
        c cVar = this.f11686b;
        if (cVar != null && cVar.k() == 5 && (anyThinkSegmentsProgressBar = this.M) != null && this.mCampOrderViewData != null) {
            if (this.mCampaignSize > 1) {
                anyThinkSegmentsProgressBar.setVisibility(0);
                this.M.init(this.mCampaignSize, 2);
                for (int i12 = 0; i12 < this.mCampOrderViewData.size(); i12++) {
                    int aF = this.mCampOrderViewData.get(i12).aF();
                    if (aF > 0) {
                        this.M.setProgress(aF, i12);
                    }
                }
                return;
            }
            anyThinkSegmentsProgressBar.setVisibility(8);
        }
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public void setCampaign(c cVar) {
        int v3;
        super.setCampaign(cVar);
        b bVar = this.aL;
        if (bVar != null) {
            bVar.a(cVar);
            b bVar2 = this.aL;
            if (cVar != null) {
                if (cVar.ao() != -1) {
                    v3 = cVar.ao();
                } else {
                    v3 = com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.b().e(), this.ah, false).v();
                }
            } else {
                v3 = com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.b().e(), this.ah, false).v();
            }
            bVar2.a(v3, com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.b().e(), this.ah, false).x());
        }
    }

    public void setCloseAlert(int i10) {
        this.f11821ad = i10;
    }

    public void setContainerViewOnNotifyListener(com.anythink.expressad.video.module.a.a aVar) {
        this.U = aVar;
    }

    @Override // com.anythink.expressad.video.signal.j
    public void setCover(boolean z10) {
        if (this.f) {
            this.D.setIsCovered(z10);
        }
    }

    public void setDialogRole(int i10) {
        boolean z10 = true;
        if (i10 != 1) {
            z10 = false;
        }
        this.aE = z10;
        o.d(TAG, i10 + " " + this.aE);
    }

    public void setIVRewardEnable(int i10, int i11, int i12) {
        this.ay = i10;
        this.az = i11;
        this.aA = i12;
    }

    @Override // com.anythink.expressad.video.signal.j
    public void setInstallDialogState(boolean z10) {
        this.W = z10;
        this.D.setIsCovered(z10);
    }

    public void setIsIV(boolean z10) {
        this.au = z10;
        b bVar = this.aL;
        if (bVar != null) {
            bVar.a(z10);
        }
    }

    @Override // com.anythink.expressad.video.signal.j
    public void setMiniEndCardState(boolean z10) {
        this.an = z10;
    }

    public void setNotchPadding(final int i10, final int i11, final int i12, final int i13) {
        RelativeLayout relativeLayout;
        try {
            StringBuilder sb2 = new StringBuilder("NOTCH VideoView ");
            boolean z10 = false;
            sb2.append(String.format("%1s-%2s-%3s-%4s", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)));
            o.d(TAG, sb2.toString());
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) getLayoutParams();
            if (Math.max(Math.max(layoutParams.leftMargin, layoutParams.rightMargin), Math.max(layoutParams.topMargin, layoutParams.bottomMargin)) > Math.max(Math.max(i10, i11), Math.max(i12, i13))) {
                z10 = true;
            }
            if (!z10 && (relativeLayout = this.H) != null) {
                relativeLayout.postDelayed(new Runnable() { // from class: com.anythink.expressad.video.module.AnythinkVideoView.12
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (AnythinkVideoView.this.H == null) {
                            return;
                        }
                        AnythinkVideoView.this.H.setVisibility(0);
                        c cVar = AnythinkVideoView.this.f11686b;
                        if (cVar != null && !cVar.j() && AnythinkVideoView.this.f11686b.f() != 2) {
                            AnythinkVideoView.this.H.setPadding(i10, i12, i11, i13);
                            AnythinkVideoView.this.H.startAnimation(AnythinkVideoView.this.aJ);
                        }
                        AnythinkVideoView.this.H.setVisibility(0);
                    }
                }, 200L);
            }
            if (this.F.getVisibility() == 0) {
                n();
            }
        } catch (Exception e10) {
            o.d(TAG, e10.getMessage());
        }
    }

    public void setPlayURL(String str) {
        this.f11818aa = str;
    }

    @Override // com.anythink.expressad.video.signal.j
    public void setScaleFitXY(int i10) {
        this.at = i10;
    }

    public void setShowingAlertViewCover(boolean z10) {
        this.D.setIsCovered(z10);
    }

    public void setShowingTransparent(boolean z10) {
        this.as = z10;
    }

    public void setSoundState(int i10) {
        this.aw = i10;
    }

    public void setUnitId(String str) {
        this.ah = str;
        b bVar = this.aL;
        if (bVar != null) {
            bVar.a(str);
        }
    }

    public void setVideoLayout(c cVar) {
        if (cVar != null) {
            this.f11686b = cVar;
            this.f11692i = cVar.j();
        }
        if (this.f11692i) {
            new com.anythink.expressad.video.dynview.j.c();
            com.anythink.expressad.video.dynview.c a10 = com.anythink.expressad.video.dynview.j.c.a(this, cVar);
            com.anythink.expressad.video.dynview.b.a();
            com.anythink.expressad.video.dynview.b.a(a10, new AnonymousClass1(this, a10));
            return;
        }
        int findLayout = findLayout(f11811s);
        if (findLayout > 0) {
            this.f11687c.inflate(findLayout, this);
            b();
        }
        av = false;
    }

    public void setVideoSkipTime(int i10) {
        this.f11819ab = i10;
    }

    @Override // com.anythink.expressad.video.signal.j
    public void setVisible(int i10) {
        setVisibility(i10);
    }

    @Override // com.anythink.expressad.video.signal.j
    public void showAlertView() {
        if (this.an) {
            return;
        }
        if (this.ag == null) {
            this.ag = new com.anythink.expressad.widget.a.b() { // from class: com.anythink.expressad.video.module.AnythinkVideoView.9
                @Override // com.anythink.expressad.widget.a.b
                public final void a() {
                    AnythinkVideoView.h(AnythinkVideoView.this);
                    AnythinkVideoView anythinkVideoView = AnythinkVideoView.this;
                    anythinkVideoView.setShowingAlertViewCover(anythinkVideoView.V);
                    if (AnythinkVideoView.this.au && (AnythinkVideoView.this.ay == com.anythink.expressad.foundation.g.a.cs || AnythinkVideoView.this.ay == com.anythink.expressad.foundation.g.a.cr)) {
                        AnythinkVideoView.k(AnythinkVideoView.this);
                        com.anythink.expressad.video.module.a.a aVar = AnythinkVideoView.this.f11689e;
                        if (aVar != null) {
                            aVar.a(124, "");
                        }
                        AnythinkVideoView.l(AnythinkVideoView.this);
                        AnythinkVideoView.this.gonePlayingCloseView();
                    }
                    AnythinkVideoView.this.i();
                }

                @Override // com.anythink.expressad.widget.a.b
                public final void b() {
                    AnythinkVideoView.h(AnythinkVideoView.this);
                    AnythinkVideoView.n(AnythinkVideoView.this);
                    AnythinkVideoView anythinkVideoView = AnythinkVideoView.this;
                    anythinkVideoView.setShowingAlertViewCover(anythinkVideoView.V);
                    if (AnythinkVideoView.this.au && AnythinkVideoView.this.ay == com.anythink.expressad.foundation.g.a.cr) {
                        AnythinkVideoView anythinkVideoView2 = AnythinkVideoView.this;
                        com.anythink.expressad.video.module.a.a aVar = anythinkVideoView2.f11689e;
                        if (aVar != null) {
                            aVar.a(2, anythinkVideoView2.b(anythinkVideoView2.aF));
                            return;
                        }
                        return;
                    }
                    if (AnythinkVideoView.this.au && AnythinkVideoView.this.ay == com.anythink.expressad.foundation.g.a.cs) {
                        AnythinkVideoView.this.i();
                        return;
                    }
                    com.anythink.expressad.video.module.a.a aVar2 = AnythinkVideoView.this.f11689e;
                    if (aVar2 != null) {
                        aVar2.a(2, "");
                    }
                }

                @Override // com.anythink.expressad.widget.a.b
                public final void c() {
                    a();
                }
            };
        }
        if (this.af == null) {
            this.af = new com.anythink.expressad.widget.a.a(getContext(), this.ag);
        }
        if (this.au) {
            this.af.a(this.ay, this.ah);
        } else {
            this.af.b();
        }
        PlayerView playerView = this.D;
        if (playerView != null && !playerView.isComplete()) {
            this.af.show();
            this.aB = true;
            this.V = true;
            setShowingAlertViewCover(true);
            com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.b().e(), this.ah, false);
            this.ax = d.J();
        }
    }

    public void showBaitClickView() {
        int parseInt;
        AnythinkBaitClickView anythinkBaitClickView;
        c cVar = this.f11686b;
        if (cVar == null || !cVar.j() || this.f11686b.M() == null) {
            return;
        }
        String e10 = this.f11686b.M().e();
        if (TextUtils.isEmpty(e10)) {
            return;
        }
        try {
            String a10 = x.a(e10, "bait_click");
            if (!TextUtils.isEmpty(a10) && (parseInt = Integer.parseInt(a10)) != 0 && (anythinkBaitClickView = this.aK) != null) {
                anythinkBaitClickView.setVisibility(0);
                this.aK.init(parseInt);
                this.aK.startAnimation();
                this.aK.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.module.AnythinkVideoView.4
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        com.anythink.expressad.video.module.a.a aVar = AnythinkVideoView.this.f11689e;
                        if (aVar != null) {
                            aVar.a(1, "");
                        }
                    }
                });
            }
        } catch (Exception e11) {
            o.d(TAG, e11.getMessage());
        }
    }

    @Override // com.anythink.expressad.video.signal.j
    public void showIVRewardAlertView(String str) {
        this.f11689e.a(8, "");
    }

    public void showMoreOfferInPlayTemplate() {
        c cVar = this.f11686b;
        if (cVar == null || this.T == null || !cVar.j() || this.f11686b.M() == null) {
            return;
        }
        TextUtils.isEmpty(this.f11686b.M().e());
    }

    @Override // com.anythink.expressad.video.signal.j
    public void showVideoLocation(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        boolean z10;
        float f;
        StringBuilder r10 = l.r("showVideoLocation marginTop:", i10, " marginLeft:", i11, " width:");
        e0.i.n(r10, i12, "  height:", i13, " radius:");
        e0.i.n(r10, i14, " borderTop:", i15, " borderLeft:");
        e0.i.n(r10, i16, " borderWidth:", i17, " borderHeight:");
        r10.append(i18);
        o.b(TAG, r10.toString());
        if (this.f) {
            this.H.setPadding(0, 0, 0, 0);
            setVisibility(0);
            if (this.H.getVisibility() != 0) {
                this.H.setVisibility(0);
            }
            if (this.F.getVisibility() == 0) {
                n();
            }
            int f10 = t.f(this.f11685a);
            int e10 = t.e(this.f11685a);
            if (i12 > 0 && i13 > 0 && f10 >= i12 && e10 >= i13) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && !this.ak) {
                y = i15;
                f11817z = i16;
                A = i17 + 4;
                B = i18 + 4;
                float f11 = i12 / i13;
                try {
                    f = (float) (this.ai / this.aj);
                } catch (Throwable th) {
                    o.b(TAG, th.getMessage(), th);
                    f = gl.Code;
                }
                if (i14 > 0) {
                    f11816x = i14;
                    if (i14 > 0) {
                        GradientDrawable gradientDrawable = new GradientDrawable();
                        gradientDrawable.setCornerRadius(t.b(getContext(), i14));
                        gradientDrawable.setColor(-1);
                        gradientDrawable.setStroke(1, 0);
                        setBackground(gradientDrawable);
                        this.D.setBackground(gradientDrawable);
                        setClipToOutline(true);
                        this.D.setClipToOutline(true);
                    }
                }
                if (Math.abs(f11 - f) > 0.1f && this.at != 1) {
                    l();
                    videoOperate(1);
                    return;
                }
                l();
                if (this.as) {
                    setLayoutCenter(i12, i13);
                    if (av) {
                        this.f11689e.a(114, "");
                        return;
                    } else {
                        this.f11689e.a(116, "");
                        return;
                    }
                }
                setLayoutParam(i11, i10, i12, i13);
                return;
            }
            l();
        }
    }

    @Override // com.anythink.expressad.video.signal.j
    public void soundOperate(int i10, int i11) {
        soundOperate(i10, i11, "2");
    }

    @Override // com.anythink.expressad.video.signal.j
    public void videoOperate(int i10) {
        l.u(i10, "VideoView videoOperate:", TAG);
        if (this.f) {
            if (i10 == 1) {
                if (getVisibility() == 0 && isfront()) {
                    o.a(TAG, "VideoView videoOperate:play");
                    if (!this.V && !this.an && !this.W && !com.anythink.expressad.foundation.f.b.f9758c) {
                        i();
                        return;
                    }
                    return;
                }
                return;
            }
            if (i10 == 2) {
                if (getVisibility() == 0) {
                    o.a(TAG, "VideoView videoOperate:pause");
                    h();
                    return;
                }
                return;
            }
            if (i10 == 3) {
                if (!this.am) {
                    this.D.release();
                    this.am = true;
                    return;
                }
                return;
            }
            if (i10 == 5) {
                this.W = true;
                if (!this.am) {
                    h();
                    return;
                }
                return;
            }
            if (i10 == 4) {
                this.W = false;
                if (!this.am && !isMiniCardShowing()) {
                    i();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        int i10;
        com.anythink.expressad.video.module.a.a aVar;
        try {
            if (this.au && ((i10 = this.ay) == com.anythink.expressad.foundation.g.a.cr || i10 == com.anythink.expressad.foundation.g.a.cs)) {
                if (this.aB) {
                    if (i10 != com.anythink.expressad.foundation.g.a.cs || (aVar = this.f11689e) == null) {
                        return;
                    }
                    aVar.a(2, b(this.aF));
                    return;
                }
                if (i10 == com.anythink.expressad.foundation.g.a.cs && this.aH) {
                    com.anythink.expressad.video.module.a.a aVar2 = this.f11689e;
                    if (aVar2 != null) {
                        aVar2.a(2, b(this.aF));
                        return;
                    }
                    return;
                }
                if (this.aE) {
                    int curPosition = this.D.getCurPosition() / 1000;
                    int bi = (int) ((curPosition / (this.D.getDuration() == 0 ? this.f11686b.bi() : this.D.getDuration())) * 100.0f);
                    if (this.ay == com.anythink.expressad.foundation.g.a.cr) {
                        h();
                        int i11 = this.az;
                        if (i11 == com.anythink.expressad.foundation.g.a.ct && bi >= this.aA) {
                            com.anythink.expressad.video.module.a.a aVar3 = this.f11689e;
                            if (aVar3 != null) {
                                aVar3.a(2, b(this.aF));
                                return;
                            }
                            return;
                        }
                        if (i11 == com.anythink.expressad.foundation.g.a.cu && curPosition >= this.aA) {
                            com.anythink.expressad.video.module.a.a aVar4 = this.f11689e;
                            if (aVar4 != null) {
                                aVar4.a(2, b(this.aF));
                                return;
                            }
                            return;
                        }
                        com.anythink.expressad.video.module.a.a aVar5 = this.f11689e;
                        if (aVar5 != null) {
                            aVar5.a(8, "");
                        }
                    }
                    if (this.ay == com.anythink.expressad.foundation.g.a.cs) {
                        int i12 = this.az;
                        if (i12 == com.anythink.expressad.foundation.g.a.ct && bi >= this.aA) {
                            h();
                            com.anythink.expressad.video.module.a.a aVar6 = this.f11689e;
                            if (aVar6 != null) {
                                aVar6.a(8, "");
                                return;
                            }
                            return;
                        }
                        if (i12 != com.anythink.expressad.foundation.g.a.cu || curPosition < this.aA) {
                            return;
                        }
                        h();
                        com.anythink.expressad.video.module.a.a aVar7 = this.f11689e;
                        if (aVar7 != null) {
                            aVar7.a(8, "");
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            c cVar = this.f11686b;
            if (cVar != null && cVar.f() != 2) {
                int i13 = this.f11686b.i();
                int curPosition2 = this.D.getCurPosition() / 1000;
                boolean z10 = false;
                if (this.f11686b.k() == 5) {
                }
                if (z10 && this.f11821ad == 1 && !this.as) {
                    h();
                    com.anythink.expressad.video.module.a.a aVar8 = this.f11689e;
                    if (aVar8 != null) {
                        aVar8.a(8, "");
                        return;
                    }
                    return;
                }
                com.anythink.expressad.video.module.a.a aVar9 = this.f11689e;
                if (aVar9 != null) {
                    aVar9.a(2, "");
                    return;
                }
                return;
            }
            com.anythink.expressad.video.module.a.a aVar10 = this.f11689e;
            if (aVar10 != null) {
                aVar10.a(2, "");
            }
        } catch (Exception e10) {
            o.d(TAG, e10.getMessage());
        }
    }

    private boolean f() {
        try {
            this.D = (PlayerView) findViewById(filterFindViewId(this.aI, "anythink_vfpv"));
            this.E = (SoundImageView) findViewById(filterFindViewId(this.aI, "anythink_sound_switch"));
            this.F = (TextView) findViewById(filterFindViewId(this.aI, "anythink_tv_count"));
            View findViewById = findViewById(filterFindViewId(this.aI, "anythink_rl_playing_close"));
            this.G = findViewById;
            findViewById.setVisibility(4);
            this.H = (RelativeLayout) findViewById(filterFindViewId(this.aI, "anythink_top_control"));
            this.I = (ImageView) findViewById(filterFindViewId(this.aI, "anythink_videoview_bg"));
            this.J = (ProgressBar) findViewById(filterFindViewId(this.aI, "anythink_video_progress_bar"));
            this.K = (FeedBackButton) findViewById(filterFindViewId(this.aI, "anythink_native_endcard_feed_btn"));
            this.M = (AnyThinkSegmentsProgressBar) findViewById(filterFindViewId(this.aI, "anythink_reward_segment_progressbar"));
            this.P = (FrameLayout) findViewById(filterFindViewId(this.aI, "anythink_reward_cta_layout"));
            this.aK = (AnythinkBaitClickView) findViewById(filterFindViewId(this.aI, "anythink_animation_click_view"));
            this.T = (RelativeLayout) findViewById(filterFindViewId(this.aI, "anythink_reward_moreoffer_layout"));
            try {
                String aE = this.f11686b.aE();
                if (TextUtils.isEmpty(aE)) {
                    aE = com.anythink.expressad.a.f6554ab;
                }
                if (!TextUtils.isEmpty(aE)) {
                    com.anythink.expressad.foundation.g.d.b.a(this.f11685a).a(aE, new com.anythink.expressad.foundation.g.d.c() { // from class: com.anythink.expressad.video.module.AnythinkVideoView.10
                        @Override // com.anythink.expressad.foundation.g.d.c
                        public final void a(String str, String str2) {
                        }

                        @Override // com.anythink.expressad.foundation.g.d.c
                        public final void a(Bitmap bitmap, String str) {
                            int b10 = t.b(AnythinkVideoView.this.f11685a, 12.0f);
                            ImageView imageView = new ImageView(AnythinkVideoView.this.f11685a);
                            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                            imageView.setImageBitmap(bitmap);
                            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) (b10 * ((bitmap.getWidth() * 1.0f) / bitmap.getHeight())), b10);
                            layoutParams.addRule(11);
                            layoutParams.addRule(12);
                            layoutParams.bottomMargin = t.b(AnythinkVideoView.this.f11685a, 5.0f);
                            layoutParams.rightMargin = t.b(AnythinkVideoView.this.f11685a, 12.0f);
                            AnythinkVideoView.this.addView(imageView, layoutParams);
                        }
                    });
                }
            } catch (Exception e10) {
                if (com.anythink.expressad.a.f6552a) {
                    o.d(TAG, e10.getLocalizedMessage());
                }
            }
            return isNotNULL(this.D, this.E, this.F, this.G);
        } catch (Throwable th) {
            o.b(TAG, th.getMessage(), th);
            return false;
        }
    }

    private void g() {
        c cVar = this.f11686b;
        if (cVar == null || !w.b(cVar.U())) {
            return;
        }
        String U = this.f11686b.U();
        o.b(TAG, "AnythinkBaseView videoResolution:".concat(String.valueOf(U)));
        String[] split = U.split("x");
        if (split.length == 2) {
            if (t.b(split[0]) > 0.0d) {
                this.ai = t.b(split[0]);
            }
            if (t.b(split[1]) > 0.0d) {
                this.aj = t.b(split[1]);
            }
            o.b(TAG, "AnythinkBaseView mVideoW:" + this.ai + "  mVideoH:" + this.aj);
        }
        if (this.ai <= 0.0d) {
            this.ai = 1280.0d;
        }
        if (this.aj <= 0.0d) {
            this.aj = 720.0d;
        }
    }

    private void h() {
        boolean z10;
        c cVar;
        try {
            PlayerView playerView = this.D;
            if (playerView != null) {
                if (!this.W && !this.V) {
                    z10 = false;
                    playerView.setIsCovered(z10);
                    this.D.onPause();
                    cVar = this.f11686b;
                    if (cVar != null || cVar.L() == null || this.f11686b.aw()) {
                        return;
                    }
                    this.f11686b.ax();
                    Context g6 = n.a().g();
                    c cVar2 = this.f11686b;
                    com.anythink.expressad.a.a.a(g6, cVar2, this.ah, cVar2.L().m(), false);
                    return;
                }
                z10 = true;
                playerView.setIsCovered(z10);
                this.D.onPause();
                cVar = this.f11686b;
                if (cVar != null) {
                }
            }
        } catch (Throwable th) {
            o.b(TAG, th.getMessage(), th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        try {
            if (!this.al) {
                boolean playVideo = this.D.playVideo();
                c cVar = this.f11686b;
                if (cVar != null && cVar.J() != 2 && !playVideo) {
                    o.d("MediaPlayer", "播放失败");
                    b bVar = this.aL;
                    if (bVar != null) {
                        bVar.onPlayError("play video failed");
                    }
                }
                this.al = true;
                return;
            }
            if (this.W || this.V) {
                return;
            }
            this.D.setIsCovered(false);
            this.D.onResume();
        } catch (Exception e10) {
            o.b(TAG, e10.getMessage(), e10);
        }
    }

    private void j() {
        if (!this.f || this.G.getVisibility() == 0) {
            return;
        }
        if (!this.f11692i || this.L) {
            this.G.setVisibility(0);
        }
        this.ao = true;
    }

    private void k() {
        if (this.aM || this.ar || this.ap) {
            return;
        }
        this.aM = true;
        int i10 = this.f11819ab;
        if (i10 >= 0) {
            if (i10 == 0) {
                this.ar = true;
            } else {
                new Handler().postDelayed(new AnonymousClass11(), this.f11819ab * 1000);
            }
        }
    }

    private void l() {
        float f;
        float f10 = t.f(this.f11685a);
        float e10 = t.e(this.f11685a);
        c.C0119c M = this.f11686b.M();
        if (M != null && ((M.c() == 1 && f10 > e10) || (M.c() == 2 && e10 > f10))) {
            float f11 = f10 + e10;
            e10 = f11 - e10;
            f10 = f11 - e10;
        }
        int b10 = t.b(getContext(), 58.0f);
        int b11 = t.b(getContext(), 104.0f);
        c cVar = this.f11686b;
        if (cVar != null && cVar.f() == 2) {
            int c10 = this.f11686b.M().c();
            if (c10 == 1) {
                f10 -= b10 * 2;
                e10 -= b11 * 2;
            }
            if (c10 == 2) {
                f10 -= b11 * 2;
                e10 -= b10 * 2;
            }
            if (c10 == 0) {
                if (this.f11688d == 1) {
                    f10 -= b10 * 2;
                    f = b11 * 2;
                } else {
                    f10 -= b11 * 2;
                    f = b10 * 2;
                }
                e10 -= f;
            }
        }
        double d10 = this.ai;
        if (d10 > 0.0d) {
            double d11 = this.aj;
            if (d11 > 0.0d && f10 > gl.Code && e10 > gl.Code) {
                double d12 = d10 / d11;
                double d13 = f10 / e10;
                o.b(TAG, "videoWHDivide:" + d12 + "  screenWHDivide:" + d13);
                double a10 = t.a(Double.valueOf(d12));
                double a11 = t.a(Double.valueOf(d13));
                o.b(TAG, "videoWHDivideFinal:" + a10 + "  screenWHDivideFinal:" + a11);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.D.getLayoutParams();
                if (a10 > a11) {
                    double d14 = (f10 * this.aj) / this.ai;
                    layoutParams.width = -1;
                    layoutParams.height = (int) d14;
                    layoutParams.gravity = 17;
                } else if (a10 < a11) {
                    layoutParams.width = (int) (e10 * d12);
                    layoutParams.height = -1;
                    layoutParams.gravity = 17;
                } else {
                    layoutParams.width = -1;
                    layoutParams.height = -1;
                }
                try {
                    c cVar2 = this.f11686b;
                    if (cVar2 != null && cVar2.j()) {
                        int b12 = this.f11686b.M().b();
                        int c11 = this.f11686b.M().c();
                        if (b12 == 102 || b12 == 202) {
                            if (c11 == 1) {
                                layoutParams.width = -1;
                                layoutParams.gravity = 17;
                                layoutParams.height = (int) (this.aj / (this.ai / f10));
                            } else {
                                layoutParams.height = -1;
                                layoutParams.gravity = 17;
                                layoutParams.width = (int) (e10 * d12);
                            }
                        }
                        if (b12 == 202 && !TextUtils.isEmpty(this.f11686b.be())) {
                            a(this.f11686b.be());
                        }
                        if (b12 == 302 || b12 == 802) {
                            double d15 = this.ai;
                            double d16 = this.aj;
                            if (d15 / d16 > 1.0d) {
                                layoutParams.width = -1;
                                layoutParams.height = (int) ((d16 * f10) / d15);
                            } else {
                                int b13 = t.b(getContext(), 220.0f);
                                layoutParams.width = (int) ((this.ai * b13) / this.aj);
                                layoutParams.height = b13;
                            }
                        }
                    }
                } catch (Throwable th) {
                    o.d(TAG, th.getMessage());
                }
                this.D.setLayoutParams(layoutParams);
                setMatchParent();
                return;
            }
        }
        m();
    }

    private void m() {
        try {
            setLayoutParam(0, 0, -1, -1);
            if (isLandscape() || !this.f) {
                return;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.D.getLayoutParams();
            int f = t.f(this.f11685a);
            layoutParams.width = -1;
            layoutParams.height = (f * 9) / 16;
            layoutParams.gravity = 17;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        if (com.anythink.expressad.foundation.f.b.a().b()) {
            this.f11686b.l(this.ah);
            com.anythink.expressad.foundation.f.b.a().a(l.p(new StringBuilder(), this.ah, "_1"), this.f11686b);
            com.anythink.expressad.foundation.f.b.a().a(l.p(new StringBuilder(), this.ah, "_1"), this.K);
        } else {
            FeedBackButton feedBackButton = this.K;
            if (feedBackButton != null) {
                feedBackButton.setVisibility(8);
            }
        }
    }

    private int o() {
        return com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.b().e(), this.ah, false).x();
    }

    private void p() {
        if (this.P == null) {
            return;
        }
        if (this.Q == null) {
            AnythinkClickCTAView anythinkClickCTAView = new AnythinkClickCTAView(getContext());
            this.Q = anythinkClickCTAView;
            anythinkClickCTAView.setCampaign(this.f11686b);
            this.Q.setUnitId(this.ah);
            com.anythink.expressad.video.module.a.a aVar = this.U;
            if (aVar != null) {
                this.Q.setNotifyListener(new com.anythink.expressad.video.module.a.a.i(aVar));
            }
            this.Q.preLoadData(this.R);
        }
        this.P.addView(this.Q);
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public final void c() {
        super.c();
        if (this.f) {
            if (this.f11692i) {
                if (com.anythink.expressad.video.dynview.i.c.a(this.f11686b) == -1 || com.anythink.expressad.video.dynview.i.c.a(this.f11686b) == 100) {
                    this.D.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.module.AnythinkVideoView.5
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            com.anythink.expressad.video.module.a.a aVar = AnythinkVideoView.this.f11689e;
                            if (aVar != null) {
                                aVar.a(1, "");
                            }
                            AnythinkVideoView.this.setCTALayoutVisibleOrGone();
                        }
                    });
                }
            } else {
                this.D.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.module.AnythinkVideoView.6
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        com.anythink.expressad.video.module.a.a aVar = AnythinkVideoView.this.f11689e;
                        if (aVar != null) {
                            aVar.a(1, "");
                        }
                    }
                });
            }
            SoundImageView soundImageView = this.E;
            if (soundImageView != null) {
                soundImageView.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.module.AnythinkVideoView.7
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Integer num = 2;
                        if (AnythinkVideoView.this.D != null && AnythinkVideoView.this.D.isSilent()) {
                            num = 1;
                        }
                        if (num.intValue() == 1) {
                            AnythinkVideoView.this.mMuteSwitch = 2;
                        } else {
                            AnythinkVideoView.this.mMuteSwitch = 1;
                        }
                        com.anythink.expressad.video.module.a.a aVar = AnythinkVideoView.this.f11689e;
                        if (aVar != null) {
                            aVar.a(5, num);
                        }
                    }
                });
            }
            this.G.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.module.AnythinkVideoView.8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (!AnythinkVideoView.this.au) {
                        AnythinkVideoView.this.e();
                        return;
                    }
                    AnythinkVideoView.e(AnythinkVideoView.this);
                    if (AnythinkVideoView.this.aE) {
                        AnythinkVideoView.this.e();
                        return;
                    }
                    com.anythink.expressad.video.module.a.a aVar = AnythinkVideoView.this.f11689e;
                    if (aVar != null) {
                        aVar.a(123, "");
                    }
                }
            });
        }
    }

    @Override // com.anythink.expressad.video.signal.j
    public void soundOperate(int i10, int i11, String str) {
        com.anythink.expressad.video.module.a.a aVar;
        SoundImageView soundImageView;
        if (this.f) {
            this.aw = i10;
            if (i10 == 1) {
                SoundImageView soundImageView2 = this.E;
                if (soundImageView2 != null) {
                    soundImageView2.setSoundStatus(false);
                }
                this.D.closeSound();
            } else if (i10 == 2) {
                SoundImageView soundImageView3 = this.E;
                if (soundImageView3 != null) {
                    soundImageView3.setSoundStatus(true);
                }
                this.D.openSound();
            }
            c cVar = this.f11686b;
            if (cVar != null && cVar.j()) {
                SoundImageView soundImageView4 = this.E;
                if (soundImageView4 != null) {
                    soundImageView4.setVisibility(0);
                }
            } else if (i11 == 1) {
                SoundImageView soundImageView5 = this.E;
                if (soundImageView5 != null) {
                    soundImageView5.setVisibility(8);
                }
            } else if (i11 == 2 && (soundImageView = this.E) != null) {
                soundImageView.setVisibility(0);
            }
        }
        if (str == null || !str.equals("2") || (aVar = this.f11689e) == null) {
            return;
        }
        aVar.a(7, Integer.valueOf(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        boolean f = f();
        this.f = f;
        if (!f) {
            o.d(TAG, "AnythinkVideoView init fail");
        }
        c();
        AlphaAnimation alphaAnimation = new AlphaAnimation(gl.Code, 100.0f);
        this.aJ = alphaAnimation;
        alphaAnimation.setDuration(200L);
    }

    private void b(int i10) {
        if (i10 > 0) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(t.b(getContext(), i10));
            gradientDrawable.setColor(-1);
            gradientDrawable.setStroke(1, 0);
            setBackground(gradientDrawable);
            this.D.setBackground(gradientDrawable);
            setClipToOutline(true);
            this.D.setClipToOutline(true);
        }
    }

    /* renamed from: com.anythink.expressad.video.module.AnythinkVideoView$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass1 implements h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f11822a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.anythink.expressad.video.dynview.c f11823b;

        public AnonymousClass1(ViewGroup viewGroup, com.anythink.expressad.video.dynview.c cVar) {
            this.f11822a = viewGroup;
            this.f11823b = cVar;
        }

        @Override // com.anythink.expressad.video.dynview.f.h
        public final void a(com.anythink.expressad.video.dynview.a aVar) {
            if (this.f11822a != null && aVar.a() != null) {
                aVar.a().setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
                this.f11822a.addView(aVar.a());
            }
            if (aVar.b() != null) {
                Iterator<View> it = aVar.b().iterator();
                while (it.hasNext()) {
                    it.next().setOnClickListener(new com.anythink.expressad.widget.a() { // from class: com.anythink.expressad.video.module.AnythinkVideoView.1.1
                        @Override // com.anythink.expressad.widget.a
                        public final void a(View view) {
                            JSONObject jSONObject;
                            JSONException e10;
                            if (AnythinkVideoView.this.U != null) {
                                try {
                                    jSONObject = new JSONObject();
                                } catch (JSONException e11) {
                                    jSONObject = null;
                                    e10 = e11;
                                }
                                try {
                                    jSONObject.put(com.anythink.expressad.foundation.g.a.ce, AnythinkVideoView.this.a(0));
                                } catch (JSONException e12) {
                                    e10 = e12;
                                    e10.printStackTrace();
                                    AnythinkVideoView.this.U.a(105, jSONObject);
                                    n.a().g();
                                }
                                AnythinkVideoView.this.U.a(105, jSONObject);
                                n.a().g();
                            }
                        }
                    });
                }
            }
            AnythinkVideoView.this.aI = aVar.c();
            AnythinkVideoView.this.b();
            boolean unused = AnythinkVideoView.av = false;
            AnythinkVideoView.this.S = this.f11823b.j();
        }

        @Override // com.anythink.expressad.video.dynview.f.h
        public final void a(com.anythink.expressad.video.dynview.c.b bVar) {
            o.d(AnythinkVideoView.TAG, "errorMsg：" + bVar.b());
        }
    }

    private void a() {
        int findLayout = findLayout(f11811s);
        if (findLayout > 0) {
            this.f11687c.inflate(findLayout, this);
            b();
        }
        av = false;
    }

    private void a(ViewGroup viewGroup, c cVar) {
        new com.anythink.expressad.video.dynview.j.c();
        com.anythink.expressad.video.dynview.c a10 = com.anythink.expressad.video.dynview.j.c.a(viewGroup, cVar);
        com.anythink.expressad.video.dynview.b.a();
        com.anythink.expressad.video.dynview.b.a(a10, new AnonymousClass1(viewGroup, a10));
    }

    private static String a(int i10, int i11) {
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

    private boolean b(int i10, int i11) {
        return i10 > 0 && i11 > 0 && t.f(this.f11685a) >= i10 && t.e(this.f11685a) >= i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b(boolean z10) {
        if (!this.au) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            if (!this.aB) {
                jSONObject.put("Alert_window_status", com.anythink.expressad.foundation.g.a.cv);
            }
            if (this.aD) {
                jSONObject.put("Alert_window_status", com.anythink.expressad.foundation.g.a.cx);
            }
            if (this.aC) {
                jSONObject.put("Alert_window_status", com.anythink.expressad.foundation.g.a.cw);
            }
            jSONObject.put("complete_info", z10 ? 1 : 2);
            return jSONObject.toString();
        } catch (Exception unused) {
            o.d(TAG, "getIVRewardStatusString ERROR");
            return "";
        }
    }

    private int a(c cVar) {
        if (cVar != null) {
            if (cVar.ao() != -1) {
                return cVar.ao();
            }
            return com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.b().e(), this.ah, false).v();
        }
        return com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.b().e(), this.ah, false).v();
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public void init(Context context) {
    }

    public AnythinkVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mMuteSwitch = 0;
        this.O = 0;
        this.mCampaignSize = 1;
        this.mCurrPlayNum = 1;
        this.mCurrentPlayProgressTime = 0;
        this.V = false;
        this.W = false;
        this.ah = "";
        this.ak = false;
        this.al = false;
        this.am = false;
        this.an = false;
        this.ao = false;
        this.ap = false;
        this.aq = false;
        this.ar = false;
        this.as = false;
        this.au = false;
        this.aw = 2;
        this.aB = false;
        this.aC = false;
        this.aD = false;
        this.aE = true;
        this.aF = false;
        this.aG = false;
        this.aH = false;
        this.aI = false;
        this.aL = new b(this);
        this.aM = false;
        this.aN = new Runnable() { // from class: com.anythink.expressad.video.module.AnythinkVideoView.3
            @Override // java.lang.Runnable
            public final void run() {
                if (AnythinkVideoView.this.P != null) {
                    AnythinkVideoView.this.P.setVisibility(8);
                }
            }
        };
    }
}
