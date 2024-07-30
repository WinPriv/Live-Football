package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.hamkho.livefoot.R;

/* loaded from: classes.dex */
public class AppCompatSeekBar extends SeekBar {

    /* renamed from: s, reason: collision with root package name */
    public final m f970s;

    public AppCompatSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        h0.a(getContext(), this);
        m mVar = new m(this);
        this.f970s = mVar;
        mVar.a(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        m mVar = this.f970s;
        Drawable drawable = mVar.f1201e;
        if (drawable != null && drawable.isStateful()) {
            SeekBar seekBar = mVar.f1200d;
            if (drawable.setState(seekBar.getDrawableState())) {
                seekBar.invalidateDrawable(drawable);
            }
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f970s.f1201e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f970s.d(canvas);
    }
}
