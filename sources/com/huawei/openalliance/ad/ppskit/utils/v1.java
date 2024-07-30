package com.huawei.openalliance.ad.ppskit.utils;

import com.huawei.openalliance.ad.ppskit.beans.inner.AdvertiserInfo;
import com.huawei.openalliance.ad.ppskit.beans.metadata.AdSource;
import com.huawei.openalliance.ad.ppskit.beans.metadata.ContentExt;
import com.huawei.openalliance.ad.ppskit.beans.metadata.ExSplashCacheBlockList;
import com.huawei.openalliance.ad.ppskit.beans.metadata.ExsplashUndismissList;
import com.huawei.openalliance.ad.ppskit.beans.metadata.FeedbackInfo;
import com.huawei.openalliance.ad.ppskit.beans.metadata.ImageInfo;
import com.huawei.openalliance.ad.ppskit.beans.metadata.ImpEX;
import com.huawei.openalliance.ad.ppskit.beans.metadata.InstallConfig;
import com.huawei.openalliance.ad.ppskit.beans.metadata.InteractCfg;
import com.huawei.openalliance.ad.ppskit.beans.metadata.LandpageAppWhiteList;
import com.huawei.openalliance.ad.ppskit.beans.metadata.LandpageWebBlackList;
import com.huawei.openalliance.ad.ppskit.beans.metadata.NegativeFb;
import com.huawei.openalliance.ad.ppskit.beans.metadata.Om;
import com.huawei.openalliance.ad.ppskit.beans.metadata.SleepLightAllowPkgList;
import com.huawei.openalliance.ad.ppskit.beans.metadata.VideoInfo;
import com.huawei.openalliance.ad.ppskit.beans.metadata.v3.Asset;
import com.huawei.openalliance.ad.ppskit.beans.openrtb.Data;
import com.huawei.openalliance.ad.ppskit.beans.openrtb.Image;
import com.huawei.openalliance.ad.ppskit.beans.openrtb.Title;
import com.huawei.openalliance.ad.ppskit.beans.openrtb.Video;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public final class v1 extends ObjectInputStream {

    /* renamed from: s, reason: collision with root package name */
    public static final Class[] f23049s = {String.class, ArrayList.class, CopyOnWriteArrayList.class, LinkedList.class, HashMap.class, HashSet.class, Integer.class, Float.class, Boolean.class, Long.class, Byte.class, Character.class, Short.class, Double.class, ImageInfo.class, VideoInfo.class, LandpageWebBlackList.class, LandpageAppWhiteList.class, SleepLightAllowPkgList.class, ExSplashCacheBlockList.class, ExsplashUndismissList.class, InstallConfig.class, ImpEX.class, Om.class, InteractCfg.class, ContentExt.class, NegativeFb.class, FeedbackInfo.class, AdSource.class, Title.class, Data.class, Image.class, Video.class, Asset.class, AdvertiserInfo.class};

    public v1(FileInputStream fileInputStream) {
        super(fileInputStream);
    }

    @Override // java.io.ObjectInputStream
    public final Class<?> resolveClass(ObjectStreamClass objectStreamClass) {
        Class[] clsArr = f23049s;
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= 35) {
                break;
            }
            if (clsArr[i10].getName().equals(objectStreamClass.getName())) {
                z10 = true;
                break;
            }
            i10++;
        }
        if (z10) {
            return super.resolveClass(objectStreamClass);
        }
        throw new ClassNotFoundException("Class " + objectStreamClass.getName() + " is not allowed!");
    }
}
