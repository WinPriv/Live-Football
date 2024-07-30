package ib;

import android.R;
import android.util.TypedValue;
import android.view.View;
import android.widget.Toolbar;
import com.huawei.opendevice.open.BaseSettingActivity;
import ka.n7;

/* loaded from: classes2.dex */
public final class a implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ View f29462s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Toolbar f29463t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ BaseSettingActivity f29464u;

    public a(BaseSettingActivity baseSettingActivity, View view, Toolbar toolbar) {
        this.f29464u = baseSettingActivity;
        this.f29462s = view;
        this.f29463t = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        BaseSettingActivity baseSettingActivity = this.f29464u;
        try {
            TypedValue typedValue = new TypedValue();
            if (baseSettingActivity.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true)) {
                i10 = TypedValue.complexToDimensionPixelSize(typedValue.data, baseSettingActivity.getResources().getDisplayMetrics());
            } else {
                i10 = 0;
            }
            int max = Math.max(this.f29462s.getHeight(), i10);
            if (max > 0) {
                this.f29463t.setMinimumHeight(max);
            }
        } catch (Throwable unused) {
            n7.g("BaseSettingActivity", "set toolBar min height error.");
        }
    }
}
