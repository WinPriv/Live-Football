package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.hamkho.livefoot.R;

@Deprecated
/* loaded from: classes.dex */
public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* renamed from: s, reason: collision with root package name */
    public final int f1292s;

    /* renamed from: t, reason: collision with root package name */
    public final int f1293t;

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1292s = getResources().getDimensionPixelOffset(R.dimen.browser_actions_context_menu_min_padding);
        this.f1293t = getResources().getDimensionPixelOffset(R.dimen.browser_actions_context_menu_max_width);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f1292s * 2), this.f1293t), 1073741824), i11);
    }
}
