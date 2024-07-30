package com.anythink.expressad.playercommon;

import a3.l;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.SurfaceHolder;
import android.view.View;
import com.anythink.core.common.a.j;
import com.anythink.core.common.b.n;
import com.anythink.expressad.exoplayer.ad;
import com.anythink.expressad.exoplayer.ae;
import com.anythink.expressad.exoplayer.d;
import com.anythink.expressad.exoplayer.f;
import com.anythink.expressad.exoplayer.g;
import com.anythink.expressad.exoplayer.h.af;
import com.anythink.expressad.exoplayer.h.o;
import com.anythink.expressad.exoplayer.h.s;
import com.anythink.expressad.exoplayer.i;
import com.anythink.expressad.exoplayer.i.c;
import com.anythink.expressad.exoplayer.v;
import com.anythink.expressad.exoplayer.w;
import com.anythink.expressad.foundation.h.o;
import com.huawei.hms.ads.gl;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes.dex */
public class VideoFeedsPlayer implements w.c {
    public static final int INTERVAL_TIME_PLAY_TIME_CD_THREAD = 1000;
    public static final String TAG = "VideoFeedsPlayer";
    private ad exoPlayer;
    private Timer mBufferTimeoutTimer;
    private Context mContext;
    private long mCurrentPosition;
    private View mFullScreenLoadingView;
    private volatile VideoPlayerStatusListener mInnerVFPLisener;
    private boolean mIsSilent;
    private WeakReference<View> mLoadingView;
    private volatile VideoPlayerStatusListener mOutterVFListener;
    private String mPlayUrl;
    private SurfaceHolder mSurfaceHolder;
    private int mVideoReadyRate;
    private s mediaSource;
    private boolean mIsComplete = false;
    private boolean mIsPlaying = false;
    private boolean mHasPrepare = false;
    private boolean mIsBuffering = false;
    private boolean mIsNeedBufferingTimeout = false;
    private boolean mIsFrontDesk = true;
    private int mBufferTime = 5;
    private Object mLock = new Object();
    private boolean isStart = false;
    private final Handler mHandler = new Handler(Looper.getMainLooper()) { // from class: com.anythink.expressad.playercommon.VideoFeedsPlayer.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
        }
    };
    private boolean needPrepareVideoPlayAgain = false;
    private String mNetVideoUrl = "";
    private String mMediaSourceUrl = "";
    private Runnable playProgressRunnable = new Runnable() { // from class: com.anythink.expressad.playercommon.VideoFeedsPlayer.2
        @Override // java.lang.Runnable
        public void run() {
            long j10;
            try {
                if (VideoFeedsPlayer.this.exoPlayer != null && VideoFeedsPlayer.this.exoPlayerIsPlaying()) {
                    VideoFeedsPlayer videoFeedsPlayer = VideoFeedsPlayer.this;
                    videoFeedsPlayer.mCurrentPosition = videoFeedsPlayer.exoPlayer.t();
                    float f = ((float) VideoFeedsPlayer.this.mCurrentPosition) / 1000.0f;
                    float f10 = (float) (VideoFeedsPlayer.this.mCurrentPosition % 1000);
                    int round = Math.round(f);
                    o.b(VideoFeedsPlayer.TAG, "currentPosition:" + round + " mCurrentPosition:" + VideoFeedsPlayer.this.mCurrentPosition);
                    if (VideoFeedsPlayer.this.exoPlayer != null && VideoFeedsPlayer.this.exoPlayer.s() > 0) {
                        j10 = VideoFeedsPlayer.this.exoPlayer.s() / 1000;
                        if (f10 > gl.Code && f10 < 500.0f) {
                            round++;
                        }
                    } else {
                        j10 = 0;
                    }
                    if (round >= 0 && j10 > 0 && round < 1 + j10) {
                        VideoFeedsPlayer.this.postOnPlayProgressOnMainThread(round, (int) j10);
                    }
                    VideoFeedsPlayer.this.mIsComplete = false;
                    if (!VideoFeedsPlayer.this.mIsBuffering) {
                        VideoFeedsPlayer.this.hideLoading();
                    }
                    VideoFeedsPlayer.this.mHandler.postDelayed(this, 1000L);
                }
            } catch (Exception e10) {
                o.d(VideoFeedsPlayer.TAG, e10.getMessage());
            }
        }
    };

    private void cancelBufferTimeoutTimer() {
        try {
            Timer timer = this.mBufferTimeoutTimer;
            if (timer != null) {
                timer.cancel();
            }
        } catch (Exception e10) {
            o.d(TAG, e10.getMessage());
        }
    }

    private void cancelPlayProgressTimer() {
        try {
            this.mHandler.removeCallbacks(this.playProgressRunnable);
        } catch (Exception e10) {
            o.d(TAG, e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideLoading() {
        try {
            Handler handler = this.mHandler;
            if (handler == null) {
                return;
            }
            handler.post(new Runnable() { // from class: com.anythink.expressad.playercommon.VideoFeedsPlayer.5
                @Override // java.lang.Runnable
                public void run() {
                    if (VideoFeedsPlayer.this.mLoadingView != null && VideoFeedsPlayer.this.mLoadingView.get() != null) {
                        ((View) VideoFeedsPlayer.this.mLoadingView.get()).setVisibility(8);
                    }
                    if (VideoFeedsPlayer.this.mFullScreenLoadingView != null) {
                        VideoFeedsPlayer.this.mFullScreenLoadingView.setVisibility(8);
                    }
                }
            });
        } catch (Exception e10) {
            o.d(TAG, e10.getMessage());
        }
    }

    private void postOnBufferinEndOnMainThread() {
        try {
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.anythink.expressad.playercommon.VideoFeedsPlayer.8
                    @Override // java.lang.Runnable
                    public void run() {
                        if (VideoFeedsPlayer.this.mOutterVFListener != null) {
                            try {
                                VideoFeedsPlayer.this.mOutterVFListener.onBufferingEnd();
                            } catch (Exception e10) {
                                o.d(VideoFeedsPlayer.TAG, e10.getMessage());
                            }
                        }
                        if (VideoFeedsPlayer.this.mInnerVFPLisener != null) {
                            try {
                                VideoFeedsPlayer.this.mInnerVFPLisener.onBufferingEnd();
                            } catch (Exception e11) {
                                o.d(VideoFeedsPlayer.TAG, e11.getMessage());
                            }
                        }
                    }
                });
            }
        } catch (Exception e10) {
            o.d(TAG, e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postOnBufferingStarOnMainThread(final String str) {
        try {
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.anythink.expressad.playercommon.VideoFeedsPlayer.7
                    @Override // java.lang.Runnable
                    public void run() {
                        if (VideoFeedsPlayer.this.mOutterVFListener != null) {
                            try {
                                VideoFeedsPlayer.this.mOutterVFListener.onBufferingStart(str);
                            } catch (Exception e10) {
                                o.d(VideoFeedsPlayer.TAG, e10.getMessage());
                            }
                        }
                        if (VideoFeedsPlayer.this.mInnerVFPLisener != null) {
                            try {
                                VideoFeedsPlayer.this.mInnerVFPLisener.onBufferingStart(str);
                            } catch (Exception e11) {
                                o.d(VideoFeedsPlayer.TAG, e11.getMessage());
                            }
                        }
                    }
                });
            }
        } catch (Exception e10) {
            o.d(TAG, e10.getMessage());
        }
    }

    private void postOnPlayCompletedOnMainThread() {
        try {
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.anythink.expressad.playercommon.VideoFeedsPlayer.12
                    @Override // java.lang.Runnable
                    public void run() {
                        if (VideoFeedsPlayer.this.mOutterVFListener != null) {
                            try {
                                VideoFeedsPlayer.this.mOutterVFListener.onPlayCompleted();
                            } catch (Exception e10) {
                                o.d(VideoFeedsPlayer.TAG, e10.getMessage());
                            }
                        }
                        if (VideoFeedsPlayer.this.mInnerVFPLisener != null) {
                            try {
                                VideoFeedsPlayer.this.mInnerVFPLisener.onPlayCompleted();
                            } catch (Exception e11) {
                                o.d(VideoFeedsPlayer.TAG, e11.getMessage());
                            }
                        }
                    }
                });
            }
        } catch (Exception e10) {
            o.d(TAG, e10.getMessage());
        }
    }

    private void postOnPlayErrorOnMainThread(final String str) {
        try {
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.anythink.expressad.playercommon.VideoFeedsPlayer.10
                    @Override // java.lang.Runnable
                    public void run() {
                        if (VideoFeedsPlayer.this.mOutterVFListener != null) {
                            try {
                                VideoFeedsPlayer.this.mOutterVFListener.onPlayError(str);
                            } catch (Exception e10) {
                                o.d(VideoFeedsPlayer.TAG, e10.getMessage());
                            }
                        }
                        if (VideoFeedsPlayer.this.mInnerVFPLisener != null) {
                            try {
                                VideoFeedsPlayer.this.mInnerVFPLisener.onPlayError(str);
                            } catch (Exception e11) {
                                o.d(VideoFeedsPlayer.TAG, e11.getMessage());
                            }
                        }
                    }
                });
            }
        } catch (Exception e10) {
            o.d(TAG, e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postOnPlayProgressOnMainThread(final int i10, final int i11) {
        try {
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.anythink.expressad.playercommon.VideoFeedsPlayer.6
                    @Override // java.lang.Runnable
                    public void run() {
                        if (VideoFeedsPlayer.this.mOutterVFListener != null) {
                            try {
                                VideoFeedsPlayer.this.mOutterVFListener.onPlayProgress(i10, i11);
                            } catch (Exception e10) {
                                o.d(VideoFeedsPlayer.TAG, e10.getMessage());
                            }
                        }
                        if (VideoFeedsPlayer.this.mInnerVFPLisener != null) {
                            try {
                                VideoFeedsPlayer.this.mInnerVFPLisener.onPlayProgress(i10, i11);
                            } catch (Exception e11) {
                                o.d(VideoFeedsPlayer.TAG, e11.getMessage());
                            }
                        }
                    }
                });
            }
        } catch (Exception e10) {
            o.d(TAG, e10.getMessage());
        }
    }

    private void postOnPlaySetDataSourceError2MainThread(final String str) {
        try {
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.anythink.expressad.playercommon.VideoFeedsPlayer.11
                    @Override // java.lang.Runnable
                    public void run() {
                        if (VideoFeedsPlayer.this.mInnerVFPLisener != null) {
                            try {
                                VideoFeedsPlayer.this.mInnerVFPLisener.onPlaySetDataSourceError(str);
                            } catch (Exception e10) {
                                o.d(VideoFeedsPlayer.TAG, e10.getMessage());
                            }
                        }
                        if (VideoFeedsPlayer.this.mOutterVFListener != null) {
                            try {
                                VideoFeedsPlayer.this.mOutterVFListener.onPlaySetDataSourceError(str);
                            } catch (Exception e11) {
                                o.d(VideoFeedsPlayer.TAG, e11.getMessage());
                            }
                        }
                    }
                });
            }
        } catch (Exception e10) {
            o.d(TAG, e10.getMessage());
        }
    }

    private void postOnPlayStartOnMainThread(final long j10) {
        try {
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.anythink.expressad.playercommon.VideoFeedsPlayer.9
                    @Override // java.lang.Runnable
                    public void run() {
                        int i10 = (int) j10;
                        if (VideoFeedsPlayer.this.mOutterVFListener != null) {
                            try {
                                VideoFeedsPlayer.this.mOutterVFListener.onPlayStarted(i10);
                            } catch (Exception e10) {
                                o.d(VideoFeedsPlayer.TAG, e10.getMessage());
                            }
                        }
                        if (VideoFeedsPlayer.this.mInnerVFPLisener != null) {
                            try {
                                VideoFeedsPlayer.this.mInnerVFPLisener.onPlayStarted(i10);
                            } catch (Exception e11) {
                                o.d(VideoFeedsPlayer.TAG, e11.getMessage());
                            }
                        }
                    }
                });
            }
        } catch (Exception e10) {
            o.d(TAG, e10.getMessage());
        }
    }

    private void rePrepareVideoSourceAgain() {
        if (this.mOutterVFListener != null) {
            this.mOutterVFListener.onVideoDownloadResume();
        }
        s sVar = this.mediaSource;
        if (sVar != null) {
            this.exoPlayer.a(sVar);
        }
    }

    private void startBufferIngTimer(final String str) {
        if (!this.mIsNeedBufferingTimeout) {
            o.d(TAG, "不需要缓冲超时功能");
            return;
        }
        cancelBufferTimeoutTimer();
        Timer timer = new Timer();
        this.mBufferTimeoutTimer = timer;
        timer.schedule(new TimerTask() { // from class: com.anythink.expressad.playercommon.VideoFeedsPlayer.3
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                try {
                    if (!VideoFeedsPlayer.this.mHasPrepare || VideoFeedsPlayer.this.mIsBuffering) {
                        o.d(VideoFeedsPlayer.TAG, "缓冲超时");
                        VideoFeedsPlayer.this.postOnBufferingStarOnMainThread(str);
                    }
                } catch (Exception e10) {
                    o.d(VideoFeedsPlayer.TAG, e10.getMessage());
                }
            }
        }, this.mBufferTime * 1000);
    }

    private void startPlayProgressTimer() {
        try {
            cancelPlayProgressTimer();
            this.mHandler.post(this.playProgressRunnable);
        } catch (Exception e10) {
            o.d(TAG, e10.getMessage());
        }
    }

    public void closeSound() {
        try {
            ad adVar = this.exoPlayer;
            if (adVar == null) {
                return;
            }
            adVar.a(gl.Code);
            this.mIsSilent = true;
        } catch (Exception e10) {
            o.d(TAG, e10.getMessage());
        }
    }

    public boolean exoPlayerIsPlaying() {
        if (this.exoPlayer.d() == 3 && this.exoPlayer.f()) {
            return true;
        }
        return false;
    }

    public boolean fullScreenLoadingViewisVisible() {
        try {
            View view = this.mFullScreenLoadingView;
            if (view != null) {
                if (view.getVisibility() == 0) {
                    return true;
                }
                return false;
            }
            return false;
        } catch (Throwable th) {
            o.d(TAG, th.getMessage());
            return false;
        }
    }

    public int getCurPosition() {
        return (int) this.mCurrentPosition;
    }

    public int getDuration() {
        ad adVar = this.exoPlayer;
        if (adVar != null) {
            adVar.s();
            return 0;
        }
        return 0;
    }

    public boolean halfLoadingViewisVisible() {
        try {
            WeakReference<View> weakReference = this.mLoadingView;
            if (weakReference != null && weakReference.get() != null) {
                if (this.mLoadingView.get().getVisibility() == 0) {
                    return true;
                }
                return false;
            }
            return false;
        } catch (Throwable th) {
            o.d(TAG, th.getMessage());
            return false;
        }
    }

    public boolean hasPrepare() {
        return this.mHasPrepare;
    }

    public void initBufferIngParam(int i10) {
        if (i10 > 0) {
            this.mBufferTime = i10;
        }
        this.mIsNeedBufferingTimeout = true;
        o.b(TAG, "mIsNeedBufferingTimeout:" + this.mIsNeedBufferingTimeout + "  mMaxBufferTime:" + this.mBufferTime);
    }

    public boolean initPlayer(Context context, View view, String str, String str2, int i10, VideoPlayerStatusListener videoPlayerStatusListener) {
        boolean z10;
        try {
            if (view == null) {
                o.b(TAG, "loadingView is NULL");
                postOnPlayErrorOnMainThread("MediaPlayer init error");
                return false;
            }
            o.b(TAG, "videoUrl:".concat(String.valueOf(str)));
            if (!TextUtils.equals(str, str2)) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.needPrepareVideoPlayAgain = z10;
            this.mMediaSourceUrl = str;
            this.mNetVideoUrl = str2;
            this.mVideoReadyRate = i10;
            this.mContext = context;
            this.mOutterVFListener = videoPlayerStatusListener;
            this.mLoadingView = new WeakReference<>(view);
            this.exoPlayer = i.a(new f(context), new c(), new d());
            this.mediaSource = new o.c(new com.anythink.expressad.exoplayer.j.o(context, "AnyThink_ExoPlayer")).b(Uri.parse(str));
            this.exoPlayer.a(0);
            this.exoPlayer.a(this.mediaSource);
            this.exoPlayer.a(this);
            return true;
        } catch (Throwable th) {
            com.anythink.expressad.foundation.h.o.d(TAG, th.getMessage());
            postOnPlayErrorOnMainThread(th.toString());
            return false;
        }
    }

    public boolean isComplete() {
        return this.mIsComplete;
    }

    public boolean isPlayIng() {
        try {
            if (this.exoPlayer != null) {
                if (exoPlayerIsPlaying()) {
                    return true;
                }
                return false;
            }
            return false;
        } catch (Exception e10) {
            com.anythink.expressad.foundation.h.o.d(TAG, e10.getMessage());
            return false;
        }
    }

    public boolean isSilent() {
        return this.mIsSilent;
    }

    public void justSeekTo(int i10) {
        try {
            this.mCurrentPosition = i10;
            if (!this.mHasPrepare) {
                com.anythink.expressad.foundation.h.o.a(TAG, "seekTo return mHasPrepare false");
            }
        } catch (Exception e10) {
            com.anythink.expressad.foundation.h.o.d(TAG, e10.getMessage());
        }
    }

    public void onCompletion() {
        try {
            this.mIsComplete = true;
            this.mIsPlaying = false;
            this.mCurrentPosition = 0L;
            hideLoading();
            postOnPlayCompletedOnMainThread();
            com.anythink.expressad.foundation.h.o.b(TAG, "======onCompletion");
        } catch (Exception e10) {
            com.anythink.expressad.foundation.h.o.d(TAG, e10.getMessage());
        }
    }

    public boolean onError(int i10, String str) {
        try {
            com.anythink.expressad.foundation.h.o.d(TAG, "onError what: " + i10 + " extra: " + str);
            hideLoading();
        } catch (Exception e10) {
            com.anythink.expressad.foundation.h.o.d(TAG, e10.getMessage());
        }
        if (!this.mIsFrontDesk && "MIX 3".equalsIgnoreCase(com.anythink.core.common.k.d.a()) && com.anythink.core.common.k.d.b().equalsIgnoreCase("Xiaomi")) {
            return true;
        }
        this.mHasPrepare = false;
        postOnPlayErrorOnMainThread(str);
        return true;
    }

    @Override // com.anythink.expressad.exoplayer.w.c
    public void onPlaybackParametersChanged(v vVar) {
        com.anythink.expressad.foundation.h.o.d(TAG, "onPlaybackParametersChanged : " + vVar.f9346b);
    }

    @Override // com.anythink.expressad.exoplayer.w.c
    public void onPlayerError(g gVar) {
        boolean z10;
        long j10;
        String str = "Play error and ExoPlayer have not message.";
        if (gVar != null) {
            int i10 = gVar.f8021d;
            z10 = true;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        str = "Play error, because have a UnexpectedException.";
                    }
                } else {
                    str = "Play error, because have a RendererException.";
                }
                z10 = false;
            } else {
                str = "Play error, because have a SourceException.";
            }
            if (gVar.getCause() != null && !TextUtils.isEmpty(gVar.getCause().getMessage())) {
                str = gVar.getCause().getMessage();
            }
        } else {
            z10 = false;
        }
        l.B(str, "onPlayerError : ", TAG);
        if (this.needPrepareVideoPlayAgain && z10) {
            this.needPrepareVideoPlayAgain = false;
            rePrepareVideoSourceAgain();
            return;
        }
        try {
            j10 = this.exoPlayer.t();
        } catch (Throwable unused) {
            j10 = 0;
        }
        String str2 = "videoUrl" + this.mNetVideoUrl + ",readyRate:" + this.mVideoReadyRate + ",cdRate:0,play process:" + j10;
        onError(gVar.f8021d, str + "," + str2);
    }

    @Override // com.anythink.expressad.exoplayer.w.c
    public void onPlayerStateChanged(boolean z10, int i10) {
        com.anythink.expressad.foundation.h.o.d(TAG, "onPlaybackStateChanged : ".concat(String.valueOf(i10)));
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 == 4) {
                        com.anythink.expressad.foundation.h.o.d(TAG, "onPlaybackStateChanged : Ended : PLAY ENDED");
                        cancelPlayProgressTimer();
                        onCompletion();
                        return;
                    }
                    return;
                }
                com.anythink.expressad.foundation.h.o.d(TAG, "onPlaybackStateChanged : READY");
                this.mIsBuffering = false;
                hideLoading();
                postOnBufferinEndOnMainThread();
                onPrepared();
                return;
            }
            com.anythink.expressad.foundation.h.o.d(TAG, "onPlaybackStateChanged : Buffering");
            this.mIsBuffering = true;
            showLoading();
            startBufferIngTimer("play buffering tiemout");
            return;
        }
        com.anythink.expressad.foundation.h.o.d(TAG, "onPlaybackStateChanged : IDLE");
    }

    public void onPrepared() {
        try {
            com.anythink.expressad.foundation.h.o.b(TAG, "onPrepared:" + this.mHasPrepare);
            this.mHasPrepare = true;
            if (!this.mIsFrontDesk && this.exoPlayer != null) {
                pause();
            }
            boolean z10 = this.mIsFrontDesk;
            if (z10) {
                if (z10) {
                    hideLoading();
                    this.mHasPrepare = true;
                    ad adVar = this.exoPlayer;
                    if (adVar != null) {
                        this.mIsPlaying = true;
                        if (!this.isStart) {
                            postOnPlayStartOnMainThread(adVar.s() / 1000);
                            com.anythink.expressad.foundation.h.o.b(TAG, "onPlayStarted()，getCurrentPosition:" + this.exoPlayer.t());
                            this.isStart = true;
                        }
                    }
                    postOnBufferinEndOnMainThread();
                    startPlayProgressTimer();
                    com.anythink.expressad.foundation.h.o.b(TAG, "onPrepare mCurrentPosition:" + this.mCurrentPosition + " onPrepare mHasPrepare：" + this.mHasPrepare);
                    return;
                }
                return;
            }
            com.anythink.expressad.foundation.h.o.d(TAG, "At background, Do not process");
        } catch (Throwable th) {
            com.anythink.expressad.foundation.h.o.d(TAG, th.getMessage());
        }
    }

    public void openSound() {
        try {
            ad adVar = this.exoPlayer;
            if (adVar == null) {
                return;
            }
            adVar.a(1.0f);
            this.mIsSilent = false;
        } catch (Exception e10) {
            com.anythink.expressad.foundation.h.o.d(TAG, e10.getMessage());
        }
    }

    public void pause() {
        try {
            if (this.mHasPrepare && this.exoPlayer != null && exoPlayerIsPlaying()) {
                com.anythink.expressad.foundation.h.o.b(TAG, "pause isPalying:" + exoPlayerIsPlaying() + " mIsPlaying:" + this.mIsPlaying);
                hideLoading();
                this.exoPlayer.a(false);
                this.mIsPlaying = false;
            }
        } catch (Exception e10) {
            com.anythink.expressad.foundation.h.o.d(TAG, e10.getMessage());
        }
    }

    public void play(String str, int i10) {
        try {
            synchronized (this.mLock) {
                com.anythink.expressad.foundation.h.o.d(TAG, "Start Play currentionPosition:" + this.mCurrentPosition);
                if (i10 > 0) {
                    this.mCurrentPosition = i10;
                }
                if (TextUtils.isEmpty(str)) {
                    postOnPlayErrorOnMainThread("play url is null");
                    return;
                }
                this.mPlayUrl = str;
                this.mHasPrepare = false;
                this.mIsFrontDesk = true;
                showLoading();
                setDataSource();
                com.anythink.expressad.foundation.h.o.b(TAG, "mPlayUrl:" + this.mPlayUrl);
            }
        } catch (Exception e10) {
            com.anythink.expressad.foundation.h.o.d(TAG, e10.getMessage());
            releasePlayer();
            hideLoading();
            postOnPlayErrorOnMainThread("mediaplayer cannot play");
        }
    }

    public void prepare() {
        ad adVar;
        try {
            if (!this.mHasPrepare && (adVar = this.exoPlayer) != null) {
                adVar.a(this.mediaSource);
                this.mHasPrepare = true;
                this.mIsPlaying = false;
            }
        } catch (Exception e10) {
            com.anythink.expressad.foundation.h.o.d(TAG, e10.getMessage());
        }
    }

    public void releasePlayer() {
        try {
            com.anythink.expressad.foundation.h.o.b(TAG, "release");
            cancelPlayProgressTimer();
            cancelBufferTimeoutTimer();
            if (this.exoPlayer != null) {
                stop();
                this.exoPlayer.b(this);
                this.exoPlayer.n();
                this.mInnerVFPLisener = null;
                this.mOutterVFListener = null;
            }
            hideLoading();
        } catch (Throwable th) {
            com.anythink.expressad.foundation.h.o.d(TAG, th.getMessage());
        }
    }

    public void seekTo(int i10) {
        long j10 = i10;
        try {
            this.mCurrentPosition = j10;
            if (!this.mHasPrepare) {
                com.anythink.expressad.foundation.h.o.a(TAG, "seekTo return mHasPrepare false");
                return;
            }
            ad adVar = this.exoPlayer;
            if (adVar != null) {
                adVar.a(j10);
            }
        } catch (Exception e10) {
            com.anythink.expressad.foundation.h.o.d(TAG, e10.getMessage());
        }
    }

    public void setDataSource() {
        try {
            com.anythink.expressad.foundation.h.o.b(TAG, "setDataSource");
            if (this.exoPlayer != null) {
                SurfaceHolder surfaceHolder = this.mSurfaceHolder;
                if (surfaceHolder != null) {
                    setDisplay(surfaceHolder);
                }
                boolean z10 = false;
                this.mHasPrepare = false;
                if (!TextUtils.equals(this.mMediaSourceUrl, this.mNetVideoUrl)) {
                    try {
                        z10 = new File(this.mMediaSourceUrl).exists();
                    } catch (Throwable unused) {
                    }
                    if (!z10) {
                        this.mediaSource = new o.c(new com.anythink.expressad.exoplayer.j.o(this.mContext, "AnyThink_ExoPlayer")).b(Uri.parse(this.mNetVideoUrl));
                        this.mMediaSourceUrl = this.mNetVideoUrl;
                    }
                }
                if (TextUtils.equals(this.mMediaSourceUrl, this.mNetVideoUrl) && this.mVideoReadyRate > 0) {
                    com.anythink.core.common.j.c.a("Video Play Fail：Play Network Url", "AdxExpress videoUrl:" + this.mPlayUrl + ",readyRate:" + this.mVideoReadyRate + ",maxVideoCacheSize:" + j.a().c() + ",lastRecycleCheckDownloadedFileSize:" + j.a().d(), n.a().r());
                }
                com.anythink.expressad.foundation.h.o.b(TAG, "Real Play Url:" + this.mMediaSourceUrl);
                this.exoPlayer.a(this.mediaSource);
                this.exoPlayer.a(true);
                startBufferIngTimer(PlayerErrorConstant.PREPARE_TIMEOUT);
            }
        } catch (Exception e10) {
            com.anythink.expressad.foundation.h.o.d(TAG, e10.getMessage());
            hideLoading();
            postOnPlayErrorOnMainThread(PlayerErrorConstant.ILLEGAL_VIDEO_ADDRESS);
            postOnPlaySetDataSourceError2MainThread(PlayerErrorConstant.ILLEGAL_VIDEO_ADDRESS);
        }
    }

    public void setDisplay(SurfaceHolder surfaceHolder) {
        try {
            this.exoPlayer.a(surfaceHolder);
        } catch (Throwable th) {
            com.anythink.expressad.foundation.h.o.d(TAG, th.getMessage());
            postOnPlayErrorOnMainThread(th.toString());
        }
    }

    public void setFullScreenLoadingView(View view) {
        if (view != null) {
            try {
                this.mFullScreenLoadingView = view;
            } catch (Exception e10) {
                com.anythink.expressad.foundation.h.o.d(TAG, e10.getMessage());
            }
        }
    }

    public void setIsComplete(boolean z10) {
        this.mIsComplete = z10;
    }

    public void setIsFrontDesk(boolean z10) {
        String str;
        try {
            this.mIsFrontDesk = z10;
            StringBuilder sb2 = new StringBuilder("isFrontDesk: ");
            if (z10) {
                str = "frontStage";
            } else {
                str = "backStage";
            }
            sb2.append(str);
            com.anythink.expressad.foundation.h.o.d(TAG, sb2.toString());
        } catch (Exception e10) {
            com.anythink.expressad.foundation.h.o.d(TAG, e10.getMessage());
        }
    }

    public void setPlaybackParams(float f) {
        try {
            if (exoPlayerIsPlaying()) {
                this.exoPlayer.a(new v(f));
            } else {
                this.exoPlayer.a(new v(f));
                this.exoPlayer.m();
            }
        } catch (Throwable th) {
            com.anythink.expressad.foundation.h.o.d(TAG, th.getMessage());
        }
    }

    public void setSelfVideoFeedsPlayerListener(VideoPlayerStatusListener videoPlayerStatusListener) {
        this.mInnerVFPLisener = videoPlayerStatusListener;
    }

    public void setVideoFeedsPlayerListener(VideoPlayerStatusListener videoPlayerStatusListener) {
        this.mOutterVFListener = videoPlayerStatusListener;
    }

    public void setVolume(float f, float f10) {
        try {
            ad adVar = this.exoPlayer;
            if (adVar != null) {
                adVar.a(f10);
            }
        } catch (Throwable th) {
            com.anythink.expressad.foundation.h.o.d(TAG, th.getMessage());
        }
    }

    public void showLoading() {
        try {
            Handler handler = this.mHandler;
            if (handler == null) {
                return;
            }
            handler.post(new Runnable() { // from class: com.anythink.expressad.playercommon.VideoFeedsPlayer.4
                @Override // java.lang.Runnable
                public void run() {
                    if (VideoFeedsPlayer.this.mFullScreenLoadingView != null) {
                        VideoFeedsPlayer.this.mFullScreenLoadingView.setVisibility(0);
                    }
                }
            });
        } catch (Exception e10) {
            com.anythink.expressad.foundation.h.o.d(TAG, e10.getMessage());
        }
    }

    public void start(boolean z10) {
        try {
            if (!this.mHasPrepare) {
                com.anythink.expressad.foundation.h.o.b(TAG, "!mHasPrepare");
                return;
            }
            if (this.exoPlayer == null || exoPlayerIsPlaying()) {
                return;
            }
            showLoading();
            play();
            this.mIsPlaying = true;
            if (z10) {
                startPlayProgressTimer();
            }
            com.anythink.expressad.foundation.h.o.b(TAG, "start");
        } catch (Exception e10) {
            com.anythink.expressad.foundation.h.o.d(TAG, e10.getMessage());
        }
    }

    public void stop() {
        try {
            if (this.mHasPrepare && this.exoPlayer != null && exoPlayerIsPlaying()) {
                hideLoading();
                this.exoPlayer.m();
                this.mHasPrepare = false;
                this.mIsPlaying = false;
                this.mIsComplete = true;
            }
        } catch (Exception e10) {
            com.anythink.expressad.foundation.h.o.d(TAG, e10.getMessage());
        }
    }

    public void start(int i10) {
        try {
            if (!this.mHasPrepare || this.exoPlayer == null || exoPlayerIsPlaying()) {
                return;
            }
            if (i10 > 0) {
                this.exoPlayer.a(i10);
                play();
            } else {
                play();
                this.mIsPlaying = true;
                com.anythink.expressad.foundation.h.o.b(TAG, "=========start 指定进度");
            }
        } catch (Exception e10) {
            com.anythink.expressad.foundation.h.o.d(TAG, e10.getMessage());
        }
    }

    public void play(String str, SurfaceHolder surfaceHolder) {
        try {
            synchronized (this.mLock) {
                if (TextUtils.isEmpty(str)) {
                    postOnPlayErrorOnMainThread("play url is null");
                    return;
                }
                this.mPlayUrl = str;
                this.mHasPrepare = false;
                this.mIsFrontDesk = true;
                this.mSurfaceHolder = surfaceHolder;
                showLoading();
                setDataSource();
                com.anythink.expressad.foundation.h.o.b(TAG, "mPlayUrl:" + this.mPlayUrl);
            }
        } catch (Exception e10) {
            com.anythink.expressad.foundation.h.o.d(TAG, e10.getMessage());
            releasePlayer();
            hideLoading();
            postOnPlayErrorOnMainThread("mediaplayer cannot play");
        }
    }

    @Override // com.anythink.expressad.exoplayer.w.c
    public void onSeekProcessed() {
    }

    public void onBufferingUpdate(int i10) {
    }

    @Override // com.anythink.expressad.exoplayer.w.c
    public void onLoadingChanged(boolean z10) {
    }

    @Override // com.anythink.expressad.exoplayer.w.c
    public void onPositionDiscontinuity(int i10) {
    }

    @Override // com.anythink.expressad.exoplayer.w.c
    public void onRepeatModeChanged(int i10) {
    }

    @Override // com.anythink.expressad.exoplayer.w.c
    public void onShuffleModeEnabledChanged(boolean z10) {
    }

    public void play() {
        this.exoPlayer.a(true);
    }

    @Override // com.anythink.expressad.exoplayer.w.c
    public void onTracksChanged(af afVar, com.anythink.expressad.exoplayer.i.g gVar) {
    }

    @Override // com.anythink.expressad.exoplayer.w.c
    public void onTimelineChanged(ae aeVar, Object obj, int i10) {
    }
}
