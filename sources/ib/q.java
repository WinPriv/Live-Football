package ib;

import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.method.Touch;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.MotionEvent;
import android.widget.TextView;

/* loaded from: classes2.dex */
public final class q extends LinkMovementMethod {

    /* renamed from: a, reason: collision with root package name */
    public final int f29511a;

    /* renamed from: b, reason: collision with root package name */
    public final int f29512b;

    public q(int i10, int i11) {
        this.f29512b = i10;
        this.f29511a = i11;
    }

    public static ClickableSpan[] a(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        int x10 = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int totalPaddingLeft = x10 - textView.getTotalPaddingLeft();
        int totalPaddingTop = y - textView.getTotalPaddingTop();
        int scrollX = textView.getScrollX() + totalPaddingLeft;
        int scrollY = textView.getScrollY() + totalPaddingTop;
        Layout layout = textView.getLayout();
        int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(scrollY), scrollX);
        return (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
    }

    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 1) {
            ClickableSpan[] a10 = a(textView, spannable, motionEvent);
            if (a10.length != 0) {
                a10[0].onClick(textView);
                int i10 = this.f29512b;
                if (i10 != 0) {
                    spannable.setSpan(new ForegroundColorSpan(i10), spannable.getSpanStart(a10[0]), spannable.getSpanEnd(a10[0]), 33);
                }
                return true;
            }
        } else if (action == 0) {
            Object[] a11 = a(textView, spannable, motionEvent);
            if (a11.length != 0) {
                int i11 = this.f29511a;
                if (i11 != 0) {
                    spannable.setSpan(new ForegroundColorSpan(i11), spannable.getSpanStart(a11[0]), spannable.getSpanEnd(a11[0]), 33);
                }
                return true;
            }
        } else {
            return Touch.onTouchEvent(textView, spannable, motionEvent);
        }
        Selection.removeSelection(spannable);
        Touch.onTouchEvent(textView, spannable, motionEvent);
        return false;
    }
}
