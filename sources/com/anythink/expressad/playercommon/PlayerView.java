package com.anythink.expressad.playercommon;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.anythink.expressad.foundation.f.b;
import com.anythink.expressad.foundation.h.i;
import com.anythink.expressad.foundation.h.o;

/* loaded from: classes.dex */
public class PlayerView extends LinearLayout {
    public static final String TAG = "PlayerView";
    private boolean isBTVideo;
    private boolean isBTVideoPlaying;
    private boolean mInitState;
    private boolean mIsCovered;
    private boolean mIsFirstCreateHolder;
    private boolean mIsNeedToRepeatPrepare;
    private boolean mIsSurfaceHolderDestoryed;
    private LinearLayout mLlSurContainer;
    private LinearLayout mLoadingView;
    private String mPlayUrl;
    private SurfaceHolder mSurfaceHolder;
    private VideoFeedsPlayer mVideoFeedsPlayer;

    /* loaded from: classes.dex */
    public class MySurfaceHoldeCallback implements SurfaceHolder.Callback {
        private MySurfaceHoldeCallback() {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            try {
                o.b("PlayerView", "surfaceChanged");
                if (PlayerView.this.mIsSurfaceHolderDestoryed && !PlayerView.this.mIsCovered && !PlayerView.this.isComplete() && !b.f9758c) {
                    if (!PlayerView.this.isBTVideo) {
                        if (PlayerView.this.mVideoFeedsPlayer.hasPrepare()) {
                            o.b("PlayerView", "surfaceChanged  start====");
                            PlayerView.this.resumeStart();
                        } else {
                            o.b("PlayerView", "surfaceChanged  PLAY====");
                            PlayerView.this.playVideo(0);
                        }
                    } else if (PlayerView.this.isBTVideoPlaying) {
                        if (!PlayerView.this.mVideoFeedsPlayer.hasPrepare()) {
                            PlayerView.this.mVideoFeedsPlayer.prepare();
                        }
                        PlayerView.this.mVideoFeedsPlayer.start(false);
                    } else {
                        PlayerView.this.pause();
                    }
                }
                PlayerView.this.mIsSurfaceHolderDestoryed = false;
            } catch (Exception e10) {
                o.d("PlayerView", e10.getMessage());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            try {
                o.b("PlayerView", "surfaceCreated");
                if (PlayerView.this.mVideoFeedsPlayer != null && surfaceHolder != null) {
                    PlayerView.this.mSurfaceHolder = surfaceHolder;
                    PlayerView.this.mVideoFeedsPlayer.setDisplay(surfaceHolder);
                }
                PlayerView.this.mIsFirstCreateHolder = false;
            } catch (Exception e10) {
                o.d("PlayerView", e10.getMessage());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            try {
                o.b("PlayerView", "surfaceDestroyed ");
                PlayerView.this.mIsSurfaceHolderDestoryed = true;
                PlayerView.this.mIsNeedToRepeatPrepare = true;
                PlayerView.this.mVideoFeedsPlayer.pause();
            } catch (Exception e10) {
                o.d("PlayerView", e10.getMessage());
            }
        }
    }

    public PlayerView(Context context) {
        super(context);
        this.mInitState = false;
        this.mIsFirstCreateHolder = true;
        this.mIsSurfaceHolderDestoryed = false;
        this.mIsCovered = false;
        this.mIsNeedToRepeatPrepare = false;
        this.isBTVideo = false;
        this.isBTVideoPlaying = false;
        init();
    }

    private void init() {
        try {
            initView();
            initPlayer();
        } catch (Exception e10) {
            o.d("PlayerView", e10.getMessage());
        }
    }

    private void initPlayer() {
        this.mVideoFeedsPlayer = new VideoFeedsPlayer();
    }

    private void initView() {
        View inflate = LayoutInflater.from(getContext()).inflate(i.a(getContext(), "anythink_playercommon_player_view", "layout"), (ViewGroup) null);
        if (inflate != null) {
            this.mLlSurContainer = (LinearLayout) inflate.findViewById(i.a(getContext(), "anythink_playercommon_ll_sur_container", "id"));
            this.mLoadingView = (LinearLayout) inflate.findViewById(i.a(getContext(), "anythink_playercommon_ll_loading", "id"));
            addSurfaceView();
            addView(inflate, -1, -1);
        }
    }

    public void addSurfaceView() {
        try {
            o.b("PlayerView", "addSurfaceView");
            SurfaceView surfaceView = new SurfaceView(getContext().getApplicationContext());
            SurfaceHolder holder = surfaceView.getHolder();
            this.mSurfaceHolder = holder;
            holder.setType(3);
            this.mSurfaceHolder.setKeepScreenOn(true);
            this.mSurfaceHolder.addCallback(new MySurfaceHoldeCallback());
            this.mLlSurContainer.addView(surfaceView, -1, -1);
        } catch (Exception e10) {
            o.d("PlayerView", e10.getMessage());
        }
    }

    public void closeSound() {
        VideoFeedsPlayer videoFeedsPlayer = this.mVideoFeedsPlayer;
        if (videoFeedsPlayer != null) {
            videoFeedsPlayer.closeSound();
        }
    }

    public void coverUnlockResume() {
        try {
            this.mVideoFeedsPlayer.setIsFrontDesk(true);
            if (this.mVideoFeedsPlayer != null) {
                o.b("PlayerView", "coverUnlockResume========");
                if (this.mVideoFeedsPlayer.hasPrepare() && !this.mIsNeedToRepeatPrepare) {
                    start(true);
                    return;
                }
                playVideo(0);
            }
        } catch (Throwable th) {
            o.d("PlayerView", th.getMessage());
        }
    }

    public int getCurPosition() {
        try {
            VideoFeedsPlayer videoFeedsPlayer = this.mVideoFeedsPlayer;
            if (videoFeedsPlayer == null) {
                return 0;
            }
            return videoFeedsPlayer.getCurPosition();
        } catch (Exception e10) {
            o.d("PlayerView", e10.getMessage());
            return 0;
        }
    }

    public int getDuration() {
        VideoFeedsPlayer videoFeedsPlayer = this.mVideoFeedsPlayer;
        if (videoFeedsPlayer != null) {
            return videoFeedsPlayer.getDuration();
        }
        return 0;
    }

    public void initBufferIngParam(int i10) {
        VideoFeedsPlayer videoFeedsPlayer = this.mVideoFeedsPlayer;
        if (videoFeedsPlayer != null) {
            videoFeedsPlayer.initBufferIngParam(i10);
        }
    }

    public boolean initVFPData(String str, String str2, int i10, VideoPlayerStatusListener videoPlayerStatusListener) {
        if (TextUtils.isEmpty(str)) {
            o.b("PlayerView", "playUrl==null");
            return false;
        }
        this.mPlayUrl = str;
        this.mVideoFeedsPlayer.initPlayer(getContext(), this.mLoadingView, str, str2, i10, videoPlayerStatusListener);
        this.mInitState = true;
        return true;
    }

    public boolean isComplete() {
        try {
            VideoFeedsPlayer videoFeedsPlayer = this.mVideoFeedsPlayer;
            if (videoFeedsPlayer == null) {
                return false;
            }
            if (!videoFeedsPlayer.isComplete()) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            o.b("PlayerView", th.getMessage(), th);
            return false;
        }
    }

    public boolean isPlayIng() {
        try {
            VideoFeedsPlayer videoFeedsPlayer = this.mVideoFeedsPlayer;
            if (videoFeedsPlayer != null) {
                return videoFeedsPlayer.isPlayIng();
            }
            return false;
        } catch (Throwable th) {
            o.d("PlayerView", th.getMessage());
            return false;
        }
    }

    public boolean isSilent() {
        return this.mVideoFeedsPlayer.isSilent();
    }

    public void justSeekTo(int i10) {
        try {
            VideoFeedsPlayer videoFeedsPlayer = this.mVideoFeedsPlayer;
            if (videoFeedsPlayer != null) {
                videoFeedsPlayer.justSeekTo(i10);
            }
        } catch (Exception e10) {
            o.d("PlayerView", e10.getMessage());
        }
    }

    public void onPause() {
        try {
            pause();
            VideoFeedsPlayer videoFeedsPlayer = this.mVideoFeedsPlayer;
            if (videoFeedsPlayer != null) {
                videoFeedsPlayer.setIsFrontDesk(false);
            }
        } catch (Exception e10) {
            o.d("PlayerView", e10.getMessage());
        }
    }

    public void onResume() {
        try {
            this.mVideoFeedsPlayer.setIsFrontDesk(true);
            if (this.mVideoFeedsPlayer != null && !this.mIsSurfaceHolderDestoryed && !isComplete() && !this.mIsCovered) {
                o.b("PlayerView", "onresume========");
                if (this.mVideoFeedsPlayer.hasPrepare()) {
                    resumeStart();
                } else {
                    playVideo(0);
                }
            }
        } catch (Exception e10) {
            o.d("PlayerView", e10.getMessage());
        }
    }

    public void openSound() {
        VideoFeedsPlayer videoFeedsPlayer = this.mVideoFeedsPlayer;
        if (videoFeedsPlayer != null) {
            videoFeedsPlayer.openSound();
        }
    }

    public void pause() {
        try {
            VideoFeedsPlayer videoFeedsPlayer = this.mVideoFeedsPlayer;
            if (videoFeedsPlayer != null) {
                videoFeedsPlayer.pause();
            }
        } catch (Exception e10) {
            o.d("PlayerView", e10.getMessage());
        }
    }

    public boolean playVideo(int i10) {
        try {
            VideoFeedsPlayer videoFeedsPlayer = this.mVideoFeedsPlayer;
            if (videoFeedsPlayer == null) {
                o.b("PlayerView", "player init error 播放失败");
                return false;
            }
            if (!this.mInitState) {
                o.b("PlayerView", "vfp init failed 播放失败");
                return false;
            }
            videoFeedsPlayer.play(this.mPlayUrl, i10);
            this.mIsNeedToRepeatPrepare = false;
            return true;
        } catch (Throwable th) {
            o.b("PlayerView", th.getMessage(), th);
            return false;
        }
    }

    public void prepare() {
        try {
            VideoFeedsPlayer videoFeedsPlayer = this.mVideoFeedsPlayer;
            if (videoFeedsPlayer != null) {
                videoFeedsPlayer.prepare();
            }
        } catch (Exception e10) {
            o.d("PlayerView", e10.getMessage());
        }
    }

    public void release() {
        try {
            VideoFeedsPlayer videoFeedsPlayer = this.mVideoFeedsPlayer;
            if (videoFeedsPlayer != null) {
                videoFeedsPlayer.releasePlayer();
            }
            if (this.mSurfaceHolder != null) {
                o.d("PlayerView", "mSurfaceHolder release");
                this.mSurfaceHolder.getSurface().release();
            }
        } catch (Throwable th) {
            o.d("PlayerView", th.getMessage());
        }
    }

    public void removeSurface() {
        try {
            o.b("PlayerView", "removeSurface");
            this.mLlSurContainer.removeAllViews();
        } catch (Exception e10) {
            o.d("PlayerView", e10.getMessage());
        }
    }

    public void resumeStart() {
        try {
            start(true);
        } catch (Exception e10) {
            o.d("PlayerView", e10.getMessage());
        }
    }

    public void seekTo(int i10) {
        try {
            VideoFeedsPlayer videoFeedsPlayer = this.mVideoFeedsPlayer;
            if (videoFeedsPlayer != null) {
                videoFeedsPlayer.seekTo(i10);
            }
        } catch (Exception e10) {
            o.d("PlayerView", e10.getMessage());
        }
    }

    public void setDataSource() {
        try {
            VideoFeedsPlayer videoFeedsPlayer = this.mVideoFeedsPlayer;
            if (videoFeedsPlayer != null) {
                videoFeedsPlayer.showLoading();
                this.mVideoFeedsPlayer.setDataSource();
                this.mIsNeedToRepeatPrepare = false;
            }
        } catch (Exception e10) {
            o.d("PlayerView", e10.getMessage());
        }
    }

    public void setDesk(boolean z10) {
        this.mVideoFeedsPlayer.setIsFrontDesk(z10);
    }

    public void setIsBTVideo(boolean z10) {
        this.isBTVideo = z10;
    }

    public void setIsBTVideoPlaying(boolean z10) {
        this.isBTVideoPlaying = z10;
    }

    public void setIsCovered(boolean z10) {
        try {
            this.mIsCovered = z10;
            o.d("PlayerView", "mIsCovered:".concat(String.valueOf(z10)));
        } catch (Exception e10) {
            o.d("PlayerView", e10.getMessage());
        }
    }

    public void setPlaybackParams(float f) {
        VideoFeedsPlayer videoFeedsPlayer = this.mVideoFeedsPlayer;
        if (videoFeedsPlayer != null) {
            videoFeedsPlayer.setPlaybackParams(f);
        }
    }

    public void setVolume(float f, float f10) {
        VideoFeedsPlayer videoFeedsPlayer = this.mVideoFeedsPlayer;
        if (videoFeedsPlayer != null) {
            videoFeedsPlayer.setVolume(f, f10);
        }
    }

    public void start(boolean z10) {
        try {
            VideoFeedsPlayer videoFeedsPlayer = this.mVideoFeedsPlayer;
            if (videoFeedsPlayer == null || this.mIsCovered) {
                return;
            }
            videoFeedsPlayer.start(z10);
        } catch (Exception e10) {
            o.d("PlayerView", e10.getMessage());
        }
    }

    public void stop() {
        try {
            VideoFeedsPlayer videoFeedsPlayer = this.mVideoFeedsPlayer;
            if (videoFeedsPlayer != null) {
                videoFeedsPlayer.stop();
            }
        } catch (Exception e10) {
            o.d("PlayerView", e10.getMessage());
        }
    }

    public void start(int i10) {
        try {
            VideoFeedsPlayer videoFeedsPlayer = this.mVideoFeedsPlayer;
            if (videoFeedsPlayer != null) {
                videoFeedsPlayer.start(i10);
            }
        } catch (Exception e10) {
            o.d("PlayerView", e10.getMessage());
        }
    }

    public boolean playVideo() {
        return playVideo(0);
    }

    public PlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mInitState = false;
        this.mIsFirstCreateHolder = true;
        this.mIsSurfaceHolderDestoryed = false;
        this.mIsCovered = false;
        this.mIsNeedToRepeatPrepare = false;
        this.isBTVideo = false;
        this.isBTVideoPlaying = false;
        init();
    }
}
