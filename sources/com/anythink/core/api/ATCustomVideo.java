package com.anythink.core.api;

/* loaded from: classes.dex */
public interface ATCustomVideo {
    String getVideoUrl();

    void reportVideoAutoStart();

    void reportVideoBreak(long j10);

    void reportVideoContinue(long j10);

    void reportVideoError(long j10, int i10, int i11);

    void reportVideoFinish();

    void reportVideoPause(long j10);

    void reportVideoStart();

    void reportVideoStartError(int i10, int i11);
}
