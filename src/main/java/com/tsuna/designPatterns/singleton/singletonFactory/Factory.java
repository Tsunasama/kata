package com.tsuna.designPatterns.singleton.singletonFactory;

class Factory {
    private static final Object classLocker = Factory.class;
    private static Factory factory;
    private int countDuty;

    private Factory() {
        countDuty = 0;
    }

    static Factory getFactory() {
        synchronized (classLocker) {
            if (factory == null)
                factory = new Factory();
            return factory;
        }
    }

    void duDuty() {
        countDuty++;
    }

    int getCounts() {
        return countDuty;
    }
}
