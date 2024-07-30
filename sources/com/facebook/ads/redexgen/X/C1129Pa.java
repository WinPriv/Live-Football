package com.facebook.ads.redexgen.X;

import android.media.MediaPlayer;
import android.widget.MediaController;

/* renamed from: com.facebook.ads.redexgen.X.Pa, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1129Pa implements MediaController.MediaPlayerControl {
    public static String[] A01 = {"hSLXxwS3ED2PXa4HWxT5O8AkoZWeLCaL", "Gmogcdio2x0gXeHeLgUduGgoR45wUaaW", "srtP07DjK9aYu1B8NyoR8EE0J7RhN7X5", "MH7", "NBYiw3cvWUp2yNoHdye4I6uBFIshebL3", "osH0FOpWNHuyeeWL1EivPIw0cJCzEheb", "y4KJdcSo65PTSQflVKQ3KiIVJaTfePYu", "FLJEaU0xa"};
    public final /* synthetic */ TextureViewSurfaceTextureListenerC0922Gt A00;

    public C1129Pa(TextureViewSurfaceTextureListenerC0922Gt textureViewSurfaceTextureListenerC0922Gt) {
        this.A00 = textureViewSurfaceTextureListenerC0922Gt;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canPause() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canSeekBackward() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canSeekForward() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getAudioSessionId() {
        MediaPlayer mediaPlayer;
        MediaPlayer mediaPlayer2;
        mediaPlayer = this.A00.A06;
        if (mediaPlayer == null) {
            return 0;
        }
        mediaPlayer2 = this.A00.A06;
        return mediaPlayer2.getAudioSessionId();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getBufferPercentage() {
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getCurrentPosition() {
        return this.A00.getCurrentPosition();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getDuration() {
        return this.A00.getDuration();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean isPlaying() {
        MediaPlayer mediaPlayer;
        MediaPlayer mediaPlayer2;
        mediaPlayer = this.A00.A06;
        if (mediaPlayer != null) {
            TextureViewSurfaceTextureListenerC0922Gt textureViewSurfaceTextureListenerC0922Gt = this.A00;
            if (A01[3].length() == 27) {
                throw new RuntimeException();
            }
            A01[1] = "lkPRs4KbLtabABAzVL2ijXaoS745wM0q";
            mediaPlayer2 = textureViewSurfaceTextureListenerC0922Gt.A06;
            if (mediaPlayer2.isPlaying()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void pause() {
        InterfaceC1135Pg interfaceC1135Pg;
        InterfaceC1135Pg interfaceC1135Pg2;
        interfaceC1135Pg = this.A00.A0E;
        if (interfaceC1135Pg != null) {
            interfaceC1135Pg2 = this.A00.A0E;
            interfaceC1135Pg2.ABL();
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void seekTo(int i10) {
        this.A00.seekTo(i10);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void start() {
        InterfaceC1135Pg interfaceC1135Pg;
        InterfaceC1135Pg interfaceC1135Pg2;
        interfaceC1135Pg = this.A00.A0E;
        if (interfaceC1135Pg != null) {
            interfaceC1135Pg2 = this.A00.A0E;
            interfaceC1135Pg2.ABM();
        }
    }
}
