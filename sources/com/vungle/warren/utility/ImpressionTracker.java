package com.vungle.warren.utility;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public class ImpressionTracker {
    private static final int MIN_VISIBILITY_PERCENTAGE = 1;
    private static final String TAG = "ImpressionTracker";
    private static final int VISIBILITY_THROTTLE_MILLIS = 100;
    private final Rect clipRect;
    private boolean isVisibilityScheduled;
    final ViewTreeObserver.OnPreDrawListener onPreDrawListener;
    private final Map<View, TrackingInfo> trackedViews;
    private final Handler visibilityHandler;
    private final VisibilityRunnable visibilityRunnable;
    WeakReference<ViewTreeObserver> weakViewTreeObserver;

    /* loaded from: classes2.dex */
    public interface ImpressionListener {
        void onImpression(View view);
    }

    /* loaded from: classes2.dex */
    public static class TrackingInfo {
        ImpressionListener impressionListener;
        int minViewablePercent;
    }

    /* loaded from: classes2.dex */
    public class VisibilityRunnable implements Runnable {
        private final ArrayList<View> mVisibleViews = new ArrayList<>();

        public VisibilityRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ImpressionListener impressionListener;
            ImpressionTracker.this.isVisibilityScheduled = false;
            for (Map.Entry entry : ImpressionTracker.this.trackedViews.entrySet()) {
                View view = (View) entry.getKey();
                if (ImpressionTracker.this.isVisible(view, ((TrackingInfo) entry.getValue()).minViewablePercent)) {
                    this.mVisibleViews.add(view);
                }
            }
            Iterator<View> it = this.mVisibleViews.iterator();
            while (it.hasNext()) {
                View next = it.next();
                TrackingInfo trackingInfo = (TrackingInfo) ImpressionTracker.this.trackedViews.get(next);
                if (trackingInfo != null && (impressionListener = trackingInfo.impressionListener) != null) {
                    impressionListener.onImpression(next);
                }
                ImpressionTracker.this.removeView(next);
            }
            this.mVisibleViews.clear();
        }
    }

    public ImpressionTracker(Context context) {
        this(context, new WeakHashMap(10), new Handler());
    }

    private View getTopView(Context context, View view) {
        View view2;
        View rootView;
        if (context instanceof Activity) {
            view2 = ((Activity) context).getWindow().getDecorView().findViewById(R.id.content);
        } else {
            view2 = null;
        }
        if (view2 == null && view != null && (rootView = view.getRootView()) != null) {
            return rootView.findViewById(R.id.content);
        }
        return view2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isVisible(View view, int i10) {
        if (view == null || view.getVisibility() != 0 || view.getParent() == null || !view.getGlobalVisibleRect(this.clipRect)) {
            return false;
        }
        long height = this.clipRect.height() * this.clipRect.width();
        long height2 = view.getHeight() * view.getWidth();
        if (height2 <= 0 || height * 100 < i10 * height2) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void scheduleVisibilityCheck() {
        if (this.isVisibilityScheduled) {
            return;
        }
        this.isVisibilityScheduled = true;
        this.visibilityHandler.postDelayed(this.visibilityRunnable, 100L);
    }

    private void setViewTreeObserver(Context context, View view) {
        ViewTreeObserver viewTreeObserver = this.weakViewTreeObserver.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            return;
        }
        View topView = getTopView(context, view);
        if (topView == null) {
            Log.d(TAG, "Unable to set ViewTreeObserver due to no available root view.");
            return;
        }
        ViewTreeObserver viewTreeObserver2 = topView.getViewTreeObserver();
        if (!viewTreeObserver2.isAlive()) {
            Log.d(TAG, "The root view tree observer was not alive");
        } else {
            this.weakViewTreeObserver = new WeakReference<>(viewTreeObserver2);
            viewTreeObserver2.addOnPreDrawListener(this.onPreDrawListener);
        }
    }

    public void addView(View view, ImpressionListener impressionListener) {
        setViewTreeObserver(view.getContext(), view);
        TrackingInfo trackingInfo = this.trackedViews.get(view);
        if (trackingInfo == null) {
            trackingInfo = new TrackingInfo();
            this.trackedViews.put(view, trackingInfo);
            scheduleVisibilityCheck();
        }
        trackingInfo.minViewablePercent = 1;
        trackingInfo.impressionListener = impressionListener;
    }

    public void clear() {
        this.trackedViews.clear();
        this.visibilityHandler.removeMessages(0);
        this.isVisibilityScheduled = false;
    }

    public void destroy() {
        clear();
        ViewTreeObserver viewTreeObserver = this.weakViewTreeObserver.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.onPreDrawListener);
        }
        this.weakViewTreeObserver.clear();
    }

    public void removeView(View view) {
        this.trackedViews.remove(view);
    }

    public ImpressionTracker(Context context, Map<View, TrackingInfo> map, Handler handler) {
        this.clipRect = new Rect();
        this.trackedViews = map;
        this.visibilityHandler = handler;
        this.visibilityRunnable = new VisibilityRunnable();
        this.onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: com.vungle.warren.utility.ImpressionTracker.1
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                ImpressionTracker.this.scheduleVisibilityCheck();
                return true;
            }
        };
        this.weakViewTreeObserver = new WeakReference<>(null);
        setViewTreeObserver(context, null);
    }
}
