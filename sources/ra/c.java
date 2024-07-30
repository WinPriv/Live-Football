package ra;

import android.widget.Toast;
import com.hamkho.livefoot.R;

/* loaded from: classes2.dex */
public final class c implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f f34943s;

    public c(f fVar) {
        this.f34943s = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Toast.makeText(this.f34943s.f34947a, R.string.hiad_download_no_space, 0).show();
    }
}
