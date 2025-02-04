package com.vungle.warren.utility;

import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public interface Executors {
    VungleThreadPoolExecutor getApiExecutor();

    VungleThreadPoolExecutor getBackgroundExecutor();

    VungleThreadPoolExecutor getDownloaderExecutor();

    VungleThreadPoolExecutor getIOExecutor();

    VungleThreadPoolExecutor getJobExecutor();

    VungleThreadPoolExecutor getLoggerExecutor();

    VungleThreadPoolExecutor getOffloadExecutor();

    VungleThreadPoolExecutor getSessionDataExecutor();

    VungleThreadPoolExecutor getTaskExecutor();

    VungleThreadPoolExecutor getUAExecutor();

    ExecutorService getUIExecutor();
}
