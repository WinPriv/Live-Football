package com.vungle.warren;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.WindowManager;
import com.vungle.warren.AdConfig;
import com.vungle.warren.analytics.AdAnalytics;
import com.vungle.warren.model.Advertisement;
import com.vungle.warren.utility.ViewUtility;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public class ClickCoordinateTracker {
    private static final int DEFAULT_WIDTH_HEIGHT = 0;
    private final AdAnalytics adAnalytics;
    private final Advertisement advertisement;
    ClickCoordinate currentClick;
    private static final String MACRO_REQ_WIDTH = Pattern.quote("{{{req_width}}}");
    private static final String MACRO_REQ_HEIGHT = Pattern.quote("{{{req_height}}}");
    private static final String MACRO_WIDTH = Pattern.quote("{{{width}}}");
    private static final String MACRO_HEIGHT = Pattern.quote("{{{height}}}");
    private static final String MACRO_DOWN_X = Pattern.quote("{{{down_x}}}");
    private static final String MACRO_DOWN_Y = Pattern.quote("{{{down_y}}}");
    private static final String MACRO_UP_X = Pattern.quote("{{{up_x}}}");
    private static final String MACRO_UP_Y = Pattern.quote("{{{up_y}}}");

    /* loaded from: classes2.dex */
    public static class ClickCoordinate {
        Coordinate downCoordinate = new Coordinate(Integer.MIN_VALUE, Integer.MIN_VALUE);
        Coordinate upCoordinate = new Coordinate(Integer.MIN_VALUE, Integer.MIN_VALUE);

        public boolean ready() {
            Coordinate coordinate = this.downCoordinate;
            if (coordinate.f27241x != Integer.MIN_VALUE && coordinate.y != Integer.MIN_VALUE) {
                Coordinate coordinate2 = this.upCoordinate;
                if (coordinate2.f27241x != Integer.MIN_VALUE && coordinate2.y != Integer.MIN_VALUE) {
                    return true;
                }
            }
            return false;
        }

        public void setDownCoordinate(Coordinate coordinate) {
            this.downCoordinate = coordinate;
        }

        public void setUpCoordinate(Coordinate coordinate) {
            this.upCoordinate = coordinate;
        }
    }

    /* loaded from: classes2.dex */
    public static class Coordinate {

        /* renamed from: x, reason: collision with root package name */
        int f27241x;
        int y;

        public Coordinate(int i10, int i11) {
            this.f27241x = i10;
            this.y = i11;
        }
    }

    /* loaded from: classes2.dex */
    public static class DeviceScreenInfo {

        @SuppressLint({"StaticFieldLeak"})
        private static DeviceScreenInfo INSTANCE;
        private final Context context;
        private final DisplayMetrics dm;

        private DeviceScreenInfo(Context context) {
            Context applicationContext = context.getApplicationContext();
            this.context = applicationContext;
            DisplayMetrics displayMetrics = new DisplayMetrics();
            this.dm = displayMetrics;
            ((WindowManager) applicationContext.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        }

        public static DeviceScreenInfo getInstance(Context context) {
            if (INSTANCE == null) {
                INSTANCE = new DeviceScreenInfo(context);
            }
            return INSTANCE;
        }

        public int getDeviceHeight() {
            return this.dm.heightPixels;
        }

        public int getDeviceWidth() {
            return this.dm.widthPixels;
        }
    }

    public ClickCoordinateTracker(Advertisement advertisement, AdAnalytics adAnalytics) {
        this.advertisement = advertisement;
        this.adAnalytics = adAnalytics;
    }

    private int getDeviceHeight() {
        if (Vungle.appContext() != null) {
            return DeviceScreenInfo.getInstance(Vungle.appContext()).getDeviceHeight();
        }
        return 0;
    }

    private int getDeviceWidth() {
        if (Vungle.appContext() != null) {
            return DeviceScreenInfo.getInstance(Vungle.appContext()).getDeviceWidth();
        }
        return 0;
    }

    private int getRequestHeight() {
        if (Vungle.appContext() != null && this.advertisement.getAdConfig() != null) {
            AdConfig.AdSize adSize = this.advertisement.getAdConfig().getAdSize();
            if (adSize == AdConfig.AdSize.VUNGLE_DEFAULT) {
                return getDeviceHeight();
            }
            return ViewUtility.dpToPixels(Vungle.appContext(), adSize.getHeight());
        }
        return 0;
    }

    private int getRequestWidth() {
        if (Vungle.appContext() != null && this.advertisement.getAdConfig() != null) {
            AdConfig.AdSize adSize = this.advertisement.getAdConfig().getAdSize();
            if (adSize == AdConfig.AdSize.VUNGLE_DEFAULT) {
                return getDeviceWidth();
            }
            return ViewUtility.dpToPixels(Vungle.appContext(), adSize.getWidth());
        }
        return 0;
    }

    private void sendClickCoordinates() {
        String[] tpatUrls;
        if (this.adAnalytics != null && (tpatUrls = this.advertisement.getTpatUrls(Advertisement.TPAT_CLICK_COORDINATES_URLS)) != null && tpatUrls.length != 0) {
            int requestWidth = getRequestWidth();
            int requestHeight = getRequestHeight();
            int requestWidth2 = getRequestWidth();
            int requestHeight2 = getRequestHeight();
            for (int i10 = 0; i10 < tpatUrls.length; i10++) {
                String str = tpatUrls[i10];
                if (!TextUtils.isEmpty(str)) {
                    tpatUrls[i10] = str.replaceAll(MACRO_REQ_WIDTH, Integer.toString(requestWidth)).replaceAll(MACRO_REQ_HEIGHT, Integer.toString(requestHeight)).replaceAll(MACRO_WIDTH, Integer.toString(requestWidth2)).replaceAll(MACRO_HEIGHT, Integer.toString(requestHeight2)).replaceAll(MACRO_DOWN_X, Integer.toString(this.currentClick.downCoordinate.f27241x)).replaceAll(MACRO_DOWN_Y, Integer.toString(this.currentClick.downCoordinate.y)).replaceAll(MACRO_UP_X, Integer.toString(this.currentClick.upCoordinate.f27241x)).replaceAll(MACRO_UP_Y, Integer.toString(this.currentClick.upCoordinate.y));
                }
            }
            this.adAnalytics.ping(tpatUrls);
        }
    }

    public void trackCoordinate(MotionEvent motionEvent) {
        if (!this.advertisement.isClickCoordinatesTrackingEnabled()) {
            return;
        }
        if (this.currentClick == null) {
            this.currentClick = new ClickCoordinate();
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                this.currentClick.setUpCoordinate(new Coordinate((int) motionEvent.getX(), (int) motionEvent.getY()));
                if (this.currentClick.ready()) {
                    sendClickCoordinates();
                    return;
                }
                return;
            }
            return;
        }
        this.currentClick.setDownCoordinate(new Coordinate((int) motionEvent.getX(), (int) motionEvent.getY()));
    }
}
