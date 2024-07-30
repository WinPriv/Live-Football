package la;

import android.view.MenuItem;
import android.widget.PopupMenu;
import com.huawei.openalliance.ad.ppskit.activity.PPSActivity;

/* loaded from: classes2.dex */
public final class k implements PopupMenu.OnMenuItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PPSActivity f32575a;

    public k(PPSActivity pPSActivity) {
        this.f32575a = pPSActivity;
    }

    @Override // android.widget.PopupMenu.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        int i10 = PPSActivity.f22351i0;
        return this.f32575a.y(menuItem);
    }
}
