package com.tsuna.designPatterns.decorator.schoolReport;

class SortScoreDecorator extends ReportDecorator {
    SortScoreDecorator(SchoolReport report) {
        super(report);
    }

    private String reportSort(){
        return "I got a very good sort in my class which is 23.\n";
    }
    @Override
    String report() {
        return reportSort()+super.report();
    }
}
