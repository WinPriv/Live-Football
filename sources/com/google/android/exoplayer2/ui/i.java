package com.google.android.exoplayer2.ui;

import com.google.android.exoplayer2.ui.PlayerControlView;

/* compiled from: TimeBar.java */
/* loaded from: classes2.dex */
public interface i {

    /* compiled from: TimeBar.java */
    /* loaded from: classes2.dex */
    public interface a {
        void A(long j10);

        void B(long j10, boolean z10);

        void z(long j10);
    }

    void a(long[] jArr, boolean[] zArr, int i10);

    void b(PlayerControlView.b bVar);

    long getPreferredUpdateDelay();

    void setBufferedPosition(long j10);

    void setDuration(long j10);

    void setEnabled(boolean z10);

    void setPosition(long j10);
}
