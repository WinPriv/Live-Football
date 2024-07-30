package com.applovin.impl.communicator;

import android.content.Context;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorMessagingService;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public class MessagingServiceImpl implements AppLovinCommunicatorMessagingService {

    /* renamed from: a, reason: collision with root package name */
    private final Context f17469a;

    /* renamed from: b, reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f17470b = a();

    public MessagingServiceImpl(Context context) {
        this.f17469a = context;
    }

    private ScheduledThreadPoolExecutor a() {
        return new ScheduledThreadPoolExecutor(1, new ThreadFactory() { // from class: com.applovin.impl.communicator.MessagingServiceImpl.2
            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable, "AppLovinSdk:com.applovin.communicator");
                thread.setPriority(10);
                thread.setDaemon(true);
                return thread;
            }
        });
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorMessagingService
    public void publish(final AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        this.f17470b.execute(new Runnable() { // from class: com.applovin.impl.communicator.MessagingServiceImpl.1
            @Override // java.lang.Runnable
            public void run() {
                AppLovinBroadcastManager.sendBroadcastSync(appLovinCommunicatorMessage, null);
            }
        });
    }

    public String toString() {
        return "MessagingServiceImpl{}";
    }
}
