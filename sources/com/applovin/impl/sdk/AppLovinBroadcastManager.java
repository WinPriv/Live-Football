package com.applovin.impl.sdk;

import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.applovin.impl.sdk.utils.CollectionUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class AppLovinBroadcastManager {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<Receiver, ArrayList<b>> f18427a = CollectionUtils.map();

    /* renamed from: b, reason: collision with root package name */
    private static final Map<String, ArrayList<b>> f18428b = CollectionUtils.map();

    /* renamed from: c, reason: collision with root package name */
    private static final ArrayList<a> f18429c = new ArrayList<>();

    /* renamed from: d, reason: collision with root package name */
    private static final Handler f18430d = new Handler(Looper.getMainLooper()) { // from class: com.applovin.impl.sdk.AppLovinBroadcastManager.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 1) {
                AppLovinBroadcastManager.b();
            } else {
                super.handleMessage(message);
            }
        }
    };

    /* loaded from: classes.dex */
    public interface Receiver {
        void onReceive(Intent intent, Map<String, Object> map);
    }

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        final Intent f18431a;

        /* renamed from: b, reason: collision with root package name */
        final Map<String, Object> f18432b;

        /* renamed from: c, reason: collision with root package name */
        final List<b> f18433c;

        public a(Intent intent, Map<String, Object> map, List<b> list) {
            this.f18431a = intent;
            this.f18432b = map;
            this.f18433c = list;
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        final IntentFilter f18434a;

        /* renamed from: b, reason: collision with root package name */
        final Receiver f18435b;

        /* renamed from: c, reason: collision with root package name */
        boolean f18436c;

        /* renamed from: d, reason: collision with root package name */
        boolean f18437d;

        public b(IntentFilter intentFilter, Receiver receiver) {
            this.f18434a = intentFilter;
            this.f18435b = receiver;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b() {
        int size;
        a[] aVarArr;
        while (true) {
            synchronized (f18427a) {
                ArrayList<a> arrayList = f18429c;
                size = arrayList.size();
                if (size <= 0) {
                    return;
                }
                aVarArr = new a[size];
                arrayList.toArray(aVarArr);
                arrayList.clear();
            }
            for (int i10 = 0; i10 < size; i10++) {
                a aVar = aVarArr[i10];
                if (aVar != null) {
                    for (b bVar : aVar.f18433c) {
                        if (bVar != null && !bVar.f18437d) {
                            bVar.f18435b.onReceive(aVar.f18431a, aVar.f18432b);
                        }
                    }
                }
            }
        }
    }

    public static void registerReceiver(Receiver receiver, IntentFilter intentFilter) {
        Map<Receiver, ArrayList<b>> map = f18427a;
        synchronized (map) {
            b bVar = new b(intentFilter, receiver);
            ArrayList<b> arrayList = map.get(receiver);
            if (arrayList == null) {
                arrayList = new ArrayList<>(1);
                map.put(receiver, arrayList);
            }
            arrayList.add(bVar);
            Iterator<String> actionsIterator = intentFilter.actionsIterator();
            while (actionsIterator.hasNext()) {
                String next = actionsIterator.next();
                Map<String, ArrayList<b>> map2 = f18428b;
                ArrayList<b> arrayList2 = map2.get(next);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>(1);
                    map2.put(next, arrayList2);
                }
                arrayList2.add(bVar);
            }
        }
    }

    public static boolean sendBroadcast(Intent intent, Map<String, Object> map) {
        synchronized (f18427a) {
            List<b> a10 = a(intent);
            if (a10 == null) {
                return false;
            }
            f18429c.add(new a(intent, map, a10));
            Handler handler = f18430d;
            if (!handler.hasMessages(1)) {
                handler.sendEmptyMessage(1);
            }
            return true;
        }
    }

    public static void sendBroadcastSync(Intent intent, Map<String, Object> map) {
        List<b> a10 = a(intent);
        if (a10 == null) {
            return;
        }
        for (b bVar : a10) {
            if (!bVar.f18437d) {
                bVar.f18435b.onReceive(intent, map);
            }
        }
    }

    public static void sendBroadcastSyncWithPendingBroadcasts(Intent intent, Map<String, Object> map) {
        if (sendBroadcast(intent, map)) {
            b();
        }
    }

    public static boolean sendBroadcastWithAdObject(String str, Object obj) {
        Map map = CollectionUtils.map(1);
        map.put("ad", obj);
        return sendBroadcast(new Intent(str), map);
    }

    public static void unregisterReceiver(Receiver receiver) {
        Map<Receiver, ArrayList<b>> map = f18427a;
        synchronized (map) {
            ArrayList<b> remove = map.remove(receiver);
            if (remove == null) {
                return;
            }
            for (b bVar : remove) {
                bVar.f18437d = true;
                Iterator<String> actionsIterator = bVar.f18434a.actionsIterator();
                while (actionsIterator.hasNext()) {
                    String next = actionsIterator.next();
                    ArrayList<b> arrayList = f18428b.get(next);
                    if (arrayList != null) {
                        Iterator<b> it = arrayList.iterator();
                        while (it.hasNext()) {
                            if (it.next().f18435b == receiver) {
                                bVar.f18437d = true;
                                it.remove();
                            }
                        }
                        if (arrayList.size() <= 0) {
                            f18428b.remove(next);
                        }
                    }
                }
            }
        }
    }

    private static List<b> a(Intent intent) {
        synchronized (f18427a) {
            String action = intent.getAction();
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            ArrayList<b> arrayList = f18428b.get(action);
            if (arrayList == null) {
                return null;
            }
            ArrayList arrayList2 = null;
            for (b bVar : arrayList) {
                if (!bVar.f18436c && bVar.f18434a.match(action, null, scheme, data, categories, "AppLovinBroadcastManager") >= 0) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(bVar);
                    bVar.f18436c = true;
                }
            }
            if (arrayList2 == null) {
                return null;
            }
            Iterator<b> it = arrayList2.iterator();
            while (it.hasNext()) {
                it.next().f18436c = false;
            }
            return arrayList2;
        }
    }
}
