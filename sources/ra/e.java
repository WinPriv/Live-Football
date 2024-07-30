package ra;

import android.widget.Toast;
import com.hamkho.livefoot.R;

/* loaded from: classes2.dex */
public final class e implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f f34946s;

    public e(f fVar) {
        this.f34946s = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f fVar = this.f34946s;
        Toast.makeText(fVar.f34947a, fVar.f34947a.getString(R.string.hiad_start_ownload_failed_downloading), 0).show();
    }
}
