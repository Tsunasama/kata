package com.tsuna.designPatterns.singleton.singletonFactory;

final class DefectiveFactory1 {
    /**
     * This factory with a defect that using lock will take more time.
     */
    private static final Object classLocker = DefectiveFactory1.class;
    private static DefectiveFactory1 defectiveFactory1;
    private static int countDuty;

    private DefectiveFactory1() {
        countDuty = 0;
    }

    static DefectiveFactory1 getDefectiveFactory1() {
        synchronized (classLocker) {
            if (defectiveFactory1 == null)
                defectiveFactory1 = new DefectiveFactory1();
            return defectiveFactory1;
        }
    }

    synchronized void duDuty() {
        countDuty++;
    }

    int getCounts() {
        return countDuty;
    }
}
