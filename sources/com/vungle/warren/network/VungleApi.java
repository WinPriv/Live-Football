package com.vungle.warren.network;

import androidx.annotation.Keep;
import java.util.Map;
import m8.q;

@Keep
/* loaded from: classes2.dex */
public interface VungleApi {
    Call<q> ads(String str, String str2, q qVar);

    Call<q> cacheBust(String str, String str2, q qVar);

    Call<q> config(String str, q qVar);

    Call<Void> pingTPAT(String str, String str2);

    Call<q> reportAd(String str, String str2, q qVar);

    Call<q> reportNew(String str, String str2, Map<String, String> map);

    Call<q> ri(String str, String str2, q qVar);

    Call<q> sendBiAnalytics(String str, String str2, q qVar);

    Call<q> sendLog(String str, String str2, q qVar);

    Call<q> willPlayAd(String str, String str2, q qVar);
}
