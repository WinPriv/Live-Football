package androidx.appcompat.widget;

import android.graphics.SurfaceTexture;
import android.util.Log;
import android.view.Surface;
import androidx.appcompat.widget.Toolbar;
import androidx.emoji2.text.l;
import com.anythink.basead.ui.PlayerView;
import com.google.android.exoplayer2.source.dash.DashMediaSource;
import com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView;
import com.google.firebase.messaging.c;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Iterator;
import l4.b;
import o5.l;
import o5.n;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class n0 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f1208s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f1209t;

    public /* synthetic */ n0(Object obj, int i10) {
        this.f1208s = i10;
        this.f1209t = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.appcompat.view.menu.j jVar = null;
        int i10 = this.f1208s;
        Object obj = this.f1209t;
        switch (i10) {
            case 0:
                Toolbar.f fVar = ((Toolbar) obj).f1093j0;
                if (fVar != null) {
                    jVar = fVar.f1115t;
                }
                if (jVar != null) {
                    jVar.collapseActionView();
                    return;
                }
                return;
            case 1:
                ((r0) obj).a();
                return;
            case 2:
            default:
                c.a aVar = (c.a) obj;
                Log.w("FirebaseMessaging", "Service took too long to process intent: " + aVar.f21310a.getAction() + " finishing.");
                aVar.f21311b.trySetResult(null);
                return;
            case 3:
                ((l.b) obj).c();
                return;
            case 4:
                ((PlayerView) obj).j();
                return;
            case 5:
                l4.r rVar = (l4.r) obj;
                b.a j02 = rVar.j0();
                rVar.o0(j02, IronSourceError.ERROR_RV_LOAD_SUCCESS_UNEXPECTED, new l4.p(j02, 2));
                rVar.f32433x.d();
                return;
            case 6:
                int i11 = DashMediaSource.f20120j0;
                ((DashMediaSource) obj).B();
                return;
            case 7:
                ((l.a) ((n.a) obj)).b();
                return;
            case 8:
                SphericalGLSurfaceView sphericalGLSurfaceView = (SphericalGLSurfaceView) obj;
                Surface surface = sphericalGLSurfaceView.f20402z;
                if (surface != null) {
                    Iterator<SphericalGLSurfaceView.b> it = sphericalGLSurfaceView.f20396s.iterator();
                    while (it.hasNext()) {
                        it.next().x();
                    }
                }
                SurfaceTexture surfaceTexture = sphericalGLSurfaceView.y;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
                if (surface != null) {
                    surface.release();
                }
                sphericalGLSurfaceView.y = null;
                sphericalGLSurfaceView.f20402z = null;
                return;
            case 9:
                ((com.google.android.material.textfield.f) obj).t(true);
                return;
        }
    }
}
