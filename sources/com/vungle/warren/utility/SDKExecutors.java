package com.vungle.warren.utility;

import android.os.Handler;
import android.os.Looper;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class SDKExecutors implements Executors {
    private static final VungleThreadPoolExecutor API_EXECUTOR;
    private static final VungleThreadPoolExecutor BACKGROUND_EXECUTOR;
    private static final VungleThreadPoolExecutor DOWNLOADER_EXECUTOR;
    private static final VungleThreadPoolExecutor IO_EXECUTOR;
    private static final int IO_KEEP_ALIVE_TIME_SECONDS = 5;
    private static final int JOBS_KEEP_ALIVE_TIME_SECONDS = 1;
    private static final VungleThreadPoolExecutor JOB_EXECUTOR;
    private static final VungleThreadPoolExecutor LOGGER_EXECUTOR;
    private static final VungleThreadPoolExecutor OFFLOAD_EXECUTOR;
    private static final VungleThreadPoolExecutor SESSION_DATA_EXECUTOR;
    private static final int SINGLE_CORE_POOL_SIZE = 1;
    private static final VungleThreadPoolExecutor TASK_EXECUTOR;
    private static final VungleThreadPoolExecutor UA_EXECUTOR;
    private static final int VUNGLE_KEEP_ALIVE_TIME_SECONDS = 10;
    private static int NUMBER_OF_CORES = Runtime.getRuntime().availableProcessors();
    private static final ExecutorService UI_EXECUTOR = new AbstractExecutorService() { // from class: com.vungle.warren.utility.SDKExecutors.1
        private final Handler UIHandler = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.ExecutorService
        public boolean awaitTermination(long j10, TimeUnit timeUnit) {
            return false;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.UIHandler.post(runnable);
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean isShutdown() {
            return false;
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean isTerminated() {
            return false;
        }

        @Override // java.util.concurrent.ExecutorService
        public List<Runnable> shutdownNow() {
            return null;
        }

        @Override // java.util.concurrent.ExecutorService
        public void shutdown() {
        }
    };

    static {
        int i10 = NUMBER_OF_CORES;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        JOB_EXECUTOR = new VungleThreadPoolExecutor(i10, i10, 1L, timeUnit, new PriorityBlockingQueue(), new NamedThreadFactory("vng_jr"));
        IO_EXECUTOR = new VungleThreadPoolExecutor(1, 1, 5L, timeUnit, new LinkedBlockingQueue(), new NamedThreadFactory("vng_io"));
        LOGGER_EXECUTOR = new VungleThreadPoolExecutor(1, 1, 5L, timeUnit, new LinkedBlockingQueue(), new NamedThreadFactory("vng_logger"));
        BACKGROUND_EXECUTOR = new VungleThreadPoolExecutor(1, 1, 10L, timeUnit, new LinkedBlockingQueue(), new NamedThreadFactory("vng_background"));
        API_EXECUTOR = new VungleThreadPoolExecutor(1, 1, 10L, timeUnit, new LinkedBlockingQueue(), new NamedThreadFactory("vng_api"));
        TASK_EXECUTOR = new VungleThreadPoolExecutor(1, 20, 10L, timeUnit, new SynchronousQueue(), new NamedThreadFactory("vng_task"));
        UA_EXECUTOR = new VungleThreadPoolExecutor(1, 1, 10L, timeUnit, new LinkedBlockingQueue(), new NamedThreadFactory("vng_ua"));
        DOWNLOADER_EXECUTOR = new VungleThreadPoolExecutor(4, 4, 1L, timeUnit, new PriorityBlockingQueue(), new NamedThreadFactory("vng_down"));
        OFFLOAD_EXECUTOR = new VungleThreadPoolExecutor(1, 1, 10L, timeUnit, new LinkedBlockingQueue(), new NamedThreadFactory("vng_ol"));
        SESSION_DATA_EXECUTOR = new VungleThreadPoolExecutor(1, 1, 5L, timeUnit, new LinkedBlockingQueue(), new NamedThreadFactory("vng_session"));
    }

    @Override // com.vungle.warren.utility.Executors
    public VungleThreadPoolExecutor getApiExecutor() {
        return API_EXECUTOR;
    }

    @Override // com.vungle.warren.utility.Executors
    public VungleThreadPoolExecutor getBackgroundExecutor() {
        return BACKGROUND_EXECUTOR;
    }

    @Override // com.vungle.warren.utility.Executors
    public VungleThreadPoolExecutor getDownloaderExecutor() {
        return DOWNLOADER_EXECUTOR;
    }

    @Override // com.vungle.warren.utility.Executors
    public VungleThreadPoolExecutor getIOExecutor() {
        return IO_EXECUTOR;
    }

    @Override // com.vungle.warren.utility.Executors
    public VungleThreadPoolExecutor getJobExecutor() {
        return JOB_EXECUTOR;
    }

    @Override // com.vungle.warren.utility.Executors
    public VungleThreadPoolExecutor getLoggerExecutor() {
        return LOGGER_EXECUTOR;
    }

    @Override // com.vungle.warren.utility.Executors
    public VungleThreadPoolExecutor getOffloadExecutor() {
        return OFFLOAD_EXECUTOR;
    }

    @Override // com.vungle.warren.utility.Executors
    public VungleThreadPoolExecutor getSessionDataExecutor() {
        return SESSION_DATA_EXECUTOR;
    }

    @Override // com.vungle.warren.utility.Executors
    public VungleThreadPoolExecutor getTaskExecutor() {
        return TASK_EXECUTOR;
    }

    @Override // com.vungle.warren.utility.Executors
    public VungleThreadPoolExecutor getUAExecutor() {
        return UA_EXECUTOR;
    }

    @Override // com.vungle.warren.utility.Executors
    public ExecutorService getUIExecutor() {
        return UI_EXECUTOR;
    }
}
