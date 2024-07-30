package com.applovin.impl.sdk.nativeAd;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.exoplayer2.ab;
import com.applovin.exoplayer2.ak;
import com.applovin.exoplayer2.an;
import com.applovin.exoplayer2.aw;
import com.applovin.exoplayer2.h.u;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.ui.f;
import com.applovin.exoplayer2.ui.g;
import com.applovin.impl.adview.j;
import com.applovin.impl.c.a;
import com.applovin.impl.c.k;
import com.applovin.impl.c.l;
import com.applovin.impl.c.m;
import com.applovin.impl.c.o;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.h;
import com.applovin.impl.sdk.utils.r;
import com.applovin.impl.sdk.y;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public class AppLovinVastMediaView extends AppLovinMediaView implements AppLovinCommunicatorSubscriber {
    private static final String COUNTDOWN_IDENTIFIER_PROGRESS_TRACKING = "PROGRESS_TRACKING";
    private static final long FADE_ANIMATION_DURATION_MILLIS = 250;
    private static final String TAG = "AppLovinVastExoPlayerMediaView";
    private final AtomicBoolean automaticPauseHandled;
    private final AtomicBoolean automaticResumeHandled;
    private final Handler countdownHandler;
    private final j countdownManager;
    private ImageView industryIconImageView;
    private final AtomicBoolean initialOnAttachedToWindowHandled;
    private boolean isVideoMuted;
    private boolean isVideoPausedByUser;
    private final boolean isVideoStream;
    private long lastVideoPositionFromPauseMillis;
    private final com.applovin.impl.sdk.utils.a lifecycleCallbacksAdapter;
    private final AtomicBoolean mediaErrorHandled;
    private final aw mediaPlayer;
    private ImageView muteButtonImageView;
    private ImageView playPauseButtonImageView;
    private FrameLayout replayIconContainer;
    private int savedVideoPercentViewed;
    private long startTimeMillis;
    private final com.applovin.impl.c.a vastAd;
    private long videoDurationMillis;
    private final AtomicBoolean videoEndListenerNotified;
    private final Set<k> videoProgressTrackers;
    private final g videoView;
    private boolean videoWasCompleted;
    private LinearLayout videoWidgetLinearLayout;
    private Activity viewActivity;

    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        private a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Uri b10;
            com.applovin.impl.c.g aR = AppLovinVastMediaView.this.vastAd.aR();
            if (aR == null || (b10 = aR.b()) == null) {
                return;
            }
            y yVar = AppLovinVastMediaView.this.logger;
            if (y.a()) {
                AppLovinVastMediaView.this.logger.b(AppLovinVastMediaView.TAG, "Industry icon clicked, opening URL: " + b10);
            }
            AppLovinVastMediaView.this.maybeFireTrackers(a.c.INDUSTRY_ICON_CLICK);
            Utils.openUri(view.getContext(), b10, AppLovinVastMediaView.this.sdk);
        }
    }

    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {

        /* renamed from: b, reason: collision with root package name */
        private final View.OnClickListener f19041b;

        public b(View.OnClickListener onClickListener) {
            this.f19041b = onClickListener;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AppLovinVastMediaView.this.maybeFireTrackers(a.c.VIDEO_CLICK);
            AppLovinVastMediaView.this.vastAd.o().o();
            this.f19041b.onClick(view);
        }
    }

    /* loaded from: classes.dex */
    public class c implements an.b, f.d {
        private c() {
        }

        @Override // com.applovin.exoplayer2.an.b
        public void a(ak akVar) {
            AppLovinVastMediaView.this.handleMediaError("Video view error (" + akVar + ")");
        }

        @Override // com.applovin.exoplayer2.an.b
        public void b(int i10) {
            y yVar = AppLovinVastMediaView.this.logger;
            if (y.a()) {
                y yVar2 = AppLovinVastMediaView.this.logger;
                StringBuilder n10 = a3.k.n("Player state changed to state ", i10, " and will play when ready: ");
                n10.append(AppLovinVastMediaView.this.mediaPlayer.x());
                yVar2.b(AppLovinVastMediaView.TAG, n10.toString());
            }
            if (i10 == 3) {
                AppLovinVastMediaView.this.mediaPlayer.a(!AppLovinVastMediaView.this.isVideoMuted ? 1 : 0);
                AppLovinVastMediaView appLovinVastMediaView = AppLovinVastMediaView.this;
                appLovinVastMediaView.videoDurationMillis = appLovinVastMediaView.mediaPlayer.H();
                AppLovinVastMediaView.this.vastAd.o().a((float) TimeUnit.MILLISECONDS.toSeconds(AppLovinVastMediaView.this.videoDurationMillis), Utils.isVideoMutedInitially(AppLovinVastMediaView.this.sdk));
                y yVar3 = AppLovinVastMediaView.this.logger;
                if (y.a()) {
                    AppLovinVastMediaView.this.logger.b(AppLovinVastMediaView.TAG, "MediaPlayer prepared: " + AppLovinVastMediaView.this.mediaPlayer);
                }
                AppLovinVastMediaView.this.countdownManager.a();
                return;
            }
            if (i10 == 4) {
                y yVar4 = AppLovinVastMediaView.this.logger;
                if (y.a()) {
                    AppLovinVastMediaView.this.logger.b(AppLovinVastMediaView.TAG, "Video completed");
                }
                AppLovinVastMediaView.this.videoWasCompleted = true;
                AppLovinVastMediaView.this.finishVideo();
                if (AppLovinVastMediaView.this.replayIconContainer == null) {
                    AppLovinVastMediaView.this.showMediaImageView();
                } else {
                    r.a(AppLovinVastMediaView.this.replayIconContainer, AppLovinVastMediaView.FADE_ANIMATION_DURATION_MILLIS, new Runnable() { // from class: com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.c.1
                        @Override // java.lang.Runnable
                        public void run() {
                            AppLovinVastMediaView.this.mediaPlayer.a(0L);
                        }
                    });
                }
            }
        }

        @Override // com.applovin.exoplayer2.ui.f.d
        public void a(int i10) {
            if (i10 == 0) {
                AppLovinVastMediaView.this.videoView.b();
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements View.OnClickListener {
        private d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (view == AppLovinVastMediaView.this.playPauseButtonImageView) {
                if (AppLovinVastMediaView.this.mediaPlayer.a()) {
                    AppLovinVastMediaView.this.isVideoPausedByUser = true;
                    AppLovinVastMediaView.this.maybeHandlePause();
                    return;
                } else {
                    AppLovinVastMediaView.this.isVideoPausedByUser = false;
                    AppLovinVastMediaView.this.maybeHandleResume();
                    return;
                }
            }
            if (view == AppLovinVastMediaView.this.muteButtonImageView) {
                boolean z10 = !AppLovinVastMediaView.this.isVideoMuted;
                AppLovinVastMediaView.this.isVideoMuted = z10;
                AppLovinVastMediaView.this.mediaPlayer.a(!z10 ? 1 : 0);
                AppLovinVastMediaView.this.populateMuteImage(z10);
                return;
            }
            if (view == AppLovinVastMediaView.this.replayIconContainer) {
                r.b(AppLovinVastMediaView.this.replayIconContainer, AppLovinVastMediaView.FADE_ANIMATION_DURATION_MILLIS, new Runnable() { // from class: com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.d.1
                    @Override // java.lang.Runnable
                    public void run() {
                        AppLovinVastMediaView.this.videoWasCompleted = false;
                        AppLovinVastMediaView.this.automaticResumeHandled.set(false);
                        AppLovinVastMediaView.this.sdk.w().a(AppLovinVastMediaView.this.lifecycleCallbacksAdapter);
                        AppLovinVastMediaView.this.maybeHandleResume();
                    }
                });
            }
        }
    }

    public AppLovinVastMediaView(AppLovinNativeAdImpl appLovinNativeAdImpl, p pVar, Context context) {
        super(appLovinNativeAdImpl, pVar, context);
        int i10;
        Handler handler = new Handler(Looper.getMainLooper());
        this.countdownHandler = handler;
        this.countdownManager = new j(handler, this.sdk);
        this.videoEndListenerNotified = new AtomicBoolean();
        this.mediaErrorHandled = new AtomicBoolean();
        this.initialOnAttachedToWindowHandled = new AtomicBoolean();
        this.automaticPauseHandled = new AtomicBoolean();
        this.automaticResumeHandled = new AtomicBoolean();
        this.isVideoMuted = true;
        this.lastVideoPositionFromPauseMillis = -1L;
        HashSet hashSet = new HashSet();
        this.videoProgressTrackers = hashSet;
        this.lifecycleCallbacksAdapter = new com.applovin.impl.sdk.utils.a() { // from class: com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.1
            @Override // com.applovin.impl.sdk.utils.a, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(Activity activity) {
                if (activity.equals(AppLovinVastMediaView.this.viewActivity)) {
                    AppLovinVastMediaView.this.maybeHandlePause();
                }
            }

            @Override // com.applovin.impl.sdk.utils.a, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityResumed(Activity activity) {
                if (activity.equals(AppLovinVastMediaView.this.viewActivity) && !AppLovinVastMediaView.this.isVideoPausedByUser) {
                    AppLovinVastMediaView.this.maybeHandleResume();
                }
            }
        };
        com.applovin.impl.c.a vastAd = appLovinNativeAdImpl.getVastAd();
        this.vastAd = vastAd;
        boolean f = vastAd.f();
        this.isVideoStream = f;
        if (f) {
            AppLovinCommunicator.getInstance(context).subscribe(this, "video_caching_failed");
        }
        if (vastAd.aS()) {
            this.industryIconImageView = com.applovin.impl.c.g.a(vastAd.aR().a(), context, pVar);
            int dpToPx = AppLovinSdkUtils.dpToPx(context, ((Integer) pVar.a(com.applovin.impl.sdk.c.b.eQ)).intValue());
            this.industryIconImageView.setLayoutParams(new FrameLayout.LayoutParams(dpToPx, dpToPx, ((Integer) pVar.a(com.applovin.impl.sdk.c.b.eS)).intValue()));
            this.industryIconImageView.setOnClickListener(new a());
            addView(this.industryIconImageView);
        }
        if (((Boolean) pVar.a(com.applovin.impl.sdk.c.b.eX)).booleanValue()) {
            LinearLayout linearLayout = new LinearLayout(context);
            this.videoWidgetLinearLayout = linearLayout;
            linearLayout.setOrientation(0);
            this.videoWidgetLinearLayout.setBackgroundResource(R.drawable.applovin_rounded_black_background);
            this.videoWidgetLinearLayout.setAlpha(((Float) pVar.a(com.applovin.impl.sdk.c.b.eW)).floatValue());
            ImageView imageView = new ImageView(context);
            this.playPauseButtonImageView = imageView;
            imageView.setClickable(true);
            d dVar = new d();
            this.playPauseButtonImageView.setOnClickListener(dVar);
            int dpToPx2 = AppLovinSdkUtils.dpToPx(context, ((Integer) pVar.a(com.applovin.impl.sdk.c.b.eU)).intValue());
            this.playPauseButtonImageView.setLayoutParams(new FrameLayout.LayoutParams(dpToPx2, dpToPx2));
            populatePlayPauseImage(false);
            this.videoWidgetLinearLayout.addView(this.playPauseButtonImageView);
            this.muteButtonImageView = new ImageView(context);
            if (populateMuteImage(this.isVideoMuted)) {
                i10 = AppLovinSdkUtils.dpToPx(context, ((Integer) pVar.a(com.applovin.impl.sdk.c.b.eT)).intValue());
                this.muteButtonImageView.setClickable(true);
                this.muteButtonImageView.setOnClickListener(dVar);
                this.muteButtonImageView.setLayoutParams(new FrameLayout.LayoutParams(i10, i10));
                this.videoWidgetLinearLayout.addView(this.muteButtonImageView);
            } else {
                i10 = 0;
            }
            int dpToPx3 = AppLovinSdkUtils.dpToPx(context, ((Integer) pVar.a(com.applovin.impl.sdk.c.b.eV)).intValue());
            this.videoWidgetLinearLayout.setPadding(dpToPx3, dpToPx3, dpToPx3, dpToPx3);
            int i11 = dpToPx3 * 2;
            this.videoWidgetLinearLayout.setLayoutParams(new FrameLayout.LayoutParams(dpToPx2 + i10 + i11, Math.max(dpToPx2, i10) + i11, 8388691));
            addView(this.videoWidgetLinearLayout);
        }
        if (((Boolean) pVar.a(com.applovin.impl.sdk.c.b.eY)).booleanValue()) {
            FrameLayout frameLayout = new FrameLayout(getContext());
            this.replayIconContainer = frameLayout;
            frameLayout.setBackgroundColor(-16777216);
            this.replayIconContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.replayIconContainer.setVisibility(4);
            this.replayIconContainer.setOnClickListener(new d());
            ImageView imageView2 = new ImageView(getContext());
            int dpToPx4 = AppLovinSdkUtils.dpToPx(context, ((Integer) pVar.a(com.applovin.impl.sdk.c.b.eZ)).intValue());
            imageView2.setLayoutParams(new FrameLayout.LayoutParams(dpToPx4, dpToPx4, 17));
            imageView2.setImageResource(R.drawable.applovin_ic_replay_icon);
            imageView2.setAdjustViewBounds(true);
            imageView2.setMaxHeight(this.replayIconContainer.getHeight());
            imageView2.setMaxWidth(this.replayIconContainer.getWidth());
            this.replayIconContainer.addView(imageView2);
            addView(this.replayIconContainer);
        }
        aw a10 = new aw.a(getContext()).a();
        this.mediaPlayer = a10;
        c cVar = new c();
        a10.a((an.b) cVar);
        a10.c(0);
        g gVar = new g(getContext());
        this.videoView = gVar;
        gVar.b();
        gVar.setControllerVisibilityListener(cVar);
        gVar.setPlayer(a10);
        gVar.setOnClickListener(new b(appLovinNativeAdImpl.getClickHandler()));
        addView(gVar);
        bringChildToFront(this.industryIconImageView);
        bringChildToFront(this.videoWidgetLinearLayout);
        prepareMediaPlayer();
        appLovinNativeAdImpl.setVideoView(gVar);
        hashSet.addAll(vastAd.a(a.c.VIDEO, l.f17444a));
    }

    private void checkCachedAdResources(boolean z10) {
        List<Uri> checkCachedResourcesExist = Utils.checkCachedResourcesExist(z10, this.vastAd, this.sdk, getContext());
        if (checkCachedResourcesExist.isEmpty()) {
            return;
        }
        if (y.a()) {
            this.logger.e(TAG, "Video failed due to missing resources: " + checkCachedResourcesExist);
        }
        finishVideo();
        showMediaImageView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void finishVideo() {
        maybeFireTrackers(a.c.VIDEO, "close");
        maybeHandlePause();
        this.sdk.w().b(this.lifecycleCallbacksAdapter);
        if (this.videoWasCompleted) {
            maybeFireRemainingCompletionTrackers();
            this.vastAd.o().i();
        }
        if (this.videoEndListenerNotified.compareAndSet(false, true)) {
            this.sdk.E().trackVideoEnd(this.vastAd, TimeUnit.MILLISECONDS.toSeconds(SystemClock.elapsedRealtime() - this.startTimeMillis), getVideoPercentViewed(), this.isVideoStream);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getVideoPercentViewed() {
        long I = this.mediaPlayer.I();
        if (this.videoWasCompleted) {
            return 100;
        }
        if (I > 0) {
            return (int) ((((float) I) / ((float) this.videoDurationMillis)) * 100.0f);
        }
        return this.savedVideoPercentViewed;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleMediaError(String str) {
        if (y.a()) {
            this.logger.e(TAG, str);
        }
        maybeFireTrackers(a.c.ERROR, com.applovin.impl.c.f.MEDIA_FILE_ERROR);
        this.vastAd.o().a(str);
        if (this.mediaErrorHandled.compareAndSet(false, true)) {
            finishVideo();
            showMediaImageView();
        }
    }

    private void maybeFireRemainingCompletionTrackers() {
        if (getVideoPercentViewed() >= this.vastAd.Q() && !this.videoProgressTrackers.isEmpty()) {
            if (y.a()) {
                this.logger.d(TAG, "Firing " + this.videoProgressTrackers.size() + " un-fired video progress trackers when video was completed.");
            }
            maybeFireTrackers(this.videoProgressTrackers);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeFireTrackers(Set<k> set) {
        maybeFireTrackers(set, com.applovin.impl.c.f.UNSPECIFIED);
    }

    private void maybeHandleOnAttachedToWindow() {
        if (!this.initialOnAttachedToWindowHandled.compareAndSet(false, true)) {
            return;
        }
        if (this.industryIconImageView != null && this.vastAd.aS()) {
            maybeFireTrackers(a.c.INDUSTRY_ICON_IMPRESSION);
            this.industryIconImageView.setVisibility(0);
        }
        this.startTimeMillis = SystemClock.elapsedRealtime();
        maybeFireTrackers(a.c.IMPRESSION);
        maybeFireTrackers(a.c.VIDEO, "creativeView");
        this.vastAd.o().d();
        this.vastAd.setHasShown(true);
        this.sdk.E().trackImpression(this.vastAd);
        this.viewActivity = com.applovin.impl.sdk.utils.b.a(Utils.getRootView(this));
        this.sdk.w().a(this.lifecycleCallbacksAdapter);
        this.mediaPlayer.a(true);
        this.countdownManager.a(COUNTDOWN_IDENTIFIER_PROGRESS_TRACKING, TimeUnit.SECONDS.toMillis(1L), new j.a() { // from class: com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.2
            @Override // com.applovin.impl.adview.j.a
            public void a() {
                long seconds = TimeUnit.MILLISECONDS.toSeconds(AppLovinVastMediaView.this.videoDurationMillis - (AppLovinVastMediaView.this.mediaPlayer.H() - AppLovinVastMediaView.this.mediaPlayer.I()));
                int videoPercentViewed = AppLovinVastMediaView.this.getVideoPercentViewed();
                HashSet hashSet = new HashSet();
                Iterator it = new HashSet(AppLovinVastMediaView.this.videoProgressTrackers).iterator();
                while (it.hasNext()) {
                    k kVar = (k) it.next();
                    if (kVar.a(seconds, videoPercentViewed)) {
                        hashSet.add(kVar);
                        AppLovinVastMediaView.this.videoProgressTrackers.remove(kVar);
                    }
                }
                AppLovinVastMediaView.this.maybeFireTrackers(hashSet);
                if (videoPercentViewed >= 25 && videoPercentViewed < 50) {
                    AppLovinVastMediaView.this.vastAd.o().f();
                    return;
                }
                if (videoPercentViewed >= 50 && videoPercentViewed < 75) {
                    AppLovinVastMediaView.this.vastAd.o().g();
                } else if (videoPercentViewed >= 75) {
                    AppLovinVastMediaView.this.vastAd.o().h();
                }
            }

            @Override // com.applovin.impl.adview.j.a
            public boolean b() {
                return !AppLovinVastMediaView.this.videoWasCompleted;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeHandlePause() {
        if (!this.automaticPauseHandled.compareAndSet(false, true)) {
            return;
        }
        maybeFireTrackers(a.c.VIDEO, com.anythink.expressad.foundation.d.c.f9459cb);
        this.vastAd.o().j();
        pauseVideo();
        populatePlayPauseImage(true);
        this.automaticResumeHandled.set(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeHandleResume() {
        if (!this.automaticResumeHandled.compareAndSet(false, true)) {
            return;
        }
        maybeFireTrackers(a.c.VIDEO, "resume");
        this.vastAd.o().k();
        if (this.lastVideoPositionFromPauseMillis >= 0) {
            if (y.a()) {
                this.logger.b(TAG, "Resuming video at position " + this.lastVideoPositionFromPauseMillis);
            }
            this.mediaPlayer.a(true);
            this.countdownManager.a();
            this.lastVideoPositionFromPauseMillis = -1L;
        } else if (y.a()) {
            this.logger.b(TAG, "Invalid last video position, isVideoPlaying=" + this.mediaPlayer.a());
        }
        populatePlayPauseImage(false);
        this.automaticPauseHandled.set(false);
    }

    private void pauseVideo() {
        if (y.a()) {
            this.logger.b(TAG, "Pausing video");
        }
        this.savedVideoPercentViewed = getVideoPercentViewed();
        this.lastVideoPositionFromPauseMillis = this.mediaPlayer.I();
        this.mediaPlayer.a(false);
        this.countdownManager.c();
        if (y.a()) {
            this.logger.b(TAG, a3.l.n(new StringBuilder("Paused video at position "), this.lastVideoPositionFromPauseMillis, " ms"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean populateMuteImage(boolean z10) {
        Uri aF;
        int i10;
        if (this.muteButtonImageView == null) {
            return false;
        }
        com.applovin.impl.c.a aVar = this.vastAd;
        if (z10) {
            aF = aVar.aE();
        } else {
            aF = aVar.aF();
        }
        if (aF != null) {
            StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
            this.muteButtonImageView.setImageURI(aF);
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return true;
        }
        if (!h.d()) {
            return false;
        }
        Context context = getContext();
        if (z10) {
            i10 = R.drawable.applovin_ic_unmute_to_mute;
        } else {
            i10 = R.drawable.applovin_ic_mute_to_unmute;
        }
        AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) context.getDrawable(i10);
        if (animatedVectorDrawable == null) {
            return false;
        }
        this.muteButtonImageView.setImageDrawable(animatedVectorDrawable);
        animatedVectorDrawable.start();
        return true;
    }

    private void populatePlayPauseImage(boolean z10) {
        Uri aD;
        int i10;
        if (this.playPauseButtonImageView == null) {
            return;
        }
        com.applovin.impl.c.a aVar = this.vastAd;
        if (z10) {
            aD = aVar.aC();
        } else {
            aD = aVar.aD();
        }
        if (aD != null) {
            StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
            this.playPauseButtonImageView.setImageURI(aD);
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        } else {
            if (z10) {
                i10 = R.drawable.applovin_ic_play_icon;
            } else {
                i10 = R.drawable.applovin_ic_pause_icon;
            }
            this.playPauseButtonImageView.setImageResource(i10);
        }
    }

    private void prepareMediaPlayer() {
        checkCachedAdResources(!this.isVideoStream);
        u a10 = new u.a(new com.applovin.exoplayer2.k.p(getContext(), ai.a(getContext(), "com.applovin.sdk"))).a(ab.a(this.vastAd.h()));
        this.mediaPlayer.a(!this.isVideoMuted ? 1 : 0);
        this.mediaPlayer.a((com.applovin.exoplayer2.h.p) a10);
        this.mediaPlayer.w();
        this.mediaPlayer.a(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showMediaImageView() {
        if (this.imageView.getDrawable() == null) {
            return;
        }
        this.imageView.setVisibility(0);
        this.videoView.setVisibility(8);
        LinearLayout linearLayout = this.videoWidgetLinearLayout;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        ImageView imageView = this.industryIconImageView;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinMediaView
    public void destroy() {
        finishVideo();
        ImageView imageView = this.industryIconImageView;
        if (imageView != null) {
            imageView.setOnClickListener(null);
        }
        ImageView imageView2 = this.playPauseButtonImageView;
        if (imageView2 != null) {
            imageView2.setOnClickListener(null);
        }
        ImageView imageView3 = this.muteButtonImageView;
        if (imageView3 != null) {
            imageView3.setOnClickListener(null);
        }
        FrameLayout frameLayout = this.replayIconContainer;
        if (frameLayout != null) {
            frameLayout.setOnClickListener(null);
        }
        this.videoView.setOnClickListener(null);
        this.viewActivity = null;
        this.mediaPlayer.E();
        this.vastAd.o().e();
        this.countdownManager.b();
        this.countdownHandler.removeCallbacksAndMessages(null);
        if (this.isVideoStream) {
            AppLovinCommunicator.getInstance(getContext()).unsubscribe(this, "video_caching_failed");
        }
        super.destroy();
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return TAG;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        maybeHandleOnAttachedToWindow();
        if (!this.isVideoPausedByUser) {
            maybeHandleResume();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        maybeHandlePause();
        super.onDetachedFromWindow();
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if (!"video_caching_failed".equals(appLovinCommunicatorMessage.getTopic())) {
            return;
        }
        Bundle messageData = appLovinCommunicatorMessage.getMessageData();
        long j10 = messageData.getLong("ad_id");
        if (((Boolean) this.sdk.a(com.applovin.impl.sdk.c.b.fy)).booleanValue() && j10 == this.vastAd.getAdIdNumber() && this.isVideoStream) {
            int i10 = messageData.getInt("load_response_code");
            String string = messageData.getString("load_exception_message");
            if ((string != null || i10 < 200 || i10 >= 300) && !this.videoWasCompleted && !this.mediaPlayer.a()) {
                handleMediaError("Video cache error during stream. ResponseCode=" + i10 + ", exception=" + string);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeFireTrackers(a.c cVar) {
        maybeFireTrackers(cVar, com.applovin.impl.c.f.UNSPECIFIED);
    }

    private void maybeFireTrackers(a.c cVar, String str) {
        maybeFireTrackers(cVar, str, com.applovin.impl.c.f.UNSPECIFIED);
    }

    private void maybeFireTrackers(a.c cVar, com.applovin.impl.c.f fVar) {
        maybeFireTrackers(cVar, "", fVar);
    }

    private void maybeFireTrackers(a.c cVar, String str, com.applovin.impl.c.f fVar) {
        maybeFireTrackers(this.vastAd.a(cVar, str), fVar);
    }

    private void maybeFireTrackers(Set<k> set, com.applovin.impl.c.f fVar) {
        if (set == null || set.isEmpty()) {
            return;
        }
        long seconds = TimeUnit.MILLISECONDS.toSeconds(this.mediaPlayer.I());
        o aP = this.vastAd.aP();
        Uri a10 = aP != null ? aP.a() : null;
        if (y.a()) {
            this.logger.b(TAG, "Firing " + set.size() + " tracker(s): " + set);
        }
        m.a(set, seconds, a10, fVar, this.sdk);
    }
}
