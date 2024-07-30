package ib;

import android.R;
import android.util.TypedValue;
import android.view.View;
import android.widget.Toolbar;
import com.huawei.opendevice.open.BaseWebActivity;
import ka.n7;

/* loaded from: classes2.dex */
public final class b implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ View f29465s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Toolbar f29466t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ BaseWebActivity f29467u;

    public b(BaseWebActivity baseWebActivity, View view, Toolbar toolbar) {
        this.f29467u = baseWebActivity;
        this.f29465s = view;
        this.f29466t = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        BaseWebActivity baseWebActivity = this.f29467u;
        try {
            TypedValue typedValue = new TypedValue();
            if (baseWebActivity.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true)) {
                i10 = TypedValue.complexToDimensionPixelSize(typedValue.data, baseWebActivity.getResources().getDisplayMetrics());
            } else {
                i10 = 0;
            }
            int max = Math.max(this.f29465s.getHeight(), i10);
            if (max > 0) {
                this.f29466t.setMinimumHeight(max);
            }
        } catch (Throwable unused) {
            n7.g("BaseWebActivity", "set toolBar min height error.");
        }
    }
}
