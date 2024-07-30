package com.anythink.expressad.foundation.h;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    private static final String f10226a = "ViewUtils";

    /* renamed from: b, reason: collision with root package name */
    private static boolean f10227b = false;

    public static boolean a(View view) {
        if (view.getVisibility() != 0) {
            o.d(f10226a, "Banner Judge : Banner's not visible.");
            return true;
        }
        if (view.getAlpha() < 0.5f) {
            o.d(f10226a, "Banner Judge : Banner's alpha must set up 50%.");
            return true;
        }
        if (view.getParent() != null && (view.getParent() instanceof ViewGroup) && ((ViewGroup) view.getParent()).getVisibility() != 0) {
            o.d(f10226a, "View Judge : View's container is not visible.");
            return true;
        }
        Rect rect = new Rect();
        boolean globalVisibleRect = view.getGlobalVisibleRect(rect);
        boolean z10 = (rect.right - rect.left) * (rect.bottom - rect.top) >= (view.getMeasuredWidth() * view.getMeasuredHeight()) / 2;
        boolean z11 = globalVisibleRect && z10;
        o.d(f10226a, "View Judge : partVisible is " + globalVisibleRect + " halfPercentVisible is " + z10);
        o.d(f10226a, "View Judge : totalViewVisible is ".concat(String.valueOf(z11)));
        if (!z11) {
            return true;
        }
        View view2 = view;
        while (view2.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2.getParent();
            for (int a10 = a(view2, viewGroup) + 1; a10 < viewGroup.getChildCount(); a10++) {
                View childAt = viewGroup.getChildAt(a10);
                if (childAt.getVisibility() == 0 && a(view, childAt)) {
                    if (childAt instanceof ViewGroup) {
                        ViewGroup viewGroup2 = (ViewGroup) childAt;
                        if (viewGroup2.getChildCount() > 0) {
                            o.d(f10226a, "View Judge : Covered by ViewGroup.");
                            boolean b10 = b(view, viewGroup2);
                            f10227b = false;
                            if (b10) {
                                return true;
                            }
                        }
                    }
                    if (b(childAt)) {
                        o.d(f10226a, "View Judge : View Covered and Cover View is not transparent.");
                        return true;
                    }
                }
            }
            view2 = viewGroup;
        }
        o.d(f10226a, "View Judge : Well done, View is not covered.");
        return false;
    }

    private static boolean b(View view) {
        return view.getAlpha() > 0.5f && view.getBackground() != null && view.getBackground().getAlpha() > 127;
    }

    private static boolean b(View view, ViewGroup viewGroup) {
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            o.d(f10226a, "View Judge : Start Loop");
            View childAt = viewGroup.getChildAt(i10);
            if (childAt.getVisibility() == 0 && a(view, childAt)) {
                if ((childAt instanceof WebView) && childAt.getVisibility() == 0) {
                    o.d(f10226a, "View Judge : View Covered by WebView.");
                    f10227b = true;
                }
                if (b(childAt)) {
                    o.d(f10226a, "View Judge : View Covered and Cover ViewGroup is not transparent.");
                    f10227b = true;
                }
                if (f10227b) {
                    break;
                }
                if (childAt instanceof ViewGroup) {
                    b(view, (ViewGroup) childAt);
                }
            }
        }
        return f10227b;
    }

    private static boolean a(View view, View view2) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        Rect rect2 = new Rect();
        view2.getGlobalVisibleRect(rect2);
        if (Rect.intersects(rect, rect2)) {
            return ((Math.min(rect.bottom, rect2.bottom) - Math.max(rect.top, rect2.top)) * (Math.min(rect.right, rect2.right) - Math.max(rect.left, rect2.left))) * 2 >= view.getMeasuredWidth() * view.getMeasuredHeight();
        }
        return false;
    }

    private static int a(View view, ViewGroup viewGroup) {
        int i10 = 0;
        while (i10 < viewGroup.getChildCount() && viewGroup.getChildAt(i10) != view) {
            i10++;
        }
        return i10;
    }
}
