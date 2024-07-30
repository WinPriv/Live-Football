package la;

import android.R;
import android.util.TypedValue;
import android.view.View;
import android.widget.Toolbar;
import com.huawei.openalliance.ad.ppskit.activity.BasePureWebActivity;
import ka.n7;

/* loaded from: classes2.dex */
public final class a implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ View f32564s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Toolbar f32565t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ BasePureWebActivity f32566u;

    public a(BasePureWebActivity basePureWebActivity, View view, Toolbar toolbar) {
        this.f32566u = basePureWebActivity;
        this.f32564s = view;
        this.f32565t = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        BasePureWebActivity basePureWebActivity = this.f32566u;
        try {
            TypedValue typedValue = new TypedValue();
            if (basePureWebActivity.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true)) {
                i10 = TypedValue.complexToDimensionPixelSize(typedValue.data, basePureWebActivity.getResources().getDisplayMetrics());
            } else {
                i10 = 0;
            }
            int max = Math.max(this.f32564s.getHeight(), i10);
            if (max > 0) {
                this.f32565t.setMinimumHeight(max);
            }
        } catch (Throwable unused) {
            n7.g("BasePureWebActivity", "set toolBar min height error.");
        }
    }
}
