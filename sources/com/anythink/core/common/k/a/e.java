package com.anythink.core.common.k.a;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class e {
    private static void a(View view) {
        if (view == null || view.getParent() == null || !(view.getParent() instanceof ViewGroup)) {
            return;
        }
        ((ViewGroup) view.getParent()).removeView(view);
    }

    private static View b(View view) {
        View rootView;
        if (view == null || (rootView = view.getRootView()) == null) {
            return null;
        }
        View findViewById = rootView.findViewById(R.id.content);
        if (findViewById != null) {
            return findViewById;
        }
        return rootView;
    }

    private static View a(Context context) {
        if (context instanceof Activity) {
            return ((Activity) context).getWindow().getDecorView().findViewById(R.id.content);
        }
        return null;
    }

    private static View a(Context context, View view) {
        View rootView;
        View view2 = null;
        View findViewById = !(context instanceof Activity) ? null : ((Activity) context).getWindow().getDecorView().findViewById(R.id.content);
        if (view != null && (rootView = view.getRootView()) != null && (view2 = rootView.findViewById(R.id.content)) == null) {
            view2 = rootView;
        }
        return findViewById != null ? findViewById : view2;
    }
}
