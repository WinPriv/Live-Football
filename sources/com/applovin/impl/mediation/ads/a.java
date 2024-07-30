package com.applovin.impl.mediation.ads;

import android.app.Activity;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.l;
import com.applovin.impl.sdk.y;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class a {
    protected final MaxAdFormat adFormat;
    protected MaxAdListener adListener;
    protected MaxAdReviewListener adReviewListener;
    protected final String adUnitId;
    protected final y logger;
    protected MaxAdRequestListener requestListener;
    protected MaxAdRevenueListener revenueListener;
    protected final p sdk;
    protected final String tag;
    protected final Map<String, Object> localExtraParameters = Collections.synchronizedMap(CollectionUtils.map());
    protected final Map<String, Object> extraParameters = Collections.synchronizedMap(CollectionUtils.map());

    /* renamed from: com.applovin.impl.mediation.ads.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0201a extends MaxAdListener, MaxAdRequestListener, MaxAdRevenueListener {
    }

    public a(String str, MaxAdFormat maxAdFormat, String str2, p pVar) {
        this.adUnitId = str;
        this.adFormat = maxAdFormat;
        this.sdk = pVar;
        this.tag = str2;
        this.logger = pVar.L();
    }

    public void a(com.applovin.impl.mediation.a.a aVar) {
        l lVar = new l();
        lVar.a().a("MAX Ad").a(aVar).a();
        if (y.a()) {
            this.logger.b(this.tag, lVar.toString());
        }
    }

    public void destroy() {
        this.localExtraParameters.clear();
        this.adListener = null;
        this.revenueListener = null;
        this.requestListener = null;
        this.adReviewListener = null;
    }

    public String getAdUnitId() {
        return this.adUnitId;
    }

    public void logApiCall(String str) {
        if (y.a()) {
            this.logger.b(this.tag, str);
        }
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        if (y.a()) {
            this.logger.b(this.tag, "Setting Ad Review creative id listener: " + maxAdReviewListener);
        }
        this.adReviewListener = maxAdReviewListener;
    }

    public void setExtraParameter(String str, String str2) {
        if (str != null) {
            if (Utils.isPubInDebugMode(p.y(), this.sdk) && ("amazon_ad_response".equals(str) || "amazon_ad_error".equals(str))) {
                throw new IllegalArgumentException("`setExtraParameter()` is an incorrect method for passing `amazon_ad_response` or `amazon_ad_error`. Please use the following method: `setLocalExtraParameter()`. Also note that this exception occurs in development builds only.");
            }
            if (this.adFormat.isAdViewAd() && "ad_refresh_seconds".equals(str) && StringUtils.isValidString(str2)) {
                int parseInt = Integer.parseInt(str2);
                if (parseInt > TimeUnit.MINUTES.toSeconds(2L)) {
                    y.i(this.tag, "Attempting to set extra parameter \"ad_refresh_seconds\" to over 2 minutes (" + parseInt + "s) - this will be ignored");
                }
            }
            this.extraParameters.put(str, str2);
            return;
        }
        throw new IllegalArgumentException("No key specified");
    }

    public void setListener(MaxAdListener maxAdListener) {
        if (y.a()) {
            this.logger.b(this.tag, "Setting listener: " + maxAdListener);
        }
        this.adListener = maxAdListener;
    }

    public void setLocalExtraParameter(String str, Object obj) {
        if (str != null) {
            if (obj instanceof Activity) {
                if (y.a()) {
                    this.logger.e(this.tag, "Ignoring setting local extra parameter to Activity instance - please pass a WeakReference of it instead!");
                    return;
                }
                return;
            } else {
                if ("amazon_ad_response".equals(str) || "amazon_ad_error".equals(str)) {
                    setExtraParameter("is_amazon_integration", Boolean.toString(true));
                }
                this.localExtraParameters.put(str, obj);
                return;
            }
        }
        throw new IllegalArgumentException("No key specified");
    }

    public void setRequestListener(MaxAdRequestListener maxAdRequestListener) {
        if (y.a()) {
            this.logger.b(this.tag, "Setting request listener: " + maxAdRequestListener);
        }
        this.requestListener = maxAdRequestListener;
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        if (y.a()) {
            this.logger.b(this.tag, "Setting revenue listener: " + maxAdRevenueListener);
        }
        this.revenueListener = maxAdRevenueListener;
    }

    public static void logApiCall(String str, String str2) {
        p pVar = p.f19228a;
        if (pVar != null) {
            pVar.L();
            if (y.a()) {
                p.f19228a.L().b(str, str2);
            }
        }
    }
}
