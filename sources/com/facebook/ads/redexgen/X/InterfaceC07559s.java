package com.facebook.ads.redexgen.X;

import android.view.Surface;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.metadata.Metadata;
import com.facebook.ads.internal.exoplayer2.source.TrackGroupArray;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.9s, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public interface InterfaceC07559s {
    void onAudioSessionId(C07549r c07549r, int i10);

    void onAudioUnderrun(C07549r c07549r, int i10, long j10, long j11);

    void onDecoderDisabled(C07549r c07549r, int i10, C0771Ai c0771Ai);

    void onDecoderEnabled(C07549r c07549r, int i10, C0771Ai c0771Ai);

    void onDecoderInitialized(C07549r c07549r, int i10, String str, long j10);

    void onDecoderInputFormatChanged(C07549r c07549r, int i10, Format format);

    void onDownstreamFormatChanged(C07549r c07549r, EZ ez);

    void onDrmKeysLoaded(C07549r c07549r);

    void onDrmKeysRemoved(C07549r c07549r);

    void onDrmKeysRestored(C07549r c07549r);

    void onDrmSessionManagerError(C07549r c07549r, Exception exc);

    void onDroppedVideoFrames(C07549r c07549r, int i10, long j10);

    void onLoadError(C07549r c07549r, EY ey, EZ ez, IOException iOException, boolean z10);

    void onLoadingChanged(C07549r c07549r, boolean z10);

    void onMediaPeriodCreated(C07549r c07549r);

    void onMediaPeriodReleased(C07549r c07549r);

    void onMetadata(C07549r c07549r, Metadata metadata);

    void onPlaybackParametersChanged(C07549r c07549r, C9T c9t);

    void onPlayerError(C07549r c07549r, AnonymousClass98 anonymousClass98);

    void onPlayerStateChanged(C07549r c07549r, boolean z10, int i10);

    void onPositionDiscontinuity(C07549r c07549r, int i10);

    void onReadingStarted(C07549r c07549r);

    void onRenderedFirstFrame(C07549r c07549r, Surface surface);

    void onSeekProcessed(C07549r c07549r);

    void onSeekStarted(C07549r c07549r);

    void onTimelineChanged(C07549r c07549r, int i10);

    void onTracksChanged(C07549r c07549r, TrackGroupArray trackGroupArray, GD gd2);

    void onVideoSizeChanged(C07549r c07549r, int i10, int i11, int i12, float f);
}
