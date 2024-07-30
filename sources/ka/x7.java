package ka;

import android.media.MediaPlayer;
import com.huawei.openalliance.ad.ppskit.views.VideoView;
import ka.r8;

/* loaded from: classes2.dex */
public final class x7 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MediaPlayer.OnVideoSizeChangedListener f32170s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ w7 f32171t;

    public x7(w7 w7Var, VideoView.q qVar) {
        this.f32171t = w7Var;
        this.f32170s = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        w7 w7Var = this.f32171t;
        MediaPlayer.OnVideoSizeChangedListener onVideoSizeChangedListener = this.f32170s;
        if (!w7Var.f32087m.b(r8.b.END)) {
            synchronized (w7Var.f32088n) {
                w7Var.I = onVideoSizeChangedListener;
                MediaPlayer mediaPlayer = w7Var.f32076a;
                if (mediaPlayer != null) {
                    mediaPlayer.setOnVideoSizeChangedListener(onVideoSizeChangedListener);
                }
            }
        }
    }
}
