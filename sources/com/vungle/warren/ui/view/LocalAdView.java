package com.vungle.warren.ui.view;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.huawei.hms.ads.gl;
import com.vungle.warren.ui.CloseDelegate;
import com.vungle.warren.ui.OrientationDelegate;
import com.vungle.warren.ui.contract.LocalAdContract;
import com.vungle.warren.ui.presenter.LocalAdPresenter;
import com.vungle.warren.ui.view.FullAdWidget;
import java.io.File;

/* loaded from: classes2.dex */
public class LocalAdView extends BaseAdView<LocalAdPresenter> implements LocalAdContract.LocalView, MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener {
    private FullAdWidget.OnItemClickListener clickListener;
    private boolean ctaClickAreaEnabled;
    private Handler handler;
    private MediaPlayer mediaPlayer;
    private boolean muted;
    private LocalAdContract.LocalPresenter presenter;
    private Runnable reportProgress;

    public LocalAdView(Context context, FullAdWidget fullAdWidget, OrientationDelegate orientationDelegate, CloseDelegate closeDelegate) {
        super(context, fullAdWidget, orientationDelegate, closeDelegate);
        this.muted = false;
        this.ctaClickAreaEnabled = false;
        this.handler = new Handler(Looper.getMainLooper());
        this.clickListener = new FullAdWidget.OnItemClickListener() { // from class: com.vungle.warren.ui.view.LocalAdView.1
            @Override // com.vungle.warren.ui.view.FullAdWidget.OnItemClickListener
            public void onItemClicked(int i10) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 != 4) {
                                if (i10 == 5 && LocalAdView.this.ctaClickAreaEnabled) {
                                    LocalAdView.this.presenter.onDownload();
                                    return;
                                }
                                return;
                            }
                            LocalAdView.this.presenter.onPrivacy();
                            return;
                        }
                        if (LocalAdView.this.mediaPlayer != null) {
                            LocalAdView.this.muteAudio();
                            LocalAdView.this.presenter.onMute(LocalAdView.this.muted);
                            LocalAdView localAdView = LocalAdView.this;
                            localAdView.view.setMuted(localAdView.muted);
                            return;
                        }
                        return;
                    }
                    LocalAdView.this.presenter.onDownload();
                    return;
                }
                LocalAdView.this.presenter.handleExit();
            }
        };
        attachListeners();
    }

    private void attachListeners() {
        this.view.setOnItemClickListener(this.clickListener);
        this.view.setOnPreparedListener(this);
        this.view.setOnErrorListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void muteAudio() {
        if (this.mediaPlayer == null) {
            return;
        }
        this.muted = !this.muted;
        switchMuteState();
    }

    private void setupPlayerProgressBar() {
        Runnable runnable = new Runnable() { // from class: com.vungle.warren.ui.view.LocalAdView.2
            float duration = -2.0f;

            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (LocalAdView.this.view.isVideoPlaying()) {
                        int currentVideoPosition = LocalAdView.this.view.getCurrentVideoPosition();
                        int videoDuration = LocalAdView.this.view.getVideoDuration();
                        if (videoDuration > 0) {
                            if (this.duration == -2.0f) {
                                this.duration = videoDuration;
                            }
                            LocalAdView.this.presenter.onProgressUpdate(currentVideoPosition, this.duration);
                            LocalAdView.this.view.setProgress(currentVideoPosition, this.duration);
                        }
                    }
                    LocalAdView.this.handler.postDelayed(this, 1000L);
                } catch (IllegalStateException unused) {
                    Log.v(LocalAdView.this.TAG, "IllegalStateException while reporting progress indicates activity was killed via SIGKILL.");
                }
            }
        };
        this.reportProgress = runnable;
        this.handler.post(runnable);
    }

    private void switchMuteState() {
        float f;
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
            try {
                if (this.muted) {
                    f = gl.Code;
                } else {
                    f = 1.0f;
                }
                mediaPlayer.setVolume(f, f);
            } catch (IllegalStateException e10) {
                Log.i(this.TAG, "Exception On Mute/Unmute", e10);
            }
        }
    }

    @Override // com.vungle.warren.ui.view.BaseAdView, com.vungle.warren.ui.contract.AdContract.AdView
    public void close() {
        super.close();
        this.handler.removeCallbacksAndMessages(null);
    }

    @Override // com.vungle.warren.ui.contract.LocalAdContract.LocalView
    public int getVideoPosition() {
        return this.view.getCurrentVideoPosition();
    }

    @Override // com.vungle.warren.ui.contract.LocalAdContract.LocalView
    public boolean isVideoPlaying() {
        return this.view.isVideoPlaying();
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
        StringBuilder sb2 = new StringBuilder(30);
        if (i10 != 1) {
            if (i10 != 100) {
                sb2.append("UNKNOWN");
            } else {
                sb2.append("MEDIA_ERROR_SERVER_DIED");
            }
        } else {
            sb2.append("MEDIA_ERROR_UNKNOWN");
        }
        sb2.append(':');
        if (i11 != -1010) {
            if (i11 != -1007) {
                if (i11 != -1004) {
                    if (i11 != -110) {
                        if (i11 != 200) {
                            sb2.append("MEDIA_ERROR_SYSTEM");
                        } else {
                            sb2.append("MEDIA_ERROR_NOT_VALID_FOR_PROGRESSIVE_PLAYBACK");
                        }
                    } else {
                        sb2.append("MEDIA_ERROR_TIMED_OUT");
                    }
                } else {
                    sb2.append("MEDIA_ERROR_IO");
                }
            } else {
                sb2.append("MEDIA_ERROR_MALFORMED");
            }
        } else {
            sb2.append("MEDIA_ERROR_UNSUPPORTED");
        }
        this.presenter.onMediaError(sb2.toString());
        return true;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(MediaPlayer mediaPlayer) {
        this.mediaPlayer = mediaPlayer;
        switchMuteState();
        this.view.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.vungle.warren.ui.view.LocalAdView.3
            @Override // android.media.MediaPlayer.OnCompletionListener
            public void onCompletion(MediaPlayer mediaPlayer2) {
                Log.d(LocalAdView.this.TAG, "mediaplayer onCompletion");
                if (LocalAdView.this.reportProgress != null) {
                    LocalAdView.this.handler.removeCallbacks(LocalAdView.this.reportProgress);
                }
                LocalAdView.this.presenter.onProgressUpdate(mediaPlayer2.getDuration(), mediaPlayer2.getDuration());
            }
        });
        this.presenter.onVideoStart(getVideoPosition(), mediaPlayer.getDuration());
        setupPlayerProgressBar();
    }

    @Override // com.vungle.warren.ui.contract.LocalAdContract.LocalView
    public void pauseVideo() {
        this.view.pausePlayback();
        Runnable runnable = this.reportProgress;
        if (runnable != null) {
            this.handler.removeCallbacks(runnable);
        }
    }

    @Override // com.vungle.warren.ui.contract.LocalAdContract.LocalView
    public void playVideo(File file, boolean z10, int i10) {
        boolean z11;
        if (!this.muted && !z10) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.muted = z11;
        if (file != null) {
            setupPlayerProgressBar();
            this.view.playVideo(Uri.fromFile(file), i10);
            this.view.setMuted(this.muted);
            boolean z12 = this.muted;
            if (z12) {
                this.presenter.onMute(z12);
            }
        }
    }

    @Override // com.vungle.warren.ui.contract.LocalAdContract.LocalView
    public void showCTAOverlay(boolean z10, boolean z11) {
        boolean z12;
        this.ctaClickAreaEnabled = z11;
        FullAdWidget fullAdWidget = this.view;
        if (z10 && z11) {
            z12 = true;
        } else {
            z12 = false;
        }
        fullAdWidget.setCtaEnabled(z12);
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdView
    public void showWebsite(String str) {
        this.view.stopPlayback();
        this.view.showWebsite(str);
        this.handler.removeCallbacks(this.reportProgress);
        this.mediaPlayer = null;
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdView
    public void setPresenter(LocalAdPresenter localAdPresenter) {
        this.presenter = localAdPresenter;
    }
}
