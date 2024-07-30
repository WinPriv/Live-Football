package ra;

import android.widget.Toast;
import androidx.transition.n;
import com.hamkho.livefoot.R;
import java.util.List;

/* loaded from: classes2.dex */
public final class i implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ List f34974s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ j f34975t;

    public i(j jVar, List list) {
        this.f34975t = jVar;
        this.f34974s = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j jVar = this.f34975t;
        jVar.f34976a.dismiss();
        if (n.M(this.f34974s)) {
            Toast.makeText(jVar.f34977b, R.string.hiad_net_error, 0).show();
        } else {
            k.b(jVar.f34977b, jVar.f34978c, jVar.f34979d);
        }
    }
}
