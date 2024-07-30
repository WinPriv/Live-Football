package com.vungle.warren.analytics;

import android.text.TextUtils;
import android.util.Log;
import com.vungle.warren.VungleApiClient;
import com.vungle.warren.model.AnalyticUrl;
import com.vungle.warren.network.Call;
import com.vungle.warren.network.Callback;
import com.vungle.warren.network.Response;
import com.vungle.warren.persistence.DatabaseHelper;
import com.vungle.warren.persistence.Repository;
import com.vungle.warren.utility.VungleUrlUtility;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;
import m8.q;

/* loaded from: classes2.dex */
public class VungleAnalytics implements AdAnalytics {
    private static final String TAG = "VungleAnalytics";
    private final VungleApiClient client;
    private final Repository repository;

    public VungleAnalytics(VungleApiClient vungleApiClient, Repository repository) {
        this.client = vungleApiClient;
        this.repository = repository;
    }

    @Override // com.vungle.warren.analytics.AdAnalytics
    public String[] ping(String[] strArr) {
        if (strArr.length == 0) {
            return strArr;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    try {
                        if (!this.client.pingTPAT(str)) {
                            arrayList.add(str);
                        } else {
                            this.repository.delete(new AnalyticUrl(str));
                        }
                    } catch (DatabaseHelper.DBException unused) {
                        Log.e(TAG, "DBException deleting : " + str);
                        Log.e(TAG, "Invalid Url : " + str);
                    }
                } catch (VungleApiClient.ClearTextTrafficException unused2) {
                    Log.e(TAG, "Cleartext Network Traffic is Blocked : " + str);
                } catch (DatabaseHelper.DBException unused3) {
                    Log.e(TAG, "Can't delete sent ping URL : " + str);
                } catch (MalformedURLException unused4) {
                    this.repository.delete(new AnalyticUrl(str));
                    Log.e(TAG, "Invalid Url : " + str);
                }
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    @Override // com.vungle.warren.analytics.AdAnalytics
    public String[] retryUnsent() {
        List list = (List) this.repository.loadAll(AnalyticUrl.class).get();
        if (list != null && list.size() > 0) {
            int size = list.size();
            String[] strArr = new String[size];
            for (int i10 = 0; i10 < size; i10++) {
                strArr[i10] = ((AnalyticUrl) list.get(i10)).url;
            }
            return ping(strArr);
        }
        return new String[0];
    }

    @Override // com.vungle.warren.analytics.AdAnalytics
    public void ri(q qVar) {
        if (qVar == null) {
            return;
        }
        this.client.ri(qVar).enqueue(new Callback<q>() { // from class: com.vungle.warren.analytics.VungleAnalytics.1
            @Override // com.vungle.warren.network.Callback
            public void onFailure(Call<q> call, Throwable th) {
                Log.d(VungleAnalytics.TAG, "send RI Failure");
            }

            @Override // com.vungle.warren.network.Callback
            public void onResponse(Call<q> call, Response<q> response) {
                Log.d(VungleAnalytics.TAG, "send RI success");
            }
        });
    }

    @Override // com.vungle.warren.analytics.AdAnalytics
    public void saveVungleUrls(String[] strArr) {
        for (String str : strArr) {
            if (VungleUrlUtility.isVungleUrl(str)) {
                try {
                    this.repository.save(new AnalyticUrl(str));
                } catch (DatabaseHelper.DBException unused) {
                    Log.e(TAG, "Can't save failed to ping URL : " + str);
                }
            }
        }
    }
}
