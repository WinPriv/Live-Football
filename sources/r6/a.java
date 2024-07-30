package r6;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* compiled from: InsetDialogOnTouchListener.java */
/* loaded from: classes2.dex */
public final class a implements View.OnTouchListener {

    /* renamed from: s, reason: collision with root package name */
    public final Dialog f34930s;

    /* renamed from: t, reason: collision with root package name */
    public final int f34931t;

    /* renamed from: u, reason: collision with root package name */
    public final int f34932u;

    /* renamed from: v, reason: collision with root package name */
    public final int f34933v;

    public a(Dialog dialog, Rect rect) {
        this.f34930s = dialog;
        this.f34931t = rect.left;
        this.f34932u = rect.top;
        this.f34933v = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(R.id.content);
        int left = findViewById.getLeft() + this.f34931t;
        int width = findViewById.getWidth() + left;
        if (new RectF(left, findViewById.getTop() + this.f34932u, width, findViewById.getHeight() + r4).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i10 = this.f34933v;
            obtain.setLocation((-i10) - 1, (-i10) - 1);
        }
        view.performClick();
        return this.f34930s.onTouchEvent(obtain);
    }
}
