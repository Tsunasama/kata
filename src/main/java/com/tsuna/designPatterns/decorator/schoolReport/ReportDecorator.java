package com.tsuna.designPatterns.decorator.schoolReport;

class ReportDecorator extends SchoolReport {
    private SchoolReport schoolReport;
    ReportDecorator(SchoolReport report){
        this.schoolReport=report;
    }
    String report() {
        return schoolReport.report();
    }

    String sign() {
        return schoolReport.sign();
    }
}
